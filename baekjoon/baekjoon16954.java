package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


//벽이 움직이는데 1초마다 모든 벽이 아래에 있는 행으로 한칸씩 내려가고 
public class baekjoon16954 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    //우선 bfs를 이용해서 구현해야 한다.
    //이렇게 하는게 우, 좌, 하, 상이라구??
    static int[] dx = { 0,0,1,-1,1,1,-1,-1,0};
    static int[] dy = { 1,-1,0,0,1,-1,-1,1,0};

    public static void main(String[] args)throws NumberFormatException, IOException {

        char[][] map = new char[8][8];

        int rcnt =0;
        for(int i=0;i<8;i++){
            String a = br.readLine();
            for(int j=0;j<a.length();j++){
                map[i][j] = a.charAt(j);
                if(map[i][j] == '#')
                rcnt++;
            }
        }

        Node uk = new Node(7,0,0);
        boolean flag = false;
        Queue<Node> q = new LinkedList<>();
        q.add(uk);


        while(!q.isEmpty() && !flag){
            int movesize = q.size();
            for(int move=0;move<movesize;move++){
                Node cur = q.poll();

                //욱이가 오른쪽에 도착했다면 종료시키기
                if(cur.x ==0)
                {
                    flag = true;
                    break;
                }

                //7칸 올라가서 버티면 된다.
                if(cur.cnt>7)
                {
                    flag = true;
                    break;
                }

                //도착 못한 욱이는 계속 움직여야 한다.
                int x = cur.x;
                int y = cur.y;

                for(int i=0;i<9;i++){
                    int nx = x+ dx[i];
                    int ny = y+ dy[i];

                    //다음 칸이 범위 안이고 빈칸일 경우 움직일 수 있음
                    if(inrange(nx,ny) && map[nx][ny] =='.'){
                        q.add(new Node(nx,ny,cur.cnt+1));
                    }
                }
            }
            //움직일 수 있는 범위를 다 끝냈으면 바위 내리기
            //마지막 칸 바위는 다 없어짐
            for(int i=0;i<8;i++){
                if(map[7][i]=='#')
                rcnt--;
                map[7][i] ='.';
            }
            //바위 다 없애고 나면 내려주기
            for(int i=6;i>=0;i--){
                for(int j=0;j<8;j++){
                    if(map[i][j] =='#'){
                        map[i][j] ='.';
                        map[i+1][j] = '#';
                    }
                }
            }
            //바위가 존재하지 않는데 큐에 사람이 있으면 통과 가능
            if(rcnt==0 && !q.isEmpty()){
                flag = true;
                break;
            }
            //벽돌이 움직인 칸에 욱이가 있으면 없애기
            int qsize = q.size();
            for(int i=0;i<qsize;i++){
                Node tmp = q.poll();
                if(map[tmp.x][tmp.y] =='.')
                q.add(tmp);
                else if(map[tmp.x][tmp.y]=='#')
                continue;
            }//바위에 깔린 욱이 제거하기
            
            //바위에 깔려서 욱이가 다 죽었으면 종료하기
            if(q.isEmpty() && rcnt>0)
            break;

        }
        /*
        //여기서 욱제 캐릭터가 오른쪽 위에 갈 수 있으면
        return 1;
        //오른쪽 위로  갈수 없으면
        return 0;
        */
        if(!flag)bw.write(String.valueOf(0+"\n"));
        else bw.write(String.valueOf(1+"\n"));
        bw.flush();
    }
// 범위 설정해주는거
public static boolean inrange(int nx,int ny){
    if(nx >=0 && ny >=0 && nx <8 && ny <8 )
    return true;
        else 
    return false;
    }
}
//여기서 자꾸 노드 만들어주는 이유 찾기
class Node{
    int x;
    int y;
    int cnt;
    //생성자 만들어주면 좋은 점 찾기
    Node(int x,int y,int cnt){
    this.x = x;
    this.y = y;
    this.cnt =cnt;
    }
}