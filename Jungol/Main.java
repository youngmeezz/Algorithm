package Jungol;

//import java.util.Scanner;
import java.util.*;

//33���� 127 ������ ���ڸ� ��� �Է¹޾� �Է¹��� ������ �ƽ�Ű�ڵ忡 �ش��ϴ� ���ڸ� ����ϴٰ� ������ ����� �Է��� ������ �����ϴ� ���α׷��� �ۼ��Ͻÿ�.
/*
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        while (true) {
            System.out.print("ASCII code =? ");
            n = sc.nextInt();
            
            if (n < 33 || n > 127)

                break;
            System.out.println((char) n);
            // System.out.printf("%c\n",n);->�޸𸮶� �ð� �� �� ���� �Ҹ�9MB,132ms (char)8MB 128ms����
            // ����ȯ�� �� ����

        }
    }
}
*/
/*
 * while(n>=33&&n<=127)
 * 
 * { System.out.print("ASCII code =?"); n = input.nextInt();
 * System.out.write(n); System.out.println(""); }}}
 * 
 * while(true){ Scanner sc = new
 * Scanner(System.in);System.out.printf("ASCII code =? "); int num =
 * sc.nextInt();if(num<33||num>127)break;System.out.printf("%c\n",num);
 * 
 * }}}
 */

// ���ڿ��� �Է¹��� �� �� ���ڿ��� �̾ �� �� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
// ���ڿ��� ���̴� 100�����̴�.

/*
  public class Main{ 
      public static void main(String[] args){ 
          Scanner input = new Scanner(System.in);
           String n = input.nextLine(); 
           System.out.println(n+n);
  } 
}
*/ 

// ���ڿ��� ��Hong Gil Dong������ �ʱ�ȭ �� �� 3������ 6�������� ���ڸ� ���ʷ� ����Ͻÿ�.
/*
public class Main { 
    public static void main(String[] args) { 
            int str[][] = new int[10][10];
            int[][] str1 = new int[10][10];
            String str2[] = new String[8];
            String[] str3 = new String[8];
            int str4 = new Integer(1);
            int str41 = new Integer("1");
            Integer str42 = new Integer("1");
            Integer str43 = new Integer(1);
            Integer str44 = new Integer('1'); //->49������->���� �ƽ�Ű�ڵ�
            int str45 = new Integer('1');
            int str46 = new int(1); //Int�� "�ڷ���"�̱� ������ ����� �ʱ�ȭ�� �ѹ��� �����ش�.
            int str47 =1;//�ʱ�ȭ
            System.out.println(str4);
            System.out.println(str41);
            System.out.println(str42);
            System.out.println(str43);
            System.out.println(str44);
            System.out.println(str45);
          String str5 = new String("Hong Gil Dong"); //String�� "��ü" �̱⶧���� ����� �ʱ�ȭ�� ���ټ� ������
           System.out.printf(str5.substring(3, 7)); //���ڿ� ���� substring�� 3<=���ڿ�<7 ���� �ؾ߸� 3~6��° ���ڸ� ���� ��� ����
  
        }
 }
 */

 //���ڿ��� �Է¹ް� ������ �Է� �޾Ƽ� ���ڿ��� �Է¹��� ������ �� �ں��� ������ŭ ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

 //���� �Է¹��� ������ ���ڿ��� ���̺��� ũ�ٸ� �� �ں��� �� ó������ ��� ����Ѵ�.

 //(���ڿ� ���̴� �ִ� 100�� �����̴�. )

//�Է� : korea 3

//��� : aer
/*
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();//nextLine�ϸ� �Է��� �ѹ� ���� ġ�� ���µ� �׷��� korea ���� 3�� �Ǽ� �Է��� �ѹ��� �ȵȴ�. �׷��� next������ �� �ڿ� �����̽� �ϰ� �ٷ� �Է°����ϴ�.
        int n = sc.nextInt();

        if(n>str.length()){//���� �Է¹��� ������ ���ڿ��� ���̺��� ũ�ٸ�
            n = str.length();// �� �ں��� �� ó������ ��� ����Ѵ�.(�Է¹��� ������ ���� �� ���ڿ� ��ü ���̰� �ǰ� ���ش�)
        }
        
        for(int i=0;i<n;i++){
            System.out.print(str.charAt(str.length()-1-i));//charAt�� ���� ���ڿ��� �迭ȭ ���Ѽ� �ϳ��� �־����� ���̱� ������ 0���ͽ����Ѵ�
            //->�׷��� str.length()-1�� �ؾ߸� ���ڿ��� 5�������� 0����4������ �迭�ε����� �ֱ� ������ -1�� ���ִ� ���̰� i�� 1���� �����ϴ� ���̴ϱ�
            //�ڿ� ���ڿ� ���� -1,-2���ָ鼭 ���� ������ְԵȴ�.
        }
    }
}
*/
/*
import java.util.Scanner;
//�� ���� ���ڿ��� �Է¹޾Ƽ� �� ���ڿ��� ������ ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

//�� ���ڿ��� ���̴� 20�� �̸��̴�.
public class Main{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2= sc.next();
        System.out.println(str1.length()+str2.length());

    }
}
*/
//���ڸ� �Է¹޾� ���ĺ� ������ ��쿡�� �״�� ����ϰ� ������ ���� �ƽ�Ű�ڵ尪�� ����ϴ� �۾��� �ݺ��ϴٰ� ��Ÿ�� ���ڰ� �ԷµǸ� �����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//* ����¿����� ���ѱ۾��� ���
import java.util.Scanner;

public class Main{
    
}