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
            //���� ��ü ����
            File file = new File("C:\\Users\\KWONYOUNGMEE\\Desktop\\encrypted_text.txt");
            //�Է� ��Ʈ�� ����
            FileReader filereader = new FileReader(file);
            int singleCh = 0;
            //reader�� ���°Ŵ� ��¿뵵�ϱ� reader�������� string���� �޾ƿ���
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
            //���� ��ü ����
            File file = new File("C:\\Users\\KWONYOUNGMEE\\Desktop\\encrypted_text.txt");
            //�Է� ��Ʈ�� ����
           // FileReader filereader = new FileReader(file);
            int singleCh = 0;
            FileReader file_stream = new FileReader(file);
            BufferedReader br = new BufferedReader(file_stream);
            //StringTokenizer singleCh;
            //reader�� ���°Ŵ� ��¿뵵�ϱ� reader�������� string���� �޾ƿ���
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
              //FileReader�� ���ڷ� �ϴ� BufferedReader ��ü ����
              BufferedReader br = new BufferedReader(new FileReader(file));

              //������ �� ���徿 �о�´�.
              char[] array = br.readLine().toLowerCase().toCharArray();
              //EOF�� null���ڸ� �����ϰ� �ִ�.
              //while(array != null){
              for(int i=0;i<rotation;i++){
                 tmp=array[0];
                 for(int len=0;len<array.length-1;len++){ //array.length��  Qyyigoptvfb //���ڿ� ������ 11���ε� 
                    //�迭�� 0���� 10���� �������־ -1�� ������� 10���� lenth(����)�� ����.
                    array[len]=array[len+1];
                 }
                 array[array.length-1]=tmp;
                 }
                //���� ���ڿ��� ����Ѵ�.
                System.out.println(array);
                //���� ���ڿ��� �������ش�.
                //str = br.readLine();
              //}
            //FileReader�ʹ� �ٸ��� ��� �� �� �ݾ��־�� �Ѵ�.
              br.close();
            }else{
              System.out.println("���Ͽ� ������ �� �����ϴ�.");
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
              //FileReader�� ���ڷ� �ϴ� BufferedReader ��ü ����
              BufferedReader br = new BufferedReader(new FileReader(file));

              //������ �� ���徿 �о�´�.
              char[] array = br.readLine().toLowerCase().toCharArray();
              //EOF�� null���ڸ� �����ϰ� �ִ�.
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
                //���� ���ڿ��� ����Ѵ�.
              System.out.println(array);
                //���� ���ڿ��� �������ش�.
                //str = br.readLine();
              //}
            //FileReader�ʹ� �ٸ��� ��� �� �� �ݾ��־�� �Ѵ�.
              br.close();
            }else{
              System.out.println("���Ͽ� ������ �� �����ϴ�.");
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
          // �̹� encrypted_text�� string�̱⋚���� char������ �ٲ���Ѵ�
          //String�� char���� ��ȯ�� �ƽ�Ű�ڵ������ ������ ��ģ �� �ٽ� StringŸ������ �����ϰ� �������� ���Ƽ�
           
            char array2[] = key.toCharArray();//key : abcdefghijk           

              for(int i=0;i<rotation;i++){
                 tmp=array[0];
                 for(int len=0;len<array.length-1;len++){
                    array[len]=array[len+1];
                 }
                 array[array.length-1]=tmp;
              }
              for(int i=0;i<array.length;i++){
                array[i]= (char)(array[i]-(array2[i]-96));//char�� �ٲ��ִ� ���� ����ȯ�ؾ��� ���⼭ int�� �ν��ؼ� ���ڿ��� �ƴ�
                //�׳� char���� ���� ���� String���� �Ϸ��ߴµ� ������
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
            array = encrypted_text.toLowerCase().split(""); //�迭�� �ѱ��ھ� �����ϱ�
           
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
                    (array[i])= String.valueOf(array[i]-(array[i]-96));//char�� �ٲ��ִ� ���� ����ȯ�ؾ��� ���⼭ int�� �ν��ؼ� ���ڿ��� �ƴ�
                
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