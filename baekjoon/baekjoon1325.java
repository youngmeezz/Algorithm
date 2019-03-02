package baekjoon;
import java.util.*;
import java.io.*;
import java.util.StringTokenizer;

//��ǻ�Ͱ� �Ʒ� M = 4���� �ٿ� �ŷ��ϴ� ���踦 �����Ѵ�.
//1������ N = 5������ ���ڸ� ���� �� �ִ�.
//dfs������� �Ͽ���.
//3�� 1�� �ŷ��ϰ� -> 1�� ��ŷ�ϸ� 3�� ��ŷ
//3�� 2�� �ŷ��ϰ� -> 2�� ��ŷ�ϸ� 3�� ��ŷ
//4�� 3�� �ŷ��ϰ� -> 3�� ��ŷ�ϸ� 4�� ��ŷ -> 1,2�� ��ŷ
///5�� 3�� �ŷ��Ѵ�. ->3�� ��ŷ�ϸ� 5�� ��ŷ ->1,2,4�� ��ŷ
//���� �ִ� ��ŷ�� �� �ִ� ��ǻ�� ��ȣ�� 1,2
//dfsȰ���ϰ� StringBuilderȰ���� ����
/*
public class baekjoon1325{

    //static int arr[][];
    //static boolean visit[][];
    static int dx[] = {-1,1,0,0};
    static int dy[] = {0,0,-1,1};
    static int N;
    static int M;
    //ArrayList�� ������ a �迭
    static ArrayList<Integer>[]  a = (ArrayList<Integer>[]) new ArrayList[10001];
    
    public static void main(String[] args)throws IOException{

        //�ŷ� �ϴ� ����� �ŷ����� �ʴ� ���踦 ��� �ľ��ϴ°���?
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //StringTokenizer st = new StringTokenizer(br.readLine());
        
        //N = Integer.parseInt(st.nextToken());
        //M = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();
        N = sb.readLine();
        M = sb.readLine();
        for(int i=1;i<=N;i++){
            //������ static���� ArrayList�迭a
            a[i] = new ArrayList<Integer>();
        }

        for(int i=0;i<M;i++){
            int v1 = 
        }
        //arr = new int[N][M];
        //visit = new boolean[N][M];


        // ArrayList�� �ϳ� ����� ��� �Ѵ�.
      //  arr[N].add[M];

        /*
        for(int i=0;i<N;i++){
            String a = br.readLine();
            for(int j=0;j<M;j++){
                arr[i][j] = a.charAt(j)-'0';
                visit[i][j] = false;
            }
        }
        visit[0][0] = true;
        bfs(0,0);
        
    }
}
*/

public class baekjoon1325{
static ArrayList<Integer>[] a = (ArrayList<Integer>[]) new ArrayList[10001];
static boolean[] visited = new boolean[10001];
static int[] ans = new int[10001];
static int cnt = 0;
 
public static void main(String[] args)throws IOException {
    //StringBuilder����ϴ°Ŷ� Scanner����ϴ°� ������ �˾Ƴ���
    StringBuilder sb = new StringBuilder();
    Scanner sc =new Scanner(System.in);
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");

    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());
    for (int i = 1; i <= n; i++) {
        a[i] = new ArrayList<Integer>();
    }
 
    for (int i = 0; i < m; i++) {
        
        st = new StringTokenizer(br.readLine(), " ");

        int v1 = Integer.parseInt(st.nextToken());
        int v2 = Integer.parseInt(st.nextToken());
 
        a[v1].add(v2);
    }
 
    int max = 0;
    for (int i = 1; i <= n; i++) {
        visited = new boolean[10001];
        dfs(i);
    }
 
    for (int i = 1; i <= n; i++) {
        if (max < ans[i]) {
            max = ans[i];
        }
    }
 
    for (int i = 1; i <= n; i++) {
        if (max == ans[i]) {
            sb.append(i + " ");
        }
    }
 
    System.out.println(sb.toString());
}


//�߿��� ���� �湮�ߴٴ� visited�� �� �� ȣ��ƴٴ� hacking��� ������ ���� �ξ
//visited�� �� �� ��������� ������
//hacking�� ȣ�� �� �� ���� ���� ������� �Ѵ�.


public static void dfs(int v) {
    visited[v] = true;
 
    for (int vv : a[v]) {
        if (!visited[vv]) {
            ans[vv]++;
            dfs(vv);
            }
        }
    }
}

/*
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

	static int N, M;
	static int[] vertex;
	static int[] nodeMap;
	static int[] ans;
	static int result;
	static ArrayList<Integer>[] list = new ArrayList[10001];

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		result = 0;
		nodeMap = new int[10001];
		ans = new int[10001];

		for (int i = 1; i <= N; i++) {
			list[i] = new ArrayList<>();
		}

		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine(), " ");

			int n1 = Integer.parseInt(st.nextToken());
			int n2 = Integer.parseInt(st.nextToken());

			list[n1].add(n2);
			nodeMap[n1] = n2;
		}

		for (int i = 1; i <= N; i++) {
			vertex = new int[100001];
			dfs(i);
		}

		for (int i = 1; i <= N; i++) {
			if (result == ans[i]) {
				System.out.print(i + " ");
			}
		}

	}

	static void dfs(int node) {

		vertex[node] = 1;

		for (int i : list[node]) {

			if (vertex[i] == 0) {
				ans[i] += 1;
				result = Math.max(result, ans[i]);
				dfs(i);
			}
		}

	}
}
*/