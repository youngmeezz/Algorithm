package baekjoon;

import java.util.*;

public class baekjoon14889 {

    static int[][] map;
    static boolean[] visited;
    static int N, min = Integer.MAX_VALUE;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        map = new int[N][N];
        visited = new boolean[N];

        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++)
                map[i][j] = sc.nextInt();
        go(0, 0); // �� �̷��� �ϴ��� �𸣰ڴ�. =>1. ����Լ��̱� ������ ù������ �迭�� (0,0)���� �����ϱ� ������ ����Լ��� ������ �ʱⰪ�� ����
                  // �����������
        System.out.println(min);
    }

    static void go(int start, int depth) {
        if (depth == N / 2) { // 2. =>N�� ������ ¦�� => ��ŸƮ���� ��ũ�� �ΰ��� ���� �ɰ��� ���� N=4��� 2�� ��ŸƮ�� 2�� ��ũ��

            int Ateam = 0, Bteam = 0;
            for (int i = 0; i < N; i++) {
                if (visited[i] == true) {
                    for (int j = 0; j < N; j++)
                        if (visited[j] == true) {
                            if (i == j)
                                continue;
                            Ateam += (map[i][j]);
                        }
                } else
                    for (int j = 0; j < N; j++)
                        if (visited[j] == false) {
                            if (i == j)
                                continue;
                            Bteam += (map[i][j]);
                        }
            }
            /*
             * 6. �׷��� go(1+1, 1+1) �� ���� start = 2, depth = 2 �� �Ǵµ� �������� if(2 == 4/2) ��
             * �����Ǿ if���� ����!! for(int i=0; i<4; i++) �ݺ����� �̿��ؼ� ���� visited[0] �̶�
             * visited[1] �� true�� ���´ϱ� 0�̶� 1�� if���� ���� Ateam �� ������ ���������ְ�, 2�� 3�� else ����
             * ���� Bteam �� ������ ���������ֳ׿�!
             */
            min = Math.min(min, Math.abs(Ateam - Bteam));
            return;
            /*
             * 7. Ateam ���� map[0][1] �� �켱 ���ױ� Bteam ���� map[2][3] �� ���ڲ�! �׸��� ���� min �������ٰ�
             * min ������ Ateam-Bteam ���밪�� �־��־��! �׸����� return ���ִϱ� go �Լ��� ���������°��ڳ�?
             */
        } else {

            for (int i = start; i < N; i++) {
                if (visited[i])
                    continue;
                visited[i] = true;
                go(i + 1, depth + 1);
                visited[i] = false;
            }
        }
        /*
         * 3. go �Լ��� ó���� start = 0, depth = 0 ���� ���Ա�, N = 4 �� �Է¹޾ҿ�. if(0 == 4/2) ��
         * �ƴϴϱ� else ������ ���ԵǸ� for(int i = 0; i < 4; i++) { if(visited[0]) continue;
         * visited[0] = true; go(0+1, 0+1); visited[0] = false;
         */
        /*
         * 4. visited �� ó���� ���� false �� �ʱ�ȭ�Ǿ������״ϱ� if(visited[0]) continue; ���� ����
         * �������̱�(if ������ true �� ��� ������ �����Ǵϱ�!) visited[0] = true; �� �ٲ��� �� ����Լ��� ȣ���ϳ׿� ����
         * ����Լ��� �� ������ �ٽ� ���ʴ�� visited[0] = false; �� �ٲ����״� ���忣 false �� �ٲ��ִ� ������ �������� �ʾƵ�
         * �ɰͰ���!
         */
        /*
         * 5. ���� �ٽ� go(0+1, 0+1) �� ������ start = 1, depth = 1 �̱�.. ���� if(depth == N/2) ��
         * �������������� �ٽ� else �� �Ѿ�Եʴϴ�! for(int i = 1; i < 4; i++) { if(visited[1])
         * continue; visited[1] = true; go(1+1, 1+1); visited[1]=false; �� �Ǿ �� go(1+1,
         * 1+1) �� ���ڳ�!
         */
        /*
         * 8. ���������� ���� �Լ��� go(1+1, 1+1) �̾����ϱ� �̰� ���������� �ٽ� else{ for(int i = 1; i < 4;
         * i++) { if(visited[1]) continue; visited[1]=true; go(1+1, 1+1);
         * visited[1]=false; } } �� �ͼ� visited[1]=false; �� ������ְ�! �׸��� for �ݺ����̴ϱ� i ���� 2��
         * �����ؼ� if(visited[2]) continue; visited[2]=true; go(2+1, 2+1);
         * visited[2]=false; ������ �Ǿ���� �� go �Լ��� ���ȣ���ϰ�¡!?
         */

        /*
         * 9.���� �����ϴ�¡¥ �����Ȳ�� Ateam ���� map[0][1] �� ����ְ� Bteam ���� map[2][3] �� ����ֱ�,
         * visited[0] �� true, visited[1] �� false, visited[2] �� true, visited[3] �� false
         * �� ���¾�! go(2+1, 2+1) �� ���� start = 3, depth = 3 �� �Ǳ� if(3 == 4/2) �� �������� ������
         * else ������ ���� for(int i = 3; i < 4; i++) { if(visited[3]) continue;
         * visited[3]=true; go(3+1, 3+1); visited[3]=false; } �� ���״� �ٽ� go �Լ��� ���ȣ���ϳ׿�!
         */
        /*
         * 10. ���� go(3+1, 3+1) �� ���ͼ� if(4 == N/2) �� �������������� else �� ���� for(int i =
         * 4;i<4; i++) �̹Ƿ� for�������� �������� �ʰԵ�! �׷� go �Լ��� ������������!? �׷� �� ���� go �Լ��� �����ԵǾ���
         * ������ for(int i = 3; i < 4; i++) { if(visited[3]) continue; visited[3]=true;
         * go(3+1, 3+1); visited[3]=false; } �� ���ƿͼ� visited[3]=false; �� ������ֱ�, i++ �� �ߴ���
         * i<4 ��� ���ǽĿ� �ɷ��� for ���� ������ go �Լ��� ����������! �׷� �� ������ go �Լ��� ���Դ� ������
         * if(visited[2]) continue; visited[2]=true; go(2+1, 2+1); visited[2]=false; ��
         * ���ƿͼ� visited[2]=false; �� ������ֱ� i++ �� �ؿ�! ������� ���ݾ� �޶���! i ���� ������ depth ����
         * �״���ڳ�? �� i++ �� �ϸ鼭 i ���� 3�̵Ǿ����� if(visited[3]) continue; visited[3]=true;
         * go(3+1, 2+1); // �̺κ�! visited[3]=false; �̷��� �Ǿ��!! �Ʊ� visited[3] �� �ٽ� false ��
         * �ٲ������ if(visited[3]) continue; �� �������� �ʱ� �ٽ� go �Լ��� ���ȣ���ؿ�!
         */
        /*
         * 11. �׷� �̹��� go(3+1, 2+1) �̴ϱ� start = 4, depth = 3 �̵ǰڳ�! �굵 if(depth == N/2) ����
         * �������� �ʱ� �ٽ� else ������ ����, else ���� for ���ǽĿ� �������� �ʾƼ�(int i = 4; i < 4; i++ �̱�
         * ������!) go �Լ��� ���������ԵǾ��! ���� �ٽ� if(visited[3]) continue; visited[3]=true;
         * go(3+1, 2+1); visited[3]=false; ����� ���ƿͼ� visited[3]=false; �� ������ְ�, i++ ��
         * �Ͽ��µ� i �� 4�� �Ǿ i<4 �� �������������� go �Լ��� ���������ϴ�! �׷� �� ���� �ҷ��� go �Լ��� !? else{
         * for(int i = 1; i < 4; i++) { if(visited[1]) continue; visited[1]=true;
         * go(1+1, 1+1); visited[1]=false; } } �ٷ� ���! ���� ���ƿͼ� visited[1]=false; ��
         * ������־��! ������� ��Ȳ�̶�� Ateam = map[0][1], Bteam = map[2][3], min = |Ateam -
         * Bteam| //���밪! visited[0] = true, visited[1] = false, visited[2] = false,
         * visited[3] = false �� ���¿���!
         */
    }

}
