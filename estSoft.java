/*
import java.util.*;

public class estSoft{
    public static void main(String[] args){

        //Scanner sc= new Scanner(System.in);
        final int numOfData = 7;
      

        int arr[] = new int[numOfData];
        //int data[] = new int[numOfData];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<numOfData;i++){
            arr[i] = sc.nextInt();
        }
        int temp=0;

        //����
        for(int i=0;i<arr.length;i++){
               //�迭�߿� ���� ���� �����ϸ� �ڿ��� 1�� ���
            if(arr[i]<0)
            {
                System.out.print("1");
            }
            //length�� 1���� �����ϱ� ������ -1�� ���Խ��Ѿ� �մϴ�.
            for(int j=0;j<arr.length-1;j++){
                    if(arr[j]>arr[j+1]){
                        temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                }
                //�迭�߿� �ִ��� ã�� �ű⼭ +1�� ���ְų� 
                if(arr[i]<arr[i+1])
                    System.out.print(arr[i+1]+1);
                else
                    System.out.print(arr[i]+1);
                //�迭�߿� ���� ����{1,3,4,6,1} �߿� 2,5 �ּڰ� 2�� ���
                //�ڿ����� �ִ��� �Ǵ� 1,2,3,4,5,6�� ������ ����ã��
                //�ߺ��� ���ܵ� return���� �ʱ�
                if(arr)
                
               
            }
            
            for(i=0;i<numOfData;i++){
            System.out.print(arr[i]+" ");
            }
        }

        /*
            (int i=0;i<numOfData;i++){
                System.out.print(data[i]+" ");
            }
            */
/*
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;


            }
        }
*/
/*
import java.util.*;

public class estSoft{
    public static void main(String[] args){

        final int numOfData = 7;
      

        int arr[] = new int[numOfData];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<numOfData;i++){
            arr[i] = sc.nextInt();
        }
        for(int j=0;j<numOfData;j++){
            System.out.print(arr[j] +" ");
        }
        int temp=0;

        //����
        for(int i=0;i<arr.length-1;i++){
            //length�� 1���� �����ϱ� ������ -1�� ���Խ��Ѿ� �մϴ�.
            //�����ϋ� 
            /*
            if(arr[i]<0)
            System.out.println("1");
            */
/*
if(arr[i]>0){
    arr[0] = 1;
    //arr�迭 �ȿ� ������ ��
    arr[arr[i]]=arr[i];
}

if(arr[0] != 1)
return 1;

for(int j=0;j<arr.length-1;j++){
        if(arr[j]>arr[j+1]){
            temp = arr[j];
            arr[j] = arr[j+1];
            arr[j+1] = temp;
    }
    
    //�迭�߿� �ִ��� ã�� �ű⼭ +1�� ���ְų� 
    /*
    if(arr[i]<arr[i+1])
        System.out.print(arr[i+1]+1);
    else
        System.out.print(arr[i]+1);
    
    //�迭�߿� ���� ����{1,3,4,6,1} �߿� 2,5 �ִ� 5�� ���
    //�ڿ����� �ִ��� �Ǵ� 1,2,3,4,5,6�� ������ ����ã��
    if(arr[i]>0)
        if(arr[i] + 1 == arr[i+1] || arr[i] == arr[i+1])
            continue;
        else
            System.out.print(arr[i]+1);
    //�ߺ��� ���ܵ� return���� �ʱ�
   // a[n] = a[n+1]
    else   
        System.out.print("1");
    
   
}
}
System.out.println();
for(int i=0;i<numOfData;i++){
System.out.print(arr[i]+" ");
}
}
}
*/

/*
import java.io.IOException;
import java.util.Scanner;
 
public class estSoft {
    public static void main(String args[]) throws IOException
    {
       //1,3,5,6-->2,4�� ������ �ּ� �ڿ����� 2�� ��ȯ�Ǿ�� ��
       //1,2,3 --> ���̿� ���� ���ڰ� ������ �� ������ �� 4�� ��ȯ�Ǵ� ��
       
       //1.���ĺ���
       
       int result=1;
       int arr[] = new int[6];
       Scanner input = new Scanner(System.in);

       //6���� �� �Է�
       System.out.println("6���� ���� �Է� ");
       for(int i=0;i<arr.length;i++) {
          arr[i] = input.nextInt();
       }
       //�Է��� �� �����ֱ�
       System.out.println("�Էµ� �� ");
       for(int j=0;j<6;j++) {
          System.out.print(arr[j]+" ");
       }
       //System.out.println();
       int temp = 0;
       
       //�������� ����
       for(int i=0; i<arr.length; i++) {
          for(int j=0; j<arr.length-1; j++) {
             
             if(arr[j]>arr[j+1]) {
                temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
             }
          }
        
          System.out.println();
        }
       //������ �� �����ֱ�
       for(int i=0;i<arr.length;i++) {
          System.out.print(arr[i]+" ");
           } 
        }
   }
*/
import java.util.*;

public class estSoft {
    public static void main(String[] args) {

        final int numOfData = 7;
        int arr[] = new int[numOfData];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < numOfData; i++) {
            arr[i] = sc.nextInt();
        }
        int temp = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }
        }
        int result = 0; // for���տ��� result�� �ʱ�ȭ �����ְ� for�� ������ result�� ������ش�.
        for (int k = 0; k < numOfData; k++) {
            // System.out.print(arr[k]+" ");

            if (arr[k] > 0)

                if (arr[k] + 1 == arr[k + 1] || arr[k] == arr[k + 1])
                    continue;
                else {
                    result = arr[k] + 1;

                    break;
                }
            else
                result = 1;

        }
        if (result == 0) {
            result = arr[arr.length - 1] + 1;
        }
        System.out.print(result);
    }
}
