package baekjoon;

import java.util.Arrays;
import java.util.Scanner;


public class baekjoon11060{

        static int N;
        static int[] A;
        static int[] dp;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        A = new int[N+1];

        for(int i=1;i<=N;i++)
            A[i] = sc.nextInt();
            sc.close();
            dp = new int[N+1];
            Arrays.fill(dp,Integer.MAX_VALUE);
            dp[1] = 0;
            
            for(int i=1;i<=N;i++){
                if(dp[i] != Integer.MAX_VALUE){
                    int jump = A[i];
                    for(int j=1;j<=jump;j++){
                        if(i+j > N)
                            continue;
                        dp[i+j] = Math.min(dp[i]+1,dp[i+j]);
                    }
                }
            }
            System.out.println(dp[N] == Integer.MAX_VALUE ? -1 : dp[N]);

    }
}