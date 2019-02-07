package baekjoon;


//사다리에 가로선을 추가해서, 사다리 게임의 결과를 조작하려고 한다. 이때, i번 세로선의 결과가 i번이 나와야 한다. (위아래 다 짝이 있어야 한다.)
//그렇게 하기 위해서 추가해야 하는 가로선 개수의 최솟값을 구하는 프로그램을 작성하시오.

import java.util.*;

public class baekjoon15684{

        static int[][] field;
        static boolean found = false;
        static int N,M,H;

        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            N = sc.nextInt();
            M = sc.nextInt();
            H = sc.nextInt();
            int res = -1;

            field = new int[H+1][N+1];

            for(int i=0;i<M;i++){
                int inputX = sc.nextInt();
                int inputY = sc.nextInt();
                field[inputX][inputY] = 1;
            }

            for(int latter =0; latter <=3; latter++){
                generateLadders(latter,1);
                if(found){
                    res = latter;
                    break;
                }
            }
            System.out.println(res);
        }

    private static void generateLadders(int count, int x){
        if(!found){
            if(count ==0){
                found = check();
                return;//이거를 써줘야만 시간 초과가 나지 않는다.
            } 
            if(found)
            return;//이거의 의도를 잘 모르겠다

            for(int i=x;i<=H;i++){
                for(int j=1;j<N;j++){
                    if(field[i][j-1] ==1 || field[i][j] ==1 || field[i][j+1] == 1){
                        continue;
                    }
                    field[i][j] = 1;
                    generateLadders(count-1,i);
                    field[i][j] =0;
                }
            }
        }
    }
private static boolean check(){
    for(int i=1;i<=N;i++){
        int y = i;
        for(int x = 1;x<=H;x++){
            if(field[x][y] == 1){
                y +=1;
            }else if(field[x][y-1] ==1){
                y-=1;
            }
        }
        if(i !=y){
            return false;
        }
    }
    return true;
}

private static void printField(){
    for(int i=1;i<=H;i++){
        for(int j=1;j<=N;j++){
            System.out.print(field[i][j] + " ");
        }
        System.out.print("\n");
    }
    System.out.print("\n");
    System.out.print("\n");
}
}