package baekjoon;
 
import java.util.*;
import java.io.*;
 
//�̰� �� bfs�� Ǯ�� �ϴ� ���� �� �𸣰ڴ�.
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
 
            //ť�� �����ҋ� �̷��� �����ϴ°� ���� �Ȱ���.
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
 
    private int commandD(int n){ //2��
        return (n*2) % 10000;
    }
    private int commandS(int n){ //n-1
        return (n == 0) ? 9999 : n-1;
    }
    private int commandL(int n){ //���� ����Ʈ
 
        //n�� 1234��� 1234%1000 = 234 �̰� 234*10 = 2340�̰� (1234/1000) = 1�̴ϱ� ���⼭ 1���ϸ� 2341�̵ȴ�.
        return (n%1000) * 10 + (n/1000);
    }
    private int commandR(int n){ //������ ����Ʈ
 
        //n�� 1234��� 1234%10 = 4�̰� 4���� *1000�� �ϸ� 4000�� ������ 4000 + (1234/10) = 4123 �̳��´�. 
        return (n%10) * 1000 + (n/10);
    }
    
 
    //����� RegisterŬ������ ������ְ�
    class Register{
        private int num; //���ڿ�
        private String command; //��ɾ�� �ʱ�ȭ �Ѵ�.
 
        //�����ڸ� �����
        public Register(int num, String command){
            this.num = num;
            this.command = command;
        }
 
        //** �̺κ� ���� �Ȱ� */
        //���ڸ� �޾ƿ´�.
        public int getNum(){
            return num;
        }
        //��ɾ� ���� �޾ƿ´�.
        public String getCommand(){
            return command;
            }
        }
    }
}
 
/*
    int number[] = new int[10001];
    //D�� �ι�
    D = n*2;
    System.out.print(D);
    //S �� n-1
    S = n-1;
    System.out.print(S);
    //L�� ���� ����Ʈ
    L = n<<10;
    System.out.print(L);
    //R�� ������ ����Ʈ
    R = n>>10;
    System.out.print(R);
    }
}
*/
