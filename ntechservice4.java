package baekjoon;

import java.util.*;
/*
class ntechservice4{
    public int []  solution(int[] array,int[][] commands){
            int [] answer = new int[commands.length];
            int [] temp = {};
            int index=0;

            for(int i=0;i<commands.length;i++){
            {
             int start = commands[i][0];
             int end = commands[i][1];
             int k = commands[i][2];

             int[] tmp = new int[end-start+1];

             int a =0;
             for(int j=start -1 ; j<end;j++)
                tmp[a++] = array[j];

                Arrays.sort(tmp);
                answer[index++] = tmp[k-1];

            }
        }
    }
}
*/
//������ �켱 �迭 �ȿ��ٰ� (1) (1,2) (1,2,3) (1,2,3,4)�� �־���� �ϴµ�
//a[0] = 1, a[1] = 1, a[2] = 2, a[3] = 1, a[4] = 2, a[5] = 3, a[6] = 1, a[7] = 2 
//a[8] = 3, a[9] = 4, a[10] =1
//�����ϴ� ���� cnt
//ù��°�� 

//k �Է¹޴� �� 
//i : ������ �� (1,2,3) i++ �ʱ�ȭ ���Ѽ� ��� 1�� ������ ��
//sum : (1),(1,2) ex.3�� (��ȣ ģ ������ ������ ����)
//n : i���� ������ ���� ������ ���� ������ �� 1,2,3,4 �̷������� ���� �ϴ� �� 
// 
import java.util.Scanner;
public class ntechservice4 {
    public static final long MAX = 50000000000000L;

    public static void main(String[] args) {

        long k ; //�Է¹��� ��
     //   int result; //��¹��� ��
        Scanner sc = new Scanner(System.in);

        k = sc.nextLong(); //�Է� ���� �� k
        long i =1L;
        long n=0L;// sum ������ ���� sum�� 10���̸� n�� 6�� -> 1���϶� 1 2���϶� 2 3���϶� 3
        if(k < 1 || k > 50000000000000L)
            System.out.println("Out of range.");
        else {
            // 13�� �ִ밪�� ��, k �� 15�� �Է¹���. n = 10, sum = 15(5�� ����);
            // �̷���� for(; sum <= 13; sum += i)
           long sum =1;

            while(true) { //sum�� i����ŭ ���ϱ�
                i++;
                sum+=i;
                if(k<=sum && k>n){
                    System.out.println(k-n); 
                    break; 
                }
                if(sum > MAX) break;
                n=sum;
            }
        }
        //sum�� 6�� n�� 5�� k�� �Է¹��� ���� 18��° ���̸� n�̸� 15��° ���⼭ ���� 3��° ���� ���ϸ� 3�� ������ �ȴ�.
        //�� 3�� �����ĸ� ������ 1���� �����ϴϱ� ���⼭ ���� ���ص� 3�����ݾ�, �� 3��°�� 3, 4��°�� 4 �̷��� ����
            /*
            for (result =1; result < sum-n; result++) {// sum-n�� ������ŭ for�� ������
            
                // ���� ���������� ���� 1,3,6,10��° �ε� n++
                n++;
                System.out.println(n);
            }
            n=sum;
        }
        System.out.println(result); 
        */
    }
}


/*
import java.util.Scanner;
public class ntechservice4 {
    public static final long MAX = 50000000000000L;

    public static void main(String[] args) {

        long k ; //�Է¹��� ��
     //   int result; //��¹��� ��
        Scanner sc = new Scanner(System.in);

        k = sc.nextLong(); //�Է� ���� �� k
        long i =1L;
        long n=0L;// sum ������ ���� sum�� 10���̸� n�� 6�� -> 1���϶� 1 2���϶� 2 3���϶� 3
        if(k < 1 || k > 50000000000000L)
            System.out.println("Out of range.");
        else {
            // 13�� �ִ밪�� ��, k �� 15�� �Է¹���. n = 10, sum = 15(5�� ����);
            // �̷���� for(; sum <= 13; sum += i)
            for (long sum=1; ; sum += i) { //sum�� i����ŭ ���ϱ�
                i++;
                if(k<=sum && k>n){
                    System.out.println(k-n); 
                    break; 
                }
                if(sum > MAX) break;
                n=sum;
            }
        }
*/