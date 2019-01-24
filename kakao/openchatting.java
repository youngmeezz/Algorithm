package kakao;

import java.util.*;

public class openchatting{
    public static void main(String[] args){
        //String�迭 arr�� �����ϰ� ����� main�Լ��� ���� �ִ°�
        String[] arr = solution(new String[]{"Enter uid1234 Muzi",
                                             "Enter uid4567 Prodo",
                                             "Leave uid1234 ",
                                             "Enter uid1234 Prodo",
                                             "Change uid4567 Ryan"});
        for(int i=0;i<arr.length;++i)
            System.out.println(arr[i]);
    }

    public static String[] solution(String[] record){
        String[] answer = null; //���� ���� String �迭 ����
        HashMap<String,String> idNick = new HashMap<String, String>();  //HashMap�� key���� Value���� String������ �ΰ�idNick�� �����Ѵ�.
        String[][] splitR = new String[record.length][2]; //String 2�����迭 splitR�� ������Ѽ� ���̸� ������ �ΰ� 0,1,2 ���� �����Ų��.
        int events =0; //events�� ���⼭ ���� �ǹ��Ѵ�.
        for(int i=0;i< splitR.length;++i)
        {
            // int num[][];
            // num[0][0] = 1;
            // num[0][1] = 2;
            // ==> num[0] = {1, 2};
            splitR[events] = record[i].split(" ");//splitR���� events�� 0�ϋ� ù���� �ǹ��ϰ� 
            //record[0]�� ���� split�� �������� ©�����鼭 Enter��
            //record[1]�� uid1234
            //record[2]�� Muzi

            //���� ���� if�� if�� �̷���� �ֱ� ������ �ι� �˻縦 ���ش�. �ؿ� �ִ� if�� events++�� ���� �ϳ� ���������༭ �� �������� ������ش�.
            if(splitR[events][0].equals("Enter")||splitR[events][0].equals("Change"))//0���� 0���϶��� Enter,Change,Leave���� ���Ƿ� �̰��� ������ üũ
            {
                idNick.put(splitR[events][1],splitR[events][2]);//put�� hash�Լ����� ���� �־��ִ� ������ key���� value���� �ѹ��� ���ش�.
                //���⼭ key���� uid1234 value���� prodo�̴�.
                //Enter�� Change�� �ٽ� ���� uid�� Ű���� ������ value���� �г����� �ٸ��� ������������.
            }
            if(splitR[events][0].equals("Enter")||splitR[events][0].equals("Leave"))
            {   
                events++;//���� �ϳ� ���������ش�. enter�� leave�� ���� �ٲ��ִ°�  �ƴϴϱ� �׳� �ุ ���������ְ�
                //change�� muzi���� prodo�� �ٲ��ִϱ� ���� ���鵵 �� �ٲ���ߵǼ� �ؿ� 
            }
        }
        answer = new String[events];
        int count =0;
        for(int i=0;i<events;++i)
        {
            if(splitR[i][0].equals("Enter"))//���࿡ ù���� ù���� Enter���
            {
                answer[count++] = idNick.get(splitR[i][1])+"���� ���Խ��ϴ�.";//get�� hash�Լ����� key���� uid1234�� �־����� value�� prodo�� ����� ���ִ� ���̴�.���� Ű���� �޾ƿ����

            }
            else if(splitR[i][0].equals("Leave"))//���࿡ ù���� ù���� Leave���
            {
                answer[count++] = idNick.get(splitR[i][1])+"���� �������ϴ�.";
            }
        }
        return answer;
    }
}