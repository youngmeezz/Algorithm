//�ֺ�� ���ϱ�
/*
package swea;

import java.io.*;
import java.util.*;

public class swea1204 {
    // static int arr[];
    static int score;
    static int t;
    static int cnt;

public static void main(String[] args)throws IOException{

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //StringTokenizer st = new StringTokenizer(br.readLine());

    int arr[] = new int[1000];
    score = Integer.parseInt(br.readLine());
    //int cnt[] = new int[];
    //int max =100;
    t = Integer.parseInt(br.readLine());
for(int test_case =1;test_case<=t;test_case++){


    for(int i=0;i<100;i++){
        for(int j=0;j<100;j++){
        if(arr[i] == arr[j]){
            cnt++;
            }
        }
    if(arr[cnt]<arr[cnt+i])
        System.out.print("# "+arr[cnt+i]);
    else
        System.out.print("# "+arr[cnt]);
        
  
            }
        }
    }
}
*/

package swea;

import java.io.*;
import java.util.*;

public class swea1204 {
    static int t;
public static void main(String[] args)throws IOException{

    Scanner sc = new Scanner(System.in);
    //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    t = sc.nextInt();

for(int test_case =1;test_case<=t;test_case++){
    //�׽�Ʈ���̽� ��ȣ
       int num = sc.nextInt();
    //1000���� �л� ���� ������ �迭
    int score[] = new int[1000];

    //1000�� �ش��ϴ� �л� ���� ���� ���� ����
    //student�� �л��� score�� �л�����
    for(int student=0;student<1000;student++){
        score[student] = sc.nextInt();
    }
    
    //ī������ �迭 ���� 0~100������count�� ������ �����̴�. 
    int count[] = new int[101];

    //�̷������� count�迭�ε��� �ȿ� student�� ������
    //0���� ����Է�����count[0]++
    //1���� ��� �Է� �ȉ����� count[1]�� ++���� �ȵǰ� count[1]�̶�°� ��ü�� ���� ���̱⋚����
    //�ٽ� �����غ���
    //score[0] = 100 score[1] =92 score[2] = 100 score[3] = 92 score[4] = 92 score[5] = 100  
    //count[score[0]]++ �� count[100]++; count[100]�� 1����
    //count[score[1]]++ �� count[92]++; count[92]�� 1����
    //count[score[2]]++ �� count[100]++; count[100]�� 1���� => 2����
    //count[score[3]]++ �� count[92]++; count[92]�� 1���� -> 2����
    //count[score[4]]++ �� count[92]++; count[92]�� 1���� -> 3�̵�
    //count[score[5]]++ �� count[100]++; count[100]�� 1���� -> 3�̵�
    for(int i=0;i<1000;i++){
        count[score[i]]++;
    }

    //��ǥ�� �ִ�� ���� ���� ���� �� ã�°ǵ�
    //���� ���� ���ڰ� ���� ������ ���� �������� �װͺ��� �� ū �� ��� �� �׷��� 
    int result =0;
    int temp =0;

    for(int max=100;max>=0;max--){
        //100���� 1���ִ�. 0<1 �̴ϱ� result�� 1�����ϰ� temp�� 100���� ��
        //99���� 2���ִ�. 1<2 �̴ϱ� result�� 2�����ϰ� temp�� 99���� ��
        //98���� 3���ִ�. 2<3 �̴ϱ� result�� 3�����ϰ� temp�� 98���� ��
        //97���� 1���ִ�. 3<1 �̴ϱ� if�� ���������� for�����鼭 max 1����
        //96���� 4���ִ�. 3<4 �̴ϱ� result�� 4 �����ϰ� temp�� 96���� ��
        //95���� 4���ִ�. 4<4 �̴ϱ� if������������ for�� ���鼭 max 1����
        //������ ���� 4���� ���� 3,2,1,0���ڰ� �� �׷���
        //���̳��� ���� �߿���(4�� ���� 96,95) ���� ū ������ 96������ϰԵ�
        //�̷������� max�� 0���� �� ���� �ȴ�.
        if(result < count[max]){
            result = count[max];
            temp = max;
        }
    }

        System.out.println("#"+num+" "+temp);
            }
        }
    }    
/*
package swea;
import java.util.Scanner;

public class swea1204 {
 
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
 
        int N = s.nextInt();
         
        // �׽�Ʈ ���̽� 1~10��
        for (int i = 1; i <= N; i++) {
            int num = s.nextInt();  // �׽�Ʈ���̽� ��ȣ
            int[] array = new int[1000]; // 1000�� �л� ���� ������ �迭
             
            for (int j = 0; j < array.length; j++) { // 1000�� �л� ���� ����
                array[j] = s.nextInt();
            }
             
            // ī������ �迭 ���� 0~100
            int[] countarray = new int[101];
             
            for (int j = 0; j < array.length; j++) {
                countarray[array[j]]++;  // ī�����ϴ� �κ�
            }
 
            int result = 0;
            int temp = 0;
             
            for (int max = 100; max >=0 ; max--) {
                if(result < countarray[max]) {
                    result = countarray[max];
                    temp = max;
                }
            }
             
            System.out.println("#"+num+" "+temp);
                 
        } // end of for
         
         
         
         
    } // end of main
 
}// end of class
*/