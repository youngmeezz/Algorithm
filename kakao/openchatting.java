package kakao;

import java.util.*;

public class openchatting{
    public static void main(String[] args){
        //String배열 arr을 선언하고 여기는 main함수라서 값을 넣는곳
        String[] arr = solution(new String[]{"Enter uid1234 Muzi",
                                             "Enter uid4567 Prodo",
                                             "Leave uid1234 ",
                                             "Enter uid1234 Prodo",
                                             "Change uid4567 Ryan"});
        for(int i=0;i<arr.length;++i)
            System.out.println(arr[i]);
    }

    public static String[] solution(String[] record){
        String[] answer = null; //답을 구할 String 배열 선언
        HashMap<String,String> idNick = new HashMap<String, String>();  //HashMap은 key값과 Value값을 String변수로 두고idNick을 선언한다.
        String[][] splitR = new String[record.length][2]; //String 2차원배열 splitR을 선언시켜서 길이를 행으로 두고 0,1,2 열을 선언시킨다.
        int events =0; //events는 여기서 행을 의미한다.
        for(int i=0;i< splitR.length;++i)
        {
            // int num[][];
            // num[0][0] = 1;
            // num[0][1] = 2;
            // ==> num[0] = {1, 2};
            splitR[events] = record[i].split(" ");//splitR에서 events는 0일떄 첫행을 의미하고 
            //record[0]은 이제 split가 공백으로 짤라지면서 Enter값
            //record[1]은 uid1234
            //record[2]은 Muzi

            //지금 현재 if랑 if로 이루어져 있기 때문에 두번 검사를 해준다. 밑에 있는 if는 events++로 행을 하나 증가시켜줘서 그 다음행을 계산해준다.
            if(splitR[events][0].equals("Enter")||splitR[events][0].equals("Change"))//0행의 0열일때는 Enter,Change,Leave값만 들어가므로 이값과 같은지 체크
            {
                idNick.put(splitR[events][1],splitR[events][2]);//put은 hash함수에서 값을 넣어주는 것으로 key값과 value값을 한번에 써준다.
                //여기서 key값은 uid1234 value값이 prodo이다.
                //Enter나 Change가 다시 들어갈때 uid인 키값이 같으면 value값이 닉네임이 다르면 덮여씌워진다.
            }
            if(splitR[events][0].equals("Enter")||splitR[events][0].equals("Leave"))
            {   
                events++;//행을 하나 증가시켜준다. enter랑 leave는 값을 바꿔주는게  아니니까 그냥 행만 증가시켜주고
                //change는 muzi에서 prodo로 바꿔주니까 위에 값들도 다 바꿔줘야되서 밑에 
            }
        }
        answer = new String[events];
        int count =0;
        for(int i=0;i<events;++i)
        {
            if(splitR[i][0].equals("Enter"))//만약에 첫행의 첫열이 Enter라면
            {
                answer[count++] = idNick.get(splitR[i][1])+"님이 들어왔습니다.";//get은 hash함수에서 key값이 uid1234만 주어지면 value값 prodo로 출력을 해주는 것이다.따라서 키값만 받아오면됨

            }
            else if(splitR[i][0].equals("Leave"))//만약에 첫행의 첫열이 Leave라면
            {
                answer[count++] = idNick.get(splitR[i][1])+"님이 나갔습니다.";
            }
        }
        return answer;
    }
}