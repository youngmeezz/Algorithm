import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
public class ntechservice3 {
    public static void main(String[] args){

        ntechservice3  cs = new ntechservice3 ();
       // System.out.println(cs.caesar((char)singleCh,4));
        try{
            //파일 객체 생성
            File file = new File("C:\\Users\\KWONYOUNGMEE\\Desktop\\encrypted_text.txt");
            //입력 스트림 생성
            FileReader filereader = new FileReader(file);
            int singleCh = 0;
            //reader를 쓰는거는 출력용도니까 reader쓰지말고 string으로 받아오기
            while((singleCh = filereader.read()) != -1){
                System.out.print((char)singleCh);
               
            }
            filereader.close();
        }catch (FileNotFoundException e) {
            // TODO: handle exception
        }catch(IOException e){
            System.out.println(e);
        }
        
        
    }

    private String caesar(String str, int n) {
        n %= 26 ; 

        StringBuffer sb = new StringBuffer();
        
        for (int i = 0; i < str.length(); i++) {
             char ch = str.charAt(i);
             
             int ascii = (int)ch+n;
             if(Character.isLowerCase(ch)) {
                  if(!Character.isLowerCase(ascii)) {
                        ascii-=26;
                  }
             }else if(Character.isUpperCase(ch)) {
                  if(!Character.isUpperCase(ascii)) {
                        ascii -=26;
                  }
             }
             if(ch!=32) {
                  sb.append((char)ascii);
             }else {
                  sb.append((char)ch);
             }
  }//for
        return sb.toString();
  }
}
*/

//
/*
public class ntechservice3 {
    public static void main(String[] args) {
        ntechservice3 cs = new ntechservice3();
          System.out.println(cs.caesar("a B z", 4));
          System.out.println(cs.caesar("AsadFw WNezin dIwEndZ IoenNoje nVQa",64));
    }
    private String caesar(String str, int n) {
          n %= 26 ; 

          StringBuffer sb = new StringBuffer();
          
          for (int i = 0; i < str.length(); i++) {
               char ch = str.charAt(i);
               
               int ascii = (int)ch+n;
               if(Character.isLowerCase(ch)) {
                    if(!Character.isLowerCase(ascii)) {
                          ascii-=26;
                    }
               }else if(Character.isUpperCase(ch)) {
                    if(!Character.isUpperCase(ascii)) {
                          ascii -=26;
                    }
               }
               if(ch!=32) {
                    sb.append((char)ascii);
               }else {
                    sb.append((char)ch);
               }
    }//for
          return sb.toString();
    }
}
*/
/*
import java.io.*;
import java.util.Scanner;
import java.util.*;

public class ntechservice3 {

	public static void main(String[] args) throws IOException {
        
        try{
            //파일 객체 생성
            File file = new File("C:\\Users\\KWONYOUNGMEE\\Desktop\\encrypted_text.txt");
            //입력 스트림 생성
           // FileReader filereader = new FileReader(file);
            int singleCh = 0;
            FileReader file_stream = new FileReader(file);
            BufferedReader br = new BufferedReader(file_stream);
            //StringTokenizer singleCh;
            //reader를 쓰는거는 출력용도니까 reader쓰지말고 string으로 받아오기
            while((singleCh = filereader.read()) != -1){
                System.out.print((char)singleCh);
              // System.out.print(singleCh.length());
            }
            filereader.close();
        }catch (FileNotFoundException e) {
            // TODO: handle exception
        }catch(IOException e){
            System.out.println(e);
        }


        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        
        int rotation = sc.nextInt();
        String key = sc.nextLine();
        
        
		for(int i = 0 ; i < rotation ; i++) {
            char tmp = key.charAt(i);

            for(int j=0;j<singleCh.length();j++)
			if(tmp <= 'Z')
				tmp += 26;
			tmp -= i;
			System.out.print(tmp);
		}
	}
}
*/
/*
import java.util.*;

class ntechservice3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int shift, i, n;
        String str;
        String str1 = "";
        String str2 = "";
        System.out.println("Enter the plaintext");
        str = sc.nextLine();
        str = str.toLowerCase();
        n = str.length();
        char ch1[] = str.toCharArray();
        char ch3, ch4;
        System.out.println("Enter the value by which each letter of the string is to be shifted");
        shift = sc.nextInt();

        System.out.println();
        System.out.println("Encrypted text is");
        for (i = 0; i < n; i++) {
            if (Character.isLetter(ch1[i])) {
                ch3 = (char) (((int) ch1[i] + shift - 96) % 26 + 96);
                // System.out.println(ch1[i]+" = "+ch3);
                str1 = str1 + ch3;
            } else if (ch1[i] == ' ') {
                str1 = str1 + ch1[i];
            }
        }
        System.out.println(str1);

        System.out.println();
        System.out.println("Decrypted text is");

        char ch2[] = str1.toCharArray();
        for (i = 0; i < str1.length(); i++) {
            if (Character.isLetter(ch2[i])) {
                if (((int) ch2[i] - shift) < 96) {
                    ch4 = (char) (((int) ch2[i] - shift - 96 + 26) % 26 + 96);

                } else {
                    ch4 = (char) (((int) ch2[i] - shift - 96) % 26 + 96);
                }
                str2 = str2 + ch4;
            }

            else if (ch2[i] == ' ') {
                str2 = str2 + ch2[i];
            }
        }
        System.out.println(str2);
    }
}
*/
/*
import java.util.*;
import java.io.*;

public class ntechservice3 {
   public static void main(String[] args){
      int rotation=3;
      char tmp = 0;
      File file=new File("C:\\Users\\KWONYOUNGMEE\\Desktop\\encrypted_text.txt");
      
      try{
            if(checkBeforeFile(file)){
              //FileReader를 인자로 하는 BufferedReader 객체 생성
              BufferedReader br = new BufferedReader(new FileReader(file));

              //파일을 한 문장씩 읽어온다.
              char[] array = br.readLine().toLowerCase().toCharArray();
              //EOF는 null문자를 포함하고 있다.
              //while(array != null){
              for(int i=0;i<rotation;i++){
                 tmp=array[0];
                 for(int len=0;len<array.length-1;len++){ //array.length가  Qyyigoptvfb //문자열 개수는 11개인데 
                    //배열은 0부터 10까지 가지고있어서 -1을 해줘야지 10개의 lenth(길이)가 돈다.
                    array[len]=array[len+1];
                 }
                 array[array.length-1]=tmp;
                 }
                //읽은 문자열을 출력한다.
                System.out.println(array);
                //다음 문자열을 가르켜준다.
                //str = br.readLine();
              //}
            //FileReader와는 다르게 사용 후 꼭 닫아주어야 한다.
              br.close();
            }else{
              System.out.println("파일에 접근할 수 없습니다.");
            }
          } catch (FileNotFoundException e) {
            e.printStackTrace();
          } catch (IOException e) {
            e.printStackTrace();
          }
        
        System.out.println("Decrypted text is");

        Scanner sc = new Scanner(System.in);
        String key = sc.nextLine();

		
            char temp = key.charAt(i);
            for(int j=0;j<key.length();j++)
			if(temp < 'a')
				temp += 26;
			    //temp -= i;
                System.out.print(temp);
        }
    
        static boolean checkBeforeFile(File file){
          if(file.exists()){
            if(file.isFile() && file.canRead()){

              return true;
            }
          }
          return false;
        }   
    }
*/
/*
import java.util.*;
import java.io.*;

public class ntechservice3 {
   public static void main(String[] args){
  //  public String solution(String encrypted_text, int rotation, String key) {
      int rotation=3;
      char tmp = 0;
      String key="abcdefghijk";
      File file=new File("C:\\Users\\KWONYOUNGMEE\\Desktop\\encrypted_text.txt");
      
      try{
            if(checkBeforeFile(file)){
              //FileReader를 인자로 하는 BufferedReader 객체 생성
              BufferedReader br = new BufferedReader(new FileReader(file));

              //파일을 한 문장씩 읽어온다.
              char[] array = br.readLine().toLowerCase().toCharArray();
              //EOF는 null문자를 포함하고 있다.
              //while(array != null){
              for(int i=0;i<rotation;i++){
                 tmp=array[0];
                 for(int len=0;len<array.length-1;len++){
                    array[len]=array[len+1];
                 }
                 array[array.length-1]=tmp;
              }
              for(int i=0;i<array.length;i++){
                 array[i]=(char) (array[i]-(key.charAt(i)-96));
                 if(array[i]<'a'){
                    array[i]=(char) (array[i]+26);
                 }
              }
                //읽은 문자열을 출력한다.
              System.out.println(array);
                //다음 문자열을 가르켜준다.
                //str = br.readLine();
              //}
            //FileReader와는 다르게 사용 후 꼭 닫아주어야 한다.
              br.close();
            }else{
              System.out.println("파일에 접근할 수 없습니다.");
            }
          } catch (FileNotFoundException e) {
            e.printStackTrace();
          } catch (IOException e) {
            e.printStackTrace();
          }
        }
        static boolean checkBeforeFile(File file){
          if(file.exists()){
            if(file.isFile() && file.canRead()){
              return true;
            }
          }
          return false;
        }   
   }
*/

import java.util.*;
import java.util.Scanner;
import java.io.*;

public class ntechservice3 {

    public static String Solution(String encrypted_text, String key, int rotation) {

            char tmp = 0;
            char array[] = encrypted_text.toLowerCase().toCharArray(); //encrypted_text
          // 이미 encrypted_text가 string이기떄문에 char형으로 바꿔야한다
          //String을 char으로 변환해 아스키코드등으로 연산을 마친 후 다시 String타입으로 리턴하고 싶을때가 많아서
           
            char array2[] = key.toCharArray();//key : abcdefghijk           

              for(int i=0;i<rotation;i++){
                 tmp=array[0];
                 for(int len=0;len<array.length-1;len++){
                    array[len]=array[len+1];
                 }
                 array[array.length-1]=tmp;
              }
              for(int i=0;i<array.length;i++){
                array[i]= (char)(array[i]-(array2[i]-96));//char로 바꿔주는 이유 형변환해야지 여기서 int로 인식해서 문자열이 아님
                //그냥 char형이 제일 빠름 String으로 하려했는데 복잡함
                 if(array[i]<'a'){
                    array[i]=(char) (array[i]+26);
                 }
                else if(array[i]>'z')
                    array[i]=(char) (array[i]-26);
            }
           return String.valueOf(array) ;
        }
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        String encrypted_text =sc.next();
        String key = sc.next();
        int rotation = sc.nextInt();
      
        //Solution sol = new Solution();
        System.out.println(Solution(encrypted_text,key,rotation));
   
    }

}

/*
import java.util.*;
import java.util.Scanner;
import java.io.*;

public class ntechservice3 {

    public static String Solution(String encrypted_text, String key, int rotation) {

            String tmp = "";
            String[] array;
            array = encrypted_text.toLowerCase().split(""); //배열에 한글자씩 저장하기
           
            String[] array2;
            array2 = key.split("");//key : abcdefghijk           

              for(int i=0;i<rotation;i++){
                 tmp=array[0];
                 for(int len=0;len<array.length-1;len++){
                    array[len]=array[len+1];
                 }
                 array[array.length-1]=tmp;
              }
            
              for(int i=0;i<array.length;i++){
                    (array[i])= String.valueOf(array[i]-(array[i]-96));//char로 바꿔주는 이유 형변환해야지 여기서 int로 인식해서 문자열이 아님
                
                 if(array[i]<'a'){
                    array[i]=(array[i]+26);
                 }
                else if(array[i]>'z')
                    array[i]=(array[i]-26);
            }
        
           return String.valueOf(array) ;
        }
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        String encrypted_text =sc.next();
        String key = sc.next();
        int rotation = sc.nextInt();
      
        System.out.println(Solution(encrypted_text,key,rotation));
   
    }

}
*/