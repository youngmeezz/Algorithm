//정사각형안에 모두 1이 채워져 있어야 한다.
//직사각형이 아닌 정사각형임을 주의하자
//Dynamic Programming을 이용한 풀이
//a지점을 오른쪽 아래 꼭지점으로 하는 정사각형 중 가장 큰 정사각형의 크기는 얼마일까요
//a가 0이라면 가장 큰 정사각형의 크기는0입니다.
//a가 1이라면 가장 큰 정사각형의 크기를 구 할 수 있습니다.
//1,2,3을 오른쪽 아래로 하는 최대 정사각형의 크기를 알고 있다고 하겠습니다.
//이떄 a를 오른쪽 아래로 하는 정사각형 중 가장 큰 정사각형은 1,2,3의 경계선 중에서 가장 가까운 값을 선택하면 됩니다.

#include<vector>
using namespace std;

int dp[1001][1001] = {0}; //dp배열을 1000x1000로 만들어준다. 
int solution(vector<vector<int>> board){

    int ans =0;
    int row = board.size();//가로길이
    int col = board[0].size();//세로길이

    //각 칸을 순회하기 위해서 이중 포문 작성
    for(int i=1;i<= row; i++)
        for(int j=1;j<=col;j++)
        //(1,1)인덱스부터 시작해 놓고 그다음에는 벗어날 범위를 구할수있게 하려면 i-1,j-1을 해줘서 0의 값을 순회가능
        //이때 식에서 봤듯이 0,0부터 시작을 했을때 0의 인덱스 범위를 벗어날 수 있으니까 
            //board는 0,0
            if(board[i-1][j-1] != 0){
                    dp[i][j] = min(dp[i][j-1], min(dp[i-1][j], dp[i-1][j-1]))+1;
                   
                   //answer 를 매번 갱신을 해준다.
                   //현재 ans 가 큰지 dp[i][j] 가 큰지 비교해서 더 큰것 꺼내 넣어줌ans에다가
                    ans = max(ans,dp[i][j]);
            }
            return ans * ans;//가장 큰 한 변의 길이가 들어있어서 return을 제곱해 주는게 중요하다.
}

/*
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
*/
