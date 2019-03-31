import java.util.*;
import java.io.*;

public class estSoft1 {
    public static void main(String[] arr){
    int aAry[]={3,4,3,0,2,2,3,0,0};
    solution(aAry);
    int bAry[]={4,2,0};
    solution(bAry);
    int cAry[]={4,4,3,3,1,0};
    solution(cAry);
    }

    private static void solution(int arr[]){
        Arrays.sort(arr); //0,0,0,2,2,3,3,3,4->5 return 
        int count=0;
            for(int i=0;i<arr.length-1;i++){
                //if(arr[i] == arr[i]+1)
                //if(arr[i] +1 == arr[i+1])
                if(arr[i] +1 == arr[i+1]){
                    for(int j=0;j<=i;j++){
                        //현재 숫자보다 1이 크면 count 증가
                        //중복인 검사하기
                        if(arr[i]==arr[j]){
                            count++;
                            
                        }
                    }
                }
            }
            System.out.println(count);
        }
        
    }




/*
public class estsoft_demo_g {
    public static void main(String[] arr){
       int aAry[]={3,1,6,1,2,4};
       solution(aAry);
       int bAry[]={1,2,3};
       solution(bAry);
       int cAry[]={-1,-3};
       solution(cAry);
       }
    private static void solution(int arr[]){
       Arrays.sort(arr);
       int a=0;
       for(int i=0;i<arr.length - 1;i++){
          if(arr[i]>0){
             if(arr[i]==arr[i+1]||arr[i+1]==arr[i]+1){
                continue;
             }
             else{
                a=arr[i]+1;
                break;
             }
          }
          else{
             a=1;
          }
       }
       
       if(a == 0) a = arr[arr.length - 1] + 1;
       System.out.println(a);
       
    }
 
 }
 */