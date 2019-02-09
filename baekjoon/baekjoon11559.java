package baekjoon;

//뿌요 뿌요 문제는 5가지 색생(R,G,B,P,Y) 4개가 터졌을떄 몇 콤보인지 구하는 것 
//접근 방법
//4개 이상 붙어있는것ㅇ르 체크하고
//위에 해당하는 뿌요들ㅇ을 한번에 없애고 위에 있는 뿌요를 내려준다.
//위 단계를 4개 이상 붙어있는 것이 없을 떄까지 반복한다.

//4개 이상 붙어있는것들을 체크한다.
//BFS를 사용해서 붙어있는 것들을 체크한다.
//이떄 큐를 하나만 사용하면 큐에 있는 것들이 없어지면서 (poll) 인접한 배열 원소들ㅇ르 큐에 넣는 방식이기 때문에
//인접한 원소를 모두 가지고 있을 큐(count_queue)를 하나 더 만든다.
//즉, 큐에서 poll()한 원소를 새로운 큐에 offer()한다.
//새로운 큐의 개수가 4개 이상인지를 체크한다.
import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class baekjoon11559{

    /*
    static int R;
    static int G;
    static int B;
    static int P;
    static int Y;
    static int blank;
    */

   // static char[][] map;
    //동서북남을 의미한다.
    static int dr[] = {1,-1,0,0};
    static int dc[] = {0,0,1,-1};

    static int N = 12;
    static int M = 6;

    static char map[][];
    static boolean check[][];
    static Queue<Pos> queue; //큐에서 계속 넣었다 뻈다를 반복하고 여기는 RGBPY를 계속 넣어줄 곳이다.
    static Queue<Pos> count_queue; //여기서 4개씩 넣었다 뺴주는것을 계산한다. 여기는 4개만 쌓였다 싶으면 터트려줄 큐이다.

    //Pos 위치 생성자를 다시 만들어 주는 이유를 알아가자 
    static class Pos{
        int r;
        int c;
        public Pos(int r,int c)
        {
            this.r = r;
            this.c = c;
        }
    }
        private static int count(char alpha){
            Pos cur_pos;
            while(!queue.isEmpty()){
                //만약 비어있지 않다면
                //큐에서 poll()한 원소를 새로운 큐에 offer()한다.
                cur_pos = queue.poll();
                count_queue.offer(cur_pos);

                for(int i=0;i<4;i++){
                    Pos next_pos = new Pos(cur_pos.r+dr[i],cur_pos.c+dc[i]);
                    //동일한 색상이면서 아직 방문하지 않았다면 큐에 삽입
                    if(map[next_pos.r][next_pos.c]==alpha && !check[next_pos.r][next_pos.c]){
                        check[next_pos.r][next_pos.c] = true;
                        queue.offer(next_pos);
                    }
                }
            }
            //count_queue: 붙어있는 뿌요들의 모임
            return count_queue.size();
        }

        //뿌요 터트려야 하니까 이렇게 구한다.
        //위에 해당하는 뿌요들을 한번에 없애고 위에 있는 뿌요들을 내려준다.
        private static void deletePuyo(Pos pos){
            for(int i=pos.r;i>=1;i--)
                map[i][pos.c] = map[i-1][pos.c];
            }


        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                int combo =0;
                N = 12;
                M = 6;

                map = new char[N+2][M+2];
                check = new boolean[N+2][M+2];
                queue = new LinkedList<>();
                count_queue = new LinkedList<>();

                //초기화(테두리 설정)
      
                //초기에 배열을 (N+2) x (N+2)로 설정해놓고, 테두리에 '.'로 설정해 주었으므로 배열 범위 체크를 따로 해주지 않아도 된다.
                for(int i=0;i<N+2;i++)
                    for(int j=0;j<M+2;j++)
                        map[i][j] ='.';

                //맵 설정
                //맵 설정 하는 거 이해 안감
                for(int i=1;i<=N;i++){
                    String line = sc.nextLine();
                    for(int j=1;j<=M;j++)
                        map[i][j] = line.charAt(j-1);
                }

                //위의 단계를 4개 이상 붙어 있는 것이 없을떄까지 반복한다.
                //1에서 4이상 뿌요가 붙어있다면 isQuit 변수를 true로 바꿔주고, combo를 증가 시키기 전 해당 변수를
                //확인해 false라면 combo를 증가시키지 않고 while문을 빠져나간다.
                boolean isQuit = false;
                while(true){
                    isQuit = true;
                    for(int i=1;i<=N;i++){
                        for(int j=1;j<=M;j++){
                            //배열의 값이 알파벳이면서 아직 체크를 안했다면 큐에 넣는다.
                            if(Character.isAlphabetic(map[i][j]) && !check[i][j]){
                                check[i][j] = true;
                                queue.offer(new Pos(i,j));
                            //붙어있는 동일한 색깔의 뿌요의 갯수를 구한다.
                            int num = count(map[i][j]);

                            //새로운 큐가 4개 이상이면 해당 배열 원소를 'd'로 바꿔준다.
                            if(num >=4){
                                for(int k=0;k<num;k++){
                                    Pos delete = count_queue.poll();
                                    map[delete.r][delete.c] = 'd';
                                }
                                //하나라도 삭제할 게 있으면 while문이 끝나지 않는다.
                                isQuit = false;
                            }
                            count_queue.clear();
                        }
                 
                    }
                }
                for(int i=1;i<=N;i++)
                    for(int j=1;j<=M;j++){
                        if(map[i][j] == 'd')
                        deletePuyo(new Pos(i,j));
                        check[i][j] = false;
                    }
                    if(isQuit)
                        break;

                        ++combo;
            }
            System.out.println(combo);
        }
    }
