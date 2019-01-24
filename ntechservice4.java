package baekjoon;

import java.util.*;
/*
class ntechservice4{
    public int []  solution(int[] array,int[][] commands){
            int [] answer = new int[commands.length];
            int [] temp = {};
            int index=0;

            for(int i=0;i<commands.length;i++){
            {
             int start = commands[i][0];
             int end = commands[i][1];
             int k = commands[i][2];

             int[] tmp = new int[end-start+1];

             int a =0;
             for(int j=start -1 ; j<end;j++)
                tmp[a++] = array[j];

                Arrays.sort(tmp);
                answer[index++] = tmp[k-1];

            }
        }
    }
}
*/
//전략은 우선 배열 안에다가 (1) (1,2) (1,2,3) (1,2,3,4)를 넣어놔야 하는데
//a[0] = 1, a[1] = 1, a[2] = 2, a[3] = 1, a[4] = 2, a[5] = 3, a[6] = 1, a[7] = 2 
//a[8] = 3, a[9] = 4, a[10] =1
//증가하는 변수 cnt
//첫번째가 

//k 입력받는 값 
//i : 증가할 수 (1,2,3) i++ 초기화 시켜서 계속 1씩 증가할 수
//sum : (1),(1,2) ex.3개 (괄호 친 수열의 갯수가 들어옴)
//n : i에서 증가된 수의 수열의 가장 마지막 값 1,2,3,4 이런식으로 증가 하는 수 
// 
import java.util.Scanner;
public class ntechservice4 {
    public static final long MAX = 50000000000000L;

    public static void main(String[] args) {

        long k ; //입력받을 값
     //   int result; //출력받을 값
        Scanner sc = new Scanner(System.in);

        k = sc.nextLong(); //입력 받을 값 k
        long i =1L;
        long n=0L;// sum 이전의 갯수 sum이 10개이면 n은 6개 -> 1군일때 1 2군일때 2 3군일때 3
        if(k < 1 || k > 50000000000000L)
            System.out.println("Out of range.");
        else {
            // 13이 최대값일 때, k 로 15를 입력받음. n = 10, sum = 15(5군 까지);
            // 이런경우 for(; sum <= 13; sum += i)
           long sum =1;

            while(true) { //sum은 i수만큼 더하기
                i++;
                sum+=i;
                if(k<=sum && k>n){
                    System.out.println(k-n); 
                    break; 
                }
                if(sum > MAX) break;
                n=sum;
            }
        }
        //sum이 6군 n이 5군 k는 입력받은 값이 18번째 수이면 n이면 15번째 여기서 이제 3번째 수를 구하면 3이 나오게 된다.
        //왜 3이 나오냐면 어차피 1부터 시작하니까 여기서 숫자 더해도 3나오잖아, 즉 3번째면 3, 4번째면 4 이렇게 나옴
            /*
            for (result =1; result < sum-n; result++) {// sum-n의 갯수만큼 for문 돌리기
            
                // 가장 마지막수의 수열 1,3,6,10번째 인데 n++
                n++;
                System.out.println(n);
            }
            n=sum;
        }
        System.out.println(result); 
        */
    }
}


/*
import java.util.Scanner;
public class ntechservice4 {
    public static final long MAX = 50000000000000L;

    public static void main(String[] args) {

        long k ; //입력받을 값
     //   int result; //출력받을 값
        Scanner sc = new Scanner(System.in);

        k = sc.nextLong(); //입력 받을 값 k
        long i =1L;
        long n=0L;// sum 이전의 갯수 sum이 10개이면 n은 6개 -> 1군일때 1 2군일때 2 3군일때 3
        if(k < 1 || k > 50000000000000L)
            System.out.println("Out of range.");
        else {
            // 13이 최대값일 때, k 로 15를 입력받음. n = 10, sum = 15(5군 까지);
            // 이런경우 for(; sum <= 13; sum += i)
            for (long sum=1; ; sum += i) { //sum은 i수만큼 더하기
                i++;
                if(k<=sum && k>n){
                    System.out.println(k-n); 
                    break; 
                }
                if(sum > MAX) break;
                n=sum;
            }
        }
*/