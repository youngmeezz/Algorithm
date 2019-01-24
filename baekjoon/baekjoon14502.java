package baekjoon;
//����, ����, permutation function templates => stl ���ڿ�(����) ...����Լ� dfs bfs(����)�� ���� dfs (�ð����⵵)
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class baekjoon14502{
    
    static int N,M;
    static int[][] map, tempMap;
    static int maxSafeZone;
    static int[] dx = {-1,0,1,0}; //�� �� ���� �Ʒ� �� ���� Ǯ��?
    static int[] dy = {0,1,0,-1};

public static void main(String[] args)throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine()); //�� ��Ʈ�� ��ũ�������� �̿��ؼ� ������ �׸����� �ñ�
    N = Integer.parseInt(st.nextToken());
    M = Integer.parseInt(st.nextToken());

    map = new int[N][M];
    tempMap = new int[N][M];

    //������ ���� �׸���
    for(int i=0;i<N-1;i++){
        StringTokenizer str = new StringTokenizer(br.readLine());
        for(int j=0;j<M;j++){
            map[i][j] = Integer.parseInt(str.nextToken());
        }
    }

    //�� �����
    //�� 3�� ����� �˰��� ��� �������� �����ϱ� �׸��� 3���ε� �� 3�� ����°��� 
    for(int i=0;i<N*M;i++){
        int x=i/M; //�� �̷��� ����? ó���� x�� �� i������ M�� ���� ������ ���ϴ��� �ñ� //���� �����ֱ� ���� ���̷� �����ֱ� 7*7�� �簢���� ��� 7�� ����
        int y=i%M; //ó���� y���� i������ M�� ���� �������� �ϴ� �� �ñ�//
        if(map[x][y]==0){
            map[x][y] = 1;
            dfs(i,1);
            map[x][y]=0;
        }
}
//���� �� ���
System.out.println(maxSafeZone);

}


//���� ���� ũ�� ���ϱ� �޼ҵ�
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

        //Ǯ�̰��� ���� �ڵ�
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
//���̷��� Ȯ�� �޼ҵ�� bfs�� ����ϰ�
public static void bfs(int x,int y){
    Queue<Dot> q = new LinkedList<Dot>();
    q.add(new Dot(x,y));

    while(!q.isEmpty()){
        Dot d = q.poll();

        for(int i=0;i<4;i++){
            int nextx = d.x + dx[i]; //nextx�� �ǹ��ϴ°�  2(���̷���)���� x�� �̵��ϴ� ��
            int nexty = d.y + dy[i]; //nexty�� �ǹ��ϴ°�  2(���̷���)���� y�� �̵��ϴ� ��

            if(nextx<0 || nexty<0 || nextx >=N || nexty >= M){ //������ ����� ���̶�� ��� ����
                continue;
            }
            if(tempMap[nextx][nexty] ==1){ //1�� ���̶�� ��� ����
                continue;
            }
            if(tempMap[nextx][nexty] ==0){  //0�� ����ִ� ���̶��
                tempMap[nextx][nexty] =2;//���̷��� Ȯ�갪 2�� �� �ٲ��ش�.
                q.add(new Dot(nextx,nexty));
            }
        }
    }
}

//������� �޼ҵ�� dfs�� ����Ѵ�.
public static void dfs(int n,int numberOfWall){
    int x = n / M;
    int y = n % M;

    if(numberOfWall ==3){//�� 3���� ��� ��������
    
    //�ӽ� �� �����
    tempMap = new int[N][M];
    for(int i=0;i<N;i++){
        for(int j=0;j<M;j++){
            tempMap[i][j] = map[i][j];
        }
    }

    //���̷��� Ȯ�� ��Ű��
    for(int i=0;i<N;i++){
        for(int j=0;j<M;j++){
            if(tempMap[i][j]==2){//���̷��� �����̶��
            //Ȯ�� �޼ҵ� ȣ��
            bfs(i,j);
        }
    }
}
//���� ���� ũ�� �޼ҵ� ȣ��
countSafeZone();

    }else{ //�� 3���� ���� ��� ������ ��������
        for(int i=n+1;i<N*M;i++){
            int tempx = i / M;
            int tempy = i % M;

            //���� �� �����
            if(map[tempx][tempy] ==0){
                map[tempx][tempy] = 1;
                dfs(i, numberOfWall+1);
            }
        }
    }
    //������ ������, �ٽ� map�� ���� ���� ���Ѿ��Ѵ�.
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

    //�ٵ� �� Ǯ�� ó�� �׽�Ʈ���̽� 27�� �ƴ϶� 28�� �����µ� -> �� ���Ȱǰ� 
//��δ� ������...������
//���� ���ϳ��� ����� 