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
        //Arrays.fill�� ��ü �迭�� ä��� ����̴�.
        Arrays.fill(dp,"");
        Arrays.fill(dpMin,999999);
        dpMin[0] = 0;
        int pivot =0;

        for(int index=0;index < t.length(); index++){
            
         //   String word = strs[index];

            //���� dp�� ���� ���� pivot
            pivot = (index ==0)? 0 : index-1;

            int depth = dpMin[pivot];
            String tempDp = dp[pivot];

            //(text - ���� dp)���� ���� �� �� ã��
            for(String word : strs){
                if(t.substring(tempDp.length(), index+1).startsWith(word)==true){
                    dp[index] = tempDp + word;
                    dpMin[index] = depth + 1;
            //        System.out.println("dp: " + dp[index]);
                    break;
                }
            }
            System.out.println("index: " + index + " pivot: "+ pivot);
            //�� ���� �� ���� ã��
            while(pivot-1 >=0){
                for(String word : strs){
                    depth = dpMin[pivot-1];
                    tempDp = dp[pivot-1];

                    if(t.substring(tempDp.length(), index + 1).startsWith(word) == false)
                    continue;
                    depth++;
                    //dpMin[index]���� ũ�ų� ������ �ǹ� ������ ����
                    if(depth>=dpMin[index])
                    continue;
                
                    //���� tempDp�� ������ �������� word�� ������, tempDp
                    if(t.substring(tempDp.length(),index+1).equals(word)==true){
                        tempDp = tempDp + word;
                        break;
                    }
                    //�ƴ϶�� �� �����͵� ã�ƺ�
                    for(int count=0;count < strs.length;count++){
                        String innerWord = strs[count];
                        if(t.substring(tempDp.length(),index+1).startsWith(innerWord) == false)
                        continue;
                        //depth���� �ּҰ����� ũ�ų� ������ �ǹ� ������ ����
                        if(depth+1 >= dpMin[index])
                        break;
                        depth++;
                        tempDp = tempDp+word;
                        //���࿡ tempDp�� text(0~index+1)�� ������ ã������ ����
                        if(t.substring(0,index+1).equals(tempDp)==true){
                            break;
                        }
                    }
                }
                //���� ���� ã�� depth�� �ּڰ����� ������ �����Ű�� ����
                System.out.println("index: " + index+ " pivot: "+ pivot+" depth: "+depth+" tempDp: "+tempDp);
                if(depth<dpMin[index]&&tempDp.equals(t.substring(0,index+1))){
                    dpMin[index] = depth;
                    dp[index] = tempDp;
                    break;
                }
                //�ƴ϶�� pivot�� �����ϰ� ���� 
                pivot--;
            }
        }
       System.out.printf("======dp======");
       for(String p : dp){
           System.out.println(p);
       }
       //�� ã�ƺôµ� dp�� ���� text�� ���� ������ -1
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
                        //���� ���ں��� 1�� ũ�� count ����
                        //�ߺ��� �˻��ϱ�
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