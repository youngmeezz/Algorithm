//개미 문제 simulation인데 이해 안감
package baekjoon;
/*
import java.util.Scanner;
public class baekjoon3048{
    public static int[][] ants;
    public static int A,B,T;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        A = sc.nextInt();
        B = sc.nextInt();

        ants = new int[2][A+B];

        String A_Group = sc.next();
        String B_Group = sc.next();

        char[] Groups = new char[A+B];

        for(int i=0;i<A;i++){
            Groups[i] = A_Group.charAt(A-i-1);
            ants[0][i] = i;
            ants[1][i] = 0;
        }
        
        for(int i=A;i<A+B;i++){
            Groups[i] = B_Group.charAt(i-A);
            ants[0][i] = i;
            ants[1][i] = 1;
        }
        T = sc.nextInt();

        getArrays();

        String result = "";
        for(int i=0;i<A+B;i++){
            result +=Groups[ants[0][i]] + "";
        }
        System.out.println(result);
    }
    public static void getArrays(){
        for(int i=0;i<T;i++){
            int d = ants[1][0];
            for(int j=0;j<ants[0].length;j++){
                if(d == 0){
                    int temp = ants[0][j-1];
                    ants[0][j-1] = ants[0][j];
                    ants[0][j] = temp;
                    ants[1][j-1] = ants[1][j];
                    ants[1][j] = d;
                    if(j<ants[0].length -1)
                        d = ants[1][j+1];
                }else{
                    d = ants[1][j];
                }
            }
        }
    }
}
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class baekjoon3048{
    static int N1;
    static int N2;
    static int T;
    static ArrayList<Node> list = new ArrayList<>();
    static StringBuffer sb = new StringBuffer();

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N1 = Integer.parseInt(st.nextToken());
        N2 = Integer.parseInt(st.nextToken());

        char[] temp1 = br.readLine().toCharArray();

        for(int i=N1-1;i>=0;i--){
            list.add(new Node(temp1[i], true));
        }
        char[] temp2 = br.readLine().toCharArray();

        for(int i=0;i<N2;i++){
            list.add(new Node(temp2[i],false));
        }

        T = Integer.parseInt(br.readLine());

        //시뮬레이션 이전에 체크
        if(N2 + N1 -1 <= T){
            for(int i=0;i<temp2.length;i++){
                sb.append(temp2[i]);
            }
            for(int i=temp1.length-1;i>=0;i--){
                sb.append(temp1[i]);
            }
            System.out.println(sb.toString());
            return;
        }

        while(T-- >0){
            for(int i=0;i<list.size()-1;i++){
                Node cur = list.get(i);
                Node next = list.get(i+1);

                if(!cur.team || cur.team == next.team)
                continue;

                list.set(i,next);
                list.set(i+1,cur);
                i++;
            }
        }
        for(int i=0;i<list.size();i++){
            sb.append(list.get(i).c);
        }
        System.out.println(sb.toString());
    }
}

class Node{
    char c;
    boolean team;
    Node(char c,boolean team){
        this.c = c;
        this.team = team;
    }
}