package baekjoon;


//��ٸ��� ���μ��� �߰��ؼ�, ��ٸ� ������ ����� �����Ϸ��� �Ѵ�. �̶�, i�� ���μ��� ����� i���� ���;� �Ѵ�. (���Ʒ� �� ¦�� �־�� �Ѵ�.)
//�׷��� �ϱ� ���ؼ� �߰��ؾ� �ϴ� ���μ� ������ �ּڰ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

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
                return;//�̰Ÿ� ����߸� �ð� �ʰ��� ���� �ʴ´�.
            } 
            if(found)
            return;//�̰��� �ǵ��� �� �𸣰ڴ�

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