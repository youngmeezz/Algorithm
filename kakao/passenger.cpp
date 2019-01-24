#include <vector>

using namespace std;

//�ð����⵵ : O(n^2)
//�������⵵ : O(N^2)
//����� �˰���:���� ��ȹ��, Bottom-Up
//����� �ڷᱸ�� : 3���� �迭

int a[501][501];
int d[501][501][2];
int MOD = 20170805;

//���������� ���� �� ��� �Լ� ���� �ʱ�ȭ �ڵ带 �� �ۼ����ּ���.
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

    d[1][1][1] = 1;// 1,1�� ���ʿ��� �Դٰ� ����
    for(int i=1;i<=m;i++){
        for(int j=1;j<=n;j++){
            if(i==1 && j==1) continue;

            //������ �ö�
            if(a[i-1][j] ==0){
                d[i][j][0] = (d[i-1][j][0] + d[i-1][j][1])%MOD;
            }else if(a[i-1][j] ==1){
                d[i][j][0] = 0;
            }else{
                d[i][j][0] = d[i-1][j][0]%MOD;
            }
            
            //���ʿ��� �ö�
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
