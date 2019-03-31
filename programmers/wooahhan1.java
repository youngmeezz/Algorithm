package programmers;

import java.util.*;

public class wooahhan1{
    public static void main(String[] args){

    int a = 50237;
    solution(a);
    int b = 15000;
    solution(b);
    }
    public static void solution(int money){
    
       // int money;
       int arr[]={0,};
       while(money>=0)
        if(money/50000 == 0)
        {
            arr[0]++;
            money = money/50000;
            
            if(money/10000 == 0){
                arr[1]++;
                money = money/10000;
                if(money/5000 == 0){
                    arr[2]++;
                    money = money/5000;
                    if(money/1000 == 0){
                        arr[3]++;
                        money = money/1000;
                        if(money/500 ==0){
                            arr[4]++;
                            money = money/500;
                            if(money/100 ==0){
                                arr[5]++;
                                money = money/100;
                                if(money/50 ==0){
                                    arr[6]++;
                                    money = money/50;
                                    if(money/10 ==0){
                                        arr[7]++;
                                        money = money/10;
                                        if(money/1 ==0){
                                            arr[8]++;
                                            money = money/1;
                                            }
                                         }  
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return arr;
    }
}


/*
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
*/
