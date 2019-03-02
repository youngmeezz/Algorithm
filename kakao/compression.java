package kakao;
//������ ���� ������ ���ؼ� HashMpa(dicMap)�� ���� �� ���� �������� 'A'~'Z'�� ��� �־����ϴ�.
//�� ���Ĵ� LZW�˰��� �°� KEY�� �˻� �� ���� ���ο� ���� ���� Ű�� �����Ͽ� ���� �߰��� �Ͽ� ������ Ǯ�� �Ͽ����ϴ�.

//LZW����
import java.util.*;
import java.io.*;
public class compression{

    

public static ArrayList<String> solution(String str)
{
    //�������� ����� ���� �����ϰ� ���ʵ����͸� �Է�
    HashMap dicMap = new HashMap<String,String>();
    char c = 'A';
    int n = 1;
    while(dicMap.size() < 26){
        dicMap.put(String.valueOf(c++),String.valueOf(n++));

    }
    //���� �ҽ�
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