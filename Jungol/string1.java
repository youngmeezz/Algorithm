package Jungol;

import java.util.Scanner;

public class string1{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n=0;

        while(n>=33 && n<=127){
            System.out.print("ASCII code =?");
            n = input.nextInt();
            System.out.write(n);
            System.out.println("");
        }
    }
}