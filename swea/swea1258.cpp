//화학 물질 욕기 nxn배열이고
//빈용기는 0으로 저장하고 
//화학물질 종류에 따라 1~9까지 저장
//1. 화학물질이 담긴 용기들이 사각형을 이루고 사각형 내부에 빈용기가없다
//2. 화학물질이 담긴 용기들로 이루어진 사각형들은 각각 차원이 다르다(가로의 용기 수 x세로의 용기수
//3. 2개의 화학물질이 담긴 용기들로 이루어진 사각형들 사이에는 빈 용기들이 있다.
//2차원 배열에서 행렬들을 찾아내고 정보를 수집한다.
//n은 100이하이고 
//부분 행렬의 열의 개수는 서로 다르며 행렬의 행의 개수도 서로 다르다.
//출력 스타일을 #1 하고 3 하면 3개의 행렬이 주어지고 그중에서 가장 행의 숫자가 낮은 값 2 3, 3 4, 4 5 이런식으로 출력한다.
//입력 스타일은 맨 첫줄에 테스트 케이스가 주어지고 그다음에 nxn행렬을 위한 n의 값이 입력된다.
//행렬이 몇개 있는지 세면 될듯
//->이것도 돌아가면서 bfs인지 체크 하면서 가면 좋을거같은데 그래야지 행렬이 있는지 없는지 알 수 있으니까
/*
#include <iostream>
#include <cstdio> //scanf , %1d를 위한 헤더
#include <queue>

using namespace std;

int Answer;
int N;
int map[100][100];
int dp[100][100];
int dx[] = {-1, 0, 1, 0};
int dy[] = {0, -1, 0, 1};
queue<pair<int, int>> q; //큐

void Init()
{
    for (int i = 0; i < N; i++)
        for (int j = 0; j < N; j++)
            map[i][j] = 0; //맵을 초기화 해준다
    for (int i = 0; i < N; i++)
        for (int j = 0; j < N; j++)
            dp[i][j] = 987654321; //dp배열을 아주 큰 수로 초기화 해준다.
}

void solve()
{
    dp[0][0] = 0;            //맨 처음 스타트지점은 0으로 설정
    q.push(make_pair(0, 0)); //큐에 맨 처음 좌표 넣는다.
    while (!q.empty())
    {                                //큐가 비어 있을 때까지 돌린다.
        int cur_x = q.front().first; //현재 x y를 큐의 첫번째 걸로 해준다.
        int cur_y = q.front().second;
        q.pop();
        for (int i = 0; i < 4; i++)
        {
            //상하 좌우를 돌린다.
            int new_x = cur_x + dx[i];
            int new_y = cur_y + dy[i];
            if (0 <= new_x && new_x < N && 0 <= new_y && new_y < N)
            {
                //범위 안에 있고
                if (dp[cur_x][cur_y] + map[new_x][new_y] < dp[new_x][new_y])
                {
                    //현재 까지의 복구 비용 + 다음 좌표(new_x,new_y)의 깊이 < 다음 좌표의 복구 비용 이라면
                    dp[new_x][new_y] = dp[cur_x][cur_y] + map[new_x][new_y];
                    //현재 까지의 복구 비용 + 다음 좌표 깊이를 다음 좌표의 복구 비용에다가 넣어주고
                    q.push(make_pair(new_x, new_y)); //다음 좌표를 큐에 넣기
                }
            }
        }
    }
}
int main()
{
    int T;
    cin >> T;
    for(int test_case =1;test_case <=T; test_case++){
        Answer = 0;
        cin >> N; //N입력 받고
        Init(); //초기화
        for(int i=0;i<N;i++)
            for(int j=0;j<N; j++)
                scanf("%1d",&map[i][j]); //맵입력받음
                solve(); //solve함수 호출
                Answer = dp[N-1][N-1]; //정답넣기 ->여기 정답 넣는게 이상하다.
                cout << "#" << test_case << " " << Answer <<endl;
    }
    return 0;
 }
 */
//1. 0이 아닌점을 찾아 행과 열의 갯수를 구한다.
//2. 해당하는 행렬을 0으로 바꿔준다.
//3. Node 구조체를 이용하여 행과 열에 대한 정보를 벡터에 저장한다.
//4. 문제의 조건대로 정렬한 후 출력한다.
/*
#include<iostream>
#include<algorithm>
#include<vector>
using namespace std;

struct Node{
    int r,c,mul;
    Node(int r,int c, int mul) : r(r),c(c),mul(mul){}
};

int t,n;
int map[100][100];
int dx[] = {0,0,1,-1};
int dy[] = {1,-1,0,0};

void dfs(int x, int y){
    map[x][y] = 0;
    for(int i=0;i<4;i++){
        int ax = x + dx[i]; //우선 이게 dfs랑 bfs할떄 자주 나오는 식인데 이게 x축으로 이동시키고 
        int ay = y + dy[i]; // 이게 y축으로 어림잡아 이동시키는 코딩같으니까 이거 확인해보기
        if(ax >=0 && ay >=0 && ax < n && ay < n && map[ax][ay] !=0){
            dfs(ax,ay);
        }
    }
}

//굳이 왜 compare_node를 구해서 풀어야 하는 건지 모르겠지만 
//
int compare_node(const Node &a, const Node &b){
    if(a.mul == b.mul){
        return a.r < b.r;
    }
    return a.mul < b.mul;
}


int main(){
    scanf("%d", &t);
    for(int tc = 1; tc<= t; tc++){
        scanf("%d", &n);
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                scanf("%d", &map[i][j]);
            }
        }

        vector<Node> v;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(map[i][j] !=0){
                    int row_cnt =1;
                    int col_cnt =1;
                    int k = i+1; //k는 i+1로 항상 초기화 해주는게 행이 또 다른 행 나오면 다시 초기화 해야 되니까

                    //행의 갯수를 더해줄 부분
                    while(true){
                        if(k >=100 || map[k][j]==0)
                        break;
                        if(map[k][j] !=0){
                            k++;
                            row_cnt++;
                        }
                    }   

                    //k를 j+1로 초기화 해주는 이유는 다시 열의 갯수를 또다른 열 등장시 초기화 해야 하니까
                    k = j+1;
                    //열의 갯수를 더해줄 부분
                    while(true){
                        if(k >=100 || map[i][k] ==0 )
                        break;
                        if(map[i][k] !=0){
                            k++;
                            col_cnt++;
                        }
                    }
                    dfs(i,j);
                    //행과 열의 갯수를 카운트 해주고 그 두개를 합한 값이 행렬의 크기니까 
                    //크기 비교 해야하는게 크기가 같을때 행이 작은 순으로 출력해야 하기 떄문에
                    v.push_back(Node(row_cnt,col_cnt,row_cnt*col_cnt));
                }
            }
        }

        sort(v.begin(),v.end(),compare_node);

        printf("#%d %d ",tc,v.size());
        for(int i=0;i<v.size();i++){
            printf("%d %d ",v[i].r,v[i].c);
        }
        printf("\n");
        }
    }
*/
//좋은 풀이가 있지만 그렇게 풀지 말고 그냥 내 스스로 풀어서 답 구하는게 최고이다.

//c++에서 벡터는 queue같은 존재이기 떄문에 그냥 하면 될듯
