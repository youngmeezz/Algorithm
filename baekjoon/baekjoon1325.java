package baekjoon;
import java.util.*;
import java.io.*;
import java.util.StringTokenizer;

//컴퓨터가 아래 M = 4개의 줄에 신뢰하는 관계를 설명한다.
//1번부터 N = 5번까지 숫자를 가질 수 있다.
//dfs문제라고 하였다.
//3이 1을 신뢰하고 -> 1을 해킹하면 3을 해킹
//3이 2를 신뢰하고 -> 2를 해킹하면 3을 해킹
//4가 3을 신뢰하고 -> 3을 해킹하면 4을 해킹 -> 1,2를 해킹
///5가 3을 신뢰한다. ->3을 해킹하면 5을 해킹 ->1,2,4를 해킹
//따라서 최대 해킹할 수 있는 컴퓨터 번호가 1,2
//dfs활용하고 StringBuilder활용해 보자
/*
public class baekjoon1325{

    //static int arr[][];
    //static boolean visit[][];
    static int dx[] = {-1,1,0,0};
    static int dy[] = {0,0,-1,1};
    static int N;
    static int M;
    //ArrayList를 구해줄 a 배열
    static ArrayList<Integer>[]  a = (ArrayList<Integer>[]) new ArrayList[10001];
    
    public static void main(String[] args)throws IOException{

        //신뢰 하는 관계와 신뢰하지 않는 관계를 어떻게 파악하는거지?
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //StringTokenizer st = new StringTokenizer(br.readLine());
        
        //N = Integer.parseInt(st.nextToken());
        //M = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();
        N = sb.readLine();
        M = sb.readLine();
        for(int i=1;i<=N;i++){
            //위에서 static해준 ArrayList배열a
            a[i] = new ArrayList<Integer>();
        }

        for(int i=0;i<M;i++){
            int v1 = 
        }
        //arr = new int[N][M];
        //visit = new boolean[N][M];


        // ArrayList를 하나 만들어 줘야 한다.
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
    //StringBuilder사용하는거랑 Scanner사용하는거 차이점 알아내기
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


//중요한 것은 방문했다는 visited와 몇 번 호출됐다는 hacking라는 변수를 따로 두어서
//visited는 매 번 리셋해줘야 하지만
//hacking는 호출 될 때 마다 값을 더해줘야 한다.


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