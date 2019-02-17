//¶¥µû¸Ô±â ¹®Á¦ 
#include<vector>
#include<algorithm>
using namespace std;

int dp[10001][4] = {0};

int pretest5(vector<vector<int>> land)
{
    int r = land.size();
    for(int i=0;i<4;i++)
        dp[0][i] = land[0][i];
    for(int i=1;i<r;i++){
        for(int j=0;j<4;j++){
            for(int k=0;k<4;k++){
                if(j!=k)
                    dp[i][j] = max(dp[i][j],land[i][j] + dp[i-1][k]);
                    int ans =0;
                    for(int i=0;i<4;i++)
                    ans = max(ans,dp[r-1][i]);
                    return ans;
            }
        }
    }
}
