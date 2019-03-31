package programmers;

import java.util.*;
import java.io.*;

    public class pretest7{

    public static void main(String[] args){

        /*
        String str1[]={"ba","na","n","a"};
        String t1[]={"banana"};
        solution(str1,t1);
        String str2[]={"app","ap","p","l","e","ple","pp"};
        String t2[]={"apple"};       
        solution(str2,t2);
        String str3[]={"ba","an","nan","ban","n"};
        String t3[]={"banana"};  
        solution(str3,t3);
        }
        */
           // System.out.println(solution(new String[] { "ab", "na", "n", "a", "bn" }, "nabnabn"));
           // System.out.println(solution(new String[] { "ba", "an", "nan", "ban","n" }, "banana"));
            System.out.println(solution(new String[] { "ba", "na", "n", "a" }, "banana"));
            System.out.println(solution(new String[] { "app", "ap", "p", "l", "e", "ple", "pp" }, "apple"));
            System.out.println(solution(new String[] { "ba","an","nan","ban","n"},"banana"));
        }
      private static int solution(String[] strs,String t){

        String[] dp = new String[t.length()];
        int[] dpMin = new int[t.length()];
        //Arrays.fill은 전체 배열을 채우는 방식이다.
        Arrays.fill(dp,"");
        Arrays.fill(dpMin,999999);
        dpMin[0] = 0;
        int pivot =0;

        for(int index=0;index < t.length(); index++){
            
         //   String word = strs[index];

            //이전 dp를 쓰기 위한 pivot
            pivot = (index ==0)? 0 : index-1;

            int depth = dpMin[pivot];
            String tempDp = dp[pivot];

            //(text - 이전 dp)에서 남은 것 중 찾기
            for(String word : strs){
                if(t.substring(tempDp.length(), index+1).startsWith(word)==true){
                    dp[index] = tempDp + word;
                    dpMin[index] = depth + 1;
            //        System.out.println("dp: " + dp[index]);
                    break;
                }
            }
            System.out.println("index: " + index + " pivot: "+ pivot);
            //더 나은 것 없나 찾기
            while(pivot-1 >=0){
                for(String word : strs){
                    depth = dpMin[pivot-1];
                    tempDp = dp[pivot-1];

                    if(t.substring(tempDp.length(), index + 1).startsWith(word) == false)
                    continue;
                    depth++;
                    //dpMin[index]보다 크거나 같으면 의미 없으니 멈춤
                    if(depth>=dpMin[index])
                    continue;
                
                    //만약 tempDp를 제외한 나머지가 word랑 같으면, tempDp
                    if(t.substring(tempDp.length(),index+1).equals(word)==true){
                        tempDp = tempDp + word;
                        break;
                    }
                    //아니라면 그 다음것도 찾아봄
                    for(int count=0;count < strs.length;count++){
                        String innerWord = strs[count];
                        if(t.substring(tempDp.length(),index+1).startsWith(innerWord) == false)
                        continue;
                        //depth값이 최소값보다 크거나 같으면 의미 없으니 멈춤
                        if(depth+1 >= dpMin[index])
                        break;
                        depth++;
                        tempDp = tempDp+word;
                        //만약에 tempDp와 text(0~index+1)이 같으면 찾았으니 멈춤
                        if(t.substring(0,index+1).equals(tempDp)==true){
                            break;
                        }
                    }
                }
                //만약 지금 찾은 depth가 최솟값보다 낮으면 적용시키고 멈춤
                System.out.println("index: " + index+ " pivot: "+ pivot+" depth: "+depth+" tempDp: "+tempDp);
                if(depth<dpMin[index]&&tempDp.equals(t.substring(0,index+1))){
                    dpMin[index] = depth;
                    dp[index] = tempDp;
                    break;
                }
                //아니라면 pivot을 감소하고 돌림 
                pivot--;
            }
        }
       System.out.printf("======dp======");
       for(String p : dp){
           System.out.println(p);
       }
       //다 찾아봤는데 dp끝 값이 text와 같지 않으면 -1
       return(dp[t.length()-1].equals(t))? dpMin[t.length()-1]: -1;
        }
      
    }
    /*
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

    */