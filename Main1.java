//������ �� ���� �Է� �޾Ƽ� ������ �ƽ�Ű�ڵ��� �հ� ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

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