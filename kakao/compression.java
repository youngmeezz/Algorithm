package kakao;
//������ ���� ������ ���ؼ� HashMpa(dicMap)�� ���� �� ���� �������� 'A'~'Z'�� ��� �־����ϴ�.
//�� ���Ĵ� LZW�˰��� �°� KEY�� �˻� �� ���� ���ο� ���� ���� Ű�� �����Ͽ� ���� �߰��� �Ͽ� ������ Ǯ�� �Ͽ����ϴ�.

//LZW����
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
                //�ܾ� ��������
                String temp = text.substring(i,j);

                //�������� �ܾ� ã��
                int tempPosition = dictionary.indexOf(temp);
                if(tempPosition>=0){ //�̹� ������ ������ ���
                    lastPosition = tempPosition;

                    //������ �ܾ���
                    if(j == text.length()){
                        result.add(lastPosition+1); //����� �߰�
                        i = j; //i ���� �����ϱ� ����
                        break;
                    }
                }else{ //������ �������� ���� ���
                    dictionary.add(temp);
                    result.add(lastPosition+1); //����� �߰�
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
                //�ܾ� ��������
                String temp = msg.substring(i,j);

                //�������� �ܾ� ã��
                int tempPosition = dictionary.indexOf(temp);
                if(tempPosition>=0){ //�̹� ������ ������ ���
                    lastPosition = tempPosition;

                    //������ �ܾ���
                    if(j == msg.length()){
                        result.add(lastPosition+1); //����� �߰�
                        i = j; //i ���� �����ϱ� ����
                        break;
                    }
                }else{ //������ �������� ���� ���
                    dictionary.add(temp);
                    result.add(lastPosition+1); //����� �߰�
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