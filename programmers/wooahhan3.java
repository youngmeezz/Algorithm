package programmers;

class wooahhan3{

    public static void main(String[] args){

    
        int a =13;
        solution(a);
        int b = 33;
        solution(b);
        }
        public static void solution(int result){

            int result =0;

            for(int i=1;i<4;i++){
            if(number % (10^i) == 3 || number % (10^i) == 6 || number % (10^i) ==9)
            {
                    result++;
             }
        }

            return result;
        }
    
    }    