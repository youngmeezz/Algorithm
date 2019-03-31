//�߷�����
//BFS�� ���ͽ�Ʈ�� �˰��� Ȱ��
/*
1) ���� ���� Ž���� ���Ͽ� �߷��� ������ å���մϴ�.
2)l=0, r=�ִ��߷� ���� �ʱ�ȭ �Ͽ� ����Ž���� �����մϴ�.
3)wgt ���� m�϶� checkPossible�Լ��� ȣ���ؼ� ���ۼ����� ���������� ��� �����ϸ� �߰��� ����
���� 
4)L�� �ٽ� �����ϰ� ����� �� ���ٸ� h�� �����մϴ�.
5)ans=m�� �̿��Ͽ� ans�� ����ϰ� �˴ϴ�.
*/

package baekjoon;

import java.util.*;
import java.io.*;

public class baekjoon1939{
    static Vector<Node> adj[] = new Vector[100001];
    static int N,M,S,E;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        for(int i=1;i<=N;i++)
        adj[i] = new Vector<Node>();

        for(int i=0,u,v,c;i<M;i++){
            st = new StringTokenizer(br.readLine());
            u = Integer.parseInt(st.nextToken());
            v = Integer.parseInt(st.nextToken());
            c = Integer.parseInt(st.nextToken());
            adj[u].add(new Node(v,c));
            adj[v].add(new Node(u,c));
        }

        st = new StringTokenizer(br.readLine());
        S = Integer.parseInt(st.nextToken());
        E = Integer.parseInt(st.nextToken());
        //solved ����Ž��
        int ans = 0, l=0, r = 1000000000,m;
        while(l <= r){
            m = (l+r) /2;
            if(checkPossible(m)){
                ans = m;
                l = m+1;
            }
            else r = m-1;
        }
        bw.write(String.valueOf(ans));
        bw.flush();
    }

    static boolean checkPossible(int weight){
        boolean chk[] = new boolean[N+1];
        chk[S] = true;

        Queue<Integer> q = new LinkedList<>();
        q.add(S);
        while(!q.isEmpty()){
            int cur = q.peek();
            q.poll();
            for(int i=0;i<adj[cur].size();i++){
                int next = adj[cur].get(i).node;
                if(chk[next] || adj[cur].get(i).cost < weight) continue;
                if(next == E) return true;
                q.add(next);
                chk[next] = true;
            }
        }
        return chk[E];
    }

    }
class Node{
    int node,cost;
    public Node(int node, int cost){
        this.node = node;
        this.cost = cost;
    }
}

