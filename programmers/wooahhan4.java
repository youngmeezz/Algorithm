package programmers;


class wooahhan4{

    public static void main(String[] args){

        String str1 = "browoanoommnaon";
        solution(str1);

        }
        public String solution(String cryptogram){

            //중복 문자 삭제하는 방법
            String result ="";
            for(int i=0;i<cryptogram.length();i++){
                if(!result.contains(String.valueOf(cryptogram.charAt(i)))){
                    result += String.valueOf(cryptogram.charAt(i));
                }
            }
            return result;

        }
    }