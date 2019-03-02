package kakao;
//데이터 사전 구현을 위해서 HashMpa(dicMap)을 선언 후 기초 데이터인 'A'~'Z'를 담아 주었습니다.
//그 이후는 LZW알고리즘에 맞게 KEY를 검사 후 존재 여부에 따라서 다음 키와 조합하여 사전 추가를 하여 문제를 풀이 하였습니다.

//LZW예제
import java.util.*;
import java.io.*;
public class compression{

    

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