package programmers;

public class pretest6{

public static void main(String[] args){

    int[] sticker = {14,6,5,11,3,9,2,10}; //36
    System.out.println(solution(sticker));
}
public static int solution(int[] sticker){
    
    int answer =0;

    int len = sticker.length;
    if(len==1) return sticker[0];

    int[] dp1 = new int[100001];
    int[] dp2 = new int[100001];

    //1번 스티커 뜯을 경우
    dp1[0] = sticker[0];
    dp1[1] = dp1[0];

    for(int i=2;i<len-1;i++){
        dp1[i] = Math.max(dp1[i-1],dp1[i-2] + sticker[i]);
    }

    //1번 스티커 안뜯을 경우
    dp2[0] = 0;
    dp2[1] = sticker[1];

    for(int i=2;i<len;i++){
        dp2[i] = Math.max(dp2[i-1],dp2[i-2] + sticker[i]);
    }

    return Math.max(dp1[len-2],dp2[len-1]);
    }
}