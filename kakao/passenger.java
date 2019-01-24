package kakao;

import java.util.Scanner;

class passenger{
    int MOD = 20170805;
    public int solution(int m,int n,int[][] cityMap){
        Intersaction[][] ixs = new Intersaction[500][500];
        for(int i=0;i<500;i++){
            for(int j=0;j<500;j++){
                ixs[i][j] = new Intersaction();
            }
        }

        for(int r =0;r< cityMap.length;r++){
            for(int c =0;c<cityMap[0].length;c++){
                if(r == 0 && c == 0){
                    ixs[0][1].fromLeft = cityMap[0][1] != 1 ? 1: 0;
                    ixs[1][0].fromTop = cityMap[1][0] !=1 ? 1 : 0;
                    continue;
                }
                //���� ��ġ�� Ÿ��
                if(cityMap[r][c] ==1) continue;
                switch(cityMap[r][c]){
                    case 0:
                    //���� ���� �ֵ�
                    //(fromRight + fromTop) ���ؼ� ����
                    //��� �������� �� ���� �� �� �ִ°����� üũ
                    int localTotal = ixs[r][c].fromLeft + ixs[r][c].fromTop;
                    if(isRange(r,c+1,m,n) && (cityMap[r][c+1] !=1)){
                        //������ ����
                        ixs[r][c+1].fromLeft +=localTotal % MOD;
                    }
                    if(isRange(r+1,c,m,n) && (cityMap[r+1][c] !=1)){
                        //�Ʒ���
                        ixs[r+1][c].fromTop +=localTotal % MOD;
                    }
                    break;
                    case 2:
                    //�Դ� �������θ� �� �� �ִ�
                    //��, fromLeft����ִ°� ���������� ����
                    if(isRange(r,c+1,m,n) && (cityMap[r][c+1] !=1))
                    ixs[r][c+1].fromLeft +=ixs[r][c].fromLeft % MOD;
                    //fromTop�� ��� �ִ°� �Ʒ��� ����
                    if(isRange(r+1,c,m,n) && (cityMap[r+1][c]!=1))
                    ixs[r+1][c].fromTop +=ixs[r][c].fromTop % MOD;
                    break;
                    }
                }
            }
            Intersaction last = ixs[cityMap.length-1][cityMap[0].length-1];

            return (last.fromLeft + last.fromTop) % MOD;
        }

        private boolean isRange(int y, int x, int m, int n){
            return (x>=0) && (x<n) && (y>=0) &&(y<m);
        }
        class Intersaction{
            public int fromLeft;
            public int fromTop;
            public Intersaction(){
                this.fromLeft = 0;
                this.fromTop = 0;
            }
        }
    }
        
    
