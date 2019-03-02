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


//���� �����̴µ� 1�ʸ��� ��� ���� �Ʒ��� �ִ� ������ ��ĭ�� �������� 
public class baekjoon16954 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    //�켱 bfs�� �̿��ؼ� �����ؾ� �Ѵ�.
    //�̷��� �ϴ°� ��, ��, ��, ���̶�??
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

                //���̰� �����ʿ� �����ߴٸ� �����Ű��
                if(cur.x ==0)
                {
                    flag = true;
                    break;
                }

                //7ĭ �ö󰡼� ��Ƽ�� �ȴ�.
                if(cur.cnt>7)
                {
                    flag = true;
                    break;
                }

                //���� ���� ���̴� ��� �������� �Ѵ�.
                int x = cur.x;
                int y = cur.y;

                for(int i=0;i<9;i++){
                    int nx = x+ dx[i];
                    int ny = y+ dy[i];

                    //���� ĭ�� ���� ���̰� ��ĭ�� ��� ������ �� ����
                    if(inrange(nx,ny) && map[nx][ny] =='.'){
                        q.add(new Node(nx,ny,cur.cnt+1));
                    }
                }
            }
            //������ �� �ִ� ������ �� �������� ���� ������
            //������ ĭ ������ �� ������
            for(int i=0;i<8;i++){
                if(map[7][i]=='#')
                rcnt--;
                map[7][i] ='.';
            }
            //���� �� ���ְ� ���� �����ֱ�
            for(int i=6;i>=0;i--){
                for(int j=0;j<8;j++){
                    if(map[i][j] =='#'){
                        map[i][j] ='.';
                        map[i+1][j] = '#';
                    }
                }
            }
            //������ �������� �ʴµ� ť�� ����� ������ ��� ����
            if(rcnt==0 && !q.isEmpty()){
                flag = true;
                break;
            }
            //������ ������ ĭ�� ���̰� ������ ���ֱ�
            int qsize = q.size();
            for(int i=0;i<qsize;i++){
                Node tmp = q.poll();
                if(map[tmp.x][tmp.y] =='.')
                q.add(tmp);
                else if(map[tmp.x][tmp.y]=='#')
                continue;
            }//������ �� ���� �����ϱ�
            
            //������ ����� ���̰� �� �׾����� �����ϱ�
            if(q.isEmpty() && rcnt>0)
            break;

        }
        /*
        //���⼭ ���� ĳ���Ͱ� ������ ���� �� �� ������
        return 1;
        //������ ����  ���� ������
        return 0;
        */
        if(!flag)bw.write(String.valueOf(0+"\n"));
        else bw.write(String.valueOf(1+"\n"));
        bw.flush();
    }
// ���� �������ִ°�
public static boolean inrange(int nx,int ny){
    if(nx >=0 && ny >=0 && nx <8 && ny <8 )
    return true;
        else 
    return false;
    }
}
//���⼭ �ڲ� ��� ������ִ� ���� ã��
class Node{
    int x;
    int y;
    int cnt;
    //������ ������ָ� ���� �� ã��
    Node(int x,int y,int cnt){
    this.x = x;
    this.y = y;
    this.cnt =cnt;
    }
}