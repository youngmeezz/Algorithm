import java.util.*;
/*
public class Jungonara1{

public static int n,m,map[][], visit[][];
public static int dx[] = {-1,-1,-1,0,0,1,1,1};
public static int dy[] = {1,0,-1,1,-1,1,0,-1};

public static void bfs(){
    Queue<Pair> q = new LinkedList<>();
    q.add(new Pair(0,0));

    while(!q.isEmpty()){
        Pair p = q.poll();
        for(int i=0;i<4;i++){
            int nx = p.x + dx[i];
            int ny = p.y + dy[i];

            if(nx<0 || ny<0 || nx>=n || ny>=m)
            continue;

            if(map[nx][ny]==0 && visit[nx][ny]==0){
                visit[nx][ny] = 1;
                q.add(new Pair(nx,ny));
            }
            if(map[nx][ny]==1){
                visit[nx][ny]++;
                if(visit[nx][ny]>=2)
                map[nx][ny]=0;
            }
        }
    }
}
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    n = sc.nextInt();
    m = sc.nextInt();
    map = new int[n][m];
    visit = new int[n][m];

    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            map[i][j] = sc.nextInt();
        }
    }
    int time =0;
    boolean check = true;
    while(check){
        init_visit();
        bfs();

        //*�� �ֺ��� � �ִ��� Ȯ�� * 2���� => 2 
        check = false;
        loop:
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(map[i][j]!=0){
                    check = true;
                    break loop;
                }
            }
        }
            time++;
      }
      System.out.println(time);
    }

      public static void init_visit(){
          for(int i=0;i<n;i++){
              for(int j=0;j<m;j++){
                  visit[i][j] = 0;
              }
          }
      }


    static class Pair{
        int x,y;
        Pair(int x,int y){
            this.x = x;
            this.y = y;
        }
    }
}
*/
/*
import java.util.*;
 
public class Jungonara1{
    public static void main(String[] args)
    {
        boolean[][] board = new boolean[10][10];
        String[][] boardc = new String[10][10];
        int[][] boardi = new int[10][10];
        int i, j;
        int n
        char arr[n][m];
        for(i = 0; i < 10; i++)
        {
            for(j = 0; j < 10; j++)
            {
                if (Math.random() < 0.3)
                {
                    board[i][j] = true;
                }
            }
        }
        
        for(i = 0; i < 10; i++)
        {
            for(j = 0; j < 10; j++)
            {
                if (board[i][j])
                {
                    boardc[i][j] = "#";        //boardc�� ���� #�� ����
                    System.out.print("# ");
                }
                else
                {
                    System.out.print(". ");
                }
            }
        System.out.println();
        }
        
        for(i = 0; i < 10; i++)   // �� ��ġ
        {
          for(j = 0; j < 10; j++)
          {      
              if(boardc[i][j] == "#") // ���� �� ��ġ�� #(����)�ϰ��
              {
                  continue;
              }
              int count =0;   // ������ ������ �ľ��ϱ� ���� �ʱ�ȭ
                  for(int k = i-1; k <= i+1; k++)  // �ֺ���ġ
                  {
                      for(int h = j-1; h <= j+1; h++)
                      {
                          if(i==k && j==h) //�ֺ� ��ġ�� Ž���Ͽ� �� ��ġ�� �� �� 
                          {
                              continue; 
                          }
                          if(k==-1 || k==10 || h==-1 || h==10) // �ֺ���ġ���� ���� ���� �Ѿ�� ���
                          {
                              continue; 
                          }
                          if(boardc[k][h] == "#") // �� �ֺ� ��ġ�� #(����)�� ���� ���
                          {
                              count++; // ���� ����
                          }
                      }
                  }
                  boardi[i][j] = count;
              }
         }
 
        System.out.println();
        
        for(i = 0; i < 10; i++)
        {
            for(j = 0; j < 10; j++)
            {
                if (board[i][j])
                {
                    System.out.print(boardc[i][j] + " ");
                }
                else
                {
                    System.out.print(boardi[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}

*/
import java.util.*;
/*
class Jungonara1 {
  public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();//��
			int m = sc.nextInt();//��
			char arr[][] = new char[n][m];
			String str[] = new String[n]; //��

            */

            //Please don't change class name 'Main'
import java.util.*;

class Main {
  public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();//��
			int m = sc.nextInt();//��
			char arr[][] = new char[n][m];
			String str[] = new String[n]; //��
		
			for(int i=0;i<n;i++){
				for(int j=0;j<m;j++){
					arr[i][j] = '0';
				}
			}
		sc.nextLine();//��������
			for(int i=0;i<n;i++)
			{
				str[i] = sc.nextLine();
			}
		
			for(int i=0;i<n;i++)
				for(int j=0;j<m;j++)
				{
					if(str[i].charAt(j) == '*')
					{
						arr[i][j] = str[i].charAt(j); 
							if(i-1>=0 && j-1>=0 && arr[i-1][j-1]!='*') //���� ��
								arr[i-1][j-1]++;
							if(i-1>=0 && arr[i-1][j]!='*') // �ٷ� ��
								arr[i-1][j]++;
							if(i-1>=0 && j+1<m && arr[i-1][j+1]!='*') //������ ��
								arr[i-1][j+1]++;
							if(j-1>=0 && arr[i][j-1]!='*')//����
								arr[i][j-1]++;
							if(j+1<m && arr[i][j+1]!='*')	//������
 							  arr[i][j+1]++;
							if(i+1<n && j-1>=0 && arr[i+1][j-1]!='*') //���� �Ʒ�
								arr[i+1][j-1]++;
							if(i+1<n && arr[i+1][j]!='*') //�ٷ� �Ʒ�
								arr[i+1][j]++;
							if(i+1<n && j+1<m && arr[i+1][j+1]!='*')//������ �Ʒ�
								arr[i+1][j+1]++;
								}	
				}
					for(int i=0;i<n;i++){
						for(int j=0;j<m;j++){
								System.out.print(arr[i][j]);
							}
						System.out.println();
					}
			}
	}


