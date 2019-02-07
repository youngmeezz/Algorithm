//벽부수고 이동하기 2버전으로 1에서는 1개의 벽만 뚫을 수 있었는데 2버전은 k개의 벽을 뚫을 수 있다.

#include<stdio.h>
#include<queue>
#include<algorithm>
#include <string.h>

using namespace std;

const int dx[] = {0,1,-1,0};
const int dy[] = {1,0,0,-1};

int N,M,K;
int dp[1001][1001][11];
char A[1001][1001];

struct ABC{
    int x,y,k;
    ABC(int x, int y, int k):x(x),y(y),k(k){}
};
int main(){
    scanf("%d %d %d",&N,&M,&K);

    for(int i=0;i<N;i++)
        scanf("%s",A[i]);

    queue<ABC> q;
    q.push(ABC(0,0,0));
   memset(dp, 0x3f, sizeof(dp));
    dp[0][0][0] =1;
    while(!q.empty()){
        ABC now= q.front();
        q.pop();
        for(int i=0;i<4;i++){
            int nx = now.x + dx[i], ny = now.y + dy[i];
            int nk = now.k + A[nx][ny] - '0';
            int nd = dp[now.x][now.y][now.k] + 1;
            if(nx <0 || N<=nx || ny <0 || M <=ny) continue;
            if(nk <=K && dp[nx][ny][nk] > nd){
                dp[nx][ny][nk] = nd;
                q.push(ABC(nx,ny,nk));
            }
        }
    }
        int ans = 1e9;
        for(int i=0;i<=K;i++)
        ans = min(ans,dp[N-1][M-1][i]);

        if(ans ==1e9) ans =-1;
        printf("%d",ans);
        return 0;
    }
