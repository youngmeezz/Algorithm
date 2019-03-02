package baekjoon;
//미로탐색
//단순 bfs문제로 어렵지 않다
//1. 다음 방문할 점을 큐에 넣는다.
//2. 큐에서 빼온다음 다음 갈 곳이 조건에 벗어나지 않는다면 큐에 넣는다.
//3. 큐가 빌때까지 계속한다.(내가 원하는 점에 왔을 때 return해줘도 가능하지 않을까?)
import java.util.*;
import java.io.*;


public class baekjoon2178{
    static int[][] arr;
    static boolean[][] visited;
    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,-1,0,1};
    static int N;
    static int M;

    public static void main(String[] args) throws Exception{

        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       // BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
       Scanner sc = new Scanner(System.in);

       // N = br.read();
      //  N = sc.nextInt();
       // M = br.read();
      // M = sc.nextInt();
      //이부분이 중요 자꾸 4 6 입력시 string값 받으면서 동시 입력 안되는데 이런식으로 string을 split 끊어 줘야 한다.
       String word = sc.nextLine();
       String array[] =word.split(" "); 

       N = Integer.parseInt(array[0]);
       M = Integer.parseInt(array[1]);

        arr = new int[N][M];
        visited = new boolean[N][M];

        for(int i=0;i<N;i++){

           // String str = String.valueOf(br.readLine());
          // String str = br.readLine();
          String str = sc.nextLine();
            for(int j=0;j<M;j++){
                arr[i][j] = str.charAt(j)-'0';
                visited[i][j] = false;
            } 
        }
        visited[0][0] = true;
        BFS(0,0);
        System.out.println(arr[N-1][M-1]);

    }
    static public void BFS(int x,int y){
        Queue<Dot> q = new LinkedList<Dot>();
        q.add(new Dot(x,y));

        //큐가 끝날때까지
        while(!q.isEmpty()){
            Dot d = q.poll();
            for(int i=0;i<4;i++){
                //다음 방문할 좌표 nextX, nextY
                int nextX = d.x + dx[i];
                int nextY = d.y + dy[i];

                //다음 좌표가 범위를 넘어갈때 건너 뛰기
                if(nextX < 0 || nextY<0 || nextX >= N || nextY >=M){
                    continue;
                }            
                //이미 방문했던 점이면 건너 뛰기
                if(visited[nextX][nextY] || arr[nextX][nextY] == 0){
                    continue;
                }
                //다음에 방문할 좌표를 큐에 넣는다.
                q.add(new Dot(nextX,nextY));
                //배열 안에 다음 방문할 곳은 현재 방문햇던 점보다 1칸 더 가야 하므로 +1
                arr[nextX][nextY] = arr[d.x][d.y] + 1;
                //다음 좌표는 방문했음으로 표시
                visited[nextX][nextY] = true;
            }
        }
    }
}

class Dot{
    int x;
    int y;
    Dot(int x,int y){
        this.x =x;
        this.y =y;
    }
}
