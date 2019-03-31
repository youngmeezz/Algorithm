package programmers;

class wooahhan2{

    public static void main(String[] args){

        String str1 = "I love you";
        solution(str1);
        }
        public String solution(String word) {

            char tmp = 0;
            char array[] = word.toLowerCase().toCharArray(); //encrypted_text
          //이미 encrypted_text가 string이기떄문에 char형으로 바꿔야한다.
          //String을 char으로 변환해 아스키코드등으로 연산을 마친 후 다시 String타입으로 리턴하고 싶을때가 많아서
    
              for(int i=0;i<26;i++){
                 tmp=array[0];
                 for(int len=0;len<array.length-1;len++){
                    array[len]=array[len+1];
                 }
                 array[array.length-1]=tmp;
              }
              for(int i=0;i<array.length;i++){
                array[i]= (char)(array[i]);
                //그냥 char형이 제일 빠름 String으로 하려했는데 복잡함
                 if(array[i]<'a'){
                    array[i]=(char)(array[i]+26);
                 }
                else if(array[i]>'z')
                    array[i]=(char)(array[i]-26);
                 }
           return String.valueOf(array);
        }
    }