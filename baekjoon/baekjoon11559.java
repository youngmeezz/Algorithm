package baekjoon;

//�ѿ� �ѿ� ������ 5���� ����(R,G,B,P,Y) 4���� �������� �� �޺����� ���ϴ� �� 
//���� ���
//4�� �̻� �پ��ִ°ͤ��� üũ�ϰ�
//���� �ش��ϴ� �ѿ�餷�� �ѹ��� ���ְ� ���� �ִ� �ѿ並 �����ش�.
//�� �ܰ踦 4�� �̻� �پ��ִ� ���� ���� ������ �ݺ��Ѵ�.

//4�� �̻� �پ��ִ°͵��� üũ�Ѵ�.
//BFS�� ����ؼ� �پ��ִ� �͵��� üũ�Ѵ�.
//�̋� ť�� �ϳ��� ����ϸ� ť�� �ִ� �͵��� �������鼭 (poll) ������ �迭 ���ҵ餷�� ť�� �ִ� ����̱� ������
//������ ���Ҹ� ��� ������ ���� ť(count_queue)�� �ϳ� �� �����.
//��, ť���� poll()�� ���Ҹ� ���ο� ť�� offer()�Ѵ�.
//���ο� ť�� ������ 4�� �̻������� üũ�Ѵ�.
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
    //�����ϳ��� �ǹ��Ѵ�.
    static int dr[] = {1,-1,0,0};
    static int dc[] = {0,0,1,-1};

    static int N = 12;
    static int M = 6;

    static char map[][];
    static boolean check[][];
    static Queue<Pos> queue; //ť���� ��� �־��� �Q�ٸ� �ݺ��ϰ� ����� RGBPY�� ��� �־��� ���̴�.
    static Queue<Pos> count_queue; //���⼭ 4���� �־��� ���ִ°��� ����Ѵ�. ����� 4���� �׿��� ������ ��Ʈ���� ť�̴�.

    //Pos ��ġ �����ڸ� �ٽ� ����� �ִ� ������ �˾ư��� 
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
                //���� ������� �ʴٸ�
                //ť���� poll()�� ���Ҹ� ���ο� ť�� offer()�Ѵ�.
                cur_pos = queue.poll();
                count_queue.offer(cur_pos);

                for(int i=0;i<4;i++){
                    Pos next_pos = new Pos(cur_pos.r+dr[i],cur_pos.c+dc[i]);
                    //������ �����̸鼭 ���� �湮���� �ʾҴٸ� ť�� ����
                    if(map[next_pos.r][next_pos.c]==alpha && !check[next_pos.r][next_pos.c]){
                        check[next_pos.r][next_pos.c] = true;
                        queue.offer(next_pos);
                    }
                }
            }
            //count_queue: �پ��ִ� �ѿ���� ����
            return count_queue.size();
        }

        //�ѿ� ��Ʈ���� �ϴϱ� �̷��� ���Ѵ�.
        //���� �ش��ϴ� �ѿ���� �ѹ��� ���ְ� ���� �ִ� �ѿ���� �����ش�.
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

                //�ʱ�ȭ(�׵θ� ����)
      
                //�ʱ⿡ �迭�� (N+2) x (N+2)�� �����س���, �׵θ��� '.'�� ������ �־����Ƿ� �迭 ���� üũ�� ���� ������ �ʾƵ� �ȴ�.
                for(int i=0;i<N+2;i++)
                    for(int j=0;j<M+2;j++)
                        map[i][j] ='.';

                //�� ����
                //�� ���� �ϴ� �� ���� �Ȱ�
                for(int i=1;i<=N;i++){
                    String line = sc.nextLine();
                    for(int j=1;j<=M;j++)
                        map[i][j] = line.charAt(j-1);
                }

                //���� �ܰ踦 4�� �̻� �پ� �ִ� ���� ���������� �ݺ��Ѵ�.
                //1���� 4�̻� �ѿ䰡 �پ��ִٸ� isQuit ������ true�� �ٲ��ְ�, combo�� ���� ��Ű�� �� �ش� ������
                //Ȯ���� false��� combo�� ������Ű�� �ʰ� while���� ����������.
                boolean isQuit = false;
                while(true){
                    isQuit = true;
                    for(int i=1;i<=N;i++){
                        for(int j=1;j<=M;j++){
                            //�迭�� ���� ���ĺ��̸鼭 ���� üũ�� ���ߴٸ� ť�� �ִ´�.
                            if(Character.isAlphabetic(map[i][j]) && !check[i][j]){
                                check[i][j] = true;
                                queue.offer(new Pos(i,j));
                            //�پ��ִ� ������ ������ �ѿ��� ������ ���Ѵ�.
                            int num = count(map[i][j]);

                            //���ο� ť�� 4�� �̻��̸� �ش� �迭 ���Ҹ� 'd'�� �ٲ��ش�.
                            if(num >=4){
                                for(int k=0;k<num;k++){
                                    Pos delete = count_queue.poll();
                                    map[delete.r][delete.c] = 'd';
                                }
                                //�ϳ��� ������ �� ������ while���� ������ �ʴ´�.
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
