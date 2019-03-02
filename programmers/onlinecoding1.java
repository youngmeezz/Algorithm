package programmers;
import java.util.*;
public class onlinecoding1 {
/*
    어떤 수를 서로 다른 소수 3개의 합으로 표현하는 경우의 수를 구하려 합니다. 예를 들어 33은 총 4가지 방법으로 표현할 수 있습니다.

    3+7+23
    3+11+19
    3+13+17
    5+11+17
    자연수 n이 매개변수로 주어질 때, n을 서로 다른 소수 3개의 합으로 표현하는 경우의 수를 return 하는 solution 함수를 작성해주세요.
*/
public static void main(String []args) {
    int n = 33;
    solution(n);
}
public int solution(int n) {

    int cnt=0;
    if(n==1 && n%2 ==0){
        return 0;
}
    if(n == 2) {
        for(int k=3;k<n;k+=2)
        {
            if(n % k ==0)
            continue;
        }
        cnt++;
        }
        int answer = cnt;
        return answer;
    }
}
/*
    for(int i=0;i<n;i++){
            if(people[i]==tshirts[j+1]){
            cnt++;
            break;
            }
            if(tshirts[j]==tshirts[j+1])
            continue;

            
        }
    }

    System.out.println(cnt);
    int answer = cnt;
    return answer;
    }
}
*/

/*
private static void solution(int arr[]){
    Arrays.sort(arr);
    int a=0;
    for(int i=0;i<arr.length - 1;i++){
       if(arr[i]>0){
          if(arr[i]==arr[i+1]||arr[i+1]==arr[i]+1){
             continue;
          }
          else{
             a=arr[i]+1;
             break;
          }
       }
       else{
          a=1;
       }
    }
    if(a == 0) a = arr[arr.length - 1] + 1;
    System.out.println(a);  
 }
}
*/