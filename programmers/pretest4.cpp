//���簢���ȿ� ��� 1�� ä���� �־�� �Ѵ�.
//���簢���� �ƴ� ���簢������ ��������
//Dynamic Programming�� �̿��� Ǯ��
//a������ ������ �Ʒ� ���������� �ϴ� ���簢�� �� ���� ū ���簢���� ũ��� ���ϱ��
//a�� 0�̶�� ���� ū ���簢���� ũ���0�Դϴ�.
//a�� 1�̶�� ���� ū ���簢���� ũ�⸦ �� �� �� �ֽ��ϴ�.
//1,2,3�� ������ �Ʒ��� �ϴ� �ִ� ���簢���� ũ�⸦ �˰� �ִٰ� �ϰڽ��ϴ�.
//�̋� a�� ������ �Ʒ��� �ϴ� ���簢�� �� ���� ū ���簢���� 1,2,3�� ��輱 �߿��� ���� ����� ���� �����ϸ� �˴ϴ�.
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
#include<algorithm> //min�Լ� ��� ����
#include<math.h> //pow�Լ� ��� ����
using namespace std;

int solution(vector<vector<int>> board){
    
    int lengthX = board.size(); //���� ����
    int lengthY = board[0].size(); //���� ����
    int max=0; //�ִ�

    if(lengthX<2 || lengthY<2){ //�࿭�� ���� �ϳ��� 2�̸��϶� 1�� ������ max�� 1
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
                    //����,����,�»����� �ּڰ��� +1 �� ���� �� ��ġ�� ����
                    if(board[i][j]>max){
                        max = board[i][j];
                    }
                }
            }
        }
    }
return pow(max,2);

}