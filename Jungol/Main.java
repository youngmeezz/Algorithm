package Jungol;

//import java.util.Scanner;
import java.util.*;

//33부터 127 까지의 숫자를 계속 입력받아 입력받은 숫자의 아스키코드에 해당하는 문자를 출력하다가 범위를 벗어나는 입력이 들어오면 종료하는 프로그램을 작성하시오.
/*
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        while (true) {
            System.out.print("ASCII code =? ");
            n = sc.nextInt();
            
            if (n < 33 || n > 127)

                break;
            System.out.println((char) n);
            // System.out.printf("%c\n",n);->메모리랑 시간 좀 더 많이 소모9MB,132ms (char)8MB 128ms으로
            // 형변환이 더 낫다

        }
    }
}
*/
/*
 * while(n>=33&&n<=127)
 * 
 * { System.out.print("ASCII code =?"); n = input.nextInt();
 * System.out.write(n); System.out.println(""); }}}
 * 
 * while(true){ Scanner sc = new
 * Scanner(System.in);System.out.printf("ASCII code =? "); int num =
 * sc.nextInt();if(num<33||num>127)break;System.out.printf("%c\n",num);
 * 
 * }}}
 */

// 문자열을 입력받은 뒤 그 문자열을 이어서 두 번 출력하는 프로그램을 작성하시오.
// 문자열의 길이는 100이하이다.

/*
  public class Main{ 
      public static void main(String[] args){ 
          Scanner input = new Scanner(System.in);
           String n = input.nextLine(); 
           System.out.println(n+n);
  } 
}
*/

// 문자열을 “Hong Gil Dong”으로 초기화 한 후 3번부터 6번까지의 문자를 차례로 출력하시오.
/*
public class Main { 
    public static void main(String[] args) { 
            int str[][] = new int[10][10];
            int[][] str1 = new int[10][10];
            String str2[] = new String[8];
            String[] str3 = new String[8];
            int str4 = new Integer(1);
            int str41 = new Integer("1");
            Integer str42 = new Integer("1");
            Integer str43 = new Integer(1);
            Integer str44 = new Integer('1'); //->49인이유->질문 아스키코드
            int str45 = new Integer('1');
            int str46 = new int(1); //Int은 "자료형"이기 때문에 선언과 초기화를 한번에 못해준다.
            int str47 =1;//초기화
            System.out.println(str4);
            System.out.println(str41);
            System.out.println(str42);
            System.out.println(str43);
            System.out.println(str44);
            System.out.println(str45);
          String str5 = new String("Hong Gil Dong"); //String은 "객체" 이기때문에 선언과 초기화를 해줄수 있지만
           System.out.printf(str5.substring(3, 7)); //문자열 추출 substring은 3<=문자열<7 까지 해야만 3~6번째 문자를 따로 출력 가능
  
        }
 }
 */

//문자열을 입력받고 정수를 입력 받아서 문자열의 입력받은 정수의 맨 뒤부터 정수만큼 출력하는 프로그램을 작성하시오.

//만약 입력받은 정수가 문자열의 길이보다 크다면 맨 뒤부터 맨 처음까지 모두 출력한다.

//(문자열 길이는 최대 100자 이하이다. )

//입력 : korea 3

//출력 : aer
/*
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();//nextLine하면 입력이 한번 엔터 치고 가는데 그러면 korea 엔터 3이 되서 입력이 한번에 안된다. 그래서 next만쓰면 그 뒤에 스페이스 하고 바로 입력가능하다.
        int n = sc.nextInt();

        if(n>str.length()){//만약 입력받은 정수가 문자열의 길이보다 크다면
            n = str.length();// 맨 뒤부터 맨 처음까지 모두 출력한다.(입력받은 정수가 이제 그 문자열 전체 길이가 되게 해준다)
        }
        
        for(int i=0;i<n;i++){
            System.out.print(str.charAt(str.length()-1-i));//charAt은 이제 문자열을 배열화 시켜서 하나씩 넣어지는 것이기 때문에 0부터시작한다
            //->그래서 str.length()-1을 해야만 문자열이 5개였을때 0부터4까지만 배열인덱스가 있기 때문에 -1을 해주는 것이고 i는 1부터 증가하는 값이니까
            //뒤에 문자열 부터 -1,-2해주면서 값을 출력해주게된다.
        }
    }
}
*/
/*
import java.util.Scanner;
//두 개의 문자열을 입력받아서 두 문자열의 길이의 합을 출력하는 프로그램을 작성하시오.

//각 문자열의 길이는 20자 미만이다.
public class Main{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2= sc.next();
        System.out.println(str1.length()+str2.length());

    }
}
*/
//문자를 입력받아 알파벳 문자인 경우에는 그대로 출력하고 숫자인 경우는 아스키코드값을 출력하는 작업을 반복하다가 기타의 문자가 입력되면 종료하는 프로그램을 작성하시오.
//* 입출력예에서 진한글씨가 출력
/*
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String n;
        while(true){
            n = input.next();
            char ch = n.charAt(0);
            int code = (int)ch;

            if(code>=65 && code<=90 || code>=97 && code<=122){
                System.out.println(ch);
            }
            else{
                try{
                   int a = Integer.parseInt(n);
                    System.out.println(code);
                }
                catch(NumberFormatException e){
                    break;
                }
            }
        }
    }
}
*/
//문자열을 입력받아 알파벳 문자만 모두 대문자로 출력하는 프로그램을 작성하시오. 
//문자열의 길이는 100이하이다.
/*
import java.util.Scanner;
public class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        char []arr = new char[100];
        int code;

        for(int i=0;i<n.length();i++){
            arr[i] = n.charAt(i);//배열에 문자열 문자 하나씩 저장
            code = (int)arr[i];//문자로 저장된 배열arr을 int형으로 형변환해준다.(그 문자의 아스키코드를 정해줌)
            //아스키코드 97부터 122은 소문자여서 -32를 해주어야 한다.
            if(code>=97 && code<=122){
                System.out.write(code-32);//매개변수로 주어진 int값에서 끝에있는 1byte만 출력 스트림으로 보냅니다.
                //매개변수가 int타입이라서 4byte전부를 출력스트림으로 보내는것으로 오해 말고
                //철자를 하나씩 보내기위해 write함수를 쓴것을 이해하자
                System.out.flush();//버퍼에 남은 데이터를 모두 출력시키고 버퍼를 비우는 역할
            }
            //아스키코드code 65부터 90은 대문자이다
            else if(code>=65 && code<=90){
                S          ystem.out.println(arr[i]);
            }
        }
    }
}
*/
//공백을 포함한 100글자 이하의 문자열을 입력받아 문장을 이루는 단어의 개수를 출력하는 프로그램을 작성하시오.
//import java.util.Scanner;

//나의 풀이에서 잘못된점 몰랐던 점 찾기
/*
public class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
     
        String n = sc.next();
        String[] splitR = new String[n.length()];
        //문자열을 자르는 함수가 딱히 없고 배열로 넣어야만 계산이 좋다?
        int events =0;
        for(int i =0;i<n.length();i++){
            splitR[events] = n[i].split(" ");//문장을 공백으로 짜르기
            if(splitR == NULL)//잘려지는게 없어서 문장이 끝나면 break로 끝내기
            break;
        }
        System.out.println(i);//나와서 지금까지 나왔던 단어 나타내기
    }
}
*/
//정답풀이
/*
public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        int num=1;
        for(int i=0;i<str.length();i++){//for문은 문장의 길이만큼은 돌려야 한다.
            if(str.charAt(i)== ' ')//한철자한철자씩 비교하다가 빈칸 등장시 num하나씩 더해주면 그게 앞에까지가 문장이었다는 뜻
            {
                num++;
            }
        }
        System.out.println(num);
    }
}
*/
//문자열을 입력 받아서 문자수만큼 오른쪽으로 한 바퀴 회전하여 출력하는 프로그램을 작성하시오. 문자열의 길이는 100이하이다.
import java.util.Scanner;

//나의 풀이 틀린점 찾기
/*
public class Main{
    public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();

            for(int i=0;i<str.length();i++)
            {
                str.charAt(i) = str.charAt(i+1);
            }
            System.out.println(str);
    }
}
*/
/*
public class Main{
    public static String str;
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        str = input.next();

        //처음 시작은 가장 뒤 글자먼저
        int index = str.length()-1;
        int length =0;

        //index가 0이 될때까지 출력
        while(index>=0){
            printStr(index,length);
            index--;//인덱스를 계속 줄여주면서 출력해야지 0이 될때가 나올 것이고 여기서 index가 -1이 되면 문자열 길이보다 작아지므로 완전히 한바퀴 돈게 성립
            //0까지가 ABCDEFG에서 다시 ABCDEFG로 간 꼴
        }
    }
    public static void printStr(int index,int length){
        while(length<str.length()){//length는 str.length문자열 길이보다 작아야 (밑에서 계속 1씩 더해주고 있음) while문을 돈다. 
            if(index>=str.length()){//만약에 index가 str.length문자열길이보다 크면 index를 0으로 해준다.다시 처음으로 돌아가야 하기 떄문에(앞문장으로돌아감 여기가 핵심)
                index =0;
            }
            System.out.print(str.charAt(index));//index는이제 문자갯수를 말하지 0,1,2,3,4,5,6(뒤에서 부터 시작 위에 초기화str.length()-1때문에) 배열에 넣어진거 하나씩 출력
            index++;
            length++;//길이를 계속 증가해줘야지 길이가 문자열 길이보다 작을떄 while문을 빠져나올 수 있다.
        }
        System.out.println("");
    }
}
*/
//import java.util.Scanner;
//영문자 두 개를 입력 받아서 각각의 아스키코드의 합과 차를 출력하는 프로그램을 작성하시오.
//나의 풀이 잘못된 것 찾기
/*
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        char a = sc.next();
        char b = sc.next();

        System.out.print((int)(a-b);
    }
}
*/
/*
public class Main{
   // public static String str;//main함수에서 영향을 받지 않기 위해 정적으로 따로 String 문자를 선언해 줍니다.
   //static선언을 붙이면 클래스에 종속되지 않고 단 하나만 생성이 되어 사용이 가능합니다.
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();//우선 입력받을떄는 string형으로 받아줘야 합니다.
        String str2 = sc.next();
        
        char c1 = str1.charAt(0);//그 이후에 첫번째 문자열을 문자형 즉 char형으로 바꾸어줍니다.  
        char c2 = str2.charAt(0);//이유는 첫 문자 하나만 알고 싶을뿐만아니라 int형으로 형변환할때 char형을 int형을 하기쉬워서

        //string을 int형으로 형변환하기 어렵다 그니까 문자 하나만 보고 판단해야하는데 그게 힘들다.
        //string은 객체형이라서 문자 자체를 하나로 보고 char형은 문자에 한자한자를 보게된다.
        System.out.println((int)c1 + (int)c2 + " ");//
        if((int)c1>=(int)c2){
            System.out.println((int)c1-(int)c2);
        }else{
            System.out.println((int)c2-(int)c1);
        }
    }
}
*/
//5개 이상 100개 이하의 문자로 된 단어를 입력받은 후 앞에서부터 5자를 출력하는 프로그램을 작성하시오.
/*
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String str = sc.next();
        
        for(int i=0;i<5;i++)
        {
            System.out.print(str.charAt(i));
        }

    }
}
*/
//100개 이하의 문자열을 입력받아서 영문자와 숫자만 출력하되 영문자는 모두 소문자로 출력하는 프로그램을 작성하시오.
//나의 풀이
/*
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        int num = sc.nextInt();

        System.out.println(str.toLowerCase());
        System.out.println(num);
    }
}
*/
/*
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        char c;//문자형c
        int n;//정수형n

        for(int i=0;i<str.length();i++){
            c = str.charAt(i);//string형 str변수를 charAt을 통해 한문자한문자씩 문자형 c에 넣어준다.
            n =(int)c; //문자형 c를 다시 int형 n에 대입시킨다?>이러면 아스키코드로 변환이 가능한건가..이게 바로 형변화인가
            //굳이 앞에 int안써도 저절로 형변환 되는듯 char보다 int가 상위라서 n의 말을 들음

            //숫자거나 알파벳 소문자면 그냥 출력
            if(n>=48 && n<=57 || n>=97 && n<=122){
                System.out.print(c);
            }else if(n>=65 && n<=90){ //이 범위 없는 문자(@,.)면 그냥 날려보냄
                //대문자면 소문자로 바꾸어 출력
                System.out.write(n+32);
                System.out.flush();
            }
        }
    }
}
*/
//단어와 문자 한 개를 입력받아서 단어에서 입력받은 문자와 같은 문자를 찾아서 그 위치를 출력하는 프로그램을 작성하시오.
//단어에서 첫 번째 문자의 위치는 0으로 하고 찾는 문자가 여러 개일 때는 처음 나오는 위치를 출력한다.
//만약 찾는 문자가 없을 때는 "No"라고 출력한다. 대소문자는 구별되며 단어는 100자 이하이다.
/*
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String str  = input.next();
        String str2 = input.next();
        char c = str2.charAt(0);//우선 두번쨰 입력받은 한자리수 첫번쨰 문자 c에다가 저장해두기

        int n = -1;//n이 0일때는 첫번쨰 문자 위치이기떄문에 0으로 초기화 할 수 없다.
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == c){
                n = i;//여기는 위치를 표시하기떄문에 배열의 인덱스 값을 표시하면 됩니다. 
                //여기서 n(인덱스위치)이 문자의 위치가 되고 c(문자)는 해당문자가 그 위치에 있는지 확인하기 위함입니다.
                break;//그리고 break이후 for문 나온다음에 
                //문자가 여러개 즉 coerocdl 이러면 c가 0번쨰 5번쨰니까 0번쨰 출력되기 위해서 break로 나가준다.
            }
        }
        //n이 이제 0이상이라면 그 위치가 되니까 위치n을 출력해주고 0보다 작으면 No를 출력해준다.
        if(n<0){
            System.out.println("No");
        }else{
            System.out.println(n);
        }
    }
}
*/
//두 개의 단어를 입력받아서 길이가 긴 단어의 문자 개수를 출력하는 프로그램을 작성하시오. 
//단어의 길이는 100자 이하다.
//내 풀이
/*
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        int max=0;

        for(int i=0;i<100;i++){
            
           max = str1.length()>str2.length() ? str1.length() : str2.length();
        }
        System.out.print(max);
    }
}
*/
//문자열(100자 이하)을 입력받은 후 정수를 입력받아 해당위치의 문자를 제거하고 출력하는 작업을 반복하다가 문자 1개가 남으면 종료하는 프로그램을 작성하시오.
//첫 번째 문자의 위치는 1이며 만약 입력받은 번호가 문자열의 길이 이상이면 마지막 문자를 제거한다.
/*
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //String 함수중에 제거하는 건 없던거 같음
        String str = sc.next();
        //ArrayList를 사용하는 방법을 잘 알아두기 strList로 만들어서 구함
        List<Character> strList = new ArrayList<>();

        //List라는 자료구조를 사용하면 변수명 strList.add를 통해 str문자열을 하나씩넣어준다.
        for(int i=0;i<str.length();i++){
            strList.add(str.charAt(i));
        }


        while(true){
            int n=sc.nextInt();
            //이제 length대신 size로 strList의 사이즈가 n보다 크거나 같을때 즉,문자가 제거된게 없을떄 그대로 출력???
            //만약 입력받은 번호가 문자열의 길이 이상이면 마지막 문자를 제거한다. 있는 문자만 출력한다.
            if(n>=strList.size()){
                n = strList.size();
        }
        //n이 해당위치 입력받은 문자인데 배열처럼 0부터시작해서 인덱스는 원래 위치에서 -1해준값을 넣어줘서 그 위치 문자 제거
        strList.remove(n-1);
        for(int i=0;i<strList.size();i++){
            System.out.print(strList.get(i));//위에서 제거됬기떄문에 사이즈도 strList도 하나 줄어듬 그래서 get을 이용해서 다시 받음
        }
        System.out.println();
        if(strList.size() == 1){//문자 1개가 남으면 종료
            break;
        }
    }
}
}
//StringBuilder --> charAt(0) 자바 레퍼런스 사용해서 풀이하기
*/
//공백을 포함한 문자열을 입력받아 다음과 같이 분리하여 번호와 함께 출력하는 프로그램을 작성하시오. 
//문자열의 길이는 100자 이하이다.
/*
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String str = input.nextLine();
        int num=1;
        char c;

        System.out.print(num+". ");//첫번쨰 항을 위함 "1. "이거 만들어줌
        for(int i=0;i<str.length();i++){
            c = str.charAt(i);
            if(c==' '){//공백이 보일시에
                System.out.println("");//한칸을 띄고
                num++;//앞에 숫자 더해주고
                System.out.print(num+". ");//위에서 처럼 "2. "이렇게 만들어줌
            }else{
                System.out.print(c);//공백 안보이면 그냥 그대로 차례차례 한문자씩 출력
            }
        }
    }
}
*/
//5개의 단어를 입력받아 모든 단어를 입력받은 역순으로 출력하는 프로그램을 작성하시오. 
//각 단어의 길이는 30이하이다.
//나의 풀이
/*
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
 

        for(int i=str.length();i>=1;i--)
        {
            String str = sc.next();
            System.out.println(str);
        }
    }
}
*/
/*
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        //ArrayList로 풀면 단어들을 리스트로 저장할 수 있다는 장점이 있다.
        List<String> wordList = new ArrayList<>();

        //5개의 단어만 입력받으므로 wordList.add를 통해 (input.next())구문으로 입력받는다.
        for(int i=0;i<5;i++){
            wordList.add(input.next());
        }
        //5개의 단어를 역순으로 출력하기위해 4부터시작해서 0으로 가는 리스트배열을 선택해주면서 wordList.get()함수구문으로 출력한다.
        for(int i=4;i>=0;i--)
        {
            System.out.println(wordList.get(i));
        }
    }
}
*/
//공백을 포함한 문장을 입력 받아서 홀수 번째 단어를 차례로 출력하는 프로그램을 작성하시오.
//문장의 길이는 100자 이하이다.
/*
import java.util.Scanner;

public class Main {
    public boolean solution(int[] arrA, int[] arrB) {
        boolean answer = true;
        //arrA를 회전해 arrB로 만들 수 있으면 true를, 그렇지 않으면 false를 return 
        int leng = arrA.length;
        int temp = arrA[arrA.length-1];
        boolean[] cu = new boolean[leng+1];
        
        for(int i =arrA.length-1;i>=1;i--){
            int temp1 = arrA[i];
            if(temp > leng) return false;
            arrA[i] = arrA[i-1];
            /*
           // if(arrA[i] == arrB[i])
            //return true;
            //else
            //return false;
            }
            
            arrA[0] = temp;
       return answer;
        }
    } // 5, 1, 2, 3, 4
}
*/
/*
import java.util.Scanner;

public class Main {
    public boolean solution(int[] arrA, int[] arrB) {
        boolean answer = true;
        //arrA를 회전해 arrB로 만들 수 있으면 true를, 그렇지 않으면 false를 return 
        int temp = arrB[arrA.length-1];
        int [][]bhyoyul = new int[arrA.length][arrA.length];
        
        for(int i =arrA.length-1;i>=1;i--){
            arrA[i] = arrA[i-1];
            if(arrB.length != arrA.length) return false;
           // if(arrA[i] == arrB[i])
            //return true;
            //else
            //return false;
            }
            arrB[0] = temp;
       return answer;
       
    } // 5, 1, 2, 3, 4
}
*/
/*
public class Main{
    public static int[] arrA;
    //public static String arrB[];
    public static String solution(int[] arrA, int[] arrB) {
        
        //boolean answer = true;
        //return answer;

        //처음 시작은 가장 뒤 글자먼저
        int index = arrA.length-1;
        int length =0;

        //index가 0이 될때까지 출력
        while(true){
            if(index>=0){
            printStr(index,length);
            index--;//인덱스를 계속 줄여주면서 출력해야지 0이 될때가 나올 것이고 여기서 index가 -1이 되면 문자열 길이보다 작아지므로 완전히 한바퀴 돈게 성립
            //0까지가 ABCDEFG에서 다시 ABCDEFG로 간 꼴
            return "true";
            }
            else{
                return "false";
            }
        }
    }
    public static void printStr(int index,int length){
        while(length<arrA.length){//length는 str.length문자열 길이보다 작아야 (밑에서 계속 1씩 더해주고 있음) while문을 돈다. 
            if(index>=arrA.length){//만약에 index가 str.length문자열길이보다 크면 index를 0으로 해준다.다시 처음으로 돌아가야 하기 떄문에(앞문장으로돌아감 여기가 핵심)
                index =0;
            }
          //  System.out.print(arrA[index]);//index는이제 문자갯수를 말하지 0,1,2,3,4,5,6(뒤에서 부터 시작 위에 초기화str.length()-1때문에) 배열에 넣어진거 하나씩 출력
            index++;
            length++;//길이를 계속 증가해줘야지 길이가 문자열 길이보다 작을떄 while문을 빠져나올 수 있다.
        }
       // System.out.println("");
    }

    public static void main(String[] args){
        //String배열 arr을 선언하고 여기는 main함수라서 값을 넣는곳
        int[] arrA = {7, 8, 10};
        int[] arrB = {10, 7, 8};
    //[7, 8, 10]	[10, 7, 8]=>true
    //[4, 3, 2, 1]	[5, 4, 1, 2]=>false
    //Solution sol = new Solution();
        System.out.println(solution(arrA,arrB));
    }
}
*/
//공백을 포함한 문장을 입력 받아서 홀수 번째 단어를 차례로 출력하는 프로그램을 작성하시오.
//문장의 길이는 100자 이하이다.
/*
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        //ArrayList를 통해 wordList를 만들자
        List<String> wordList = new ArrayList<>();

        //StringTokenizer로 문장을 공백으로 잘라서 구분하자
        StringTokenizer st = new StringTokenizer(sentence," ");
        //Token이 더 있을떄까지 wordList를 더해주면서 Token화 시킨다-> 그니까 문장에 단어들을 토큰화 시켜서 넣어준다. 
        while(st.hasMoreTokens()){
            wordList.add(st.nextToken());
        }
        int index =0;
        //인덱스가 0부터시작해서 2,4,->이것이 배열의 홀수 번쨰이다. 따라서 홀수번째 출력하면서 wordList.size만큼 돌고
        //wordList.get을 통해 단어를 받아온다.
        while(index<wordList.size()){
            System.out.println(wordList.get(index));
            index +=2;
        }
    }
}
*/
//20개 이하의 문자로 이루어진 10개의 단어와 한 개의 문자를 입력받아서 마지막으로 입력받은 문자로 끝나는 단어를 모두 출력하는 프로그램을 작성하시오.
/*
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        List<String> wordList = new ArrayList<>();

        for(int i=0;i<10;i++){
            wordList.add(sc.next());
        }
        String str = sc.next();
        char c= str.charAt(0);//첫번쨰 문자로 우선 초기화 저장

        int num=0;//마지막 글자 인덱스 저장
        for(int i=0;i<10;i++){
            num = wordList.get(i).length()-1; //num은 지금까지 입력된 단어들의 마지막 글자의 인덱스를 저장한다.
            if(wordList.get(i).charAt(num) == c){ //num은 숫자 인덱스 자체일뿐이므로charAt을 통해 문자 자체를 넣고 입력된 한문자c와 비교하여 같으면 출력
                System.out.println(wordList.get(i));
            }
        }
    }
}
*/
//
//문자열을 선언하고 다음과 같이 "Hong Gil Dong"이라는 이름을 복사하여 저장한 후 출력하는 프로그램을 작성하시오.
/*
import java.util.*;
public class Main{
    public static void main(String[] args){
        
        String str = "Hong Gil Dong";
        String str1 = new String(str);

        System.out.println(str1);
    }
}
*/
//20개 이하의 문자열로 된 이름을 입력받아서 그 뒤에 "fighting"을 붙여서 저장하고 출력하는 프로그램을 작성하시오.
/*
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
   
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        String str1 = "fighting";
        String str2 = new String(str1);
        System.out.println(str+str1);
    }
}
*/
//20자 이하인 두 개의 문자열을 입력받아 첫 번째 문자열의 앞부분 두자를 두 번째 문자열의 앞부분에 복사하고 다시 뒷부분에 이어 붙여서 저장한 후 두 번째 문자열을 출력하는 프로그램을 작성하시오.
/*
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String n1 = sc.next();
        String n2 = sc.next();

        n2 = n1.substring(0,2) + n2.substring(2);//앞문자열 0,1까지 문자 추출하고 뒷 문자열2부터 다시 이어서 시작하기떄문에
        n2 += n1.substring(0,2);//앞에 빠진 0,1두 문자 뒤에 이어 붙이기 위해 존재

        System.out.println(n2);
    }
}
*/
//100개 이하의 문자로 구성된 한 개의 문자열을 입력받아서 그 문자열에 문자 'c'와 문자열 "ab"의 포함여부를 "Yes", "No"로 구분하여 출력예처럼 출력하는 프로그램을 작성하시오.
/*
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int len = str.length();
        int i,j;//여기서 초기화를 안시키면 
        //len-1하면 4이고 len은 5이니까 0,1,2,3,4 ->값이다.
        for(i=0;i<len;i++){ 
            if(str.charAt(i) == 'c'){
                System.out.print("Yes ");
                break;
            }
        }
        if(i == len) //문자열 길이 자체와 같게 되면 없다는 의미니까 No출력
            System.out.print("No ");

        for(j=0;j<len-1;j++){
            if(str.charAt(j) == 'a' && str.charAt(j+1) == 'b'){
                System.out.print("Yes ");
                break;
            }
        }
    if(j == len){
        System.out.print("No ");
       // System.out.println();
    }
    }
}
*/
//->c언어 같은 스타일이라서 java는 str.find로 쓰는게 좋다
//자바 레퍼런스 ->str.contains로 찾기 contains찾는게 중요하다이미구현되어있는거 쓰는것두 좋당
//온라인 코딩테스트때 사용

/*
import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		boolean c_str = false, ab_str = false;
		/*
		for(int i=0;i<str.length();i++){
			if(str.charAt(i) == 'c'){
				c_str = true;
			} else if(str.charAt(i) == 'a' && i + 1 <= str.length() && str.charAt(i+1) == 'b'){
				ab_str = true;
			}
		}
        */
        /*
		if(str.contains("c")) c_str = true;
		if(str.contains("ab")) ab_str = true;

		if(c_str) System.out.print("Yes ");
		else System.out.print("No ");

		if(ab_str) System.out.print("Yes");
		else System.out.print("No");
	}
}
*/
//세 개의 단어를 입력받아 아스키코드(사전) 순으로 가장 먼저 나오는 단어를 출력하는 프로그램을 작성하시오.
//각 단어의 길이는 1이상 10 이하이다.
/*
import java.util.*;

public class Main{
    public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            //스트링 배열을 써볼줄 알아야한다.
            String[] str = new String[3];
            String temp;
            int i,j;

            for(i=0;i<3;i++)
                str[i] = sc.next();
            
            for(i=0;i<2;i++){
                for(j=i+1;j<3;j++){
                    //역순출력 이해 안감 질문->compareTo함수 a>b이면 양수를 반환->이럼 안되지 아스키코드  1 2 3 순이라고 하면 1-2하면 -1음수가 나와야지
                    //역순이 안될텐데 음수가 나오면 사전순이 맞지만 >0 이면 양수가 나온 것이기 떄문에 역순 취해준다.
                    //string배열(char형과 같은 의미)이 알아서 숫자(아스키코드)와 비교하면서 하기 떄문에 굳이 형변환 할 필요가 없다. 
                    if(str[i].compareTo(str[j])>0){
                        temp = str[i];
                        str[i] = str[j];
                        str[j] = temp;
                    }
                }
            }
            System.out.println(str[0]);

        }
    }
*/
/*
import java.util.*;
//5개의 문자열을 입력받아 문자열 크기(아스키코드) 역순으로 정렬하여 출력하는 프로그램을 작성하시오.
//아스키코드 역순이라는 말이 잘 이해가지 않음
 //아니다 위랑 말 안된다 다시 질문하기
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String [] str = new String[5];
        String temp;
        int i,j;

        for(i=0;i<5;i++)
            str[i] = sc.next();
        
        for(i=0;i<4;i++){
            for(j=i+1;j<5;j++){
                //compareTo함수 a<b이면 음수를 반환(a=b이면 0을 그대로 반환)-> 아스키코드  3 2 1  순이라고 하면 3-2하면 1양수가 나와서 
                    //역순이 안될텐데 양수나오면 순서가 역순 상태 임이 맞지만 아래와 같이 <0 이면 음수가 나온것이기 때문에 역순 취해준다.
                    //string배열(char형과 같은 의미)이 알아서 숫자(아스키코드)와 비교하면서 하기 떄문에 굳이 형변환 할 필요가 없다. 
                if(str[i].compareTo(str[j])<0){
                    temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
        }
        for(i=0;i<5;i++)
        System.out.println(str[i]);
    }
}
*/
//한 개의 문자열을 입력받아서 첫 줄에는 정수로 변환하여 2배한 값을 출력하고, 다음 줄에는 실수로 변환한 값을 반올림하여 소수 둘째자리까지 출력하는 프로그램을 작성하시오.
//내가 한 풀이에서 틀린점 찾기
/*
public class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        //정수로 변환하는 것
        int a = parseInt(str);
        //실수로 변환한 값을 반올림하여 소수 둘째자리까지
        int b = parseFloat(str);

        System.out.println("%d %.2lf",a,b);
    }
}
*/
/*
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str1,str2,str3;
        StringBuilder sb = new StringBuilder();
        StringBuilder st = new StringBuilder();

        int su1,len,i;
        double su2;

        str1 = sc.next();
        len = str1.length();
        for(i=0;i<len;i++){
            if(str1.charAt(i) == '.'){
                break;
            }
            sb.append(str1.charAt(i));
        }
        su1 = Integer.parseInt(sb.toString());
        System.out.println(su1*2);

        for(i=0;i<len;i++){
            if(str1.charAt(i) == '.'){
                st.append(str1.charAt(i));
            }
            else if(str1.charAt(i)>='0' && str1.charAt(i) <='9'){
                st.append(str1.charAt(i));
            }
            else{
                break;
            }
        }
        su2 = Double.parseDouble(st.toString());
        System.out.printf("%.2f\n",su2);
    }
}
*/
//5개의 정수를 입력받아 모두 붙여서 문자열로 저장한 후 세 자씩 나누어서 출력하는 프로그램을 작성하시오.
//내풀이
/*
import java.util.Scanner;
import java.util.StringTokenizer;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int [] arr = new int[5];
        for(int i=0;i<4;i++){
            arr[i] = sc.nextInt();
        }
        String str = arr.toString();
        StringTokenizer st = new StringTokenizer(str);

        String str2 = st.nextToken(str,substring(0,3));

        System.out.println(str2);
    }
}
*/
/*
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); 
        StringBuilder str = new StringBuilder(); //string을 String으로 선언하는게 아니라 String과 비슷한 StringBuilder를 만들어줌
        int [] num = new int[5];//배열을 만들어줘서 정수값 넣음
        int su1,len,i,cnt;

        for(i=0;i<5;i++){
            num[i] = sc.nextInt(); //우선 배열안에 넣을 정수 값들을 입력해준다.
        }
        for(i=0;i<5;i++){
            str.append(num[i]);//정수값을이어붙이려고 stringbuilder사용했고 이거가 이제 int형대신 문자열로 붙여넣어짐
        }
        len = str.length();//문자열의 길이

        cnt=0;//갯수셀것 3개씩 자를거라서
        for(i=0;i<len;i++){
            System.out.print(str.charAt(i));//길이만큼 한글자한글자 출력해주고
            cnt++;//개수더한다.
            if(cnt==3){
                cnt=0;//카운트를 0으로 다시 초기화해준다.
                System.out.println();//숫자가 3이되면 엔터키를 해준다.
            }
        }
        System.out.println();
    }
}
*/
//공백을 포함한 문자열을 입력받아 각 단어로 분리하여 문자열 배열에 저장한 후 입력순서의 반대 순서로 출력하는 프로그램을 작성하시오. 문자열의 길이는 100자 이하이다.
//내 풀이
/*
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        StringTokenizer st = new StringTokenizer(str);
        
        String str2 = st.nextToken(str," ");
        
        int len = str.length();
        for(int i=0;i<str.length();i++){

            String str3[] = new String[i]; 
        }

        for(int str.length();;i--){
            System.out.println(str3);
        }
    }
}
*/
/*
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str;
        char[][] ch = new char[50][20];
        int i,len,x,y;
        str = sc.nextLine();
        len = str.length();

        x=0;
        y=0;
        for(i=0;i<len;i++){
            if(str.charAt(i) == ' '){//공백일경우
                ch[x][y] = '\0';//문자열 배열에 공백 저장 아무것도 없는 상태 x값만 증가시켜주고 y값은 0
                x++;
                y=0;
                continue;
            }
            else{//공백아닐경우
                ch[x][y++] = str.charAt(i);//문자열배열에 이제 값을 넣어준다.x값(행)은 그대로고 y값(열)만 증가시켜서 값을 넣어줌
            }
        }
        ch[x][y] = '\0';//배열에 다시 공백계속 넣어줌? 이해 안감

        for(i=x;i>=0;i--){
            System.out.println(ch[i]);//2차원 배열이었었는데 1차원 배열로 출력할 수 있었단 말이야?신기하군
        }
    }
}
*/
//"flower" "rose" "lily" "daffodil" "azalea" 5개의 단어를 초기화한 후 한 개의 문자를 입력받아서 입력받은 문자가 두 번째나 세 번째에 포함된 단어를 모두 출력하고 마지막 줄에 출력한 단어의 개수를 출력하는 프로그램을 작성하시오.
//해당되는 단어가 없으면 "0"만 첫 줄에 출력한다.
/*
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str[] ={"flower","rose","lily","daffodil","azalea"};
        String mun;
        int i,j,len,cnt=0;

        mun = sc.next(); //한 문자 입력받을 것입니다.

        for(i=0;i<5;i++){
            len = str[i].length();
            for(j=0;j<len;j++){
                if(j==1 && str[i].charAt(j) == mun.charAt(0)){//j==1즉 두번쨰 문자이고 입력받은 문자랑 그 안에 속한 문자가 같을때
                    cnt++;
                    System.out.println(str[i]);
                    break;
                }else if(j==2 && str[i].charAt(j) == mun.charAt(0)){//j==2즉 세번쨰 문자이고 입력받은 문자랑 그 안에 속한 문자가 같을떄
                    cnt++;
                    System.out.println(str[i]);
                    break;
                }
            }
        }
        System.out.println(cnt);//출력한 단어의 갯수 출력
    }
}
*/
//단어를 입력받다가 "0"을 입력받으면 입력을 종료하고 그 때까지 입력받은 단어의 개수를 출력하고 홀수 번째 입력받은 단어를 한 줄에 1개씩 출력하는 프로그램을 작성하시오. 
//단어의 개수는 50개를 넘지 않고, 단어의 길이는 100자 이하이다.
/*
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str[] = new String[50];
        String mun;
        int i,j;

        for(i=0;i<50;i++){
            mun= sc.next();
            if(mun.equals("0"))//0이 입력되면 종료하고
            break;
            str[i] = mun;
        }
        System.out.println(i); //그떄까지 받은 수 i++중이었으므로 이것이 바로 cnt함수가 된다.
        for(j=1;j<=i;j++){//홀수를 위해 1부터 시작한 것이고
            if(j%2==1)
            System.out.println(str[j-1]); //배열은 어차피 첫번쨰수가 0번쨰이므로 0부터 출력한다.
        }
    }
}
*/
//10 이하의 정수 n을 입력받고 n개의 문자열을 입력받은 후 그 크기를 비교하여 가장 작은 문자열부터 차례로 출력하는 프로그램을 작성하시오. 
//문자열의 길이는 100자 이하다. 사전순(아스키코드순)으로 뒤에 나오는 것을 큰 것으로 한다.
/*
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str[] = new String[10];
        String temp;
        int i,j,num;

        num = sc.nextInt();

        for(i=0;i<num-1;i++){//i는 앞숫자 배열
            for(j=i+1;j<num;j++){//j는 뒷숫자 배열
                if(str[i].compareTo(str[j])>0){//양수면 아스키코드에서 1-2 이런식으로 되어야지 순차적인데 이래서 음수가 나와야되는데 양수가 나오면
                    //역순으로 다시 다 바꾸어주어야 하마.
                    temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
        }
        for(i=0;i<num;i++){
            System.out.println(str[i]);
        }
    }
}
*/
//5개의 단어(각 단어는 100자 이하)를 입력받은 후 문자와 문자열(100자 이하)을 한 개씩 입력받아 나중에 입력받은 문자나 문자열이 포함된 단어를 모두 출력하는 프로그램을 작성하시오. 찾는 단어가 없으면 “none”이라고 출력한다.
/*
import java.util.*;

public class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        char c = sc.next();
        String str = sc.next();
        
        len = str.length();

        for(i=0;i<len;i++){
        if(c.equals(i) == arr[i])
        
    }
}
*/
//5개의 단어(각 단어는 100자 이하)를 입력받은 후 문자와 문자열(100자 이하)을 한 개씩 입력받아 나중에 입력받은 문자나 문자열이 포함된 단어를 모두 출력하는 프로그램을 작성하시오. 찾는 단어가 없으면 “none”이라고 출력한다.
/*
import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String ck1,ck2;
        String str[] = new String[5];
        int i,j,len,cnt=0;

        for(i=0;i<5;i++){
            str[i] = sc.next();
        }
        ck1 = sc.next();
        ck2 = sc.next();
        
        for(i=0;i<5;i++){
            if(str[i].indexOf(ck1)>-1 || str[i].indexOf(ck2)>-1){//indexOf 문자열의 위치를 리턴 즉,ck1의문자와 ck2의 문자열에 위치에 해당하는 문자가 나오면 출력해준다.
                cnt++;
                System.out.println(str[i]);
            }
        }
        if(cnt==0)
        System.out.println("none");
    }
}
*/
//두 개의 문자열 A와 B 한 개의 정수 n을 입력받아서 A에 B를 연결하고, 변경된 문자열 A에서 n개의 문자를 B에 복사한 후 A와 B를 출력하는 프로그램을 작성하시오. (1≤n,A,B≤100)
/*
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuffer con = new StringBuffer();
        StringBuffer con2 = new StringBuffer();
        String str1,str2;
        int i,n,len1,len2;

        str1 = sc.next();
        str2 = sc.next();
        n = sc.nextInt();

        con.append(str1);
        con.append(str2);
        System.out.println(con);

        len2 = str2.length();
        for(i=0;i<=n;i++){
            con2.append(str1.charAt(i));
        }
        for(i=n+1;i<=len2;i++){
            con2.append(str2.charAt(i));
        }
        System.out.println(con2);
    }
}
*/
/*
import java.util.*;
public class Main{
    public static void main(String[] args){
        String str1,str2;
        Scanner sc = new Scanner(System.in);
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        int su1,su2,len1,len2,i;
        
        str1 = sc.next();
        str2 = sc.next();
        len1 = str1.length();
        len2 = str2.length();

        for(i=0;i<len1;i++){
            if(str1.charAt(i)>='0' && str1.charAt(i)<='9'){
                s1.append(str1.charAt(i));
        }
        else{
            break;
        }
    }
    su1 = Integer.parseInt(s1.toString());

    for(i=0;i<len2;i++){
        if(str2.charAt(i) == '.'){//이거 왜 해주는 지 모르겠다.
            s2.append(str2.charAt(i));
        }
        else if(str2.charAt(i)>='0' && str2.charAt(i)<='9'){
            s2.append(str2.charAt(i));
        }else{
            break;
        }
        }
        su2 = Integer.parseInt(s2.toString());
        System.out.println(su1 * su2);
    }
}
*/
//한 개의 단어를 입력받아서 거꾸로 뒤집어 출력하는 작업을 반복하다가 "END"라고 입력이 되면 종료하는 프로그램을 작성하시오. 
//입력받는 단어의 길이는 20이하이다.
/*
import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String str;
        int i,j,len;

        for(i=0;;i++){
            str = sc.nextLine();
            if(str.equals("END"))
            break;
            len = str.length();
            for(j=len-1;j>=0;j--){
                System.out.print(str.charAt(j));
            }
                System.out.println();
            }
        }
    }
*/
//정수, 실수, 문자열을 차례로 입력받아서 새로운 문자열에 출력한 후 전체의 길이를 2등분하여 출력하는 프로그램을 작성하시오. 실수는 반올림하여 소수 셋째자리까지 출력하는 것으로 하고, 새로운 문자열의 길이가 홀수일 때는 첫 번째 줄에 한 개를 더 출력한다. 각 문자열의 길이는 30자 이내이다.
/*
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        double num2 = sc.nextDouble();
        num2 = (Math.round(num2 * 1000)) / 1000.0;
        String str1 = sc.next();
        String str = Integer.toString(num1) + Double.toString(num2) + str1;

        int length = str.length();
        if(length % 2 ==0){//전체길이 2등분
            System.out.println(str.substring(0,length/2));
            System.out.println(str.substring(length/2));
        }else{
            System.out.println(str.substring(0,length/2+1));
            System.out.println(str.substring(length/2+1));
        }
    }
}
*/

//문자열 "~!@#$^&*()_+|" 를 출력하는 함수를 작성하고 
//정수를 입력받아 입력받은 수만큼 함수를 호출하는 프로그램을 작성하시오.
/*
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0;i<n;i++){
            printChar("~!@#$^&*()_+|");
        }
    }
    public static void printChar(String str){
        System.out.println(str);
    }
}
*/
//반지름의 길이를 전달받아 넓이를 출력하는 함수를 작성하고 반지름의 길이를 입력받아 함수를 호출하여 넓이를 출력하는 프로그램을 작성하시오. 
//(원주율은 3.14로 하고 반올림하여 소수 둘째자리까지 출력한다. 원의 넓이 = 반지름 * 반지름 * 원주율이다.)
/*
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();

        circleArea(r);
    }
    public static void circleArea(int r){
        double area = r*r*3.14;
        System.out.printf("%.2f",area);
    }
}
*/
//nxn숫자사각형 만들기
/*
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        square(n);
    }
    public static void square(int n)
    {
        int[][] arr = new int[n][n];
        int num =1;

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println("");
        }
    }
}
*/
//두 개의 정수를 전달받아 최대값을 구하여 리턴하는 함수를 작성하고 세 정수를 입력받아 최대값을 출력하는 프로그램을 작성하시오.
/*
import java.util.Scanner;
public class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        int max1 = Max(n1,n2);
        //여기서 max1로 나온거랑 이제 n3만 비교하면 되나? n3이 작으면 
        //이거와 상관없이 3개를 다 비교할 수 있는 함수 방법이 바로 이것이다
        //n1랑 n2먼저 비교하고 그다음에 둘중 큰거 골라서 n3이랑 비교하는것
        int max2 = Max(max1,n3);

        System.out.println(max2);
    }
    public static int Max(int num1,int num2){
        int max;
        if(num1>num2){
            max = num1;
        }
        else{
            max = num2;
        }
        return max;
        }
    }
*/
//10 이하의 두 정수를 받아서 첫 번째 수를 두 번째 수만큼 거듭제곱하여 나온 값을 리턴하는 함수를 작성하여 다음과 같이 출력하는 프로그램을 작성하시오.
/* 
import java.util.Scanner;
 public class Main{
     public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         int a = sc.nextInt();
         int b = sc.nextInt();

         System.out.println(exponentiation(a,b));
     }
    
     public static int exponentiation(int n,int k){

                int res = 1;
                for(int i=0;i<k;i++)
                    res *=n;
         
         return res;
     }
 }
 */
//정수의 연산식을 입력받아 연산을 위한 함수를 호출하여 4칙연산(+ - * /)의 연산결과를 출력하는 프로그램을 작성하시오. 
//('/'의 경우는 정수 부분만 출력하고 4칙연산 이외의 연산 결과는 0으로 한다.)
//단 if~ else if~ else 문으로 작성하세요.
/*
import java.util.Scanner;
public class Main{
public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    String str = sc.next();
  //  char c = str.charAt(0);//char를 이용해서 구해야만 + 값을 넣어줄수 있다. string으로만은 구하기가 힘들다 그 이유는??->우선 str == "+"자체를 인식 못함->그이유는?
  //" " 이 쌍따옴표로 묶이면 자체를 단일문자라고 인식하지못해요! 문자열이라고 인식하게 되어있어! 쉽게생각해보면 "" 이면 NULL 이 들어있는것이라서 이미 문자 1개가 들어있는것이고, "+" 이면 '+' 문자와 '\0' 라는 널문자 2개가 들어있는것이기 때문에 2개 문자가 들어있는게 되는거에욤!
  //웅웅! 그게맞아욤! 문자열의 끝은 무조건 '\0' 으로 인식하게 만들어진게 컴퓨터잖오!? 그래서 우리가 보통 배열을 선언하면 마지막문자는 '\0' 이고, 모든 문자열에 대한 함수는 NULL 문자가 나올 때까지 1개 문자씩 비교, 혹은 복사, 붙여넣기 등을 수행하도록 되어있거둔!
    int y = sc.nextInt();
    
    Calculator(x,str,y);
}
    public static void Calculator(int x, String str , int y){

        if(str.equals("+"))
        {
            int result = x+y;
            System.out.println(x+" " + str + " "+ y + " = " + result);
        }
        else if(str.equals("-"))
        {
            int result = x-y;
            System.out.println(x+" "+ str + " "+ y + " = "+ result);
        }
        else if(str.equals("*"))
        {
            int result = x*y;
            System.out.println(x+" "+ str +" "+ y + " = "+ result);
        }
        else if(str.equals("/"))
        {
            int result = (int)x/y;
            System.out.println(x+" "+ str +" "+ y + " = "+result);
        }
        else
        {
            System.out.println(x+" "+str +" "+y+ " = " + 0);
        }
    }
}
*/
//서로 다른 두 개의 정수가 주어진다.
//두 정수를 입력받아 큰 수는 2로 나눈 몫을 저장하고 작은 수는 2를 곱하여 저장한 후 
//출력하는 프로그램을 작성하시오.
//(참조에 의한 호출을 이용한 함수를 작성하여 값을 수정하고 출력은 메인함수에서 한다.)
/*
import java.util.Scanner;

public class Main{
    public static void main(String[] ars){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(method1(a,b) + " " + method2(a,b));
    }


    //일단 method1에서는 a에 대한 값만 리턴해서 x2를 해줄것인지 /2를 해줄 것인지 구해온다.
    public static int method1(int a,int b){

        //a가 b보다 큰 수일경우
        if(a>b){
            //a가 큰수라서 2로 나눠주는데 여기서 b의 값은 관여 안함 밑에 method2함수에서 관여할 것이기 때문에 나중에 따로 출력하려면 이렇게 함수 2개여야 한다.
            a/=2;
        }else if(b>a){
            //a가 b보다 작은 수일 경우
            //a가 작은수라서 2를 곱해준다. 
            a*=2;
        }
        return a;
    }
    //일단 method2에서는 b에 대한 값만 리턴해서 x2를 해줄것인지 /2를 해줄 것인지 구해온다.
    public static int method2(int a,int b){
        //a가 b보다 큰 수일경우
        if(a>b){
            //위에서 큰 수 a에 대해서만 처리해 줬으므로 여기서 작은수 b를 2배 곱해준다.
            b*=2;
        }else if(b>a){
            //a가 b보다 작은 수일 경우
            //b가 큰수라서 2를 나눠준다. 
            b/=2;
        }
        return b;
    }
}
*/

 
//10 이하의 두 개의 정수를 입력받아서 작은 수부터 큰 수까지의 구구단을 차례대로 출력하는 프로그램을 구조화하여 작성하시오.
/*
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n1=0;
        int n2=0;

        if(a>b){
            n1 = b;
            n2 = a;
        }else if(b>a){
            n1 = a;
            n2 = b;
        }
        for(int i=n1;i<=n2;i++){
            Gugudan(i);
        }
    }
        public static void Gugudan(int n){
            System.out.println("== " + n + "dan ==");
            for(int i=1;i<=9;i++){
                System.out.print(n+" * "+i+" = ");
                
                if(n*i<10){
                    System.out.print(" ");//아 이거 해주는 이유가 깔끔한 구구단 형태로 자릿수 맞춰줄려고 깔끔용도로 써준다. 10의 자리랑 1의 자리 하나있는거는 자리가 한자리수 차이나 그림이 안살아나니까
                }
                
                System.out.println(n*i);
            }
                System.out.println("");
            }
        } 
        */

//‘@’문자를 10개 출력하는 함수를 작성 한 후 함수를 세 번 호출하여 아래와 같이 출력하는 프로그램을 작성하시오.
/*
public class Main{
    public static void main(String[] args){
        System.out.println("first");
        method();
        System.out.println("second");
        method();
        System.out.println("third");
        method();
    }
    public static void  method(){
        for(int i=1;i<=10;i++){
            System.out.print("@");
        }
        System.out.println("");
    }
}
*/
//1부터 전달받은 수까지의 합을 출력하는 함수를 작성하고 1000 이하의 자연수를 입력받아 작성한 함수로 전달하여 출력하는 프로그램을 작성하시오.
/*
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        method(n);
    }
    public static void method(int m){
        int sum =0;
        for(int i=1;i<=m;i++){
            sum+=i;
        }
        System.out.println(sum);
    }
}
*/
//100이하의 자연수를 입력받아 아래와 같은 사각형을 출력하는 프로그램을 작성하시오. (출력하는 부분은 함수로 작성하시오.)
/*
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        square(n);
    }
    public static void square(int n){
        int[][] Arr = new int[n][n];

        //이거는 테두리에 123,123을 곱할것을 미리 행과열에 저장해 두는것이다. 겉테두리5개 123,123
        for(int i=0;i<n;i++){
            Arr[0][i] = i+1;
            Arr[i][0] = i+1;
        }
        //이거는 위에서 행과 열에서123,123을 해놓은 것을 이제 각각 곱해서 행렬[1][1]부터 안에 조그만 4개안에 집어 넣으려는 것이다.
        for(int j=1;j<n;j++){
            for(int i=1;i<n;i++){
                Arr[j][i] = Arr[j][0]*Arr[0][i];
            }
        }
        for(int j=0;j<n;j++){
            for(int i=0;i<n;i++){
                System.out.print(Arr[j][i]+" ");
            }
            System.out.println("");
            }
        }
    }
*/
/*
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        method(a,b);
    }
        public static void method(int a, int b)
        {
            int max=0;
            int min=0;

            if(a>b){
                max =a;
                min =b;
            }
            else if(a<b)
            {
                max=b;
                min=a;
            }
            int result = 0;
            result = max*max - min*min;
            System.out.println(result);
        }
    }
*/

//3명 학생의 3과목 점수를 입력받아 각 과목별 학생별 총점을 출력하는 구조화된 프로그램을 작성하시오.
/*
public class Main{
    public static void  main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        //총 9개의 점수를 입력 받아야 하는 구조인것 같다.
        for(int i=0;i<9;i++){
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        method(a,b,c);
        }
    }
        public static int method(int a,int b,int c){

            int arr[][] = new int[3][3];

            for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    arr[i][j] = a;
                }
            }
            int result1 =0; //과목별 총점
            int result2 =0; //학생별 총점
        }
    }
}
*/
////3명 학생의 3과목 점수를 입력받아 각 과목별  학생별 총점을 출력하는 구조화된 프로그램을 작성하시오.
 /*
public class Main{
    public static void main(String[] args){
        score();
    }
    public static void score(){
        Scanner sc = new Scanner(System.in);
       // int student = 3;

        int arr[][] = new int [4][4];


        //이게 9개씩 입력받을 값
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        //사각형의 테두리 즉 열이 3인 이유가 합계는 마지막 열에 구해놓을 것이기 때문에 3을 써준다 3은 그전열까지는 포함되는 값이 아님
            for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    arr[i][3] += arr[i][j];
                }
            }
            for(int j=0;j<3;j++){
                for(int i=0;i<3;i++){
                    arr[3][j] +=arr[i][j];
                }
            }

            //과목별합에서 더하든지 학생별 합에서 하든지 해서 총합구하기
            for(int i=0;i<3;i++){
                arr[3][3] += arr[3][i];
            }

            for(int i=0;i<4;i++){
                for(int j=0;j<4;j++){
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println("");
            }

        }
    }
    */
  
//2016년의 날짜를 두 개의 정수 월 일로 입력받아서 입력된 날짜가 존재하면 "OK!" 그렇지 않으면 "BAD!"라고 출력하는 프로그램을 작성하시오.
/*
public class Main{
    public static void main(String[] args){
        //두개의 정수 입력받기
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int day = sc.nextInt();

        if(checkDate(month,day) == true){
            System.out.println("OK!");
        }else{
            System.out.println("BAD!");
        }
    }
    //입력된 날짜가 존재하는지 검사하기
    public static boolean checkDate(int m,int d){
        boolean result = false;
        if(m==1 || m==3 || m==5 || m==7 || m==8 || m==10 || m==12){
            if(d>=1 && d<=31){
                result = true;
            }
        }else if(m==4 || m==6 || m==9 || m==11){
            if(d>=1&&d<=30){
                result = true;
            }
        }else if(m==2){
            if(d>=1&&d<=29){
                result = true;
            }
        }
        return result;
        }
    }
*/

//두 개의 정수를 입력받아 절대값이 더 큰 수를 출력하고 두 개의 실수를 입력받아 절대값이 작은 수를 출력하는 프로그램을 작성하시오. 실수는 소수점 이하 2자리까지 출력한다.
/*
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        double x = sc.nextDouble();
        double y = sc.nextDouble();

        System.out.println(absolute(a,b));
        System.out.printf("%.2f",absolute2(x,y));
    }
    //절댓값을 비교하는 함수(정수)
    public static int absolute(int a,int b){
        int a2,b2;
        int result=0;
        if(a<0){
            a2 = a*(-1);
        }else{
            a2 = a;
        }
        if(b<0){
            b2 = b*(-1);
        }else{
            b2 = b;
        }
        if(a2>b2){
            result = a;
        }else {
            result = b;
    }
    return result;
}

    public static double absolute2(double x,double y){
        double x2,y2;
        double result =0.0;
        if(x<0){
            x2 = x*(-1);
        }else{
            x2 =x;
        }
        if(y<0){
            y2 = x*(-1);
        }else{
            y2 = y;
        }
        if(x2>y2){
            result = y;
        }else{
            result = x;
        }
        return result; 
    }
}
*/
//원의 넓이를 입력받아 반지름의 길이를 소수 둘째자리까지 출력하는 프로그램을 작성하시오. 
//원의 넓이 = 반지름 * 반지름 * 3.14 식을 이용하시오.
/*
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double area = sc.nextDouble(); //원의 넓이
        
        //원의 넓이
        System.out.printf("%.2f",method(area));
    }
        public static double method(double area){
            double r = Math.sqrt(area/3.14);
            return r;
        }
    }
*/
