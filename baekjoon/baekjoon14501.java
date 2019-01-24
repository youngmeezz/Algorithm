//dp�� Ǫ�� ���
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

    //dp[n] = n�϶����� ���� ����

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
    static int[] tArr; //����� �Ϸ��ϴµ� �ɸ��� �Ⱓ
    static int[] pArr; //����� ������ ���� �� �ִ� �ݾ�
    static int maxPrice;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); //��� ��¥ �Է�
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
        //Ż�� ���� �� �����
        //����� ��¥�� ��� ��¥�� ��ġ�Ұ�� ������ ��糯������ Ż��(i == n)
        //������ ��� ���� �ƴ� ��� ,2�� Ż�� ������ ����� �� ���� ���� ���� ���� �з�
        //1)����� �� ���
        //����� ��¥�� ��� ��¥���� �����̿��� ����� �Ϸ� ���ϴ� ���(t+tArr[t]>n)
        //2)����� ���� ���� ���
        //���� ��� ������ ��(����)�� ��� ��¥�� ���� ���(t+1>n)
        // i == n || (t+tArr[t]>n && t+1>n)
        // i == n || t+1>n
        // i>=n ( i�� t+1�� ���� ���� ����� ��¥(i)�� ������ ��㰡���� ��(t+1)�� ��ġ��)
        if(i>=n){
            if(maxPrice<totalPrice)
                maxPrice = totalPrice;
                return;
        }

        //i��° ���� ��� �� ���
        //���� ����� �� �� �ִ� ��¥�� ��� �ݾ��� ���Ͽ� �Ķ���͸� ����
        if(i+tArr[i]<=n)
            recursiveDFS(i+tArr[i],totalPrice+pArr[i]);

        //i��° ���� ��� ���� ���� ���
        //������ ��¥�� ���� ������ �Ķ���ͷ� ����
        if(i+1<=n)
            recursiveDFS(i+1,totalPrice);
    }

}