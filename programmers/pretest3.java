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
            //�־��� 3���� ��ǥ�߿��� ���� ���� ��ǥ�� ������ �ϳ��� �ٸ� ��ǥ�� ���� ��ǥ�̴�
            //�׷��� if������ �̹� ���� ��ǥ �ΰ��� ������ �� x��ǥ�� ������ �ϳ��� ��ǥ�� ����. 
           // v[0][0](=x1) xor v[1][0](=x2) xor v[2][0](=x2)
            if(v[0][0] == v[1][0]){
                x = v[2][0];
            }else if(v[0][0]==v[2][0]){
                x=v[1][0];
            }else{
                x=v[0][0];
            }

            // v[0][1](=y1) xor v[1][1](=y2) xor v[2][1](=y2)
              //�־��� 3���� ��ǥ�߿��� ���� ���� ��ǥ�� ������ �ϳ��� �ٸ� ��ǥ�� ���� ��ǥ�̴�
            //�׷��� if������ �̹� ���� ��ǥ �ΰ��� ������ �� y��ǥ�� ������ �ϳ��� ��ǥ�� ����. 
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

