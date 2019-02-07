package baekjoon;
//좀 괜찮은 풀이
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
//import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
//import java.util.ArrayList;
//import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


class baekjoon2206{
    //(1,1)과 (N,M)은 항상 0으로 고정되어있고 항상 1,1부터 시작한다.
    //그 와중에 벽 한개도 부수고 갈 수 있다.
    //어떤 사람은 전역변수에 다 넣는 사람이 있꼬 어떤사람은 밑에다 선언하는 방식이 있따.

    //다른 분 중에서 여기 세워 놓는 분 걸로 해보기
    static final int WALL = 1;
    static final int YES = 1;
    static final int NO = 0;
    static final int[] dRow = {0,-1,0,1};
    static final int[] dCol = {1,0,-1,0};

    static int[][] map = new int[1001][1001];
    static boolean[][][] discovered = new boolean[1001][1001][2];

    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        //여기서 Bufferwriter써야 되는지 확인하기
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        for(int i=0;i<N;i++){
            String s = br.readLine();
            for(int j=0;j<M;j++){
                map[i][j] = s.charAt(j)-'0';
            }
        }

        //반복문을 줄여야 시간초과를 줄일 수 있다
        //큐노드까지 가능한 것을 알아내는 것이 중요할 듯 하다.
        Queue<Node> queue = new LinkedList<Node>();

        queue.add(new Node(0,0,0));
        discovered[0][0][NO] = true;
        discovered[0][0][YES] = true;

        boolean isSuccess = false;
        int step =0;
        while(!queue.isEmpty() && isSuccess){

            step++;

            int size = queue.size();
            for(int i=0;i<size;i++){
                Node u = queue.poll(); //여기서 poll은 또 뭐야
                
                if(u.row == N-1 && u.col == M-1){
                    isSuccess = true;
                    break;
                }

                //탐색
                for(int j=0;j<4;j++){
                    int nextRow = u.row +dRow[j];
                    int nextCol = u.col +dCol[j];


                    if(nextRow <0 || nextRow >=N || nextCol <0 || nextCol >=M) 
                    continue;

                    //벽
                    if(map[nextRow][nextCol] == WALL){
                        if(u.destroy < YES && !discovered[nextRow][nextCol][1]){
                            queue.add(new Node(nextRow,nextCol,YES));
                            discovered[nextRow][nextCol][YES] = true;
                        }
                    }
                    //빈칸
                    else{
                        if(!discovered[nextRow][nextCol][u.destroy]){
                            queue.add(new Node(nextRow,nextCol,u.destroy));
                            discovered[nextRow][nextCol][u.destroy] = true;
                        }
                    }
                }
            }
        }
        bw.write(String.valueOf(isSuccess ? step : -1));
        bw.flush();

        System.out.println(isSuccess ? step : -1);
    }
}
class Node{
    int row;
    int col;
    int destroy;

    Node(int row,int col,int destroy){
        this.row = row;
        this.col = col;
        this.destroy = destroy;
    }
}
     //   chicken = new ArrayList<Dot>();
     //   person = new ArrayList<Dot>();
/*
        for(int i=0;i<N;i++){
            str = br.readLine().split(" ");
            N = Integer.parseInt(str[0]);
            M = Integer.parseInt(str[1]);
            arr = new int[N][N];
            result = Integer.MAX_VALUE;
        //    chicken = new ArrayList<Dot>();
        //   person = new ArrayList<Dot>();

            for(i=0;i<N;i++){
                str = br.readLine().split(" ");
                for(int j=0;j<N;j++){
                    arr[i][j] = Integer.parseInt(str[j]);
                    if(arr[i][j] == 1){
                        //1일때는 사람 list에 추가
                   //     person.add(new Dot(i,j));
                    }else if(arr[i][j] == 2){
                        //2일때는 치킨 list에 추가
                   //     chicken.add(new Dot(i,j));
                    }
                }
            }
            // ---------입력부 --------//

            //치킨 집 선택을 위한 배열 visited, output
 //           visited = new boolean[chicken.size()];
//            output = new int[chicken.size()];

            //치킨 집 선택
   //         for(i=0;i<chicken.size();i++){
                visited[i] = true;
                ChickenSelection(i,0);
                visited[i] = false;
            }
            System.out.println(result);
        }
    }
        //치킨 집 선택을 위한 함수
        public static void ChickenSelection(int start,int depth){
            output[depth] = start + 1;

            for(int i = start;i<chicken.size();i++){
                if(visited[i])
                    continue;
                visited[i] = true;
                ChickenSelection(i,depth+1);
                visited[i] = false;
            }
            //치킨집이 선택 되었을경우
            //(치킨집이 최대 M개 이므로 depth는 M-1이 되어야 한다. 0부터 시작했으니까)
            if(depth == M-1){
                int sum =0;
                int currentM =0;
                //사람이 갈 수 있는 치킨 집의 경우 중 가장 최소 값을 선택한다.
                //person 한명 씩 모든 Chicken집을 선택하여 최소값ㅇ르 비교한다.
                for(int i=0;i<person.size();i++){
                    int min = Integer.MAX_VALUE;
                    for(int j=0;j<M;j++){
                        currentM = Calc(person.get(i), chicken.get(output[j]-1));
                        min = Math.min(min,currentM);
                    }
                    //최소 값일 경우 더한다.
                    sum = sum + min;
                }
                //치킨 집 경우의 수마다 다른 최소 거리중 가장 작은 최소거리를 선택한다.
                result = Math.min(result,sum);
            }
        }

        //위치 거리 계산 함수
        public static int Calc(Dot d1, Dot d2){
            return Math.abs(d1.x - d2.x) + Math.abs(d1.y - d2.y);
        }
    }
    class Dot{
        int x;
        int y;
         
        Dot(int x,int y){
        this.x = x;
        this.y = y;
    }
}
*/