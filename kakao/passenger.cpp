#include <vector>

using namespace std;

//시간복잡도 : O(n^2)
//공간복잡도 : O(N^2)
//사용한 알고리즘:동적 계획법, Bottom-Up
//사용한 자료구조 : 3차원 배열

int a[501][501];
int d[501][501][2];
int MOD = 20170805;

//전역변수를 정의 할 경우 함수 내에 초기화 코드를 꼭 작성해주세요.
int solution(int m,int n,vector<vector<int>> city_map){

    for(int i=0;i<=m;i++){
        for(int j=0;j<=n;j++){
            a[i][j] = 0;
            d[i][j][0] = 0;
            d[i][j][1] = 0;

        }
    }

    for(int i=1;i<=m;i++){
        for(int j=1;j<=n;j++){
            a[i][j] = city_map[i-1][j-1];
        }
    }

    d[1][1][1] = 1;// 1,1에 왼쪽에서 왔다고 하자
    for(int i=1;i<=m;i++){
        for(int j=1;j<=n;j++){
            if(i==1 && j==1) continue;

            //위에서 올때
            if(a[i-1][j] ==0){
                d[i][j][0] = (d[i-1][j][0] + d[i-1][j][1])%MOD;
            }else if(a[i-1][j] ==1){
                d[i][j][0] = 0;
            }else{
                d[i][j][0] = d[i-1][j][0]%MOD;
            }
            
            //왼쪽에서 올때
            if(a[i][j-1] == 0){
                d[i][j][1] = (d[i][j-1][1] + d[i][j-1][0])%MOD;
            }else if(a[i][j-1] == 1){
                d[i][j][1] = 0;
            }else{
                d[i][j][1] = d[i][j-1][1]%MOD;
            }
            }
        }
        int answer = (d[m][n][0]%MOD + d[m][n][1]%MOD)%MOD;
        return answer;
    }
