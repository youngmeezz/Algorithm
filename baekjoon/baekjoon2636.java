package baekjoon;

//여기서 혼자 해볼 것은 변수 설정이랑 입력부 출력부부터 짜놓기 그러면 이제 알고리즘은 답안 참고해 가면서 풀어보기
//그리고 알고리즘 미리 생각해두고 풀면 더 좋을 것이다.

import java.util.Scanner;
import java.util.*;
//2636을 dfs로 풀어보자
//문제에서 주어진 조건중 "모눈 종이의 맨 가장자리에는 치즈가 놓이지 않는 것으로 가정한다."
//즉, 언제나 가장자리는 공기라는 의미이다.


/*순서
1. 언제나 좌측 최상단인(0,0)으로 부터 DFS를 돌린다.
2. DFS 탐색 중 다음 이동할 장소가 치즈(1)이면 값을 +1해준다.(1->2)
-치즈가 만약 한면만 공기와 닿아잇을 경우 2가 될것이고
2면이 닿아잇다면 3, 3면이 닿아있다면4 , 4면이 닿으면 5가 될 것이다.
3. DFS 탐색 도중 공기(0)면 -1로 값을 바꿔주고 이동하여 추가 DFS를 진행한다.
4. 위 과정을 통해 DFS가 다 끝나고 나면, 2중 for문을 이용하여
 - 3 이상의 값을 갖는 곳에 2면 이상이 공기와 접촉된 치즈이기 떄문에 녹여주고(0으로)
 - -1은 원래 공기 였으니 0으로 다시 돌려주고,
 - 1이나 2를 갖는 치즈는 공기에 노출되지 않거나,한면만 노출된 치즈이므로 다시 1로 돌려준다.

 -> 3이상 : 0 / 2or1 : 1 / -1 : 0
5. 위 과정을 치즈가 모두 녹을 떄 까지 반복하여 그 횟수를 세서 출력하면 된다.

이렇게 하면 내부공기는 외부공기와 연결되기 전까지 탐색하지 않으면서 적절히 치즈를 녹여 갈 수 있다.
*/

/*
만나는 0은 -1로 바꿔주고 추가 탐색, 0보다 큰값을 만나면 +1을 해준다.
2중 for문을 돌려서
1) 3이상이면 -> 2면 이상이 공기와 접촉한 치즈이므로 녹임(0)
2) -1이면 -> 원래 공기였으니까 원상복기로 (0)
3) 1 이나 2이면 ->1면 이하만 공기와 접촉한 치즈이므로 원상복구(1)
*/

/*
public class baekjoon2636{

        //우선 변수설정하기
        static int cheese;
        static int map[][];
        static boolean check[][];
        static int time;//치즈가 모두 녹아서 없어지는데 걸리는 시간
        static int count; //칸의 갯수 출력할 것
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();//세로길이
        int col = sc.nextInt();//가로길이


        //치즈가 모두 녹아서 없어지는데 걸리는 시간을 출력
        
        //칸의 갯수를 출력
        System.out.println("%d",count);
    }
}

//입력부 
//첫째줄에는 사각형 모양 판의 세로와 가로의 길이가 양의 정수로 주어진다.
//세로와 가로의 길이는 최대 100이다.
//판의 각 가로줄의 모양이 윗줄부터 차례로 둘쨰 줄부터 마지막 줄까지 주어진다.
//치즈가 없는 칸은 0,치즈가 있는 칸의 1로 주어지며 숫자 사이에는 빈칸이 하나씩 있다.  



//출력부
//(첫째줄에는 치즈가 모두 녹아서 없어지는데 걸리는 시간)
//(둘쨰줄에는 모두 녹기 한 시간 전에 남아있는 치즈조각이 놓여 있는 칸의 갯수를 출력한다.)
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class baekjoon2636{
    public static int dx[] = {0,0,-1,1};
    public static int dy[] = {1,-1,0,0};
    public static int n;
    public static int m;
    public static int map[][];

    public static void main(String[] args)throws Exception{ //throws Exception을 반드시 해줘야만 뒤에 에러가 안난다 이거 왜 해줘야 하는지 체크하기

        BufferedReader in  = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        //Scanner sc = new Scanner(System.in);
        String line[] = in.readLine().split(" ");
        n = Integer.parseInt(line[0]);
        m = Integer.parseInt(line[1]);
        map = new int[n][m];
        int i,j;
        for(i=0;i<n;i++){
            line = in.readLine().split(" ");
            for(j=0;j<m;j++)
                map[i][j] = Integer.parseInt(line[j]);
            }
            
            for(i=0;!allDissolved();i++)
            dfs(0,0);

            out.write(String.valueOf(i));
            out.close();
            in.close();
        }
    //이거는 그냥 true false 값으로 다 녹일 수 있는지 없는지 체크
    private static boolean allDissolved(){
        int i,j,cnt=0;
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                if(map[i][j]==1 || map[i][j]==2){
                    map[i][j] = 1;
                    cnt++;
                }
                else map[i][j] =0;
            }
        }
        return cnt == 0;
    }
    //이거 모르겠으니까 그냥 dfs로 풀이
    //외부는 언제나(0,0)과 연결->-1로 마킹
    private static void dfs(int x,int y)
    {
        map[x][y] = -1;
        int ax,ay;
        for(int i=0;i<4;i++){
            ax = x+dx[i];
            ay = y+dy[i];
            if(isInRange(ax,ay)){
                if(map[ax][ay]==0)
                dfs(ax,ay);
                else if(map[ax][ay]>0)
                map[ax][ay]++;
            }
        }
    }

    private static boolean isInRange(int x,int y){
        return (0<=x && x<n) && (0<=y && y<m);
    }
}