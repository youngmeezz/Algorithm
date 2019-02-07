package programmers;

public class pretest3{
public static void main(String[] args){

    int[][] answer ={{1,4},{3,4},{3,10}};

    pretest3 sol= new pretest3();
    System.out.println(sol.solution(answer));

}

        public int[] solution(int[][] v){
            int x;
            int y;
            //주어진 3개의 좌표중에서 답을 구할 좌표는 나머지 하나가 다른 좌표랑 같은 좌표이다
            //그래서 if문에서 이미 같은 좌표 두개가 나오면 답 x좌표는 나머지 하나의 좌표와 같다. 
           // v[0][0](=x1) xor v[1][0](=x2) xor v[2][0](=x2)
            if(v[0][0] == v[1][0]){
                x = v[2][0];
            }else if(v[0][0]==v[2][0]){
                x=v[1][0];
            }else{
                x=v[0][0];
            }

            // v[0][1](=y1) xor v[1][1](=y2) xor v[2][1](=y2)
              //주어진 3개의 좌표중에서 답을 구할 좌표는 나머지 하나가 다른 좌표랑 같은 좌표이다
            //그래서 if문에서 이미 같은 좌표 두개가 나오면 답 y좌표는 나머지 하나의 좌표와 같다. 
            if(v[0][1]==v[1][1]){
                y=v[2][1];
            }else if(v[0][1] == v[2][1]){
                y=v[1][1];
            }else{
                y=v[0][1];
            }
            int[] answer = {x,y};
            return answer;
        }
    }

