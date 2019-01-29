//ȭ�� ���� ��� nxn�迭�̰�
//����� 0���� �����ϰ� 
//ȭ�й��� ������ ���� 1~9���� ����
//1. ȭ�й����� ��� ������ �簢���� �̷�� �簢�� ���ο� ���Ⱑ����
//2. ȭ�й����� ��� ����� �̷���� �簢������ ���� ������ �ٸ���(������ ��� �� x������ ����
//3. 2���� ȭ�й����� ��� ����� �̷���� �簢���� ���̿��� �� ������ �ִ�.
//2���� �迭���� ��ĵ��� ã�Ƴ��� ������ �����Ѵ�.
//n�� 100�����̰� 
//�κ� ����� ���� ������ ���� �ٸ��� ����� ���� ������ ���� �ٸ���.
//��� ��Ÿ���� #1 �ϰ� 3 �ϸ� 3���� ����� �־����� ���߿��� ���� ���� ���ڰ� ���� �� 2 3, 3 4, 4 5 �̷������� ����Ѵ�.
//�Է� ��Ÿ���� �� ù�ٿ� �׽�Ʈ ���̽��� �־����� �״����� nxn����� ���� n�� ���� �Էµȴ�.
//����� � �ִ��� ���� �ɵ�
//->�̰͵� ���ư��鼭 bfs���� üũ �ϸ鼭 ���� �����Ű����� �׷����� ����� �ִ��� ������ �� �� �����ϱ�
/*
#include <iostream>
#include <cstdio> //scanf , %1d�� ���� ���
#include <queue>

using namespace std;

int Answer;
int N;
int map[100][100];
int dp[100][100];
int dx[] = {-1, 0, 1, 0};
int dy[] = {0, -1, 0, 1};
queue<pair<int, int>> q; //ť

void Init()
{
    for (int i = 0; i < N; i++)
        for (int j = 0; j < N; j++)
            map[i][j] = 0; //���� �ʱ�ȭ ���ش�
    for (int i = 0; i < N; i++)
        for (int j = 0; j < N; j++)
            dp[i][j] = 987654321; //dp�迭�� ���� ū ���� �ʱ�ȭ ���ش�.
}

void solve()
{
    dp[0][0] = 0;            //�� ó�� ��ŸƮ������ 0���� ����
    q.push(make_pair(0, 0)); //ť�� �� ó�� ��ǥ �ִ´�.
    while (!q.empty())
    {                                //ť�� ��� ���� ������ ������.
        int cur_x = q.front().first; //���� x y�� ť�� ù��° �ɷ� ���ش�.
        int cur_y = q.front().second;
        q.pop();
        for (int i = 0; i < 4; i++)
        {
            //���� �¿츦 ������.
            int new_x = cur_x + dx[i];
            int new_y = cur_y + dy[i];
            if (0 <= new_x && new_x < N && 0 <= new_y && new_y < N)
            {
                //���� �ȿ� �ְ�
                if (dp[cur_x][cur_y] + map[new_x][new_y] < dp[new_x][new_y])
                {
                    //���� ������ ���� ��� + ���� ��ǥ(new_x,new_y)�� ���� < ���� ��ǥ�� ���� ��� �̶��
                    dp[new_x][new_y] = dp[cur_x][cur_y] + map[new_x][new_y];
                    //���� ������ ���� ��� + ���� ��ǥ ���̸� ���� ��ǥ�� ���� ��뿡�ٰ� �־��ְ�
                    q.push(make_pair(new_x, new_y)); //���� ��ǥ�� ť�� �ֱ�
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
        cin >> N; //N�Է� �ް�
        Init(); //�ʱ�ȭ
        for(int i=0;i<N;i++)
            for(int j=0;j<N; j++)
                scanf("%1d",&map[i][j]); //���Է¹���
                solve(); //solve�Լ� ȣ��
                Answer = dp[N-1][N-1]; //����ֱ� ->���� ���� �ִ°� �̻��ϴ�.
                cout << "#" << test_case << " " << Answer <<endl;
    }
    return 0;
 }
 */
//1. 0�� �ƴ����� ã�� ��� ���� ������ ���Ѵ�.
//2. �ش��ϴ� ����� 0���� �ٲ��ش�.
//3. Node ����ü�� �̿��Ͽ� ��� ���� ���� ������ ���Ϳ� �����Ѵ�.
//4. ������ ���Ǵ�� ������ �� ����Ѵ�.
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
        int ax = x + dx[i]; //�켱 �̰� dfs�� bfs�ҋ� ���� ������ ���ε� �̰� x������ �̵���Ű�� 
        int ay = y + dy[i]; // �̰� y������ ���� �̵���Ű�� �ڵ������ϱ� �̰� Ȯ���غ���
        if(ax >=0 && ay >=0 && ax < n && ay < n && map[ax][ay] !=0){
            dfs(ax,ay);
        }
    }
}

//���� �� compare_node�� ���ؼ� Ǯ��� �ϴ� ���� �𸣰����� 
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
                    int k = i+1; //k�� i+1�� �׻� �ʱ�ȭ ���ִ°� ���� �� �ٸ� �� ������ �ٽ� �ʱ�ȭ �ؾ� �Ǵϱ�

                    //���� ������ ������ �κ�
                    while(true){
                        if(k >=100 || map[k][j]==0)
                        break;
                        if(map[k][j] !=0){
                            k++;
                            row_cnt++;
                        }
                    }   

                    //k�� j+1�� �ʱ�ȭ ���ִ� ������ �ٽ� ���� ������ �Ǵٸ� �� ����� �ʱ�ȭ �ؾ� �ϴϱ�
                    k = j+1;
                    //���� ������ ������ �κ�
                    while(true){
                        if(k >=100 || map[i][k] ==0 )
                        break;
                        if(map[i][k] !=0){
                            k++;
                            col_cnt++;
                        }
                    }
                    dfs(i,j);
                    //��� ���� ������ ī��Ʈ ���ְ� �� �ΰ��� ���� ���� ����� ũ��ϱ� 
                    //ũ�� �� �ؾ��ϴ°� ũ�Ⱑ ������ ���� ���� ������ ����ؾ� �ϱ� ������
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
//���� Ǯ�̰� ������ �׷��� Ǯ�� ���� �׳� �� ������ Ǯ� �� ���ϴ°� �ְ��̴�.

//c++���� ���ʹ� queue���� �����̱� ������ �׳� �ϸ� �ɵ�
