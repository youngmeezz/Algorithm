package baekjoon;

/*
import java.util.Scanner;
//public static void main()
public class drangoncurve{

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[][] pattern = new int[4][1024];
    boolean[][] map = new boolean[101][101];

    pattern[0][0] = 0;
    pattern[1][0] = 1;
    pattern[2][0] = 2;
    pattern[3][0] = 3;

    //µå·¡°ï Ä¿ºê ¼ÂÆÃ
    for(int k =0;k<4;k++){
        for(int i=1;i<=10;i++){
            int start = (int)Math.pow(2,i-1);
            int end = (int)Math.pow(2,i);
            for(int j=start,l=1;j<end;j++,l+=2){
                pattern[k][j] = pattern[k][j-1] + 1 == 4? 0:pattern[k][j-1] +1;
            }
        }
    }

    //µå·¡°ï Ä¿ºê ±×¸®±â
    for(int i=0;i<n;i++){
        int x = sc.nextInt();
        int y = sc.nextInt();
        int d = sc.nextInt();
        int g = sc.nextInt();
        int end = (int)Math.pow(2,g);

        int currentX = x;
        int currentY = y;
        map[currentY][currentX] = true;

        for(int j=0;j<end;j++){
            if(pattern[d][j] ==0){
                currentX +=1;
            }else if(pattern[d][j] ==1){
                currentY -=1;
            }else if(pattern[d][j] ==2){
                currentX -=1;
            }else{
                currentY +=1;
            }
            map[currentY][currentX] = true;
            }
        }
    //¸Ê Å½»ö
    int cnt =0;
    for(int i=0;i<100;i++){
        for(int j=0;j<100;j++){
            if(map[i][j] && map[i][j+1] && map[i+1][j] && map[i+1][j+1]){
            cnt++;
        }
    }    
}
System.out.println(cnt);
    
}
}
*/
import java.util.*;

public class drangoncurve{
    static boolean[][] map = new boolean[101][101];
    static int[] dx = {1,0,-1,0};
    static int[] dy = {0,-1,0,1};
    static int N;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        int[][] dc = new int[N][4];
        for(int i=0;i<N;i++)
            for(int j=0;j<4;j++)
                dc[i][j]=sc.nextInt();
            go(dc);
            int count=0;
            for(int i=0;i<100;i++)
                for(int j=0;j<100;j++)
                if(map[i][j] && map[i][j+1] && map[i+1][j] && map[i+1][j+1])
                count++;
                System.out.println(count);
    }
    static void go(int[][] dc){
        for(int i=0;i<N;i++){
            ArrayList<Integer> al = new ArrayList<Integer>();
            al.add(dc[i][2]);
            for(int j=0;j<dc[i][3];j++){
                int size = al.size();
                for(int k=size-1;k>=0;k--){
                    int temp = al.get(k);
                    if(temp==3)al.add(0);
                    else al.add(temp+1);
                }
            }
            int x=dc[i][0];
            int y=dc[i][1];
            map[y][x] =true;
            for(int j=0;j<al.size();j++){
                y = y+dy[al.get(j)];
                x = x+dx[al.get(j)];
                map[y][x] = true;
            }
        }
    }
}