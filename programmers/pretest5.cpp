//땅따먹기 문제 
#include<vector>
#include<algorithm>
using namespace std;

int dp[10001][4] = {0};//주어진 입력의 최대행의 갯수가 10만개이기떄문에 십만 1개 4개의 열의 갯수 땅따먹기 구조

int pretest5(vector<vector<int>> land)
{
    int r = land.size();//땅의 크기 

//가장 base케이스 초기화
    for(int i=0;i<4;i++)
        dp[0][i] = land[0][i];//가장 첫번째 행은 갈곳이 없기때문에 더이상 이동하는 방향이 없을 때에는 land값 자체를 dp에 저장함

    for(int i=1;i<r;i++){ //1~r번째 행까지 for문 돌리기 위에서 내려오는 밑에서 올라오는 최대 점수가 같기 떄문에 밑에서 위로 올라갈떄 얻을수 있는 최대 점수구하기

        for(int j=0;j<4;j++){//각 열에 대해서 계산을 한번씩 해야되서 for문 4번 돌림
            for(int k=0;k<4;k++){ //각 열에 대해서 이동할수있는 방법이 4가지 이기때문에 원래 3가지이지만 같은열도 일단 이동하는걸로 작성

                if(j!=k)//각 열에서 이동하는 열이 같은 열이면 안된다 같지 않은 경우에만 dp배열을 그린다.
                    dp[i][j] = max(dp[i][j],land[i][j] + dp[i-1][k]); //각각의 행에 대해서 그 열에서 이동할 수 있는 3가지 방법이 구해진다.x값을 구한 것이 됨

                    //for문 빠져 나오고 
                    int ans =0;
                    for(int i=0;i<4;i++)
                    ans = max(ans,dp[r-1][i]);//r-1번쨰 행에는 각 열에서 출발했을떄 얻을수있는 최대 점수가 들어있다. 그중 max값을 찾아 리턴 for문 돌려줌
                    return ans;
            }
        }
    }
}
