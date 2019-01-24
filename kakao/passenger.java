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
                //지금 위치의 타입
                if(cityMap[r][c] ==1) continue;
                switch(cityMap[r][c]){
                    case 0:
                    //어디든 갈수 있따
                    //(fromRight + fromTop) 합해서 전달
                    //대신 다음으로 갈 곳이 갈 수 있는곳인지 체크
                    int localTotal = ixs[r][c].fromLeft + ixs[r][c].fromTop;
                    if(isRange(r,c+1,m,n) && (cityMap[r][c+1] !=1)){
                        //오른쪽 부터
                        ixs[r][c+1].fromLeft +=localTotal % MOD;
                    }
                    if(isRange(r+1,c,m,n) && (cityMap[r+1][c] !=1)){
                        //아래로
                        ixs[r+1][c].fromTop +=localTotal % MOD;
                    }
                    break;
                    case 2:
                    //왔던 방향으로만 갈 수 있다
                    //즉, fromLeft담겨있는걸 오른쪽으로 전달
                    if(isRange(r,c+1,m,n) && (cityMap[r][c+1] !=1))
                    ixs[r][c+1].fromLeft +=ixs[r][c].fromLeft % MOD;
                    //fromTop에 담겨 있는걸 아래로 전달
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
        
    
