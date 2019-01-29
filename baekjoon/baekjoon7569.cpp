//M�� N�� �ԷµǾ�� �ϴµ� �׾ƿ÷����� ������ ���� �ǹ��Ѵ�.
// ���� M,N�� �׾ƿ÷����� ������ ���� ��Ÿ���� H�� �־�����.
//M�� ������ ���� ĭ�� ��,N�� ������ ���� ĭ�� ���� ��Ÿ����.
//�丶�䰡 ������� ��� �ؾߵ� ��ó�� ������ �ʹ°ž�?
//�丶�䰡 ����� ������ ��� ���� ���ϴ� ��Ȳ�̸�-1
//�丶�䰡 ����ɋ����� ��� �;��ִ� ���¸� 0���
//��� ������!! ���� �ּ� ��ĥ�ɸ�����?
//������ ���� 2���ε� �� ������ �׷� �ϳ��� ���Ͱ� ����γ�
//�� �������� ��� ���� ���� �׷� 4���̳�?
//->���� �丶�䰡 �ֺ��� ���� ���� �丶�並 ������Ű��
//�ֺ��̶�� ���� ��,�Ʒ�,����,������ ��,�� 6������ ���ϸ� ���� �丶���� ���Ĵ� �Ϸ簡 �ɸ���.
//���� ��� �丶�並 �Ͱ� ������� �� ���� �ɸ���
//������ �;�� ������ �ùķ��̼� �Ѵ�.
//�ٸ� ���� �丶�並 ������ְ� ���ĵǴ� ������ �����ϰ�, ���ÿ� ��� �丶�䰡 �;����� Ȯ���ϴ� ������ �ʿ�
//BFS�� ������ ����->��ġ�� ���� bfs�� �𸥴�.
//���� �丶�並 �������� �����ϴ� ����� ��带 �湮�س����� ������ ����ϸ�,
//���� �丶�並 �ٽ� Ȯ���� �ʿ䰡 ���� ������ visit�� üũ�ذ��鼭 �ٽ� �湮���� �ʴ� ������ ���� �����̴�.
//
/*
public class baekjoon7569{
    
    static int n;
    static int[] tArr; //����� �Ϸ��ϴµ� �ɸ��� �Ⱓ
    static int[] pArr; //����� ������ ���� �� �ִ� �ݾ�
    static int maxPrice;
    
    public static void main(String[] args){
        //�ƴϱ��� �Է� ������ -> �迭�� ������ �־����°� ������
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); //��� ��¥ �Է�
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
        
        //i��° ���� ��� ���� ���� ���
        //������ ��¥�� ���� ������ �Ķ���ͷ� ����
        if(i+1<=n)
            recursiveDFS(i+1,totalPrice);
    }
}
*/
#include<stdio.h>
#include<queue>
using namespace std;

int m,n,h,cnt;
int tomato[100][100][100];  //3���� �迭 �����
int visit[100][100][100];   //�湮�ϴ� ������ ����� �������� �湮 �ߴ��� ���ߴ����� üũ �����ϴ�
int dir[6][3] = { {-1,0,0},{1,0,0},{0,-1,0},{0,1,0},{0,0,-1},{0,0,1}};//�� �Ʒ� ������ ���� �� �� ���� üũ


//����ü�� x,y,z���� ����ֱ� ���� �������ֱ� ���ؼ� 
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


            //6������ �� ���µ� �� �̷� ���


            for(int j=0;j<6;++j){
                int xx = x + dir[j][0];
                int yy = y + dir[j][1];
                int zz = z + dir[j][2];


//dir�� 2�����迭 ������ �ǹ��ϰ�  x������ ��ŭ ������ �װŸ� �׳� 2���� 0���� �����س����� x��
//1�迭�ȿ� �����س����� y��
//2�迭�ȿ� ������ ������ z��
//�ƴѰ� ������ �� ���⼭ ���ڱ� x���̸� ������ �����̶�� �����ϸ� �̰� ������ �ƴѰ� ������
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