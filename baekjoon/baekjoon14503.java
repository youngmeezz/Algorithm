package baekjoon;
//d = 0 북
//d = 1 동
//d = 2 남
//d = 3 서
//->시계방향으로 돌린다
//로봇 청소기가 있는 칸의 상태는 빈칸이다.-> 로봇 청소기는 0이다.std
//로봇 청소기는 현재 위치에서 청소를 시작하고
//현재 위치에서 현재 방향을 기준으로 왼쪽방향부터 차례대로 탐색한다.std
//(그 이후에 추가 조건은 백준 내용 참고하기1~4까지)

//출력은 로봇 청소기가 청소하는 칸의 개수를 출력
import java.util.Scanner;

public class baekjoon14503 {
    // 고개 돌리기 용 메소드

    public static int changeHead(int nowh) {

        switch (nowh) {
        case 0:
            nowh = 3; // 서쪽
            break;
        case 1:
            nowh = 0; // 북쪽
            break;
        case 2:
            nowh = 1; // 동쪽
            break;
        case 3:
            nowh = 2; // 남쪽
            break;
        }

        return nowh;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Y = sc.nextInt();
        int X = sc.nextInt();
        int[][] map = new int[Y][X];

        int nowy = sc.nextInt(); // 맵에서 y좌표
        int nowx = sc.nextInt(); // 맵에서 x좌표
        int nowh = sc.nextInt(); // 고개돌릴떄 넣어야할 값

        for (int i = 0; i < Y; i++) {
            for (int j = 0; j < X; j++) {
                map[i][j] = sc.nextInt();
            }
        }
        int check = 0;
        int res = 0;
        boolean flag = true;

        // 청소 시작
        while (flag) {
            // 1. 청소

            if (map[nowy][nowx] == 0) { // 청소기 위치가 청소 안되어있을경우
                map[nowy][nowx] = 2; // 청소하고
                res += 1;// 결과값을 +1
                check = 0; // 몇번 체크했는지는 초기화
            }

            // 3.다음칸 찾기 실패 후 후진
            if (check == 4) { // 만약 청소가능 체크를 4번 했으면

                switch (nowh) { // 현재 방향에 따라서

                case 0:
                    nowy += 1; // 뒤로 한칸
                    check = 0; // 체크는 초기화
                    if (map[nowy][nowx] == 1) {// 근데 뒤로 한칸이 벽이라면
                        flag = false; // 청소 그만
                    }
                    break;

                case 1:
                    nowx -= 1; // 앞으로 한칸
                    check = 0; // 체크는 초기화
                    if (map[nowy][nowx] == 1) { // 근데 앞으로 한칸이 벽이라면
                        flag = false; // 청소그만
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
            //nowh는 현재(now) 헤드(head)의 위치를 말해준다.
            // 2. 다음 칸 찾기
            while (map[nowy][nowx] == 2) { // 지금 내가 있는 칸이 청소되어있으면
                nowh = changeHead(nowh); // head방향을 왼쪽으로 돌리고-->문제 조건에서 나옴
                check++; // 청소 가능 체크+1

                int nexty = 0;
                int nextx = 0; // 다음 칸 체크용 변수는 체크 할 떄마다 초기화

                switch (nowh) { // head의 최종방향에 따라서(*다음 칸은 돌린 고개방향의 앞 한칸)

                case 0:
                    nexty = nowy - 1; // 북쪽을 보고있으니까 다음 칸의 좌표는 현재 칸에서 위로 한칸.
                    if (map[nexty][nowx] == 0) { // 근데 이게 청소 가능한 칸이면
                        nowy = nexty; // 다음 칸으로 이동.
                    } // 청소 가능 칸이 아닌경우에는 nowy, nowx는 체크 시점 그대로

                    // 즉, 반복문은 계속 돌아감.
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
                    break; // 체크를 동서남북 4번했는데도 청소가능하지 않을시 종료한다.
            }
        }
        System.out.println(res);
        sc.close();
    }
}
//->두번째 테스트 케이스에서 57이 나와야 하는데 54가 나온다