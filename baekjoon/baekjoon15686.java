//도시에 있는 치킨집 중에서 최대 M개를 고르고, 나머지 치킨집은 모두 폐업 시켜야 한다.
//어떻게 고르면, 도시의 치킨거리가 가장 작게 될지 구하는 프로그램 작성
//NxN행렬이고 치킨집 최대 M개 를 골라서 나머지는 폐업을 시킨다.
//어떻게 하면 도시의 치킨거리를 가장 작게 줄일까 생각
//입력 -> 도시의 정보는 0,1,2로 이루어져 있고, 0은 빈 칸, 1은ㄴ 집, 2는 치킨집을 의미한다.
//집의 개수는 2N을 넘지 않으며, 적어도 1개 존재한다.
//치킨집의 개수는 M보다 크거나 같고, 13보다 작거나 같다.
//출력-> 첫째줄에 폐업 시키지 않을 치킨집을 최대 M개 골랐을때, 도시의 치킨 거리의 최솟값을 출력한다.
package baekjoon;
//좀 괜찮은 풀이
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
                        //1일때는 사람 list에 추가
                        person.add(new Dot(i,j));
                    }else if(arr[i][j] == 2){
                        //2일때는 치킨 list에 추가
                        chicken.add(new Dot(i,j));
                    }
                }
            }
            // ---------입력부 --------//

            //치킨 집 선택을 위한 배열 visited, output
            visited = new boolean[chicken.size()];
            output = new int[chicken.size()];

            //치킨 집 선택
            for(i=0;i<chicken.size();i++){
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