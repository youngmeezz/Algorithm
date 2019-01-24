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
                Answer = dp[N-1][N-1]; //정답넣기
                cout << "#" << test_case << " " << Answer <<endl;
    }
    return 0;
 }

