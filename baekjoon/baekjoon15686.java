//���ÿ� �ִ� ġŲ�� �߿��� �ִ� M���� ����, ������ ġŲ���� ��� ��� ���Ѿ� �Ѵ�.
//��� ����, ������ ġŲ�Ÿ��� ���� �۰� ���� ���ϴ� ���α׷� �ۼ�
//NxN����̰� ġŲ�� �ִ� M�� �� ��� �������� ����� ��Ų��.
//��� �ϸ� ������ ġŲ�Ÿ��� ���� �۰� ���ϱ� ����
//�Է� -> ������ ������ 0,1,2�� �̷���� �ְ�, 0�� �� ĭ, 1���� ��, 2�� ġŲ���� �ǹ��Ѵ�.
//���� ������ 2N�� ���� ������, ��� 1�� �����Ѵ�.
//ġŲ���� ������ M���� ũ�ų� ����, 13���� �۰ų� ����.
//���-> ù°�ٿ� ��� ��Ű�� ���� ġŲ���� �ִ� M�� �������, ������ ġŲ �Ÿ��� �ּڰ��� ����Ѵ�.
package baekjoon;
//�� ������ Ǯ��
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

class baekjoon15686{
    static int N;
    static int M;
    static int[][] arr;
    static ArrayList<Dot> chicken;
    static ArrayList<Dot> person;
    static int[] output;
    static boolean[] visited;
    static int result;

    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split(" ");
        N = Integer.parseInt(str[0]);
        M = Integer.parseInt(str[1]);
        arr = new int[N][N];
        result = Integer.MAX_VALUE;
        chicken = new ArrayList<Dot>();
        person = new ArrayList<Dot>();

        for(int i=0;i<N;i++){
            str = br.readLine().split(" ");
            N = Integer.parseInt(str[0]);
            M = Integer.parseInt(str[1]);
            arr = new int[N][N];
            result = Integer.MAX_VALUE;
            chicken = new ArrayList<Dot>();
            person = new ArrayList<Dot>();

            for(i=0;i<N;i++){
                str = br.readLine().split(" ");
                for(int j=0;j<N;j++){
                    arr[i][j] = Integer.parseInt(str[j]);
                    if(arr[i][j] == 1){
                        //1�϶��� ��� list�� �߰�
                        person.add(new Dot(i,j));
                    }else if(arr[i][j] == 2){
                        //2�϶��� ġŲ list�� �߰�
                        chicken.add(new Dot(i,j));
                    }
                }
            }
            // ---------�Էº� --------//

            //ġŲ �� ������ ���� �迭 visited, output
            visited = new boolean[chicken.size()];
            output = new int[chicken.size()];

            //ġŲ �� ����
            for(i=0;i<chicken.size();i++){
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