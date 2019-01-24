//dp로 푸는 방법
/*
private void solve(){
 
    int n = sc.nextInt();
    int[] t = new int[n+1];
    int[] p = new int[n+1];
    int[] dp = new int[n+1];

    for(int i=1;i<=n;i++){
        t[i] = sc.nextInt();
        p[i] = sc.nextInt();

        dp[i] = p[i];
    }

    //dp[n] = n일때까지 얻은 수익

    for(int i=2;i<=2;i++){
        for(int j=1;j<i;j++){

            if(i-j>=t[j]){
                dp[i] = Math.max(p[i] + dp[j],dp[i]);
            }
        }
    }
    int max =0;
    
    for(int i=1;i<=n;i++){
        if(i+t[i]<=n+1){
            if(max<dp[i]){
                max = dp[i];
            }
        }
    }
    System.out.println(max);
}
}
*/

import java.util.Scanner;

public class baekjoon14501{
    static int n;
    static int[] tArr; //상담을 완료하는데 걸리는 기간
    static int[] pArr; //상담을 했을때 받을 수 있는 금액
    static int maxPrice;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); //퇴사 날짜 입력
        int totalPrice=0;

        tArr = new int[n];
        pArr = new int[n];

        for(int i=0;i<n;i++){
            tArr[i] = sc.nextInt();
            pArr[i] = sc.nextInt();
        }
        recursiveDFS(0,0);
        System.out.println(maxPrice);
    }

    public static void recursiveDFS(int i,int totalPrice){
        //탈출 조건 잘 만들기
        //상담할 날짜가 퇴사 날짜와 일치할경우 오늘이 퇴사날임으로 탈출(i == n)
        //오늘이 퇴사 날이 아닐 경우 ,2차 탈출 조건을 상담을 할 경우와 하지 않을 경우로 분류
        //1)상담을 할 경우
        //상담할 날짜가 퇴사 날짜보다 후일이여서 상담을 완료 못하는 경우(t+tArr[t]>n)
        //2)상담을 하지 않을 경우
        //다음 상담 가능한 날(내일)이 퇴사 날짜를 지날 경우(t+1>n)
        // i == n || (t+tArr[t]>n && t+1>n)
        // i == n || t+1>n
        // i>=n ( i와 t+1이 같은 이유 상담할 날짜(i)와 다음날 상담가능한 날(t+1)이 일치함)
        if(i>=n){
            if(maxPrice<totalPrice)
                maxPrice = totalPrice;
                return;
        }

        //i번째 날에 상담 할 경우
        //다음 상담을 할 수 있는 날짜와 상담 금액을 더하여 파라미터를 전달
        if(i+tArr[i]<=n)
            recursiveDFS(i+tArr[i],totalPrice+pArr[i]);

        //i번째 날에 상담 하지 않을 경우
        //다음날 날짜와 현재 이익을 파라미터로 전달
        if(i+1<=n)
            recursiveDFS(i+1,totalPrice);
    }

}