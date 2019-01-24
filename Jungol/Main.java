package Jungol;

//import java.util.Scanner;
import java.util.*;

//33부터 127 까지의 숫자를 계속 입력받아 입력받은 숫자의 아스키코드에 해당하는 문자를 출력하다가 범위를 벗어나는 입력이 들어오면 종료하는 프로그램을 작성하시오.
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
            // System.out.printf("%c\n",n);->메모리랑 시간 좀 더 많이 소모9MB,132ms (char)8MB 128ms으로
            // 형변환이 더 낫다

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

// 문자열을 입력받은 뒤 그 문자열을 이어서 두 번 출력하는 프로그램을 작성하시오.
// 문자열의 길이는 100이하이다.

/*
  public class Main{ 
      public static void main(String[] args){ 
          Scanner input = new Scanner(System.in);
           String n = input.nextLine(); 
           System.out.println(n+n);
  } 
}
*/ 

// 문자열을 “Hong Gil Dong”으로 초기화 한 후 3번부터 6번까지의 문자를 차례로 출력하시오.
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
            Integer str44 = new Integer('1'); //->49인이유->질문 아스키코드
            int str45 = new Integer('1');
            int str46 = new int(1); //Int은 "자료형"이기 때문에 선언과 초기화를 한번에 못해준다.
            int str47 =1;//초기화
            System.out.println(str4);
            System.out.println(str41);
            System.out.println(str42);
            System.out.println(str43);
            System.out.println(str44);
            System.out.println(str45);
          String str5 = new String("Hong Gil Dong"); //String은 "객체" 이기때문에 선언과 초기화를 해줄수 있지만
           System.out.printf(str5.substring(3, 7)); //문자열 추출 substring은 3<=문자열<7 까지 해야만 3~6번째 문자를 따로 출력 가능
  
        }
 }
 */

 //문자열을 입력받고 정수를 입력 받아서 문자열의 입력받은 정수의 맨 뒤부터 정수만큼 출력하는 프로그램을 작성하시오.

 //만약 입력받은 정수가 문자열의 길이보다 크다면 맨 뒤부터 맨 처음까지 모두 출력한다.

 //(문자열 길이는 최대 100자 이하이다. )

//입력 : korea 3

//출력 : aer
/*
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();//nextLine하면 입력이 한번 엔터 치고 가는데 그러면 korea 엔터 3이 되서 입력이 한번에 안된다. 그래서 next만쓰면 그 뒤에 스페이스 하고 바로 입력가능하다.
        int n = sc.nextInt();

        if(n>str.length()){//만약 입력받은 정수가 문자열의 길이보다 크다면
            n = str.length();// 맨 뒤부터 맨 처음까지 모두 출력한다.(입력받은 정수가 이제 그 문자열 전체 길이가 되게 해준다)
        }
        
        for(int i=0;i<n;i++){
            System.out.print(str.charAt(str.length()-1-i));//charAt은 이제 문자열을 배열화 시켜서 하나씩 넣어지는 것이기 때문에 0부터시작한다
            //->그래서 str.length()-1을 해야만 문자열이 5개였을때 0부터4까지만 배열인덱스가 있기 때문에 -1을 해주는 것이고 i는 1부터 증가하는 값이니까
            //뒤에 문자열 부터 -1,-2해주면서 값을 출력해주게된다.
        }
    }
}
*/
/*
import java.util.Scanner;
//두 개의 문자열을 입력받아서 두 문자열의 길이의 합을 출력하는 프로그램을 작성하시오.

//각 문자열의 길이는 20자 미만이다.
public class Main{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2= sc.next();
        System.out.println(str1.length()+str2.length());

    }
}
*/
//문자를 입력받아 알파벳 문자인 경우에는 그대로 출력하고 숫자인 경우는 아스키코드값을 출력하는 작업을 반복하다가 기타의 문자가 입력되면 종료하는 프로그램을 작성하시오.
//* 입출력예에서 진한글씨가 출력
import java.util.Scanner;

public class Main{
    
}