package baekjoon;
//d = 0 ��
//d = 1 ��
//d = 2 ��
//d = 3 ��
//->�ð�������� ������
//�κ� û�ұⰡ �ִ� ĭ�� ���´� ��ĭ�̴�.-> �κ� û�ұ�� 0�̴�.std
//�κ� û�ұ�� ���� ��ġ���� û�Ҹ� �����ϰ�
//���� ��ġ���� ���� ������ �������� ���ʹ������ ���ʴ�� Ž���Ѵ�.std
//(�� ���Ŀ� �߰� ������ ���� ���� �����ϱ�1~4����)

//����� �κ� û�ұⰡ û���ϴ� ĭ�� ������ ���
import java.util.Scanner;

public class baekjoon14503 {
    // �� ������ �� �޼ҵ�

    public static int changeHead(int nowh) {

        switch (nowh) {
        case 0:
            nowh = 3; // ����
            break;
        case 1:
            nowh = 0; // ����
            break;
        case 2:
            nowh = 1; // ����
            break;
        case 3:
            nowh = 2; // ����
            break;
        }

        return nowh;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Y = sc.nextInt();
        int X = sc.nextInt();
        int[][] map = new int[Y][X];

        int nowy = sc.nextInt(); // �ʿ��� y��ǥ
        int nowx = sc.nextInt(); // �ʿ��� x��ǥ
        int nowh = sc.nextInt(); // �������� �־���� ��

        for (int i = 0; i < Y; i++) {
            for (int j = 0; j < X; j++) {
                map[i][j] = sc.nextInt();
            }
        }
        int check = 0;
        int res = 0;
        boolean flag = true;

        // û�� ����
        while (flag) {
            // 1. û��

            if (map[nowy][nowx] == 0) { // û�ұ� ��ġ�� û�� �ȵǾ��������
                map[nowy][nowx] = 2; // û���ϰ�
                res += 1;// ������� +1
                check = 0; // ��� üũ�ߴ����� �ʱ�ȭ
            }

            // 3.����ĭ ã�� ���� �� ����
            if (check == 4) { // ���� û�Ұ��� üũ�� 4�� ������

                switch (nowh) { // ���� ���⿡ ����

                case 0:
                    nowy += 1; // �ڷ� ��ĭ
                    check = 0; // üũ�� �ʱ�ȭ
                    if (map[nowy][nowx] == 1) {// �ٵ� �ڷ� ��ĭ�� ���̶��
                        flag = false; // û�� �׸�
                    }
                    break;

                case 1:
                    nowx -= 1; // ������ ��ĭ
                    check = 0; // üũ�� �ʱ�ȭ
                    if (map[nowy][nowx] == 1) { // �ٵ� ������ ��ĭ�� ���̶��
                        flag = false; // û�ұ׸�
                    }
                    break;

                case 2:
                    nowx -= 1;
                    check = 0;
                    if (map[nowy][nowx] == 1) {
                        flag = false;
                    }
                    break;

                case 3:
                    nowx += 1;
                    check = 0;
                    if (map[nowy][nowx] == 1) {
                        flag = false;
                    }
                    break;
                }
            }
            //nowh�� ����(now) ���(head)�� ��ġ�� �����ش�.
            // 2. ���� ĭ ã��
            while (map[nowy][nowx] == 2) { // ���� ���� �ִ� ĭ�� û�ҵǾ�������
                nowh = changeHead(nowh); // head������ �������� ������-->���� ���ǿ��� ����
                check++; // û�� ���� üũ+1

                int nexty = 0;
                int nextx = 0; // ���� ĭ üũ�� ������ üũ �� ������ �ʱ�ȭ

                switch (nowh) { // head�� �������⿡ ����(*���� ĭ�� ���� �������� �� ��ĭ)

                case 0:
                    nexty = nowy - 1; // ������ ���������ϱ� ���� ĭ�� ��ǥ�� ���� ĭ���� ���� ��ĭ.
                    if (map[nexty][nowx] == 0) { // �ٵ� �̰� û�� ������ ĭ�̸�
                        nowy = nexty; // ���� ĭ���� �̵�.
                    } // û�� ���� ĭ�� �ƴѰ�쿡�� nowy, nowx�� üũ ���� �״��

                    // ��, �ݺ����� ��� ���ư�.
                    break;

                case 1:
                    nextx = nowx + 1;
                    if (map[nowy][nextx] == 0) {
                        nowx = nextx;
                    }
                    break;
                case 2:
                    nexty = nowy + 1;
                    if (map[nexty][nowx] == 0) {
                        nowy = nexty;
                    }
                    break;
                case 3:
                    nextx = nowx - 1;
                    if (map[nowy][nextx] == 0) {
                        nowx = nextx;
                    }
                    break;
                }

                if (check == 4)
                    break; // üũ�� �������� 4���ߴµ��� û�Ұ������� ������ �����Ѵ�.
            }
        }
        System.out.println(res);
        sc.close();
    }
}
//->�ι�° �׽�Ʈ ���̽����� 57�� ���;� �ϴµ� 54�� ���´�