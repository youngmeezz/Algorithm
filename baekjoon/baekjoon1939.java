//중량제한
//BFS와 다익스트라 알고리즘 활용
/*
1) 먼저 이진 탐색을 통하여 중량의 범위를 책정합니다.
2)l=0, r=최대중량 으로 초기화 하여 이진탐색을 진행합니다.
3)wgt 값이 m일때 checkPossible함수를 호출해서 시작섬에서 도착섬까지 운반 가능하면 중간값 다음
으로 
4)L을 다시 갱신하고 운반할 수 없다면 h를 갱신합니다.
5)ans=m을 이용하여 ans를 출력하게 됩니다.
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
        //solved 이진탐색
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

