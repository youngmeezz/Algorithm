package programmers;

class wooahhan2{

    public static void main(String[] args){

        String str1 = "I love you";
        solution(str1);
        }
        public String solution(String word) {

            char tmp = 0;
            char array[] = word.toLowerCase().toCharArray(); //encrypted_text
          //�̹� encrypted_text�� string�̱⋚���� char������ �ٲ���Ѵ�.
          //String�� char���� ��ȯ�� �ƽ�Ű�ڵ������ ������ ��ģ �� �ٽ� StringŸ������ �����ϰ� �������� ���Ƽ�
    
              for(int i=0;i<26;i++){
                 tmp=array[0];
                 for(int len=0;len<array.length-1;len++){
                    array[len]=array[len+1];
                 }
                 array[array.length-1]=tmp;
              }
              for(int i=0;i<array.length;i++){
                array[i]= (char)(array[i]);
                //�׳� char���� ���� ���� String���� �Ϸ��ߴµ� ������
                 if(array[i]<'a'){
                    array[i]=(char)(array[i]+26);
                 }
                else if(array[i]>'z')
                    array[i]=(char)(array[i]-26);
                 }
           return String.valueOf(array);
        }
    }