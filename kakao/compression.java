package kakao;
//데이터 사전 구현을 위해서 HashMpa(dicMap)을 선언 후 기초 데이터인 'A'~'Z'를 담아 주었습니다.
//그 이후는 LZW알고리즘에 맞게 KEY를 검사 후 존재 여부에 따라서 다음 키와 조합하여 사전 추가를 하여 문제를 풀이 하였습니다.

//LZW예제
/*
import java.util.*;
import java.io.*;
public class compression{

    static ArrayList<String>defaultDictionary = new ArrayList<>();

    public static void main(String[] args){
        setDefaultDictionary();
        solution("KAKAO");
        solution("TOBEORNOTTOBEORTOBEORNORNOT");
        solution("ABABBAABABABABAB");
    }

    static void solution(String text){
        ArrayList dictionary = (ArrayList) defaultDictionary;
        ArrayList<Integer> result = new ArrayList<>();

        for(int i=0;i<text.length();i++){
            int lastPosition = i;
            for(int j=i+1;j<=text.length();j++){
                //단어 가져오기
                String temp = text.substring(i,j);

                //사전에서 단어 찾기
                int tempPosition = dictionary.indexOf(temp);
                if(tempPosition>=0){ //이미 사전에 존재할 경우
                    lastPosition = tempPosition;

                    //마지막 단어라면
                    if(j == text.length()){
                        result.add(lastPosition+1); //결과에 추가
                        i = j; //i 포문 종료하기 위함
                        break;
                    }
                }else{ //사전에 존재하지 않을 경우
                    dictionary.add(temp);
                    result.add(lastPosition+1); //결과에 추가
                    i = j-2;
                    break;
                }
            }
         }
         System.out.println(result);
        }
        static void setDefaultDictionary(){
            for(int i=0;i<=25;i++){
                defaultDictionary.add(String.valueOf((char)(i+65)));
            }
        }
    }

*/
/*
public static ArrayList<String> solution(String str)
{
    //사전으로 사용할 맵을 생성하고 기초데이터를 입력
    HashMap dicMap = new HashMap<String,String>();
    char c = 'A';
    int n = 1;
    while(dicMap.size() < 26){
        dicMap.put(String.valueOf(c++),String.valueOf(n++));

    }
    //메인 소스
    ArrayList<String> retList = new ArrayList<String>();
    while(!str.isEmpty()){
        for(int i = str.length();i>0;i--){
            if(dicMap.containKey(str.substring(0,i))){
                String key = str.substring(0,i);
                String nextKey = str.length() > i+1 ? str.substring(i,i+1) : "";
                retList.add(dicMap.get(key));
                if(!nextKey.isEmpty() && !dicMap.containsKey(key+nextKey)){
                    dicMap.put(key+nextKey, String.valueOf(dicMap.size()+1));
                }
                str = str.substring(key.length());
                break;
                }
            }
        }
        return retList;
    }
}
*/




import java.util.*;
import java.io.*;
class Solution {

    static ArrayList<String>defaultDictionary = new ArrayList<>();
    public int[] solution(String msg){
        ArrayList dictionary = (ArrayList) defaultDictionary;
       // ArrayList<Integer> result = new ArrayList<>();
         int[] result = new int[integers.size()];
    /*
    for (int i=0; i < result.length; i++)
    {
        result[i] = integers.get(i).intValue();
    }
    */
   // return ret;

        for(int i=0;i<msg.length();i++){
            int lastPosition = i;
            for(int j=i+1;j<=msg.length();j++){
                //단어 가져오기
                String temp = msg.substring(i,j);

                //사전에서 단어 찾기
                int tempPosition = dictionary.indexOf(temp);
                if(tempPosition>=0){ //이미 사전에 존재할 경우
                    lastPosition = tempPosition;

                    //마지막 단어라면
                    if(j == msg.length()){
                        result.add(lastPosition+1); //결과에 추가
                        i = j; //i 포문 종료하기 위함
                        break;
                    }
                }else{ //사전에 존재하지 않을 경우
                    dictionary.add(temp);
                    result.add(lastPosition+1); //결과에 추가
                    i = j-2;
                    break;
                }
            }
         }

        // System.out.println(result);
        return result;
        }

        static void setDefaultDictionary(){
            for(int i=0;i<=25;i++){
                defaultDictionary.add(String.valueOf((char)(i+65)));
            }
        }
    }


s