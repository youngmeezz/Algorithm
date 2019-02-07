package baekjoon;
//�� ������ Ǯ��
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
    //(1,1)�� (N,M)�� �׻� 0���� �����Ǿ��ְ� �׻� 1,1���� �����Ѵ�.
    //�� ���߿� �� �Ѱ��� �μ��� �� �� �ִ�.
    //� ����� ���������� �� �ִ� ����� �ֲ� ������ �ؿ��� �����ϴ� ����� �ֵ�.

    //�ٸ� �� �߿��� ���� ���� ���� �� �ɷ� �غ���
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
        //���⼭ Bufferwriter��� �Ǵ��� Ȯ���ϱ�
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        for(int i=0;i<N;i++){
            String s = br.readLine();
            for(int j=0;j<M;j++){
                map[i][j] = s.charAt(j)-'0';
            }
        }

        //�ݺ����� �ٿ��� �ð��ʰ��� ���� �� �ִ�
        //ť������ ������ ���� �˾Ƴ��� ���� �߿��� �� �ϴ�.
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
                Node u = queue.poll(); //���⼭ poll�� �� ����
                
                if(u.row == N-1 && u.col == M-1){
                    isSuccess = true;
                    break;
                }

                //Ž��
                for(int j=0;j<4;j++){
                    int nextRow = u.row +dRow[j];
                    int nextCol = u.col +dCol[j];


                    if(nextRow <0 || nextRow >=N || nextCol <0 || nextCol >=M) 
                    continue;

                    //��
                    if(map[nextRow][nextCol] == WALL){
                        if(u.destroy < YES && !discovered[nextRow][nextCol][1]){
                            queue.add(new Node(nextRow,nextCol,YES));
                            discovered[nextRow][nextCol][YES] = true;
                        }
                    }
                    //��ĭ
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
                        //1�϶��� ��� list�� �߰�
                   //     person.add(new Dot(i,j));
                    }else if(arr[i][j] == 2){
                        //2�϶��� ġŲ list�� �߰�
                   //     chicken.add(new Dot(i,j));
                    }
                }
            }
            // ---------�Էº� --------//

            //ġŲ �� ������ ���� �迭 visited, output
 //           visited = new boolean[chicken.size()];
//            output = new int[chicken.size()];

            //ġŲ �� ����
   //         for(i=0;i<chicken.size();i++){
                visited[i] = true;
                ChickenSelection(i,0);
                visited[i] = false;
            }
            System.out.println(result);
        }
    }
        //ġŲ �� ������ ���� �Լ�
        public static void ChickenSelection(int start,int depth){
            output[depth] = start + 1;

            for(int i = start;i<chicken.size();i++){
                if(visited[i])
                    continue;
                visited[i] = true;
                ChickenSelection(i,depth+1);
                visited[i] = false;
            }
            //ġŲ���� ���� �Ǿ������
            //(ġŲ���� �ִ� M�� �̹Ƿ� depth�� M-1�� �Ǿ�� �Ѵ�. 0���� ���������ϱ�)
            if(depth == M-1){
                int sum =0;
                int currentM =0;
                //����� �� �� �ִ� ġŲ ���� ��� �� ���� �ּ� ���� �����Ѵ�.
                //person �Ѹ� �� ��� Chicken���� �����Ͽ� �ּҰ����� ���Ѵ�.
                for(int i=0;i<person.size();i++){
                    int min = Integer.MAX_VALUE;
                    for(int j=0;j<M;j++){
                        currentM = Calc(person.get(i), chicken.get(output[j]-1));
                        min = Math.min(min,currentM);
                    }
                    //�ּ� ���� ��� ���Ѵ�.
                    sum = sum + min;
                }
                //ġŲ �� ����� ������ �ٸ� �ּ� �Ÿ��� ���� ���� �ּҰŸ��� �����Ѵ�.
                result = Math.min(result,sum);
            }
        }

        //��ġ �Ÿ� ��� �Լ�
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