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
        //이거는 0~5까지 주어지는 배열에서 6개의 숫자가 들어간다 하면
        //1,2,3,4,5,6이 넣어져야 하니까 cu[1] = 1 =>이러면 true cu[2] = 2 , cu[3] = 3, cu[4] = 4, cu[5] = 5, cu[6] =6 으로 주어지게 된다. 
        
        for(int i=0;i<leng;i++){
            int temp = arr[i];//배열을 int형 변수 temp에 넣어 줄수 있다.그니까 arr[0]을 temp에 넣어주고
            //temp값은 int i값이 증가할때마다 계속 변화하므로 temp라는 변수를 써준것

            //만약에 temp가 leng 즉 배열의 길이보다 크다면 이것은 인덱스의 범위를 초과한 것이므로 false
            if(temp > leng) 
            return false;

            //만약에 1개씩 들어가야 하는 boolean cu배열에 temp인덱스가 들어가면 true가 나온다?
            //이것도 이해 안간다.
            //원래는 temp에다가 arr[i]를 넣으니까 1~6까지 숫자가 들어간다.
            //그래서cu[temp] 에서도 1~6까지 숫자가 들어가야 한다.
            //cu[temp] 1~6의 숫자가 넣어지면 true값이 되고 
           // cu[temp] = true; 

            //이제 만약 true값이 이미 주어진경우 한번이라도 나온 것이기 떄문에 중복이면 안된다. 따라서 true값이 나왔다면 이제 false로 바꿔준다.
            //즉 cu[1] = true인데 다시 cu[1] 이 나오면 false가 된다 즉 배열안에 중복이 선언된거니까 false를 출력해준다.
            if(cu[temp] == true) {
                return false;
            }else //true값이 아니라면 한번도 나온 것이 아니기때문에 true로 변환시켜줘서 위로 갈떄 다시 true가 되면 중복되는걸로 확인함.
            //여기서 반드시 if(cu[temp]==true) 먼저 해줘야함 먼저 해줘야 else로 바로 넘어가서 true로 바꿔주는데 먼저 true로 넣어버리면 다 true라서 false로 다바꿔짐
                return true;

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