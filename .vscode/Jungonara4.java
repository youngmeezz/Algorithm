/*
import java.util.*;

public class Jungonara4{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        StringBuffer con = new StringBuffer();
        String s1 = new String();
        String s2 = new String();
       
        //int i,n,len1,len2;

        s1 = sc.next();

        for(int i=0;i<=s1.length();i++){
            s2 = s1.charAt(i);
            for(int j=0;j<s)
        }

        con.append(s1);
        con.append(s2);

        System.out.print(con);
        
    }
}
*/

//Please don't change class name 'Main'
import java.util.*;
class Main {

  public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			String str1 = new String();
		  StringBuilder sb = new StringBuilder();
			
			str1 = sc.next();
			
		for(int i=0,length = str1.length()-1;i<str1.length();i++,length--){
				
				sb.append(str1.charAt(i));
				sb.append(str1.charAt(length));
                
                if(i+1>=str1.length()/2) {
                    if(str1.length()%2 == 1) {
                        sb.append(str1.charAt(i+1));
                    }
                    break;
                }
  }
		System.out.print(sb);
}
}

/*
지뢰찾기
제출완료
2019.03.10ㅣ18:36:59
배열 합치기
제출완료
2019.03.10ㅣ16:36:52
[템플릿] 사분면
제출완료
2019.03.10ㅣ16:22:39
[템플릿] 문자열 번갈아 출력하기
제출완료
2019.03.10ㅣ17:05:19
*/