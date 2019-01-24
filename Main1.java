//영문자 두 개를 입력 받아서 각각의 아스키코드의 합과 차를 출력하는 프로그램을 작성하시오.

import java.util.Scanner;

public class Main1{
    public static String str;
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String str1 = input.next();
        String str2 = input.next();
         
        char c1 = str1.charAt(0);
        char c2 = str2.charAt(0);
         
        System.out.print((int)c1 + (int)c2 + " ");
        if((int)c1>=(int)c2) {
            System.out.println((int)c1-(int)c2);
        }else {
            System.out.println((int)c2-(int)c1);
        }
    }
}