package baekjoon;

/*
import java.util.ArrayList;
import java.util.Scanner;
import java.awt.Point;
import java.io.FileInputStream;

class baekjoon7562 {
    static int l;
    static int[][] map;
    static int[][] visited;
    static ArrayList<Point> queue;

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int test_case = 0; test_case < T; test_case++) {
            l = sc.nextInt();

            map = new int[l][l];

            int curr_x = sc.nextInt();
            int curr_y = sc.nextInt();

            int end_x = sc.nextInt();
            int end_y = sc.nextInt();

            visited = new int[l][l];
            queue = new ArrayList<Point>();

            BFS(curr_x, curr_y, end_x, end_y);
        }
    }

    static void BFS(int curr_x, int curr_y, int end_x, int end_y) {
        int[] move_x = { -2, -1, 1, 2, 2, 1, -1, -2 };
        int[] move_y = { -1, -2, -2, -1, 1, 2, 2, 1 };

        int level = 0;
        visited[curr_x][curr_y] = 1;
        queue.add(new Point(curr_x, curr_y));

        while (queue.isEmpty() != true) {
            int queue_size = queue.size();

            for (int i = 0; i < queue_size; i++) {
                curr_x = queue.get(0).x;
                curr_y = queue.get(0).y;
                queue.remove(0);

                if (curr_x == end_x && curr_y == end_y) {
                    System.out.println(level);
                    break;
                }
                for (int j = 0; j < 8; j++) {
                    int next_x = move_x[j] + curr_x;
                    int next_y = move_y[j] + curr_y;

                    if (next_x < l && next_y < l && next_x >= 0 && next_y >= 0) {
                        if (visited[next_x][next_y] == 0) {
                            visited[next_x][next_y] = 1;
                            queue.add(new Point(next_x, next_y));
                        }
                    }
                }
            }
            level++;
        }
    }
}
*/
/*
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class baekjoon7562{
    public static int des_x;
    public static int des_y;
    public static boolean[][] visited;
    public static int N;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while(T-- > 0){
            N = sc.nextInt(); //체스판의 크기
            //int[][] map = new int[N][N];
            visited = new boolean[N][N];//여기서 체스판으로 구함
            int now_x = sc.nextInt();
            int now_y = sc.nextInt();
            des_x = sc.nextInt();
            des_y = sc.nextInt();
            int cnt =0;
            
            System.out.println(bfs(now_x,now_y,cnt));

        }
    }
    public static class Pair{
        int x,y;
        Pair(int x, int y){
            this.x = x;
            this.y = y;
        }
    }

    public static int bfs(int x,int y,int cnt){
        
        Queue<Pair> q = new LinkedList<Pair>();
        q.add(new Pair(x,y));
        cnt = 0;
        int[] dx = {1,2,2,1,-1,-2,-2,-1};
        int[] dy = {2,1,-1,-2,-2,-1,1,2};

        while(!q.isEmpty()){
            int q_size = q.size();
            for(int i =0;i<q_size;i++){
                Pair pair = q.poll();
                x = pair.x;
                y = pair.y;

                if(x == des_x && y == des_y){
                    return cnt;
                }

                for(int j=0;j<8;j++){
                    int nx = x + dx[j];
                    int ny = y + dy[j];
                    if(nx >=0 && nx < N && ny >=0 && ny< N){
                        if(visited[ny][nx] == false){
                            visited[ny][nx] = true;
                            q.add(new Pair(nx,ny));
                        }
                    }
                }
            }
            cnt++;
        }
        return cnt;
    }
}
*/

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class baekjoon7562{
    public static void main(String[] args){
        
        class POINT {
             int x,y;
             public POINT(int x,int y)
             {
                 this.x = x;
                 this.y = y;
             }
        }

        Scanner input = new Scanner(System.in);
        int x[] = {-2,-1,1,2,2,1,-2,-1};
        int y[] = {1,2,2,1,-1,-2,-1,-2};

        int Case_n = input.nextInt();
        for(int z=0;z<Case_n;z++){
            int l = input.nextInt();
            int Start_x = input.nextInt();
            int Start_y = input.nextInt();
            int End_x = input.nextInt();
            int End_y = input.nextInt();

            int map[][] = new int[l][l];
            for(int i=0;i<l;i++){
                for(int j=0;j<l;j++){
                    map[i][j] =0;
                }
            }
            Queue<POINT> q = new LinkedList<POINT>();
            POINT point = new POINT(Start_x,Start_y);
            q.offer(point);

            while(!q.isEmpty())
            {
                POINT L = q.poll();
                if(L.x == End_x && L.y == End_y)
                    break;
                for(int i=0;i<x.length;i++)
                {
                    int a=L.x+x[i];
                    int b=L.y+y[i];

                    if((a>=l||a<0||b>=l||b<0) || (!(map[a][b]==0)))
                    {
                        continue;
                    }
                    else{
                        map[a][b] = map[L.x][L.y]+1;
                        point = new POINT(a,b);
                        q.offer(point);
                    }
                }
            }
            System.out.println(map[End_x][End_y]);
        }
    }
}