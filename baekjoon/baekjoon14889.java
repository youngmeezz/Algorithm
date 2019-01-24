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
        go(0, 0); // 왜 이렇게 하는지 모르겠다. =>1. 재귀함수이기 떄문에 첫시작인 배열이 (0,0)으로 시작하기 때문에 재귀함수가 돌려면 초기값을 먼저
                  // 설정해줘야함
        System.out.println(min);
    }

    static void go(int start, int depth) {
        if (depth == N / 2) { // 2. =>N은 무조건 짝수 => 스타트팀과 링크팀 두개를 나눠 쪼개기 위함 N=4라면 2은 스타트팀 2은 링크팀

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
             * 6. 그래서 go(1+1, 1+1) 로 들어가면 start = 2, depth = 2 가 되는데 이제서야 if(2 == 4/2) 에
             * 성립되어서 if문에 들어가욤!! for(int i=0; i<4; i++) 반복문을 이용해서 현재 visited[0] 이랑
             * visited[1] 만 true인 상태니까 0이랑 1은 if문에 들어가서 Ateam 에 점수를 증가시켜주고, 2랑 3은 else 문에
             * 들어가서 Bteam 의 점수를 증가시켜주네욤!
             */
            min = Math.min(min, Math.abs(Ateam - Bteam));
            return;
            /*
             * 7. Ateam 에는 map[0][1] 이 우선 들어갈테구 Bteam 에는 map[2][3] 이 들어가겠꾼! 그리고 나서 min 변수에다가
             * min 변수랑 Ateam-Bteam 절대값을 넣어주어욤! 그리고나서 return 해주니까 go 함수를 빠져나가는거자노?
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
         * 3. go 함수에 처음에 start = 0, depth = 0 으로 들어왔구, N = 4 로 입력받았오. if(0 == 4/2) 가
         * 아니니까 else 문으로 들어가게되면 for(int i = 0; i < 4; i++) { if(visited[0]) continue;
         * visited[0] = true; go(0+1, 0+1); visited[0] = false;
         */
        /*
         * 4. visited 는 처음에 전부 false 로 초기화되어있을테니깐 if(visited[0]) continue; 에는 들어가지
         * 않을것이구(if 문에는 true 인 경우 조건이 성립되니까!) visited[0] = true; 로 바꿔준 후 재귀함수를 호출하네욤 ㅎㅎ
         * 재귀함수가 다 끝나면 다시 차례대로 visited[0] = false; 로 바꿔줄테니 당장엔 false 로 바꿔주는 구문은 생각하지 않아두
         * 될것같오!
         */
        /*
         * 5. 구럼 다시 go(0+1, 0+1) 로 들어갔으니 start = 1, depth = 1 이구.. 아직 if(depth == N/2) 에
         * 성립하지않으니 다시 else 로 넘어가게됨니다! for(int i = 1; i < 4; i++) { if(visited[1])
         * continue; visited[1] = true; go(1+1, 1+1); visited[1]=false; 가 되어서 또 go(1+1,
         * 1+1) 로 가겠넹!
         */
        /*
         * 8. 마지막으로 들어온 함수가 go(1+1, 1+1) 이었으니까 이게 빠져나가면 다시 else{ for(int i = 1; i < 4;
         * i++) { if(visited[1]) continue; visited[1]=true; go(1+1, 1+1);
         * visited[1]=false; } } 로 와서 visited[1]=false; 로 만들어주고! 그리고 for 반복문이니까 i 값이 2로
         * 증가해서 if(visited[2]) continue; visited[2]=true; go(2+1, 2+1);
         * visited[2]=false; 구문이 되어가지구 또 go 함수를 재귀호출하겠징!?
         */

        /*
         * 9.으으 복잡하다징짜 현재상황은 Ateam 에는 map[0][1] 이 들어있고 Bteam 에는 map[2][3] 이 들어있구,
         * visited[0] 은 true, visited[1] 은 false, visited[2] 는 true, visited[3] 은 false
         * 인 상태야! go(2+1, 2+1) 로 들어가면 start = 3, depth = 3 이 되구 if(3 == 4/2) 에 성립하지 않으니
         * else 문으로 가서 for(int i = 3; i < 4; i++) { if(visited[3]) continue;
         * visited[3]=true; go(3+1, 3+1); visited[3]=false; } 로 갈테니 다시 go 함수를 재귀호출하네욤!
         */
        /*
         * 10. 이제 go(3+1, 3+1) 로 들어와서 if(4 == N/2) 에 성립하지않으니 else 로 가면 for(int i =
         * 4;i<4; i++) 이므로 for문에서도 성립하지 않게돼! 그럼 go 함수를 빠져나가겠지!? 그럼 이 전에 go 함수로 들어오게되었던
         * 구문인 for(int i = 3; i < 4; i++) { if(visited[3]) continue; visited[3]=true;
         * go(3+1, 3+1); visited[3]=false; } 로 돌아와서 visited[3]=false; 로 만들어주구, i++ 을 했더니
         * i<4 라는 조건식에 걸려서 for 문이 끝나구 go 함수를 빠져나가용! 그럼 또 이전에 go 함수로 들어왔던 구문인
         * if(visited[2]) continue; visited[2]=true; go(2+1, 2+1); visited[2]=false; 로
         * 돌아와서 visited[2]=false; 로 만들어주구 i++ 을 해욤! 여기부터 조금씩 달라져! i 값만 변했지 depth 값은
         * 그대로자낭? 즉 i++ 을 하면서 i 값이 3이되었으니 if(visited[3]) continue; visited[3]=true;
         * go(3+1, 2+1); // 이부분! visited[3]=false; 이렇게 되어욤!! 아까 visited[3] 을 다시 false 로
         * 바꿔버려서 if(visited[3]) continue; 에 성립하지 않구 다시 go 함수를 재귀호출해욤!
         */
        /*
         * 11. 그럼 이번엔 go(3+1, 2+1) 이니깐 start = 4, depth = 3 이되겠넴! 얘도 if(depth == N/2) 에는
         * 성립하지 않구 다시 else 문으로 들어가고, else 문의 for 조건식에 성립하지 않아서(int i = 4; i < 4; i++ 이기
         * 때문에!) go 함수를 빠져나오게되어욤! 구럼 다시 if(visited[3]) continue; visited[3]=true;
         * go(3+1, 2+1); visited[3]=false; 여기로 돌아와서 visited[3]=false; 를 만들어주고, i++ 을
         * 하였는데 i 가 4가 되어서 i<4 에 성립하지않으니 go 함수를 빠져나갑니당! 그럼 이 전에 불렀던 go 함수는 !? else{
         * for(int i = 1; i < 4; i++) { if(visited[1]) continue; visited[1]=true;
         * go(1+1, 1+1); visited[1]=false; } } 바로 요기! 요기로 돌아와서 visited[1]=false; 로
         * 만들어주어욤! 현재까지 상황이라면 Ateam = map[0][1], Bteam = map[2][3], min = |Ateam -
         * Bteam| //절대값! visited[0] = true, visited[1] = false, visited[2] = false,
         * visited[3] = false 인 상태예욤!
         */
    }

}
