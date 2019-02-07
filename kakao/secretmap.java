package kakao;

public class secretmap {
    public static void main(String[] args) {
        int n = 5;
        int[] arr1 = { 9, 20, 28, 18, 11 };
        int[] arr2 = { 30, 1, 21, 17, 28 };

        String[] map = solution(n, arr1, arr2);

        for (int i = 0; i < n; i++) {
            System.out.println(map[i]);
        }
    }

static String[] solution(int n,int[] arr1,int[] arr2){
    String[] answer = new String[n];

    for(int i=0;i<n;i++){

        answer[i] = convert(arr1[i]|arr2[i],n); // arr1|arr2이 뜻이 무슨뜻인지 알아오기 비트연산인가?
        //대응되는 비트 중에서 하나라도 1이면 1을 반환함 (비트 OR 연산)
    }
    return answer;
}

    static String convert(int num, int n) {
        StringBuilder sb = new StringBuilder();
        char[] binaryStr = Integer.toBinaryString(num).toCharArray();

        int length = n - binaryStr.length;
        for(int i=0;i<length;i++){
            sb.append(" ");
        }
        for(char c : binaryStr){
            if(c=='1')sb.append("#");
            else if(c=='0') sb.append(" ");
        }
        return sb.toString();
    }
}