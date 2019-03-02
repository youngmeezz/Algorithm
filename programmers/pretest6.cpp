#include<vector>
using namespace std;

int dp1[100001]; //첫번째 스티커를 뜯은 경우
int dp2[100001]; //첫번째 스티커를 뜯지 않은 경우

int pretest6(vector<int> sticker)
{
    int n = sticker.size();
//스티커가 한장이라면
    if(n == 1)
        return sticker[0];

//스티커가 적어도 2장 이상인경우

    //첫 번째 스티커를 뜯은 경우
    //첫번째 인덱스와 두번째 인덱스를 초기화 시켜준다.
    dp1[0] = sticker[0];
    dp1[1] = dp1[0];

    //첫번째 스티커 반드시 뜯은 경우 n-1번째 스티커를 뜯으면 안되기 때문에 n-2까지 for문 돈다.(dp가 0부터 시작해서 n-1이 마지막 숫자임)
    for(int i=2;i<n-1;i++){
        dp1[i] = max(dp1[i-1],dp1[i-2] + sticker[i]);
        //dp1[n-2]에 답이 들어있게 됩니다.첫번쨰 스티커부터 마지막스티커까지 적절히 잘뜯었을때 들어있는 최대 정수
    
    
    //첫번째 스티커를 뜯지 않은 경우
    dp2[0] = 0;
    dp2[1] = dp2[0];
    for(int i=2;i<n;i++){
        dp2[i] = max(dp2[i-1],dp2[i-2] + sticker[i]);
        //dp2[n-1]에 답이 들어있게 됩니다.
    }
    }
   // int answer = 36;
    return max(dp1[n-2],dp2[n-1]);
}