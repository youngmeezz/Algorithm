package baekjoon;

import java.util.*;
import java.io.*;

public class baekjoon2194{

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;

    static int r,c,a,b,k;
    static int map[][];
    static int[][] dpice,dpjung,dpocean;

    static boolean visit[][];

    static int dx[] = {0,1,0,-1}; //우,하,좌,상
    static int dy[] = {1,0,-1,0};

    public static void main(String[] args) throws NumberFormatException, IOException {

        st = new StringTokenizer(br.readLine());
        r = Integer.parseInt(st.nextToken());//맵 크기 rxc
        c = Integer.parseInt(st.nextToken());
        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        map = new int[r][c];
        visit = new boolean[r][c];

        for(int i=0;i<k;i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken())-1;
            int y = Integer.parseInt(st.nextToken())-1;

            map[x][y]=-1;

        }

        st = new StringTokenizer(br.readLine());
        int stx = Integer.parseInt(st.nextToken())-1;
        int sty = Integer.parseInt(st.nextToken())-1;

        st = new StringTokenizer(br.readLine());
        int edx = Integer.parseInt(st.nextToken())-1;
        int edy = Integer.parseInt(st.nextToken())-1;

        //insert 끝난문장
        

        //exception시작
        if(r<a && c<b){
            bw.write(String.valueOf(-1));
            bw.flush();
            return;
        }

        //sol bfs
        int min = Integer.MAX_VALUE;
        Queue<Node> q = new LinkedList<>();
        q.add(new Node(stx,sty,0));
        visit[stx][sty] = true;

        while(!q.isEmpty()){
            Node cur = q.poll();

            //ends.option.
            if(cur.x == edx && cur.y == edy){
                min = Math.min(min,cur.cnt);
            }

            int x = cur.x;
            int y = cur.y;

            for(int i=0;i<4;i++){
                int nx = x + dx[i];
                int ny = y + dy[i];

                //다음칸이 범위 안이고 && 장애물이 걸리지 않는다면
                if(inrage(nx,ny) && ispossible(nx,ny)){
                    //방문하지 않았다면
                    if(!visit[nx][ny]){
                        q.add(new Node(nx,ny,cur.cnt+1));
                        visit[nx][ny] = true;
                    }
                }
            }

        }//while loop : bfs

        if(min == Integer.MAX_VALUE)
            bw.write(String.valueOf(-1));
        else bw.write(String.valueOf(min));
        bw.flush();

    }//main

    private static boolean ispossible(int nx, int ny){
        //유닛 움직이는 범위 안에 장애물, 범위 벗어나지 않을때
        if(nx+a-1<r && ny+b-1<c){
            for(int i=nx;i<=nx+a-1;i++){
                for(int j=ny; j<=ny+b-1;j++){
                    //유닛이 움직이는 범위에 장애물이 있으면 return
                    if(map[i][j] == -1) return false;
                }
            }
        }else return false;

        //범위에 장애물 없고 범위 안이면 true
        return true;
    }

    private static boolean inrage(int nx, int ny){
        if(nx>=0 && ny>=0 && nx<r && ny<c)
        return true;
        else return false;
    }

}//class의 끝

class Node{
    int x,y,cnt;
    public Node(int x,int y,int cnt){
        this.x = x;
        this.y = y;
        this.cnt = cnt;
    }
}