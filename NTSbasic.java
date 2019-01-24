import java.util.Arrays;
import java.util.Scanner;

public class NTSbasic {
    public boolean solution(int[] arr) {
    
        boolean answer = true;
        
        int leng = arr.length;
        for(int j=0;j<arr.length;j++) {
        System.out.println(arr[j]);
        }
        boolean[] cu = new boolean[leng+1];
        
        for(int i=0;i<leng;i++){
            int temp = arr[i];
            if(temp > leng) return false;
            if(cu[temp] == true) {
                return false;
            }else{
                cu[temp] = true;
            }
        }
       
        return answer;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = new String(); // 입력받은 정수 문자열
        input = sc.nextLine();
       
        input = input.substring(1, input.length()-1);
        String[] array = input.split(",");
        int[] arr = Arrays.asList(array).stream().mapToInt(Integer::parseInt).toArray();

        System.out.println(arr.length);

        NTSbasic sol = new NTSbasic();
       
       System.out.println(sol.solution(arr));
       }
}