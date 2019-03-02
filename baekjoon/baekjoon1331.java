package baekjoon;

import java.io.*;
import java.util.*;

public class baekjoon1331{
    static boolean visited[][] = new boolean[7][7];
    static String a;
    static String startA;
    static int x,y,px,py;
    static int input[][] = new int[37][3];

    static int dx[] = {1,2,2,1,-1,-2,-2,-1};
    static int dy[] = {2,1,-1,-2,-2,-1,1,2};

    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for(int i=0;i<36;i++){
            String a = br.readLine();  
            x = a.charAt(0)-'A';
            y = a.charAt(1)-'1';
            input[i][0] = x;
            input[i][1] = y;
            if(i>0){
                px = input[i-1][0];
                py = input[i-1][1];
            }
            if(visited[x][y])
            break;
            visited[x][y] = true;

            boolean case3 = false;
            for(int j=0;j<8;j++){
                int nx = px + dx[j];
                int ny = py + dy[j];

            if(nx<0 || nx>5 || ny<0 || ny>5)
            continue;
            if(nx ==x && ny==y)
            case3 =true;
            }
            if(!case3 && i!=0)
            break;
        }
        for(int i=0;i<6;i++){
            for(int j=0;j<6;j++){
                if(!visited[i][j]){
                    bw.write(String.valueOf("Invalid"));
                    bw.flush();
                    System.exit(0);
                }
            }
        }

        boolean case4 = false;
        for(int j=0;j<8;j++){
            int nx = input[0][0] + dx[j];
            int ny = input[0][1] + dy[j];
            if(nx<0 || nx>5 || ny<0 || ny>5)
            continue;
            if(nx==input[35][0] && ny == input[35][1])
            case4 = true;
        }
        if(!case4){
            bw.write(String.valueOf("Invalid"));
            bw.flush();
            System.exit(0);
        }

        bw.write(String.valueOf("Valid"));
        bw.flush();
        }
    }