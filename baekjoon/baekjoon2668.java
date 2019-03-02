//DFS�⺻�߿� �⺻�� ����

package baekjoon;
import java.util.*;
import java.io.*;
public class baekjoon2668{

    static int[] arr;
    static boolean[] visited;
    //last�� ������ ���� ������� ���ٸ� ����Ŭ�� �ϼ� �����Ƿ� ����Ʈ�� �߰� �̰� -> dfs�Ϸ��� ����Ŭ �ؾߵǴ±��� estsoft���� 2�� ������ ����
    static int last;
    //ArrayList�� �ϳ� ������ �ξ�� �ϰ�
    static ArrayList<Integer> list;

    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        arr= new int[N+1];
        visited = new boolean[N+1];
        list = new ArrayList<Integer>();
        for(int i=1;i<=N;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=1;i<=N;i++){
            visited[i] = true; //���� ��Ϳ� ������ �ȵǹǷ� ù �������� �湮���� üũ
            last = i;
            DFS(i);
            visited[i] = false; //���� ���ڸ� dfs�ؾ� �ϴϱ� �ʱ�ȭ �����ش�.
        }
        Collections.sort(list);//���� �� ���� ����ؾ� �ϴϱ� ����

        //���ڰ� ����� ������ ���
        System.out.println(list.size());

        //����� ���� list�� �ϳ��� ���ʴ�� ���ĵ� ������ ���
        for(int i : list){
            System.out.println(i); //list���� �ϳ��� ������ش�.
        }
    }
    public static void DFS(int i){
        if(!visited[arr[i]]){ //������ �湮�� ���� �ƴϿ��� �Ѵ�.
            visited[arr[i]] = true; //�湮�����Ƿ� true;
            DFS(arr[i]);
            visited[arr[i]] = false; //���� DFS�� ���Ͽ� false
        }
        if(arr[i] == last){ //������ ���� ������� ���ٸ� ����Ŭ�� �ϼ������Ƿ� ����Ʈ�� �߰�
            list.add(last);
        }
    }
}

        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //StringTokenizer st = new StringTokenizer(br.readLine()," ");

        //N = Integer.parseInt(st.nextToken());
        //result =0;
        //ans = new int[10001];

 