package baekjoon;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class baekjoon9376{

    //우선 bfs를 이용해서 구현해야 한다.
    static int h;
    static int w;
    static int[][] map = new int[105][105];
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};



public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int test_case;
    //test case 입력받고 구하고 싶다.
   
    test_case = Integer.parseInt(br.readLine());
    while(test_case-- > 0){
        Node2 helper = new Node2(0,0);
        Node2 prison1 = null;
        Node2 prison2 = null;

        StringTokenizer st = new StringTokenizer(br.readLine());

        h = Integer.parseInt(st.nextToken()) + 2; //높이에서 +2하는 이유
        w = Integer.parseInt(st.nextToken()) + 2; //너비에서 +2하는 이유


        //어느 정점에서 만나게 될지 모르니 맵의 모든 정점을 조사해야 하고
        //각 정점마다 3명이 문을 몇개 열고 왔는지 합산을 해줍니다. 그리고 그 중 가장 최솟값이 우리가 원하는 답이 될 것입니다.
        //단, 만나는 지점이 문인 경우 -2를 해줘야 합니다.(3명이 동시에 문을 열지 않아도 된다.)

        for(int i=1;i<h-1;i++){

            String s = "."+br.readLine()+".";
            
            for(int j=0;j<w;j++){
                char c = s.charAt(j);
                switch(c){
                    case '.':
                    case '*':
                    case '#':
                        map[i][j] = c;
                        break;
                
                    case '$':
                        map[i][j] = c;
                        if(prison1 == null){
                            prison1 = new Node2(i,j);
                        }else{
                            prison2 = new Node2(i,j);
                        }
                        break;
            }
        }
    }
    for(int j=0;j<w;j++){
        map[0][j] = map[h-1][j] = '.';
    }
    //solve
    int[][] dist1 = bfs(helper);
    int[][] dist2 = bfs(prison1);
    int[][] dist3 = bfs(prison2);

    int ans = h*w;
    int tempCost = 0;
    for(int i=0;i<h;i++){
        for(int j=0;j<w;j++){
            if(map[i][j] == '*')
            continue;

            tempCost = dist1[i][j] + dist2[i][j] + dist3[i][j];
            if(map[i][j] == '#')
                tempCost -= 2;
            ans = ans > tempCost ? tempCost : ans;
        }
    }
    System.out.println(ans);

    }
}
    //이거 밑에서 bfs구현해주기 
    public static int[][] bfs(Node2 src){
        int[][] dist = new int[h][w];

        for(int i=0;i<h;i++){
            Arrays.fill(dist[i], -1); //배열 한번에 초기화 및 수정
        }

        Queue<Node2> queue = new LinkedList<Node2>();
        queue.add(src);
        dist[src.x][src.y] = 0;

        while(!queue.isEmpty()){
            Node2 u = queue.remove();

            for(int i=0;i<4;i++){
                int xx = u.x + dx[i];
                int yy = u.y + dy[i];

                if(xx <0 || xx >=h || yy <0 || yy >= w)
                    continue;
                if(map[xx][yy] == '*')
                    continue;

                if(map[xx][yy] == '.' || map[xx][yy] == '$'){
                    if(dist[xx][yy] == -1 || dist[xx][yy] > dist[u.x][u.y]){
                        dist[xx][yy] = dist[u.x][u.y];
                        queue.add(new Node2(xx,yy));
                    }
                }else if(map[xx][yy] == '#'){
                    if(dist[xx][yy] == -1 || dist[xx][yy] > dist[u.x][u.y] + 1){
                        dist[xx][yy] = dist[u.x][u.y] +1;
                        queue.add(new Node2(xx,yy));
                    }
                }
            }
        }
        return dist;
    }
}

//생성자 만들어주기
    class Node2{
        int x;
        int y;

        Node2(int x,int y){
            this.x = x;
            this.y = y;
        }
    }

    //너무 복잡한 문제이다.
    //문의 갯수를 구하는 프로그램
