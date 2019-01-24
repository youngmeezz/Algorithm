package baekjoon;
//조합, 순열, permutation function templates => stl 문자열(꿀팁) ...재귀함수 dfs bfs(안전)도 가능 dfs (시간복잡도)
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class baekjoon14502{
    
    static int N,M;
    static int[][] map, tempMap;
    static int maxSafeZone;
    static int[] dx = {-1,0,1,0}; //왜 위 오른 아래 왼 으로 풀지?
    static int[] dy = {0,1,0,-1};

public static void main(String[] args)throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine()); //왜 스트링 토크나이저를 이용해서 지도를 그릴지가 궁금
    N = Integer.parseInt(st.nextToken());
    M = Integer.parseInt(st.nextToken());

    map = new int[N][M];
    tempMap = new int[N][M];

    //연구소 지도 그리기
    for(int i=0;i<N-1;i++){
        StringTokenizer str = new StringTokenizer(br.readLine());
        for(int j=0;j<M;j++){
            map[i][j] = Integer.parseInt(str.nextToken());
        }
    }

    //벽 세우기
    //벽 3개 세우는 알고리즘 어떻게 세웠는지 질문하기 그리고 3개인데 왜 3개 세우는거지 
    for(int i=0;i<N*M;i++){
        int x=i/M; //왜 이렇게 하지? 처음에 x를 왜 i나누기 M한 값의 몫으로 구하는지 궁금 //열로 나눠주기 세로 길이로 나눠주기 7*7의 사각형일 경우 7로 나눔
        int y=i%M; //처음에 y값을 i나누기 M한 값의 나머지로 하는 지 궁금//
        if(map[x][y]==0){
            map[x][y] = 1;
            dfs(i,1);
            map[x][y]=0;
        }
}
//최종 답 출력
System.out.println(maxSafeZone);

}


//안전 영역 크기 구하기 메소드
public static void countSafeZone(){
    int tempCnt =0;
    for(int i=0;i<N;i++){
        for(int j=0;j<M;j++){
            if(tempMap[i][j]==0){
                tempCnt++;
            }
        }
    }
    if(tempCnt>maxSafeZone){
        maxSafeZone = tempCnt;

        //풀이과정 보는 코드
        for(int i=0;i<N;i++){
            System.out.println();
            for(int j=0;j<M;j++){
                System.out.print(tempMap[i][j]);
                System.out.print(" ");
            }
        }
        System.out.println("#" + maxSafeZone);
        }
    }
//바이러스 확산 메소드는 bfs를 사용하고
public static void bfs(int x,int y){
    Queue<Dot> q = new LinkedList<Dot>();
    q.add(new Dot(x,y));

    while(!q.isEmpty()){
        Dot d = q.poll();

        for(int i=0;i<4;i++){
            int nextx = d.x + dx[i]; //nextx가 의미하는게  2(바이러스)에서 x축 이동하는 값
            int nexty = d.y + dy[i]; //nexty가 의미하는게  2(바이러스)에서 y축 이동하는 값

            if(nextx<0 || nexty<0 || nextx >=N || nexty >= M){ //범위를 벗어나는 값이라면 계속 진행
                continue;
            }
            if(tempMap[nextx][nexty] ==1){ //1인 벽이라면 계속 진행
                continue;
            }
            if(tempMap[nextx][nexty] ==0){  //0인 비어있는 값이라면
                tempMap[nextx][nexty] =2;//바이러스 확산값 2로 다 바꿔준다.
                q.add(new Dot(nextx,nexty));
            }
        }
    }
}

//벽세우기 메소드는 dfs를 사용한다.
public static void dfs(int n,int numberOfWall){
    int x = n / M;
    int y = n % M;

    if(numberOfWall ==3){//벽 3개를 모두 세웠으면
    
    //임시 맵 만들기
    tempMap = new int[N][M];
    for(int i=0;i<N;i++){
        for(int j=0;j<M;j++){
            tempMap[i][j] = map[i][j];
        }
    }

    //바이러스 확산 시키기
    for(int i=0;i<N;i++){
        for(int j=0;j<M;j++){
            if(tempMap[i][j]==2){//바이러스 지역이라면
            //확산 메소드 호출
            bfs(i,j);
        }
    }
}
//안전 영역 크기 메소드 호출
countSafeZone();

    }else{ //벽 3개를 아직 모두 세우지 못했을때
        for(int i=n+1;i<N*M;i++){
            int tempx = i / M;
            int tempy = i % M;

            //다음 벽 세우기
            if(map[tempx][tempy] ==0){
                map[tempx][tempy] = 1;
                dfs(i, numberOfWall+1);
            }
        }
    }
    //실험이 끝나고, 다시 map을 원상 복귀 시켜야한다.
    map[x][y] =0;
}
}
class Dot{
    int x,y;
    Dot(int x, int y){
        this.x = x;
        this.y = y;
        }
    }

    //근데 이 풀이 처음 테스트케이스 27이 아니라 28이 나오는데 -> 잘 못된건가 
//우민님 연예인...ㅎㅎㅎ
//나는 너하나로 충분해 