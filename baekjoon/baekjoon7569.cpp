//M과 N이 입력되어야 하는데 쌓아올려지는 상자의 수를 의미한다.
// 정수 M,N이 쌓아올려지는 상자의 수를 나타내는 H가 주어진다.
//M은 상자의 가로 칸의 수,N은 상자의 세로 칸의 수를 나타낸다.
//토마토가 익을라면 어떻게 해야되 근처에 있으면 익는거야?
//토마토가 저장될 떄부터 모두 익지 못하는 상황이면-1
//토마토가 저장될떄부터 모두 익어있는 상태면 0출력
//모두 익을떄!! 까지 최소 며칠걸리는지?
//상자의 수가 2개인데 왜 위에는 그럼 하나도 안익게 내비두나
//왜 위에까지 모두 익을 때가 그럼 4일이냐?
//->익은 토마토가 주변의 익지 않은 토마토를 전염시키고
//주변이라는 것은 위,아래,왼쪽,오른쪽 앞,뒤 6방향을 말하면 익은 토마토의 전파는 하루가 걸린다.
//맵의 모든 토마토를 익게 만드려면 몇 일이 걸릴까
//실제로 익어가는 과정을 시뮬레이션 한다.
//다만 익은 토마토를 기록해주고 전파되는 과정을 구현하고, 동시에 모든 토마토가 익었는지 확인하는 구현도 필요
//BFS와 유사한 구조->그치만 나는 bfs를 모른다.
//익은 토마토를 기점으로 전파하는 방법은 노드를 방문해나가는 과정과 비슷하며,
//익은 토마토를 다시 확인할 필요가 없는 구현은 visit를 체크해가면서 다시 방문하지 않는 과정과 같기 떄문이다.
//
/*
public class baekjoon7569{
    
    static int n;
    static int[] tArr; //상담을 완료하는데 걸리는 기간
    static int[] pArr; //상담을 했을때 받을 수 있는 금액
    static int maxPrice;
    
    public static void main(String[] args){
        //아니구나 입력 받을때 -> 배열의 갯수가 주어지는거 같은데
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); //퇴사 날짜 입력
        int totalPrice=0;

        tArr = new int[n];
        pArr = new int[n];

        for(int i=0;i<n;i++){
            tArr[i] = sc.nextInt();
            pArr[i] = sc.nextInt();
        }
        recursiveDFS(0,0);
        System.out.println(maxPrice);
    }

    public static void recursiveDFS(int i,int totalPrice){
        
        //i번째 날에 상담 하지 않을 경우
        //다음날 날짜와 현재 이익을 파라미터로 전달
        if(i+1<=n)
            recursiveDFS(i+1,totalPrice);
    }
}
*/
#include<stdio.h>
#include<queue>
using namespace std;

int m,n,h,cnt;
int tomato[100][100][100];  //3차원 배열 만들기
int visit[100][100][100];   //방문하는 변수도 만들어 나야지만 방문 했는지 안했는지가 체크 가능하다
int dir[6][3] = { {-1,0,0},{1,0,0},{0,-1,0},{0,1,0},{0,0,-1},{0,0,1}};//위 아래 오른쪽 왼쪽 앞 뒤 방향 체크


//구조체로 x,y,z변수 잡아주기 축을 설정해주기 위해서 
struct col{
    int x,y,z;
};

queue<col> q;

int bfs(){
    int ans =1;
    while(!q.empty()){
        int size = q.size();
        for(int i=0;i<size;++i){
            col c1 = q.front();
            q.pop();
            int x = c1.x;
            int y = c1.y;
            int z = c1.z;

            if(visit[x][y][z])
                continue;
            else
            
                visit[x][y][z] = 1;


            //6방향을 다 도는데 왜 이런 결과


            for(int j=0;j<6;++j){
                int xx = x + dir[j][0];
                int yy = y + dir[j][1];
                int zz = z + dir[j][2];


//dir은 2차원배열 방향을 의미하고  x축으로 얼만큼 갈건지 그거를 그냥 2번쨰 0으로 지정해놓은게 x축
//1배열안에 지정해놓은게 y축
//2배열안에 지정해 놓은게 z축
//아닌거 같은데 왜 여기서 갑자기 x축이면 오른쪽 왼쪽이라고 생각하면 이게 정답이 아닌거 같은데
                if(xx < 0 || xx >= h)
                    continue;
                if(yy < 0 || yy >= n)
                    continue;
                if(zz < 0 || zz >= m)
                    continue;
                if(tomato[xx][yy][zz] == -1)
                    continue;

                if(tomato[xx][yy][zz] == 0){
                    q.push({xx,yy,zz});
                    tomato[xx][yy][zz] = 1;
                    cnt--;
                }
                if(cnt ==0)
                    return ans;
            }
        }
        ans++;
        }
        return -1;
    }
int main(){
    scanf("%d %d %d",&m,&n,&h);
    for(int i=0;i<h;++i){
        for(int j=0;j<n;++j){
            for(int k=0;k<m;++k){
                scanf("%d", & tomato[i][j][k]);
                if(tomato[i][j][k] == 0)
                cnt++;
                else if(tomato[i][j][k] == 1)
                    q.push({i,j,k});
            }
        }
    }
    printf("%d\n", bfs());
    return 0;
}