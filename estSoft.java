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

        //정렬
        for(int i=0;i<arr.length;i++){
               //배열중에 음수 값만 존재하면 자연수 1을 출력
            if(arr[i]<0)
            {
                System.out.print("1");
            }
            //length는 1부터 시작하기 떄문에 -1을 포함시켜야 합니다.
            for(int j=0;j<arr.length-1;j++){
                    if(arr[j]>arr[j+1]){
                        temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                }
                //배열중에 최댓값을 찾고 거기서 +1을 해주거나 
                if(arr[i]<arr[i+1])
                    System.out.print(arr[i+1]+1);
                else
                    System.out.print(arr[i]+1);
                //배열중에 없는 숫자{1,3,4,6,1} 중에 2,5 최솟값 2를 출력
                //자연수가 있는지 판단 1,2,3,4,5,6중 빠지는 숫자찾기
                //중복이 생겨도 return하지 않기
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

        //정렬
        for(int i=0;i<arr.length-1;i++){
            //length는 1부터 시작하기 떄문에 -1을 포함시켜야 합니다.
            //음수일떄 
            /*
            if(arr[i]<0)
            System.out.println("1");
            */
/*
if(arr[i]>0){
    arr[0] = 1;
    //arr배열 안에 들어왔을 때
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
    
    //배열중에 최댓값을 찾고 거기서 +1을 해주거나 
    /*
    if(arr[i]<arr[i+1])
        System.out.print(arr[i+1]+1);
    else
        System.out.print(arr[i]+1);
    
    //배열중에 없는 숫자{1,3,4,6,1} 중에 2,5 최댓값 5를 출력
    //자연수가 있는지 판단 1,2,3,4,5,6중 빠지는 숫자찾기
    if(arr[i]>0)
        if(arr[i] + 1 == arr[i+1] || arr[i] == arr[i+1])
            continue;
        else
            System.out.print(arr[i]+1);
    //중복이 생겨도 return하지 않기
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
       //1,3,5,6-->2,4가 없으니 최소 자연수인 2가 반환되어야 함
       //1,2,3 --> 사이에 빠진 숫자가 없으면 그 다음수 인 4가 반환되는 것
       
       //1.정렬부터
       
       int result=1;
       int arr[] = new int[6];
       Scanner input = new Scanner(System.in);

       //6개의 값 입력
       System.out.println("6개의 숫자 입력 ");
       for(int i=0;i<arr.length;i++) {
          arr[i] = input.nextInt();
       }
       //입력한 값 보여주기
       System.out.println("입력된 값 ");
       for(int j=0;j<6;j++) {
          System.out.print(arr[j]+" ");
       }
       //System.out.println();
       int temp = 0;
       
       //오름차순 정렬
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
       //정렬한 값 보여주기
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
        int result = 0; // for문앞에서 result를 초기화 시켜주고 for문 나오고 result를 출력해준다.
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
