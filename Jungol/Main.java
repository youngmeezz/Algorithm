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
/*
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String n;
        while(true){
            n = input.next();
            char ch = n.charAt(0);
            int code = (int)ch;

            if(code>=65 && code<=90 || code>=97 && code<=122){
                System.out.println(ch);
            }
            else{
                try{
                   int a = Integer.parseInt(n);
                    System.out.println(code);
                }
                catch(NumberFormatException e){
                    break;
                }
            }
        }
    }
}
*/
//���ڿ��� �Է¹޾� ���ĺ� ���ڸ� ��� �빮�ڷ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. 
//���ڿ��� ���̴� 100�����̴�.
/*
import java.util.Scanner;
public class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        char []arr = new char[100];
        int code;

        for(int i=0;i<n.length();i++){
            arr[i] = n.charAt(i);//�迭�� ���ڿ� ���� �ϳ��� ����
            code = (int)arr[i];//���ڷ� ����� �迭arr�� int������ ����ȯ���ش�.(�� ������ �ƽ�Ű�ڵ带 ������)
            //�ƽ�Ű�ڵ� 97���� 122�� �ҹ��ڿ��� -32�� ���־�� �Ѵ�.
            if(code>=97 && code<=122){
                System.out.write(code-32);//�Ű������� �־��� int������ �����ִ� 1byte�� ��� ��Ʈ������ �����ϴ�.
                //�Ű������� intŸ���̶� 4byte���θ� ��½�Ʈ������ �����°����� ���� ����
                //ö�ڸ� �ϳ��� ���������� write�Լ��� ������ ��������
                System.out.flush();//���ۿ� ���� �����͸� ��� ��½�Ű�� ���۸� ���� ����
            }
            //�ƽ�Ű�ڵ�code 65���� 90�� �빮���̴�
            else if(code>=65 && code<=90){
                S          ystem.out.println(arr[i]);
            }
        }
    }
}
*/
//������ ������ 100���� ������ ���ڿ��� �Է¹޾� ������ �̷�� �ܾ��� ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//import java.util.Scanner;

//���� Ǯ�̿��� �߸����� ������ �� ã��
/*
public class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
     
        String n = sc.next();
        String[] splitR = new String[n.length()];
        //���ڿ��� �ڸ��� �Լ��� ���� ���� �迭�� �־�߸� ����� ����?
        int events =0;
        for(int i =0;i<n.length();i++){
            splitR[events] = n[i].split(" ");//������ �������� ¥����
            if(splitR == NULL)//�߷����°� ��� ������ ������ break�� ������
            break;
        }
        System.out.println(i);//���ͼ� ���ݱ��� ���Դ� �ܾ� ��Ÿ����
    }
}
*/
//����Ǯ��
/*
public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        int num=1;
        for(int i=0;i<str.length();i++){//for���� ������ ���̸�ŭ�� ������ �Ѵ�.
            if(str.charAt(i)== ' ')//��ö����ö�ھ� ���ϴٰ� ��ĭ ����� num�ϳ��� �����ָ� �װ� �տ������� �����̾��ٴ� ��
            {
                num++;
            }
        }
        System.out.println(num);
    }
}
*/
//���ڿ��� �Է� �޾Ƽ� ���ڼ���ŭ ���������� �� ���� ȸ���Ͽ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. ���ڿ��� ���̴� 100�����̴�.
import java.util.Scanner;

//���� Ǯ�� Ʋ���� ã��
/*
public class Main{
    public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();

            for(int i=0;i<str.length();i++)
            {
                str.charAt(i) = str.charAt(i+1);
            }
            System.out.println(str);
    }
}
*/
/*
public class Main{
    public static String str;
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        str = input.next();

        //ó�� ������ ���� �� ���ڸ���
        int index = str.length()-1;
        int length =0;

        //index�� 0�� �ɶ����� ���
        while(index>=0){
            printStr(index,length);
            index--;//�ε����� ��� �ٿ��ָ鼭 ����ؾ��� 0�� �ɶ��� ���� ���̰� ���⼭ index�� -1�� �Ǹ� ���ڿ� ���̺��� �۾����Ƿ� ������ �ѹ��� ���� ����
            //0������ ABCDEFG���� �ٽ� ABCDEFG�� �� ��
        }
    }
    public static void printStr(int index,int length){
        while(length<str.length()){//length�� str.length���ڿ� ���̺��� �۾ƾ� (�ؿ��� ��� 1�� �����ְ� ����) while���� ����. 
            if(index>=str.length()){//���࿡ index�� str.length���ڿ����̺��� ũ�� index�� 0���� ���ش�.�ٽ� ó������ ���ư��� �ϱ� ������(�չ������ε��ư� ���Ⱑ �ٽ�)
                index =0;
            }
            System.out.print(str.charAt(index));//index������ ���ڰ����� ������ 0,1,2,3,4,5,6(�ڿ��� ���� ���� ���� �ʱ�ȭstr.length()-1������) �迭�� �־����� �ϳ��� ���
            index++;
            length++;//���̸� ��� ����������� ���̰� ���ڿ� ���̺��� ������ while���� �������� �� �ִ�.
        }
        System.out.println("");
    }
}
*/
//import java.util.Scanner;
//������ �� ���� �Է� �޾Ƽ� ������ �ƽ�Ű�ڵ��� �հ� ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//���� Ǯ�� �߸��� �� ã��
/*
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        char a = sc.next();
        char b = sc.next();

        System.out.print((int)(a-b);
    }
}
*/
/*
public class Main{
   // public static String str;//main�Լ����� ������ ���� �ʱ� ���� �������� ���� String ���ڸ� ������ �ݴϴ�.
   //static������ ���̸� Ŭ������ ���ӵ��� �ʰ� �� �ϳ��� ������ �Ǿ� ����� �����մϴ�.
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();//�켱 �Է¹������� string������ �޾���� �մϴ�.
        String str2 = sc.next();
        
        char c1 = str1.charAt(0);//�� ���Ŀ� ù��° ���ڿ��� ������ �� char������ �ٲپ��ݴϴ�.  
        char c2 = str2.charAt(0);//������ ù ���� �ϳ��� �˰� �����Ӹ��ƴ϶� int������ ����ȯ�Ҷ� char���� int���� �ϱ⽬����

        //string�� int������ ����ȯ�ϱ� ��ƴ� �״ϱ� ���� �ϳ��� ���� �Ǵ��ؾ��ϴµ� �װ� �����.
        //string�� ��ü���̶� ���� ��ü�� �ϳ��� ���� char���� ���ڿ� �������ڸ� ���Եȴ�.
        System.out.println((int)c1 + (int)c2 + " ");//
        if((int)c1>=(int)c2){
            System.out.println((int)c1-(int)c2);
        }else{
            System.out.println((int)c2-(int)c1);
        }
    }
}
*/
//5�� �̻� 100�� ������ ���ڷ� �� �ܾ �Է¹��� �� �տ������� 5�ڸ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
/*
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String str = sc.next();
        
        for(int i=0;i<5;i++)
        {
            System.out.print(str.charAt(i));
        }

    }
}
*/
//100�� ������ ���ڿ��� �Է¹޾Ƽ� �����ڿ� ���ڸ� ����ϵ� �����ڴ� ��� �ҹ��ڷ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//���� Ǯ��
/*
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        int num = sc.nextInt();

        System.out.println(str.toLowerCase());
        System.out.println(num);
    }
}
*/
/*
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        char c;//������c
        int n;//������n

        for(int i=0;i<str.length();i++){
            c = str.charAt(i);//string�� str������ charAt�� ���� �ѹ����ѹ��ھ� ������ c�� �־��ش�.
            n =(int)c; //������ c�� �ٽ� int�� n�� ���Խ�Ų��?>�̷��� �ƽ�Ű�ڵ�� ��ȯ�� �����Ѱǰ�..�̰� �ٷ� ����ȭ�ΰ�
            //���� �տ� int�Ƚᵵ ������ ����ȯ �Ǵµ� char���� int�� ������ n�� ���� ����

            //���ڰų� ���ĺ� �ҹ��ڸ� �׳� ���
            if(n>=48 && n<=57 || n>=97 && n<=122){
                System.out.print(c);
            }else if(n>=65 && n<=90){ //�� ���� ���� ����(@,.)�� �׳� ��������
                //�빮�ڸ� �ҹ��ڷ� �ٲپ� ���
                System.out.write(n+32);
                System.out.flush();
            }
        }
    }
}
*/
//�ܾ�� ���� �� ���� �Է¹޾Ƽ� �ܾ�� �Է¹��� ���ڿ� ���� ���ڸ� ã�Ƽ� �� ��ġ�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//�ܾ�� ù ��° ������ ��ġ�� 0���� �ϰ� ã�� ���ڰ� ���� ���� ���� ó�� ������ ��ġ�� ����Ѵ�.
//���� ã�� ���ڰ� ���� ���� "No"��� ����Ѵ�. ��ҹ��ڴ� �����Ǹ� �ܾ�� 100�� �����̴�.
/*
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String str  = input.next();
        String str2 = input.next();
        char c = str2.charAt(0);//�켱 �ι��� �Է¹��� ���ڸ��� ù���� ���� c���ٰ� �����صα�

        int n = -1;//n�� 0�϶��� ù���� ���� ��ġ�̱⋚���� 0���� �ʱ�ȭ �� �� ����.
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == c){
                n = i;//����� ��ġ�� ǥ���ϱ⋚���� �迭�� �ε��� ���� ǥ���ϸ� �˴ϴ�. 
                //���⼭ n(�ε�����ġ)�� ������ ��ġ�� �ǰ� c(����)�� �ش繮�ڰ� �� ��ġ�� �ִ��� Ȯ���ϱ� �����Դϴ�.
                break;//�׸��� break���� for�� ���´����� 
                //���ڰ� ������ �� coerocdl �̷��� c�� 0���� 5�����ϱ� 0���� ��µǱ� ���ؼ� break�� �����ش�.
            }
        }
        //n�� ���� 0�̻��̶�� �� ��ġ�� �Ǵϱ� ��ġn�� ������ְ� 0���� ������ No�� ������ش�.
        if(n<0){
            System.out.println("No");
        }else{
            System.out.println(n);
        }
    }
}
*/
//�� ���� �ܾ �Է¹޾Ƽ� ���̰� �� �ܾ��� ���� ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�. 
//�ܾ��� ���̴� 100�� ���ϴ�.
//�� Ǯ��
/*
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        int max=0;

        for(int i=0;i<100;i++){
            
           max = str1.length()>str2.length() ? str1.length() : str2.length();
        }
        System.out.print(max);
    }
}
*/
//���ڿ�(100�� ����)�� �Է¹��� �� ������ �Է¹޾� �ش���ġ�� ���ڸ� �����ϰ� ����ϴ� �۾��� �ݺ��ϴٰ� ���� 1���� ������ �����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//ù ��° ������ ��ġ�� 1�̸� ���� �Է¹��� ��ȣ�� ���ڿ��� ���� �̻��̸� ������ ���ڸ� �����Ѵ�.
/*
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //String �Լ��߿� �����ϴ� �� ������ ����
        String str = sc.next();
        //ArrayList�� ����ϴ� ����� �� �˾Ƶα� strList�� ���� ����
        List<Character> strList = new ArrayList<>();

        //List��� �ڷᱸ���� ����ϸ� ������ strList.add�� ���� str���ڿ��� �ϳ����־��ش�.
        for(int i=0;i<str.length();i++){
            strList.add(str.charAt(i));
        }


        while(true){
            int n=sc.nextInt();
            //���� length��� size�� strList�� ����� n���� ũ�ų� ������ ��,���ڰ� ���ŵȰ� ������ �״�� ���???
            //���� �Է¹��� ��ȣ�� ���ڿ��� ���� �̻��̸� ������ ���ڸ� �����Ѵ�. �ִ� ���ڸ� ����Ѵ�.
            if(n>=strList.size()){
                n = strList.size();
        }
        //n�� �ش���ġ �Է¹��� �����ε� �迭ó�� 0���ͽ����ؼ� �ε����� ���� ��ġ���� -1���ذ��� �־��༭ �� ��ġ ���� ����
        strList.remove(n-1);
        for(int i=0;i<strList.size();i++){
            System.out.print(strList.get(i));//������ ���ŉ�⋚���� ����� strList�� �ϳ� �پ�� �׷��� get�� �̿��ؼ� �ٽ� ����
        }
        System.out.println();
        if(strList.size() == 1){//���� 1���� ������ ����
            break;
        }
    }
}
}
//StringBuilder --> charAt(0) �ڹ� ���۷��� ����ؼ� Ǯ���ϱ�
*/
//������ ������ ���ڿ��� �Է¹޾� ������ ���� �и��Ͽ� ��ȣ�� �Բ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. 
//���ڿ��� ���̴� 100�� �����̴�.
/*
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String str = input.nextLine();
        int num=1;
        char c;

        System.out.print(num+". ");//ù���� ���� ���� "1. "�̰� �������
        for(int i=0;i<str.length();i++){
            c = str.charAt(i);
            if(c==' '){//������ ���Ͻÿ�
                System.out.println("");//��ĭ�� ���
                num++;//�տ� ���� �����ְ�
                System.out.print(num+". ");//������ ó�� "2. "�̷��� �������
            }else{
                System.out.print(c);//���� �Ⱥ��̸� �׳� �״�� �������� �ѹ��ھ� ���
            }
        }
    }
}
*/
//5���� �ܾ �Է¹޾� ��� �ܾ �Է¹��� �������� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. 
//�� �ܾ��� ���̴� 30�����̴�.
//���� Ǯ��
/*
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
 

        for(int i=str.length();i>=1;i--)
        {
            String str = sc.next();
            System.out.println(str);
        }
    }
}
*/
/*
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        //ArrayList�� Ǯ�� �ܾ���� ����Ʈ�� ������ �� �ִٴ� ������ �ִ�.
        List<String> wordList = new ArrayList<>();

        //5���� �ܾ �Է¹����Ƿ� wordList.add�� ���� (input.next())�������� �Է¹޴´�.
        for(int i=0;i<5;i++){
            wordList.add(input.next());
        }
        //5���� �ܾ �������� ����ϱ����� 4���ͽ����ؼ� 0���� ���� ����Ʈ�迭�� �������ָ鼭 wordList.get()�Լ��������� ����Ѵ�.
        for(int i=4;i>=0;i--)
        {
            System.out.println(wordList.get(i));
        }
    }
}
*/
//������ ������ ������ �Է� �޾Ƽ� Ȧ�� ��° �ܾ ���ʷ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//������ ���̴� 100�� �����̴�.
/*
import java.util.Scanner;

public class Main {
    public boolean solution(int[] arrA, int[] arrB) {
        boolean answer = true;
        //arrA�� ȸ���� arrB�� ���� �� ������ true��, �׷��� ������ false�� return 
        int leng = arrA.length;
        int temp = arrA[arrA.length-1];
        boolean[] cu = new boolean[leng+1];
        
        for(int i =arrA.length-1;i>=1;i--){
            int temp1 = arrA[i];
            if(temp > leng) return false;
            arrA[i] = arrA[i-1];
            /*
           // if(arrA[i] == arrB[i])
            //return true;
            //else
            //return false;
            }
            
            arrA[0] = temp;
       return answer;
        }
    } // 5, 1, 2, 3, 4
}
*/
/*
import java.util.Scanner;

public class Main {
    public boolean solution(int[] arrA, int[] arrB) {
        boolean answer = true;
        //arrA�� ȸ���� arrB�� ���� �� ������ true��, �׷��� ������ false�� return 
        int temp = arrB[arrA.length-1];
        int [][]bhyoyul = new int[arrA.length][arrA.length];
        
        for(int i =arrA.length-1;i>=1;i--){
            arrA[i] = arrA[i-1];
            if(arrB.length != arrA.length) return false;
           // if(arrA[i] == arrB[i])
            //return true;
            //else
            //return false;
            }
            arrB[0] = temp;
       return answer;
       
    } // 5, 1, 2, 3, 4
}
*/
/*
public class Main{
    public static int[] arrA;
    //public static String arrB[];
    public static String solution(int[] arrA, int[] arrB) {
        
        //boolean answer = true;
        //return answer;

        //ó�� ������ ���� �� ���ڸ���
        int index = arrA.length-1;
        int length =0;

        //index�� 0�� �ɶ����� ���
        while(true){
            if(index>=0){
            printStr(index,length);
            index--;//�ε����� ��� �ٿ��ָ鼭 ����ؾ��� 0�� �ɶ��� ���� ���̰� ���⼭ index�� -1�� �Ǹ� ���ڿ� ���̺��� �۾����Ƿ� ������ �ѹ��� ���� ����
            //0������ ABCDEFG���� �ٽ� ABCDEFG�� �� ��
            return "true";
            }
            else{
                return "false";
            }
        }
    }
    public static void printStr(int index,int length){
        while(length<arrA.length){//length�� str.length���ڿ� ���̺��� �۾ƾ� (�ؿ��� ��� 1�� �����ְ� ����) while���� ����. 
            if(index>=arrA.length){//���࿡ index�� str.length���ڿ����̺��� ũ�� index�� 0���� ���ش�.�ٽ� ó������ ���ư��� �ϱ� ������(�չ������ε��ư� ���Ⱑ �ٽ�)
                index =0;
            }
          //  System.out.print(arrA[index]);//index������ ���ڰ����� ������ 0,1,2,3,4,5,6(�ڿ��� ���� ���� ���� �ʱ�ȭstr.length()-1������) �迭�� �־����� �ϳ��� ���
            index++;
            length++;//���̸� ��� ����������� ���̰� ���ڿ� ���̺��� ������ while���� �������� �� �ִ�.
        }
       // System.out.println("");
    }

    public static void main(String[] args){
        //String�迭 arr�� �����ϰ� ����� main�Լ��� ���� �ִ°�
        int[] arrA = {7, 8, 10};
        int[] arrB = {10, 7, 8};
    //[7, 8, 10]	[10, 7, 8]=>true
    //[4, 3, 2, 1]	[5, 4, 1, 2]=>false
    //Solution sol = new Solution();
        System.out.println(solution(arrA,arrB));
    }
}
*/
//������ ������ ������ �Է� �޾Ƽ� Ȧ�� ��° �ܾ ���ʷ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//������ ���̴� 100�� �����̴�.
/*
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        //ArrayList�� ���� wordList�� ������
        List<String> wordList = new ArrayList<>();

        //StringTokenizer�� ������ �������� �߶� ��������
        StringTokenizer st = new StringTokenizer(sentence," ");
        //Token�� �� ���������� wordList�� �����ָ鼭 Tokenȭ ��Ų��-> �״ϱ� ���忡 �ܾ���� ��ūȭ ���Ѽ� �־��ش�. 
        while(st.hasMoreTokens()){
            wordList.add(st.nextToken());
        }
        int index =0;
        //�ε����� 0���ͽ����ؼ� 2,4,->�̰��� �迭�� Ȧ�� �����̴�. ���� Ȧ����° ����ϸ鼭 wordList.size��ŭ ����
        //wordList.get�� ���� �ܾ �޾ƿ´�.
        while(index<wordList.size()){
            System.out.println(wordList.get(index));
            index +=2;
        }
    }
}
*/
//20�� ������ ���ڷ� �̷���� 10���� �ܾ�� �� ���� ���ڸ� �Է¹޾Ƽ� ���������� �Է¹��� ���ڷ� ������ �ܾ ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
/*
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        List<String> wordList = new ArrayList<>();

        for(int i=0;i<10;i++){
            wordList.add(sc.next());
        }
        String str = sc.next();
        char c= str.charAt(0);//ù���� ���ڷ� �켱 �ʱ�ȭ ����

        int num=0;//������ ���� �ε��� ����
        for(int i=0;i<10;i++){
            num = wordList.get(i).length()-1; //num�� ���ݱ��� �Էµ� �ܾ���� ������ ������ �ε����� �����Ѵ�.
            if(wordList.get(i).charAt(num) == c){ //num�� ���� �ε��� ��ü�ϻ��̹Ƿ�charAt�� ���� ���� ��ü�� �ְ� �Էµ� �ѹ���c�� ���Ͽ� ������ ���
                System.out.println(wordList.get(i));
            }
        }
    }
}
*/
//
//���ڿ��� �����ϰ� ������ ���� "Hong Gil Dong"�̶�� �̸��� �����Ͽ� ������ �� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
/*
import java.util.*;
public class Main{
    public static void main(String[] args){
        
        String str = "Hong Gil Dong";
        String str1 = new String(str);

        System.out.println(str1);
    }
}
*/
//20�� ������ ���ڿ��� �� �̸��� �Է¹޾Ƽ� �� �ڿ� "fighting"�� �ٿ��� �����ϰ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
/*
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
   
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        String str1 = "fighting";
        String str2 = new String(str1);
        System.out.println(str+str1);
    }
}
*/
//20�� ������ �� ���� ���ڿ��� �Է¹޾� ù ��° ���ڿ��� �պκ� ���ڸ� �� ��° ���ڿ��� �պκп� �����ϰ� �ٽ� �޺κп� �̾� �ٿ��� ������ �� �� ��° ���ڿ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
/*
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String n1 = sc.next();
        String n2 = sc.next();

        n2 = n1.substring(0,2) + n2.substring(2);//�չ��ڿ� 0,1���� ���� �����ϰ� �� ���ڿ�2���� �ٽ� �̾ �����ϱ⋚����
        n2 += n1.substring(0,2);//�տ� ���� 0,1�� ���� �ڿ� �̾� ���̱� ���� ����

        System.out.println(n2);
    }
}
*/
//100�� ������ ���ڷ� ������ �� ���� ���ڿ��� �Է¹޾Ƽ� �� ���ڿ��� ���� 'c'�� ���ڿ� "ab"�� ���Կ��θ� "Yes", "No"�� �����Ͽ� ��¿�ó�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
/*
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int len = str.length();
        int i,j;//���⼭ �ʱ�ȭ�� �Ƚ�Ű�� 
        //len-1�ϸ� 4�̰� len�� 5�̴ϱ� 0,1,2,3,4 ->���̴�.
        for(i=0;i<len;i++){ 
            if(str.charAt(i) == 'c'){
                System.out.print("Yes ");
                break;
            }
        }
        if(i == len) //���ڿ� ���� ��ü�� ���� �Ǹ� ���ٴ� �ǹ̴ϱ� No���
            System.out.print("No ");

        for(j=0;j<len-1;j++){
            if(str.charAt(j) == 'a' && str.charAt(j+1) == 'b'){
                System.out.print("Yes ");
                break;
            }
        }
    if(j == len){
        System.out.print("No ");
       // System.out.println();
    }
    }
}
*/
//->c��� ���� ��Ÿ���̶� java�� str.find�� ���°� ����
//�ڹ� ���۷��� ->str.contains�� ã�� containsã�°� �߿��ϴ��̹̱����Ǿ��ִ°� ���°͵� ����
//�¶��� �ڵ��׽�Ʈ�� ���

/*
import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		boolean c_str = false, ab_str = false;
		/*
		for(int i=0;i<str.length();i++){
			if(str.charAt(i) == 'c'){
				c_str = true;
			} else if(str.charAt(i) == 'a' && i + 1 <= str.length() && str.charAt(i+1) == 'b'){
				ab_str = true;
			}
		}
        */
        /*
		if(str.contains("c")) c_str = true;
		if(str.contains("ab")) ab_str = true;

		if(c_str) System.out.print("Yes ");
		else System.out.print("No ");

		if(ab_str) System.out.print("Yes");
		else System.out.print("No");
	}
}
*/
//�� ���� �ܾ �Է¹޾� �ƽ�Ű�ڵ�(����) ������ ���� ���� ������ �ܾ ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//�� �ܾ��� ���̴� 1�̻� 10 �����̴�.
/*
import java.util.*;

public class Main{
    public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            //��Ʈ�� �迭�� �Ẽ�� �˾ƾ��Ѵ�.
            String[] str = new String[3];
            String temp;
            int i,j;

            for(i=0;i<3;i++)
                str[i] = sc.next();
            
            for(i=0;i<2;i++){
                for(j=i+1;j<3;j++){
                    //������� ���� �Ȱ� ����->compareTo�Լ� a>b�̸� ����� ��ȯ->�̷� �ȵ��� �ƽ�Ű�ڵ�  1 2 3 ���̶�� �ϸ� 1-2�ϸ� -1������ ���;���
                    //������ �ȵ��ٵ� ������ ������ �������� ������ >0 �̸� ����� ���� ���̱� ������ ���� �����ش�.
                    //string�迭(char���� ���� �ǹ�)�� �˾Ƽ� ����(�ƽ�Ű�ڵ�)�� ���ϸ鼭 �ϱ� ������ ���� ����ȯ �� �ʿ䰡 ����. 
                    if(str[i].compareTo(str[j])>0){
                        temp = str[i];
                        str[i] = str[j];
                        str[j] = temp;
                    }
                }
            }
            System.out.println(str[0]);

        }
    }
*/
/*
import java.util.*;
//5���� ���ڿ��� �Է¹޾� ���ڿ� ũ��(�ƽ�Ű�ڵ�) �������� �����Ͽ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//�ƽ�Ű�ڵ� �����̶�� ���� �� ���ذ��� ����
 //�ƴϴ� ���� �� �ȵȴ� �ٽ� �����ϱ�
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String [] str = new String[5];
        String temp;
        int i,j;

        for(i=0;i<5;i++)
            str[i] = sc.next();
        
        for(i=0;i<4;i++){
            for(j=i+1;j<5;j++){
                //compareTo�Լ� a<b�̸� ������ ��ȯ(a=b�̸� 0�� �״�� ��ȯ)-> �ƽ�Ű�ڵ�  3 2 1  ���̶�� �ϸ� 3-2�ϸ� 1����� ���ͼ� 
                    //������ �ȵ��ٵ� ��������� ������ ���� ���� ���� ������ �Ʒ��� ���� <0 �̸� ������ ���°��̱� ������ ���� �����ش�.
                    //string�迭(char���� ���� �ǹ�)�� �˾Ƽ� ����(�ƽ�Ű�ڵ�)�� ���ϸ鼭 �ϱ� ������ ���� ����ȯ �� �ʿ䰡 ����. 
                if(str[i].compareTo(str[j])<0){
                    temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
        }
        for(i=0;i<5;i++)
        System.out.println(str[i]);
    }
}
*/
//�� ���� ���ڿ��� �Է¹޾Ƽ� ù �ٿ��� ������ ��ȯ�Ͽ� 2���� ���� ����ϰ�, ���� �ٿ��� �Ǽ��� ��ȯ�� ���� �ݿø��Ͽ� �Ҽ� ��°�ڸ����� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//���� �� Ǯ�̿��� Ʋ���� ã��
/*
public class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        //������ ��ȯ�ϴ� ��
        int a = parseInt(str);
        //�Ǽ��� ��ȯ�� ���� �ݿø��Ͽ� �Ҽ� ��°�ڸ�����
        int b = parseFloat(str);

        System.out.println("%d %.2lf",a,b);
    }
}
*/
/*
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str1,str2,str3;
        StringBuilder sb = new StringBuilder();
        StringBuilder st = new StringBuilder();

        int su1,len,i;
        double su2;

        str1 = sc.next();
        len = str1.length();
        for(i=0;i<len;i++){
            if(str1.charAt(i) == '.'){
                break;
            }
            sb.append(str1.charAt(i));
        }
        su1 = Integer.parseInt(sb.toString());
        System.out.println(su1*2);

        for(i=0;i<len;i++){
            if(str1.charAt(i) == '.'){
                st.append(str1.charAt(i));
            }
            else if(str1.charAt(i)>='0' && str1.charAt(i) <='9'){
                st.append(str1.charAt(i));
            }
            else{
                break;
            }
        }
        su2 = Double.parseDouble(st.toString());
        System.out.printf("%.2f\n",su2);
    }
}
*/
//5���� ������ �Է¹޾� ��� �ٿ��� ���ڿ��� ������ �� �� �ھ� ����� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//��Ǯ��
/*
import java.util.Scanner;
import java.util.StringTokenizer;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int [] arr = new int[5];
        for(int i=0;i<4;i++){
            arr[i] = sc.nextInt();
        }
        String str = arr.toString();
        StringTokenizer st = new StringTokenizer(str);

        String str2 = st.nextToken(str,substring(0,3));

        System.out.println(str2);
    }
}
*/
/*
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); 
        StringBuilder str = new StringBuilder(); //string�� String���� �����ϴ°� �ƴ϶� String�� ����� StringBuilder�� �������
        int [] num = new int[5];//�迭�� ������༭ ������ ����
        int su1,len,i,cnt;

        for(i=0;i<5;i++){
            num[i] = sc.nextInt(); //�켱 �迭�ȿ� ���� ���� ������ �Է����ش�.
        }
        for(i=0;i<5;i++){
            str.append(num[i]);//���������̾���̷��� stringbuilder����߰� �̰Ű� ���� int����� ���ڿ��� �ٿ��־���
        }
        len = str.length();//���ڿ��� ����

        cnt=0;//�������� 3���� �ڸ��Ŷ�
        for(i=0;i<len;i++){
            System.out.print(str.charAt(i));//���̸�ŭ �ѱ����ѱ��� ������ְ�
            cnt++;//�������Ѵ�.
            if(cnt==3){
                cnt=0;//ī��Ʈ�� 0���� �ٽ� �ʱ�ȭ���ش�.
                System.out.println();//���ڰ� 3�̵Ǹ� ����Ű�� ���ش�.
            }
        }
        System.out.println();
    }
}
*/
//������ ������ ���ڿ��� �Է¹޾� �� �ܾ�� �и��Ͽ� ���ڿ� �迭�� ������ �� �Է¼����� �ݴ� ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�. ���ڿ��� ���̴� 100�� �����̴�.
//�� Ǯ��
/*
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        StringTokenizer st = new StringTokenizer(str);
        
        String str2 = st.nextToken(str," ");
        
        int len = str.length();
        for(int i=0;i<str.length();i++){

            String str3[] = new String[i]; 
        }

        for(int str.length();;i--){
            System.out.println(str3);
        }
    }
}
*/
/*
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str;
        char[][] ch = new char[50][20];
        int i,len,x,y;
        str = sc.nextLine();
        len = str.length();

        x=0;
        y=0;
        for(i=0;i<len;i++){
            if(str.charAt(i) == ' '){//�����ϰ��
                ch[x][y] = '\0';//���ڿ� �迭�� ���� ���� �ƹ��͵� ���� ���� x���� ���������ְ� y���� 0
                x++;
                y=0;
                continue;
            }
            else{//����ƴҰ��
                ch[x][y++] = str.charAt(i);//���ڿ��迭�� ���� ���� �־��ش�.x��(��)�� �״�ΰ� y��(��)�� �������Ѽ� ���� �־���
            }
        }
        ch[x][y] = '\0';//�迭�� �ٽ� ������ �־���? ���� �Ȱ�

        for(i=x;i>=0;i--){
            System.out.println(ch[i]);//2���� �迭�̾����µ� 1���� �迭�� ����� �� �־��� ���̾�?�ű��ϱ�
        }
    }
}
*/
//"flower" "rose" "lily" "daffodil" "azalea" 5���� �ܾ �ʱ�ȭ�� �� �� ���� ���ڸ� �Է¹޾Ƽ� �Է¹��� ���ڰ� �� ��°�� �� ��°�� ���Ե� �ܾ ��� ����ϰ� ������ �ٿ� ����� �ܾ��� ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//�ش�Ǵ� �ܾ ������ "0"�� ù �ٿ� ����Ѵ�.
/*
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str[] ={"flower","rose","lily","daffodil","azalea"};
        String mun;
        int i,j,len,cnt=0;

        mun = sc.next(); //�� ���� �Է¹��� ���Դϴ�.

        for(i=0;i<5;i++){
            len = str[i].length();
            for(j=0;j<len;j++){
                if(j==1 && str[i].charAt(j) == mun.charAt(0)){//j==1�� �ι��� �����̰� �Է¹��� ���ڶ� �� �ȿ� ���� ���ڰ� ������
                    cnt++;
                    System.out.println(str[i]);
                    break;
                }else if(j==2 && str[i].charAt(j) == mun.charAt(0)){//j==2�� ������ �����̰� �Է¹��� ���ڶ� �� �ȿ� ���� ���ڰ� ������
                    cnt++;
                    System.out.println(str[i]);
                    break;
                }
            }
        }
        System.out.println(cnt);//����� �ܾ��� ���� ���
    }
}
*/
//�ܾ �Է¹޴ٰ� "0"�� �Է¹����� �Է��� �����ϰ� �� ������ �Է¹��� �ܾ��� ������ ����ϰ� Ȧ�� ��° �Է¹��� �ܾ �� �ٿ� 1���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. 
//�ܾ��� ������ 50���� ���� �ʰ�, �ܾ��� ���̴� 100�� �����̴�.
/*
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str[] = new String[50];
        String mun;
        int i,j;

        for(i=0;i<50;i++){
            mun= sc.next();
            if(mun.equals("0"))//0�� �ԷµǸ� �����ϰ�
            break;
            str[i] = mun;
        }
        System.out.println(i); //�׋����� ���� �� i++���̾����Ƿ� �̰��� �ٷ� cnt�Լ��� �ȴ�.
        for(j=1;j<=i;j++){//Ȧ���� ���� 1���� ������ ���̰�
            if(j%2==1)
            System.out.println(str[j-1]); //�迭�� ������ ù�������� 0�����̹Ƿ� 0���� ����Ѵ�.
        }
    }
}
*/
//10 ������ ���� n�� �Է¹ް� n���� ���ڿ��� �Է¹��� �� �� ũ�⸦ ���Ͽ� ���� ���� ���ڿ����� ���ʷ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. 
//���ڿ��� ���̴� 100�� ���ϴ�. ������(�ƽ�Ű�ڵ��)���� �ڿ� ������ ���� ū ������ �Ѵ�.
/*
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str[] = new String[10];
        String temp;
        int i,j,num;

        num = sc.nextInt();

        for(i=0;i<num-1;i++){//i�� �ռ��� �迭
            for(j=i+1;j<num;j++){//j�� �޼��� �迭
                if(str[i].compareTo(str[j])>0){//����� �ƽ�Ű�ڵ忡�� 1-2 �̷������� �Ǿ���� �������ε� �̷��� ������ ���;ߵǴµ� ����� ������
                    //�������� �ٽ� �� �ٲپ��־�� �ϸ�.
                    temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
        }
        for(i=0;i<num;i++){
            System.out.println(str[i]);
        }
    }
}
*/
//5���� �ܾ�(�� �ܾ�� 100�� ����)�� �Է¹��� �� ���ڿ� ���ڿ�(100�� ����)�� �� ���� �Է¹޾� ���߿� �Է¹��� ���ڳ� ���ڿ��� ���Ե� �ܾ ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. ã�� �ܾ ������ ��none���̶�� ����Ѵ�.
/*
import java.util.*;

public class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        char c = sc.next();
        String str = sc.next();
        
        len = str.length();

        for(i=0;i<len;i++){
        if(c.equals(i) == arr[i])
        
    }
}
*/
//5���� �ܾ�(�� �ܾ�� 100�� ����)�� �Է¹��� �� ���ڿ� ���ڿ�(100�� ����)�� �� ���� �Է¹޾� ���߿� �Է¹��� ���ڳ� ���ڿ��� ���Ե� �ܾ ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. ã�� �ܾ ������ ��none���̶�� ����Ѵ�.
/*
import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String ck1,ck2;
        String str[] = new String[5];
        int i,j,len,cnt=0;

        for(i=0;i<5;i++){
            str[i] = sc.next();
        }
        ck1 = sc.next();
        ck2 = sc.next();
        
        for(i=0;i<5;i++){
            if(str[i].indexOf(ck1)>-1 || str[i].indexOf(ck2)>-1){//indexOf ���ڿ��� ��ġ�� ���� ��,ck1�ǹ��ڿ� ck2�� ���ڿ��� ��ġ�� �ش��ϴ� ���ڰ� ������ ������ش�.
                cnt++;
                System.out.println(str[i]);
            }
        }
        if(cnt==0)
        System.out.println("none");
    }
}
*/
//�� ���� ���ڿ� A�� B �� ���� ���� n�� �Է¹޾Ƽ� A�� B�� �����ϰ�, ����� ���ڿ� A���� n���� ���ڸ� B�� ������ �� A�� B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. (1��n,A,B��100)
/*
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuffer con = new StringBuffer();
        StringBuffer con2 = new StringBuffer();
        String str1,str2;
        int i,n,len1,len2;

        str1 = sc.next();
        str2 = sc.next();
        n = sc.nextInt();

        con.append(str1);
        con.append(str2);
        System.out.println(con);

        len2 = str2.length();
        for(i=0;i<=n;i++){
            con2.append(str1.charAt(i));
        }
        for(i=n+1;i<=len2;i++){
            con2.append(str2.charAt(i));
        }
        System.out.println(con2);
    }
}
*/
/*
import java.util.*;
public class Main{
    public static void main(String[] args){
        String str1,str2;
        Scanner sc = new Scanner(System.in);
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        int su1,su2,len1,len2,i;
        
        str1 = sc.next();
        str2 = sc.next();
        len1 = str1.length();
        len2 = str2.length();

        for(i=0;i<len1;i++){
            if(str1.charAt(i)>='0' && str1.charAt(i)<='9'){
                s1.append(str1.charAt(i));
        }
        else{
            break;
        }
    }
    su1 = Integer.parseInt(s1.toString());

    for(i=0;i<len2;i++){
        if(str2.charAt(i) == '.'){//�̰� �� ���ִ� �� �𸣰ڴ�.
            s2.append(str2.charAt(i));
        }
        else if(str2.charAt(i)>='0' && str2.charAt(i)<='9'){
            s2.append(str2.charAt(i));
        }else{
            break;
        }
        }
        su2 = Integer.parseInt(s2.toString());
        System.out.println(su1 * su2);
    }
}
*/
//�� ���� �ܾ �Է¹޾Ƽ� �Ųٷ� ������ ����ϴ� �۾��� �ݺ��ϴٰ� "END"��� �Է��� �Ǹ� �����ϴ� ���α׷��� �ۼ��Ͻÿ�. 
//�Է¹޴� �ܾ��� ���̴� 20�����̴�.
/*
import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String str;
        int i,j,len;

        for(i=0;;i++){
            str = sc.nextLine();
            if(str.equals("END"))
            break;
            len = str.length();
            for(j=len-1;j>=0;j--){
                System.out.print(str.charAt(j));
            }
                System.out.println();
            }
        }
    }
*/
//����, �Ǽ�, ���ڿ��� ���ʷ� �Է¹޾Ƽ� ���ο� ���ڿ��� ����� �� ��ü�� ���̸� 2����Ͽ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. �Ǽ��� �ݿø��Ͽ� �Ҽ� ��°�ڸ����� ����ϴ� ������ �ϰ�, ���ο� ���ڿ��� ���̰� Ȧ���� ���� ù ��° �ٿ� �� ���� �� ����Ѵ�. �� ���ڿ��� ���̴� 30�� �̳��̴�.
/*
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        double num2 = sc.nextDouble();
        num2 = (Math.round(num2 * 1000)) / 1000.0;
        String str1 = sc.next();
        String str = Integer.toString(num1) + Double.toString(num2) + str1;

        int length = str.length();
        if(length % 2 ==0){//��ü���� 2���
            System.out.println(str.substring(0,length/2));
            System.out.println(str.substring(length/2));
        }else{
            System.out.println(str.substring(0,length/2+1));
            System.out.println(str.substring(length/2+1));
        }
    }
}
*/

//���ڿ� "~!@#$^&*()_+|" �� ����ϴ� �Լ��� �ۼ��ϰ� 
//������ �Է¹޾� �Է¹��� ����ŭ �Լ��� ȣ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
/*
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0;i<n;i++){
            printChar("~!@#$^&*()_+|");
        }
    }
    public static void printChar(String str){
        System.out.println(str);
    }
}
*/
//�������� ���̸� ���޹޾� ���̸� ����ϴ� �Լ��� �ۼ��ϰ� �������� ���̸� �Է¹޾� �Լ��� ȣ���Ͽ� ���̸� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. 
//(�������� 3.14�� �ϰ� �ݿø��Ͽ� �Ҽ� ��°�ڸ����� ����Ѵ�. ���� ���� = ������ * ������ * �������̴�.)
/*
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();

        circleArea(r);
    }
    public static void circleArea(int r){
        double area = r*r*3.14;
        System.out.printf("%.2f",area);
    }
}
*/
//nxn���ڻ簢�� �����
/*
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        square(n);
    }
    public static void square(int n)
    {
        int[][] arr = new int[n][n];
        int num =1;

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println("");
        }
    }
}
*/
//�� ���� ������ ���޹޾� �ִ밪�� ���Ͽ� �����ϴ� �Լ��� �ۼ��ϰ� �� ������ �Է¹޾� �ִ밪�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
/*
import java.util.Scanner;
public class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        int max1 = Max(n1,n2);
        //���⼭ max1�� ���°Ŷ� ���� n3�� ���ϸ� �ǳ�? n3�� ������ 
        //�̰ſ� ������� 3���� �� ���� �� �ִ� �Լ� ����� �ٷ� �̰��̴�
        //n1�� n2���� ���ϰ� �״����� ���� ū�� ��� n3�̶� ���ϴ°�
        int max2 = Max(max1,n3);

        System.out.println(max2);
    }
    public static int Max(int num1,int num2){
        int max;
        if(num1>num2){
            max = num1;
        }
        else{
            max = num2;
        }
        return max;
        }
    }
*/
//10 ������ �� ������ �޾Ƽ� ù ��° ���� �� ��° ����ŭ �ŵ������Ͽ� ���� ���� �����ϴ� �Լ��� �ۼ��Ͽ� ������ ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
/* 
import java.util.Scanner;
 public class Main{
     public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         int a = sc.nextInt();
         int b = sc.nextInt();

         System.out.println(exponentiation(a,b));
     }
    
     public static int exponentiation(int n,int k){

                int res = 1;
                for(int i=0;i<k;i++)
                    res *=n;
         
         return res;
     }
 }
 */
//������ ������� �Է¹޾� ������ ���� �Լ��� ȣ���Ͽ� 4Ģ����(+ - * /)�� �������� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. 
//('/'�� ���� ���� �κи� ����ϰ� 4Ģ���� �̿��� ���� ����� 0���� �Ѵ�.)
//�� if~ else if~ else ������ �ۼ��ϼ���.
/*
import java.util.Scanner;
public class Main{
public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    String str = sc.next();
  //  char c = str.charAt(0);//char�� �̿��ؼ� ���ؾ߸� + ���� �־��ټ� �ִ�. string���θ��� ���ϱⰡ ����� �� ������??->�켱 str == "+"��ü�� �ν� ����->��������?
  //" " �� �ֵ���ǥ�� ���̸� ��ü�� ���Ϲ��ڶ�� �ν��������ؿ�! ���ڿ��̶�� �ν��ϰ� �Ǿ��־�! ���Ի����غ��� "" �̸� NULL �� ����ִ°��̶� �̹� ���� 1���� ����ִ°��̰�, "+" �̸� '+' ���ڿ� '\0' ��� �ι��� 2���� ����ִ°��̱� ������ 2�� ���ڰ� ����ִ°� �Ǵ°ſ���!
  //����! �װԸ¾ƿ�! ���ڿ��� ���� ������ '\0' ���� �ν��ϰ� ��������� ��ǻ���ݿ�!? �׷��� �츮�� ���� �迭�� �����ϸ� ���������ڴ� '\0' �̰�, ��� ���ڿ��� ���� �Լ��� NULL ���ڰ� ���� ������ 1�� ���ھ� ��, Ȥ�� ����, �ٿ��ֱ� ���� �����ϵ��� �Ǿ��ְŵ�!
    int y = sc.nextInt();
    
    Calculator(x,str,y);
}
    public static void Calculator(int x, String str , int y){

        if(str.equals("+"))
        {
            int result = x+y;
            System.out.println(x+" " + str + " "+ y + " = " + result);
        }
        else if(str.equals("-"))
        {
            int result = x-y;
            System.out.println(x+" "+ str + " "+ y + " = "+ result);
        }
        else if(str.equals("*"))
        {
            int result = x*y;
            System.out.println(x+" "+ str +" "+ y + " = "+ result);
        }
        else if(str.equals("/"))
        {
            int result = (int)x/y;
            System.out.println(x+" "+ str +" "+ y + " = "+result);
        }
        else
        {
            System.out.println(x+" "+str +" "+y+ " = " + 0);
        }
    }
}
*/
//���� �ٸ� �� ���� ������ �־�����.
//�� ������ �Է¹޾� ū ���� 2�� ���� ���� �����ϰ� ���� ���� 2�� ���Ͽ� ������ �� 
//����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//(������ ���� ȣ���� �̿��� �Լ��� �ۼ��Ͽ� ���� �����ϰ� ����� �����Լ����� �Ѵ�.)
/*
import java.util.Scanner;

public class Main{
    public static void main(String[] ars){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(method1(a,b) + " " + method2(a,b));
    }


    //�ϴ� method1������ a�� ���� ���� �����ؼ� x2�� ���ٰ����� /2�� ���� ������ ���ؿ´�.
    public static int method1(int a,int b){

        //a�� b���� ū ���ϰ��
        if(a>b){
            //a�� ū���� 2�� �����ִµ� ���⼭ b�� ���� ���� ���� �ؿ� method2�Լ����� ������ ���̱� ������ ���߿� ���� ����Ϸ��� �̷��� �Լ� 2������ �Ѵ�.
            a/=2;
        }else if(b>a){
            //a�� b���� ���� ���� ���
            //a�� �������� 2�� �����ش�. 
            a*=2;
        }
        return a;
    }
    //�ϴ� method2������ b�� ���� ���� �����ؼ� x2�� ���ٰ����� /2�� ���� ������ ���ؿ´�.
    public static int method2(int a,int b){
        //a�� b���� ū ���ϰ��
        if(a>b){
            //������ ū �� a�� ���ؼ��� ó���� �����Ƿ� ���⼭ ������ b�� 2�� �����ش�.
            b*=2;
        }else if(b>a){
            //a�� b���� ���� ���� ���
            //b�� ū���� 2�� �����ش�. 
            b/=2;
        }
        return b;
    }
}
*/

 
//10 ������ �� ���� ������ �Է¹޾Ƽ� ���� ������ ū �������� �������� ���ʴ�� ����ϴ� ���α׷��� ����ȭ�Ͽ� �ۼ��Ͻÿ�.
/*
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n1=0;
        int n2=0;

        if(a>b){
            n1 = b;
            n2 = a;
        }else if(b>a){
            n1 = a;
            n2 = b;
        }
        for(int i=n1;i<=n2;i++){
            Gugudan(i);
        }
    }
        public static void Gugudan(int n){
            System.out.println("== " + n + "dan ==");
            for(int i=1;i<=9;i++){
                System.out.print(n+" * "+i+" = ");
                
                if(n*i<10){
                    System.out.print(" ");//�� �̰� ���ִ� ������ ����� ������ ���·� �ڸ��� �����ٷ��� ����뵵�� ���ش�. 10�� �ڸ��� 1�� �ڸ� �ϳ��ִ°Ŵ� �ڸ��� ���ڸ��� ���̳� �׸��� �Ȼ�Ƴ��ϱ�
                }
                
                System.out.println(n*i);
            }
                System.out.println("");
            }
        } 
        */

//��@�����ڸ� 10�� ����ϴ� �Լ��� �ۼ� �� �� �Լ��� �� �� ȣ���Ͽ� �Ʒ��� ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
/*
public class Main{
    public static void main(String[] args){
        System.out.println("first");
        method();
        System.out.println("second");
        method();
        System.out.println("third");
        method();
    }
    public static void  method(){
        for(int i=1;i<=10;i++){
            System.out.print("@");
        }
        System.out.println("");
    }
}
*/
//1���� ���޹��� �������� ���� ����ϴ� �Լ��� �ۼ��ϰ� 1000 ������ �ڿ����� �Է¹޾� �ۼ��� �Լ��� �����Ͽ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
/*
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        method(n);
    }
    public static void method(int m){
        int sum =0;
        for(int i=1;i<=m;i++){
            sum+=i;
        }
        System.out.println(sum);
    }
}
*/
//100������ �ڿ����� �Է¹޾� �Ʒ��� ���� �簢���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. (����ϴ� �κ��� �Լ��� �ۼ��Ͻÿ�.)
/*
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        square(n);
    }
    public static void square(int n){
        int[][] Arr = new int[n][n];

        //�̰Ŵ� �׵θ��� 123,123�� ���Ұ��� �̸� ������� ������ �δ°��̴�. ���׵θ�5�� 123,123
        for(int i=0;i<n;i++){
            Arr[0][i] = i+1;
            Arr[i][0] = i+1;
        }
        //�̰Ŵ� ������ ��� ������123,123�� �س��� ���� ���� ���� ���ؼ� ���[1][1]���� �ȿ� ���׸� 4���ȿ� ���� �������� ���̴�.
        for(int j=1;j<n;j++){
            for(int i=1;i<n;i++){
                Arr[j][i] = Arr[j][0]*Arr[0][i];
            }
        }
        for(int j=0;j<n;j++){
            for(int i=0;i<n;i++){
                System.out.print(Arr[j][i]+" ");
            }
            System.out.println("");
            }
        }
    }
*/
/*
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        method(a,b);
    }
        public static void method(int a, int b)
        {
            int max=0;
            int min=0;

            if(a>b){
                max =a;
                min =b;
            }
            else if(a<b)
            {
                max=b;
                min=a;
            }
            int result = 0;
            result = max*max - min*min;
            System.out.println(result);
        }
    }
*/

//3�� �л��� 3���� ������ �Է¹޾� �� ���� �л��� ������ ����ϴ� ����ȭ�� ���α׷��� �ۼ��Ͻÿ�.
/*
public class Main{
    public static void  main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        //�� 9���� ������ �Է� �޾ƾ� �ϴ� �����ΰ� ����.
        for(int i=0;i<9;i++){
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        method(a,b,c);
        }
    }
        public static int method(int a,int b,int c){

            int arr[][] = new int[3][3];

            for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    arr[i][j] = a;
                }
            }
            int result1 =0; //���� ����
            int result2 =0; //�л��� ����
        }
    }
}
*/
////3�� �л��� 3���� ������ �Է¹޾� �� ����  �л��� ������ ����ϴ� ����ȭ�� ���α׷��� �ۼ��Ͻÿ�.
 /*
public class Main{
    public static void main(String[] args){
        score();
    }
    public static void score(){
        Scanner sc = new Scanner(System.in);
       // int student = 3;

        int arr[][] = new int [4][4];


        //�̰� 9���� �Է¹��� ��
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        //�簢���� �׵θ� �� ���� 3�� ������ �հ�� ������ ���� ���س��� ���̱� ������ 3�� ���ش� 3�� ������������ ���ԵǴ� ���� �ƴ�
            for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    arr[i][3] += arr[i][j];
                }
            }
            for(int j=0;j<3;j++){
                for(int i=0;i<3;i++){
                    arr[3][j] +=arr[i][j];
                }
            }

            //�����տ��� ���ϵ��� �л��� �տ��� �ϵ��� �ؼ� ���ձ��ϱ�
            for(int i=0;i<3;i++){
                arr[3][3] += arr[3][i];
            }

            for(int i=0;i<4;i++){
                for(int j=0;j<4;j++){
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println("");
            }

        }
    }
    */
  
//2016���� ��¥�� �� ���� ���� �� �Ϸ� �Է¹޾Ƽ� �Էµ� ��¥�� �����ϸ� "OK!" �׷��� ������ "BAD!"��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
/*
public class Main{
    public static void main(String[] args){
        //�ΰ��� ���� �Է¹ޱ�
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int day = sc.nextInt();

        if(checkDate(month,day) == true){
            System.out.println("OK!");
        }else{
            System.out.println("BAD!");
        }
    }
    //�Էµ� ��¥�� �����ϴ��� �˻��ϱ�
    public static boolean checkDate(int m,int d){
        boolean result = false;
        if(m==1 || m==3 || m==5 || m==7 || m==8 || m==10 || m==12){
            if(d>=1 && d<=31){
                result = true;
            }
        }else if(m==4 || m==6 || m==9 || m==11){
            if(d>=1&&d<=30){
                result = true;
            }
        }else if(m==2){
            if(d>=1&&d<=29){
                result = true;
            }
        }
        return result;
        }
    }
*/

//�� ���� ������ �Է¹޾� ���밪�� �� ū ���� ����ϰ� �� ���� �Ǽ��� �Է¹޾� ���밪�� ���� ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. �Ǽ��� �Ҽ��� ���� 2�ڸ����� ����Ѵ�.
/*
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        double x = sc.nextDouble();
        double y = sc.nextDouble();

        System.out.println(absolute(a,b));
        System.out.printf("%.2f",absolute2(x,y));
    }
    //������ ���ϴ� �Լ�(����)
    public static int absolute(int a,int b){
        int a2,b2;
        int result=0;
        if(a<0){
            a2 = a*(-1);
        }else{
            a2 = a;
        }
        if(b<0){
            b2 = b*(-1);
        }else{
            b2 = b;
        }
        if(a2>b2){
            result = a;
        }else {
            result = b;
    }
    return result;
}

    public static double absolute2(double x,double y){
        double x2,y2;
        double result =0.0;
        if(x<0){
            x2 = x*(-1);
        }else{
            x2 =x;
        }
        if(y<0){
            y2 = x*(-1);
        }else{
            y2 = y;
        }
        if(x2>y2){
            result = y;
        }else{
            result = x;
        }
        return result; 
    }
}
*/
//���� ���̸� �Է¹޾� �������� ���̸� �Ҽ� ��°�ڸ����� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. 
//���� ���� = ������ * ������ * 3.14 ���� �̿��Ͻÿ�.
/*
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double area = sc.nextDouble(); //���� ����
        
        //���� ����
        System.out.printf("%.2f",method(area));
    }
        public static double method(double area){
            double r = Math.sqrt(area/3.14);
            return r;
        }
    }
*/
//�� ���� �Ǽ��� �Է¹޾�
//���� ū ���� �ø��� ������ ����ϰ�
//���� ���� ���� ������ ������ ����� �� 
//���� ���� �ݿø��� ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//�ԷµǴ� �Ǽ��� -1000�̻� 1000�����̴�.
//import java.util.Scanner;
/*
import java.lang.Math;

public class Main{
public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    double arr[] = new double[3];
    for(int i=0;i<arr.length;i++){
        arr[i] = sc.nextDouble();
    }
    printresult(array(arr));
}
//�迭�� ���޹޾� ������������ �����ϴ� �Լ�
public static double[] array(double[] arr){
    double temp;
    for(double j=0;j<3;j++){
        for(int i=0;i<2;i++){
            if(arr[i]>arr[i+1]){
                temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
    }
    return arr;
}
//�迭�� ���޹޾� ���� ���Ǵ�� ������ִ� �Լ�
public static void printresult(double [] arr){
    //���� ū ���� �ø���.
    System.out.print((int)Math.ceil(arr[2]+" "));
    //���� ���� ���� ������.
    System.out.print((int)Math.floor(arr[0]+" "));
    //���� ���� �ݿø��Ѵ�.
    System.out.print((int)Math.round(arr[1]+" "));
    }
} 
*/
//main() �Լ� ������ ���ڸ� ������� ���� 1, 2, 3 �� ���� ���ڸ� �����Ͽ� ������ �� ��� ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. 
//��¿��� ���� ����Ͻÿ�.
/*
public class Main{
    public static void main(String[] args){
        printNum();
    }
    public static void printNum(){
        int[] arr = {1,2,3};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.println(arr[i] + " + " + arr[j]+" = "+(arr[i]+arr[j]));
            }
        }
    }
}
*/
//10���� ������ �Է¹޾� �������ķ� �������� ������ �ϸ鼭 �ϳ��� �ܰ谡 ���� ������ �� ���İ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
/*
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        //���� �Է¹޾� �迭�� ����
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        BubbleSort(arr);
    }
    //���� ���� ����(����)�ϴ� �Լ�
    public static void BubbleSort(int[] arr){
        int temp=0;

       //���⼭ arr.length-1�� ������ 0~9�����ϸ� 10���� �� �� ������ 10������ 9��°�� ���� ���ĵ� ���� ������ �ȴ�.
       //�׷��� ���� 10��° ���� ���Ӥ� �ʰ� 0~8���� ������ 9�� ������ ���� ������ �ϼ� �Ǳ� ������ i���� <length-1�� �Ǵ� ���̴�.
        for(int i=0;i<arr.length-1;i++){
             //���⼭�� �ε��� ���鸸 ���°Ŵϱ� �迭 ���� -1�Ѱ��� �־��������� 0~9���� �ε��� ������ 9�� ���� �ȵǰ� 0~8�� �ε�����..  10���� �迭
        //������ �ؿ� 0~9�� �ϰԵǸ� �迭�� �ε����� �ʰ��ϰ� �ȴ�. 
        //������ �ؿ� arr[j+1]�� �Ѱ��� j�� 9�ΰ��� arr[10]�� �ǰ� ���� arr[0]~arr[9]���� �ۿ� ������ �迭�� �ε��� ������ ���ϰ� �ȴ�.
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]<arr[j+1])
                {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            //���� �� ������ ���
            for(int num=0;num<arr.length;num++){
                System.out.print(arr[num]+" ");
            }
            System.out.println();
        }
    }
}
*/
//���� �� ���� �Է¹ް�  ������ ��ũ�� �Լ��� �ۼ��Ͽ� �� ���� ���� ������ ���� ���� �������� ����
//���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. (�ŵ������� '^'�� ǥ���ϱ�� �Ѵ�.)
/*
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.printf("(%d - %d) ^ 2 = ",a,b);
        System.out.println((int)(Math.pow((a-b),2)));
        System.out.printf("(%d + %d) ^ 3 = ",a,b);
        System.out.println((int)(Math.pow((a+b),3)));
    }
    //���⼭ distiction�Լ� ���� ������ -�� ���ֱ⋚���� ������ ������ ���� �����Ϸ��� ������ �����ϸ� ����̱� �����ʳ�??
    //�׳� a-b�ϸ� ������ �� �� �ִ�? -> �̰� �ƴϰ� �׳� �� �ȴ�.
    public static int distinction(int a, int b){
        int result;
        result = (a>b?(a-b):(b-a));
        return result;
    }
}
*/
//���� N�� �Է¹ް� �ٽ� N���� ������ �Է¹޾� ������������ �����Ͽ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. 
//(1 �� N �� 15, �Է°� ���, ������ ��� �Լ��� �̿��� ��)
//1. �����Լ�
/*
public class Main{
    public static void main(String[] args){

        //����Լ�(�����Լ�(�Է��Լ�))
        printArr(arrayArr(input()));
    }
//2. �Է� �Լ� int[] input() �� ����
public static int[] input(){
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();

    //�迭 ����
    int arr[] = new int[n];

    //�迭�� n���� �� ä���
    for(int i=0;i<n;i++){
        arr[i] = input.nextInt();
    }
    return arr;
}
//3. ��� �Լ� void printArr(int arr[])�� ����
public static void printArr(int arr[]){
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i] + " ");
    }
}
//4. ���� ���� ���� �Լ� int[] arrayArr(int arr[])�� ����
public static int [] arrayArr(int arr[]){
    int temp;
    for(int i=0;i<arr.length-1;i++){
        for(int j=0;j<arr.length-1;j++){
            if(arr[j]<arr[j+1]){
                temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
    }
    return arr;
    }
}
*/
//�� ���� �������� ���Ͽ� ������ ����ȯ�� �� �� �����غ���. 
//�� �� ������ ������ ��� ������ �Ǹ� ���� ���� ��� ��ȯ�ϱ� �� ������ �����ٰ� ���ٸ� ������ ������ ���Ѿ� �Ѵ�. 
//ū ���� ������ ������ �۰ų� �����Ƿ� ������ ������ �ȴ�.
//�� ���� �Ǽ��� �Է¹޾� ������ �������� ���ϰ� �� ������ ���̿� �����ϴ� ������ ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�. 
//��, �Է¹޴� �� �Ǽ��� ����̸� �� ������ ���̶�� ���� �� �������� �����Ѵ�.
/*
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        //������ ������
        //Math.sqrt(a) ; => a�� ������
        System.out.println(gap(Math.sqrt(a),Math.sqrt(b)));
    }

    //�� �� ���̿� �����ϴ� ������ ����
    public static int gap(double a,double b){
        int num =0;
        double bigger = (a>b?a:b);
        double smaller = (a>b?b:a);
        //�� �� �� ���� �� �ø��ϱ�
        smaller = Math.ceil(smaller);
        //�� ū ���� ����
        bigger = Math.floor(bigger);
        //���� ���� ū �� ���� ���� �� ������ num���ϱ�
        while(smaller<=bigger){
            smaller++;
            num++;
        }
        return num;
    }
}
*/
//5���� ������ �Է¹޾� �� ������ ���밪�� 
//���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�
/*
public class Main{
    public static void main(String[] args){
        System.out.println(sum());
    }
    public static int sum(){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];

        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        //5���� ���� �Է¹޾� �迭�� ����
        }
        //���� ���ϱ�
        int sum =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                arr[i] *= (-1);
            }
            sum += arr[i];
            }
            return sum;
        }
    }
*/
 
//���� n�� �Է¹޾� 2��n�� 2��10���� 1024 ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. (1 �� n �� 20)
/*
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(multiple(n));
    }
    public static int multiple(int n){
        int result = 2;
        for(int i=1;i<n;i++){
            result *=2;
            //result = 2;
            //result = 4;
            //result = 8;
            //result = 16
        }
        return result;
    }
}
*/
//�� ���� �Ǽ��� �Է¹޾� �հ�� ����� ���Ͽ� ����� �ݿø��� ������ ����ϰ�, ������ �Է¹��� ���� ���� ���� �ݿø��� �� �հ�� ����� ���Ͽ� ����� �ݿø��� �� ����� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
/*
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        //�հ�� ����� ���ؼ� ����� �ݿø�
        System.out.println(Math.round(Avg(a,b,c)));
        //Math.round�� ���� �ݿø��� �ϰ� ����� �ݿø�
        System.out.println(Math.round(Avg(Math.round(a),Math.round(b),Math.round(c))));

    }
    //�հ�� ����� ���ϴ� �Լ�
    public static double Avg(double a, double b, double c){
        double sum;
        double avg;
        sum = a+b+c;
        avg = sum/3; //�̷��� �ϸ� ����� �ݿø� �ϰ� �ȴ�.
        return avg;
    }
}
*/
//�ڷ��� ���� 7�� ��ũ�� ����� �����Ͽ� �ڷ��� ������ŭ ������ �Է¹޾� �Է¹��� ������� �տ������� ���������� ���鼭 �ٷ� ���� ���ڿ� ���Ͽ� ũ�� ��ȯ�Ѵ�.
//�̷��� �۾��� �� �� �ݺ��� �� �� ����� �ϳ��� �࿡ �������� �����Ͽ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
/*
public class Main{
    public static void main(String[] args){
        //�ڷ� ���� ����� ����
        final int numOfData = 7;

        //�ڷ� ���� ��ŭ ���� �Է¹޾� �迭�� ����
        int data[] = new int[numOfData];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<numOfData;i++){
            data[i] = sc.nextInt();
        }
        //���� ���� ����
        arrayData(data);

        for(int i=0;i<numOfData;i++){
            System.out.print(data[i]+" ");
        }
    }
    //�迭 �Է¹޾� ���� ����
    public static void arrayData(int arr[]){
        int temp;
        for(int i=0;i<3;i++){
            for(int j=0;j<arr.length-1;j++){
                //�̰Ŵ� ��������
                /*
                if(arr[j]<arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    
                    //�̰Ŵ� �ø�����
                    if(arr[j]>arr[j+1]){
                        temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                }
            }
        }
    }
}
*/
//�������� 3.141592�� ��ũ�� ����� �����ϰ� ���� ���̸� ���ϴ� ��ũ�� �Լ��� �ۼ��Ͽ� �������� �Է¹޾� ���� ���̸� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. (�Ҽ� ��°�ڸ����� �ݿø�)
//��Ǯ��
/*
public class Main{
    public static double k = 3.141592;
    public static void main(String[] args){

        
        int r =0;
        int area = 0;

        solution(r;
    }

    public solution(int r)
    {
        int area = r*r*k;

        System.out.println(area);
    }
}
*/
/*
public class Main{
    public static double k = 3.141592;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("radius : ");
        double n = sc.nextDouble(); //������ �Է¹޴°�
        System.out.print("area = ");
        System.out.printf("%.3f",solution(n)); //���ǳ��� ���
    }

    public static double solution(double r)
    {
        double area = r*r*k;
        return area;
    }
}
*/

//20 ������ �ڿ��� N�� �Է¹޾� ����Լ��� �̿��ؼ� ���ڿ� ��recursive���� N�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
/*
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        recur(n);
    }

    //recursive ����ϴ� ����Լ�
    public static int recur(int n){
        if(n == 0){
            return n; //0�� �ԷµǸ� 0�� ����϶�
        }else{
            System.out.println("recursive");
            return recur(n-1);
        }
    }
}
*/
//�ڿ��� N�� �Է¹޾� ����Լ��� �̿��Ͽ� N���� 1���� ���ʴ�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. 
//N�� 50������ �ڿ����̴�.
/*
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        recur(n);
    }
    public static int recur(int n){
        if(n ==0)
        return n;
        else{
            System.out.print(n+" ");
            return recur(n-1);
        }
    }
}
*/
//100 ������ �ڿ��� N�� �Է¹޾� ����Լ��� �̿��Ͽ� 1���� N������ ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
/*
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        recur(a);
        System.out.println(a);
      //System.out.println(recur(input));
    }
    public static int recur(int a){

        if(a==1){
            return a;
        }
        else 
        {
            //System.out.print(n+" ");

            //return �� ���� ����
            //recur(int a) �̺κп��� ������ ���µ� this method must return a result of type int java

            //���⼭ �׳� return a�� �ƴϱ⋚���� ������ 2���� ¦�� Ȧ�� ����ϴ� ����Լ��ʹ� �ٸ��� ���´�. ����     //recur(input); // System.out.println(input); �ȵǴ� ����
            a = recur(a-1)+a;
            return a;
            //System.out.println(recur(a-1) + a);
      
        }
    }
}
*/
 //10 ������ �ڿ��� N�� �Է¹޾� �ֻ����� N�� ������ ���� �� �ִ� ��� ��츦 ����ϵ�
 // �ߺ��Ǵ� ��쿡�� �տ������� ���� ������ 1���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 /*
 import java.util.Scanner;

 public class Main{
     public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();

         int dice[] = new int[n];

         for(int i=0;i<dice.length;i++){
             dice[i] = 1;
         }

         if(n>=1){
             while(dice[n-1]<=6){
                 printArray(dice);
                 dice[n-1]++;
             }
         if(n>=2){
            while(dice[n-1]<6){
                dice[n-2]++;
                dice[n-1] = dice[n-2];
                while(dice[n-1]<6){
                    printArray(dice);
                    dice[n-1]++;
                }
                printArray(dice);
            }
             if(n>2){
                 int level =3;
                 while(level<=n){
                     recurDice(n,level,dice);
                     level++;
                 }
             }
        }
    }
}

//�迭�� ����ϴ� �Լ�
 public static void printArray(int arr[]){
     for(int j=0;j<arr.length;j++){
         System.out.print(arr[j]+" ");
     }
     System.out.println("");
 }

 //a�Ķ���ͷ� �޾� n-a�ڸ� �� �ϳ��� �÷� ���
 public static void changeDice(int n,int a,int arr[]){
     while(arr[n-a]<=6){
         printArray(arr);
         arr[n-a]++;
     }
 }
 //����Լ�
 public static void recurDice(int n,int a,int arr[]){
     if(a==2){
         while(arr[n-2]<6){
             arr[n-2]++;
             arr[n-1] = arr[n-2];
             while(arr[n-1]<6){
                 printArray(arr);
                 arr[n-1]++;
             }
             printArray(arr);
         }

     }else{
         while(arr[n-a]<=6){
             arr[n-a+1] = arr[n-a];
             arr[n-a]++;
             recurDice(n,a-1,arr);
             }
         }
     }
}
*/
//ù ��° ���� 1�̰� N��° ���� (N/2)��° ���� (N-1)��° ���� ������ ������ ������ �ִ�. 
//50 ������ �ڿ��� N�� �Է¹޾� ���ȣ���� �̿��Ͽ� �� �������� N��° ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//(1 2 3 5 7 10 13 18 ��)
/*
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(recursive(n));
    }
    public static int recursive(int n){
        if(n==1){
            return 1;
        }
        else{
            return(recursive(n/2)+recursive(n-1));
        }
    }
}
*/
//9�ڸ� ������ �ڿ����� �Է¹޾� ����Լ��� �̿��Ͽ� �� �ڸ� ������ ������ ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//( main()�Լ��� ���� �ϳ�, ����Լ��� �Ű����� �ϳ����� ����� �� �ִ�.)
/*
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum =0;
	///���� �Է¹ޱ� n���� �״����� �հ�� �Ʒ� �Լ��� �̿��ؼ� sum�� ���Ѵ�.
        System.out.println((int)method(n,sum));
    }
    public static double method(int n,int sum){
        //�Ű����� n�ޱ� , 1�� �ڸ� �� ���ϱ�
        if(n<1){
            return sum;
        }else{
		//1���ڸ��� ��� �����ϱ� ���� 231 = 1^2+ 3^2 + 2^2 
            sum += Math.pow(n%10,2);
			
			//���⼭ ��� 10���� �����ָ鼭 1�� �ڸ� ���ڸ� �����ݴϴ�. �̰��ϴ������� ����Լ��� ��Ӻθ��� ����
            //231%10 = 1^2 -> 231/10 = 23-> 23%10 =3^2 ->  23/10 = 2%10 = 2^2 
            return method(n/10,sum);
        }
    }
}
*/
//�ڿ��� N�� �Է¹޾� 1���� N���� ����� �ϵ� n-1��° ���� n��° ���� 2�� ���� ���� �ǵ��� �ϴ� ���α׷��� �ۼ��Ͻÿ�.
/*
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        method(n);
        System.out.println(n);
    }
    public static int method(int n){
        if(n==1){
            return 1;
        }else{
            System.out.print(method(n/2)+" ");
            return n;
        }
    }
}
*/
//�ڿ��� N�� �Է¹޾� N�� Ȧ���� ��쿡�� 1���� N������ Ȧ����  ¦���� ���� 2���� N������ ¦���� ��� ����ϴ� ���α׷��� ����Լ��� �ۼ��Ͻÿ�.
/*
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       // method(n);
        //System.out.println(n);
        System.out.println(method(n));
    }
    public static int method(int n){
        if(n==1 || n==2){
            return n;
        }
        else{
            System.out.print(method(n-2)+" ");
            //this method must  return a result of type int Java ������ �ݵ�� return n���ش�
           return n;
        }
    }
}
*/
//�ڿ��� N�� M�� �Է¹޾Ƽ� �ֻ����� N�� ������ ���� ���� ���� M�� ���� �� �ִ� ��� ��츦 ����ϴ� ���α׷��� �ۼ��Ͻÿ�. 
//��, N�� 10 ������ �����̴�.
/*
public class Main{
    static int N;
    static int M;
    static int [] arr;

    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        arr = new int[N];

        dice(0,0);
    }
    public static void dice(int level,int sum){
        if(level < arr.length){
            for(int i=1;i<=6;i++){
                arr[level] = i;
                dice(level+1,sum+i);
            }
        }else{
            if(sum == M){
                for(int j=0;j<arr.length;j++){
                    System.out.print(arr[j]+" ");
                }
                System.out.println("");
            }
        }
    }
}
*/
//ù ��°�� 1, �� ��°�� 2, �� ��°���ʹ� ���� �� ���� ���� 100���� ���� �������� �̷���� ������ �ִ�. 
//100 ������ �ڿ��� N�� �Է¹޾� ����Լ��� �̿��Ͽ� N��° ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
/*
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(recur(N));
    }
    public static int recur(int N){
        if(N == 1){
            return 1;
        }else if(N==2){
            return 2;
        }else{
            return (recur(N-2)*recur(N-1))%100;
        }
    }
}
*/
//100�� ������ �ڿ��� N�� �Է¹޾� ¦���̸� 2��  Ȧ���̸� 3���� ������ �۾��� �ݺ��ϴٰ� �� ���� 1�� �Ǹ� �׶����� �������� �۾��� Ƚ���� ����ϴ� ���α׷��� ����Լ��� �ۼ��Ͻÿ�.
//100 �� 50 �� 25 �� 8 �� 4 �� 2 �� 1
//Ƚ��(level)�� �Բ� �����ϰ� n�� 1�̸� level�� ����ϸ� �ȴ�. 
//�Լ�(n/2 �Ǵ� n/3  level+1)
/*
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println(recur(n,0));
    }
    public static int recur(int n,int level){
        if(n==1){
            return level;
        }else if(n%2 ==0){
            return recur(n/2,level+1);
        }else{
            return recur(n/3,level+1);
        }
    }

}
*/
//3�ڸ��� �̷���� �ڿ��� 3���� �Է¹޾� �� ������ ���� ���� �� �� ������� �� �ڸ� ���ڵ��� 0�� ������ ��� ������ ���� ���Ͽ� ����ϴ� ���α׷��� ����Լ��� �ۼ��Ͻÿ�.
//�Է¿����� �� ���� ���� 1365300�̴�. �׷��Ƿ� 1 * 3 * 6 * 5 * 3 = 270
//1�� �ڸ��� * 1�� �ڸ��� ������ ���� �ڸ����� �� (��  1�� �ڸ����� 0�̸� 1�� �ٲپ ���Ѵ�.)
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int N = a*b*c;
        System.out.println(recur(N,1));
    }
    public static int recur(int N,int sum){
        //���ڸ� ���ΰ�?
        int i =0;
        while(N/Math.pow(10,i)>10)
        {
            i++;
        }
        //i+1�ڸ� ���̴�.
        if(N<10){
            if(N!=0){
                return sum*N;
            }else{
                return sum*1;
            }
        }else{
            int x = N/(int)(Math.pow(10,i));//ù��° ��
            int y = N%(int)(Math.pow(10,i));//ù��° �� �߶󳻰� ���� ��
            return recur(y,sum*x);
        }
    }
}
