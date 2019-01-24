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
                Answer = dp[N-1][N-1]; //����ֱ�
                cout << "#" << test_case << " " << Answer <<endl;
    }
    return 0;
 }

