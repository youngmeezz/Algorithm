//정사각형안에 모두 1이 채워져 있어야 한다.
//직사각형이 아닌 정사각형임을 주의하자
//Dynamic Programming을 이용한 풀이
//a지점을 오른쪽 아래 꼭지점으로 하는 정사각형 중 가장 큰 정사각형의 크기는 얼마일까요
//a가 0이라면 가장 큰 정사각형의 크기는0입니다.
//a가 1이라면 가장 큰 정사각형의 크기를 구 할 수 있습니다.
//1,2,3을 오른쪽 아래로 하는 최대 정사각형의 크기를 알고 있다고 하겠습니다.
//이떄 a를 오른쪽 아래로 하는 정사각형 중 가장 큰 정사각형은 1,2,3의 경계선 중에서 가장 가까운 값을 선택하면 됩니다.
/*
#include<vector>
using namespace std;

int dp[1001][1001] = {0};
int solution(vector<vector<int>> board){

    int ans =0;
    int row = board.size();
    int col = board[0].size();
    for(int i=1;i<= row; i++)
        for(int j=1;j<=col;j++)
            if(board[i-1][j-1] != 0){
                    dp[i][j] = min(dp[i][j-1], min(dp[i-1][j], dp[i-1][j-1]))+1;
                    ans = max(ans,dp[i][j]);
            }
            return ans * ans;
}
*/
#include<iostream>
#include<vector>
#include<algorithm> //min함수 사용 위한
#include<math.h> //pow함수 사용 위한
using namespace std;

int solution(vector<vector<int>> board){
    
    int lengthX = board.size(); //행의 갯수
    int lengthY = board[0].size(); //열의 갯수
    int max=0; //최댓값

    if(lengthX<2 || lengthY<2){ //행열의 값이 하나라도 2미만일때 1이 있으면 max는 1
        for(int i=0;i<lengthX;i++){
            for(int j=0;j<lengthY;j++){
                if(board[i][j] == 1){
                    max =1;
                }
            }
        }
    }
    else
    {
        for(int i=1;i<lengthX;i++){
            for(int j=1;j<lengthY;j++){
                if(board[i][j]==1){
                    board[i][j]=min({board[i-1][j-1],board[i-1][j],board[i][j-1]})+1;
                    //좌측,상측,좌상측의 최솟값에 +1 한 값을 현 위치에 저장
                    if(board[i][j]>max){
                        max = board[i][j];
                    }
                }
            }
        }
    }
return pow(max,2);

}