package baekjoon;
 
import java.util.*;
import java.io.*;
 
//이게 왜 bfs로 풀이 하는 건지 잘 모르겠다.
public class baekjoon9019{
 
    static int n;
    static int D;
    static int S;
    static int L;
    static int R;
 
public static void main(String[] args)throws IOException{
 
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int T = Integer.parseInt(br.readLine());
 
    for(int i=0;i<T;i++){
    StringTokenizer st = new StringTokenizer(br.readLine()," ");
    int A = Integer.parseInt(st.nextToken());
    int B = Integer.parseInt(st.nextToken());
 
    DSLR dslr = new DSLR(A,B);
    System.out.println(dslr.getCommands());
    }
    br.close();
}
 
    static class DSLR{
        private int A,B;
        private boolean[] visited;
        
        public DSLR(int a,int b){
            A = a;
            B = b;
            visited = new boolean[10001];  
        }
 
        public String getCommands(){
 
            //큐를 설정할떄 이렇게 설정하는거 이해 안간다.
            Queue<Register> registers = new LinkedList<>();
             registers.offer(new Register(A,""));
             visited[A] = true;
             while(!registers.isEmpty()){
                 Register register = registers.poll();
                 if(register.getNum() == B){
                     return register.getCommand();
                 }
 
                 if(!visited[commandD(register.getNum())]){
                     int num = commandD(register.getNum());
                     visited[num] = true;
                     StringBuilder commands = new StringBuilder(register.getCommand());
                     registers.offer(new Register(num, commands.append("D").toString()));
                 }
                 if(!visited[commandS(register.getNum())]){
                     int num = commandS(register.getNum());
                     visited[num] = true;
                     StringBuilder commands = new StringBuilder(register.getCommand());
                    registers.offer(new Register(num, commands.append("S").toString()));
                
                }
 
                if(!visited[commandL(register.getNum())]){
                    int num = commandL(register.getNum());
                    visited[num] = true;
                    StringBuilder commands = new StringBuilder(register.getCommand());
                    registers.offer(new Register(num, commands.append("L").toString()));
                }
                
                if(!visited[commandR(register.getNum())]){
                    int num = commandR(register.getNum());
                    visited[num] = true;
                    StringBuilder commands = new StringBuilder(register.getCommand());
                    registers.offer(new Register(num, commands.append("R").toString()));
 
                }
             }
             return null;
            }
 
    private int commandD(int n){ //2배
        return (n*2) % 10000;
    }
    private int commandS(int n){ //n-1
        return (n == 0) ? 9999 : n-1;
    }
    private int commandL(int n){ //왼쪽 시프트
 
        //n이 1234라면 1234%1000 = 234 이고 234*10 = 2340이고 (1234/1000) = 1이니까 여기서 1더하면 2341이된다.
        return (n%1000) * 10 + (n/1000);
    }
    private int commandR(int n){ //오른쪽 시프트
 
        //n이 1234라면 1234%10 = 4이고 4에서 *1000을 하면 4000이 나오고 4000 + (1234/10) = 4123 이나온다. 
        return (n%10) * 1000 + (n/10);
    }
    
 
    //등록할 Register클래스를 만들어주고
    class Register{
        private int num; //숫자와
        private String command; //명령어값을 초기화 한다.
 
        //생성자를 만들고
        public Register(int num, String command){
            this.num = num;
            this.command = command;
        }
 
        //** 이부분 이해 안감 */
        //숫자를 받아온다.
        public int getNum(){
            return num;
        }
        //명령어 값을 받아온다.
        public String getCommand(){
            return command;
            }
        }
    }
}
 
/*
    int number[] = new int[10001];
    //D는 두배
    D = n*2;
    System.out.print(D);
    //S 는 n-1
    S = n-1;
    System.out.print(S);
    //L은 왼쪽 시프트
    L = n<<10;
    System.out.print(L);
    //R은 오른쪽 시프트
    R = n>>10;
    System.out.print(R);
    }
}
*/
