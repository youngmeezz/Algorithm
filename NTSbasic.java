import java.util.Arrays;
import java.util.Scanner;

public class NTSbasic {
    public boolean solution(int[] arr) {
    
        boolean answer = true; //�Ϲ������� answer�� true���� �����ϰ��Ѵ�.
        
        int leng = arr.length;// �迭�� ���̸� leng��� ��Ʈ�� ������ �д�.
        /*
        for(int j=0;j<arr.length;j++) {
        System.out.println(arr[j]);
        }
        */
        //�̰͵� ���� �Ȱ���.
        boolean[] cu = new boolean[leng+1]; //���ο� boolean�� üũ �迭�� ����� �ش�. �̰Ŵ� ���̿� +1���ִ� ������ 0���� �����ϴ°� �ƴ϶� 1���� ���� �ȴ�.
        //
        
        for(int i=0;i<leng;i++){
            int temp = arr[i];//�迭�� int�� ���� temp�� �־� �ټ� �ִ�.�״ϱ� arr[0]�� temp�� �־��ְ�
            //temp���� int i���� �����Ҷ����� ��� ��ȭ�ϹǷ� temp��� ������ ���ذ�

            //���࿡ temp�� leng �� �迭�� ���̺��� ũ�ٸ� �̰��� �ε����� ������ �ʰ��� ���̹Ƿ� false
            if(temp > leng) 
            return false;

            //���࿡ 1���� ���� �ϴ� boolean cu�迭�� temp�ε����� ���� true�� ���´�?
            //�̰͵� ���� �Ȱ���.
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
        String input = new String(); // �Է¹��� ���� ���ڿ�
        input = sc.nextLine();
       
        input = input.substring(1, input.length()-1);
        String[] array = input.split(",");
        int[] arr = Arrays.asList(array).stream().mapToInt(Integer::parseInt).toArray();

        System.out.println(arr.length);

        NTSbasic sol = new NTSbasic();
       
       System.out.println(sol.solution(arr));
       }
}