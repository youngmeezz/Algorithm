package baekjoon;

//���⼭ ȥ�� �غ� ���� ���� �����̶� �Էº� ��ºκ��� ¥���� �׷��� ���� �˰����� ��� ������ ���鼭 Ǯ���
//�׸��� �˰��� �̸� �����صΰ� Ǯ�� �� ���� ���̴�.

import java.util.Scanner;
import java.util.*;
//2636�� dfs�� Ǯ���
//�������� �־��� ������ "�� ������ �� �����ڸ����� ġ� ������ �ʴ� ������ �����Ѵ�."
//��, ������ �����ڸ��� ������ �ǹ��̴�.


/*����
1. ������ ���� �ֻ����(0,0)���� ���� DFS�� ������.
2. DFS Ž�� �� ���� �̵��� ��Ұ� ġ��(1)�̸� ���� +1���ش�.(1->2)
-ġ� ���� �Ѹ鸸 ����� ������� ��� 2�� �ɰ��̰�
2���� ����մٸ� 3, 3���� ����ִٸ�4 , 4���� ������ 5�� �� ���̴�.
3. DFS Ž�� ���� ����(0)�� -1�� ���� �ٲ��ְ� �̵��Ͽ� �߰� DFS�� �����Ѵ�.
4. �� ������ ���� DFS�� �� ������ ����, 2�� for���� �̿��Ͽ�
 - 3 �̻��� ���� ���� ���� 2�� �̻��� ����� ���˵� ġ���̱� ������ �쿩�ְ�(0����)
 - -1�� ���� ���� ������ 0���� �ٽ� �����ְ�,
 - 1�̳� 2�� ���� ġ��� ���⿡ ������� �ʰų�,�Ѹ鸸 ����� ġ���̹Ƿ� �ٽ� 1�� �����ش�.

 -> 3�̻� : 0 / 2or1 : 1 / -1 : 0
5. �� ������ ġ� ��� ���� �� ���� �ݺ��Ͽ� �� Ƚ���� ���� ����ϸ� �ȴ�.

�̷��� �ϸ� ���ΰ���� �ܺΰ���� ����Ǳ� ������ Ž������ �����鼭 ������ ġ� �쿩 �� �� �ִ�.
*/

/*
������ 0�� -1�� �ٲ��ְ� �߰� Ž��, 0���� ū���� ������ +1�� ���ش�.
2�� for���� ������
1) 3�̻��̸� -> 2�� �̻��� ����� ������ ġ���̹Ƿ� ����(0)
2) -1�̸� -> ���� ���⿴���ϱ� ���󺹱�� (0)
3) 1 �̳� 2�̸� ->1�� ���ϸ� ����� ������ ġ���̹Ƿ� ���󺹱�(1)
*/

/*
public class baekjoon2636{

        //�켱 ���������ϱ�
        static int cheese;
        static int map[][];
        static boolean check[][];
        static int time;//ġ� ��� ��Ƽ� �������µ� �ɸ��� �ð�
        static int count; //ĭ�� ���� ����� ��
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();//���α���
        int col = sc.nextInt();//���α���


        //ġ� ��� ��Ƽ� �������µ� �ɸ��� �ð��� ���
        
        //ĭ�� ������ ���
        System.out.println("%d",count);
    }
}

//�Էº� 
//ù°�ٿ��� �簢�� ��� ���� ���ο� ������ ���̰� ���� ������ �־�����.
//���ο� ������ ���̴� �ִ� 100�̴�.
//���� �� �������� ����� ���ٺ��� ���ʷ� �Ѥ� �ٺ��� ������ �ٱ��� �־�����.
//ġ� ���� ĭ�� 0,ġ� �ִ� ĭ�� 1�� �־����� ���� ���̿��� ��ĭ�� �ϳ��� �ִ�.  



//��º�
//(ù°�ٿ��� ġ� ��� ��Ƽ� �������µ� �ɸ��� �ð�)
//(�Ѥ��ٿ��� ��� ��� �� �ð� ���� �����ִ� ġ�������� ���� �ִ� ĭ�� ������ ����Ѵ�.)
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

    public static void main(String[] args)throws Exception{ //throws Exception�� �ݵ�� ����߸� �ڿ� ������ �ȳ��� �̰� �� ����� �ϴ��� üũ�ϱ�

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
    //�̰Ŵ� �׳� true false ������ �� ���� �� �ִ��� ������ üũ
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
    //�̰� �𸣰����ϱ� �׳� dfs�� Ǯ��
    //�ܺδ� ������(0,0)�� ����->-1�� ��ŷ
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