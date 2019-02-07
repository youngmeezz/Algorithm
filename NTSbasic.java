import java.util.Arrays;
import java.util.Scanner;

public class NTSbasic {
    public boolean solution(int[] arr) {
    
        boolean answer = true; //일반적으로 answer는 true값을 리턴하게한다.
        
        int leng = arr.length;// 배열의 길이를 leng라는 인트형 변수로 둔다.
        /*
        for(int j=0;j<arr.length;j++) {
        System.out.println(arr[j]);
        }
        */
        //이것도 이해 안간다.
        boolean[] cu = new boolean[leng+1]; //새로운 boolean형 체크 배열을 만들어 준다. 이거는 길이에 +1해주는 이유가 0부터 시작하는게 아니라 1부터 가야 된다.
        //
        
        for(int i=0;i<leng;i++){
            int temp = arr[i];//배열을 int형 변수 temp에 넣어 줄수 있다.그니까 arr[0]을 temp에 넣어주고
            //temp값은 int i값이 증가할때마다 계속 변화하므로 temp라는 변수를 써준것

            //만약에 temp가 leng 즉 배열의 길이보다 크다면 이것은 인덱스의 범위를 초과한 것이므로 false
            if(temp > leng) 
            return false;

            //만약에 1개씩 들어가야 하는 boolean cu배열에 temp인덱스가 들어가면 true가 나온다?
            //이것도 이해 안간다.
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