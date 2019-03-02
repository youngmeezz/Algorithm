package baekjoon;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class baekjoon9376{

    //�켱 bfs�� �̿��ؼ� �����ؾ� �Ѵ�.
    static int h;
    static int w;
    static int[][] map = new int[105][105];
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};



public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int test_case;
    //test case �Է¹ް� ���ϰ� �ʹ�.
   
    test_case = Integer.parseInt(br.readLine());
    while(test_case-- > 0){
        Node2 helper = new Node2(0,0);
        Node2 prison1 = null;
        Node2 prison2 = null;

        StringTokenizer st = new StringTokenizer(br.readLine());

        h = Integer.parseInt(st.nextToken()) + 2; //���̿��� +2�ϴ� ����
        w = Integer.parseInt(st.nextToken()) + 2; //�ʺ񿡼� +2�ϴ� ����


        //��� �������� ������ ���� �𸣴� ���� ��� ������ �����ؾ� �ϰ�
        //�� �������� 3���� ���� � ���� �Դ��� �ջ��� ���ݴϴ�. �׸��� �� �� ���� �ּڰ��� �츮�� ���ϴ� ���� �� ���Դϴ�.
        //��, ������ ������ ���� ��� -2�� ����� �մϴ�.(3���� ���ÿ� ���� ���� �ʾƵ� �ȴ�.)

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
    //�̰� �ؿ��� bfs�������ֱ� 
    public static int[][] bfs(Node2 src){
        int[][] dist = new int[h][w];

        for(int i=0;i<h;i++){
            Arrays.fill(dist[i], -1); //�迭 �ѹ��� �ʱ�ȭ �� ����
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

//������ ������ֱ�
    class Node2{
        int x;
        int y;

        Node2(int x,int y){
            this.x = x;
            this.y = y;
        }
    }

    //�ʹ� ������ �����̴�.
    //���� ������ ���ϴ� ���α׷�
