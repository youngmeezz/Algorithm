package baekjoon;

import java.util.*;

public class baekjoon2851{

    static int[] scores;
    static int result;
    static int now,after;
    static int numOfMushroom;

    public static void main(String[] args){

            Scanner sc = new Scanner(System.in);
            numOfMushroom = 10;
            scores = new int[numOfMushroom];

            for(int i=0;i<scores.length;i++){
                scores[i] = sc.nextInt();
            }
            result = scores[0];
            for(int i=1;i<scores.length;i++){
                now = result;
                after = result + scores[i];

                now = Math.abs(100 - now);
                after = Math.abs(100 - after);

                if(after <= now){
                    result += scores[i];
                }else{
                    break;
                }
            }
            System.out.println(result);

            }
        }
        /*
        int sum =0;
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<10;i++){
        score = sc.nextInt(); // �������� �޴� ����
        sum += score;
        }
        //100�� ������ �������
        //����� ������ ��� ã��?
        //�̰Ÿ� ���ϰڵ�
        if(score<max)
        {
            score = max;//score�� �� ū ������ ġȯ���ְ�
            //ù° �ٿ� �������� �޴� ���� ���
        }
    
        //���� ���α׷��ӽ��� ��� �̴� ���� �߰��� ��� ä�� ���� �߰ڵ�..�Ф�
        System.out.println(score);
        

    }
}
*/
/* �켱 �̰Ű� ��� ���ư������� �ñ�
        Scanner sc = new Scanner(System.in);
        int min = sc.nextInt(); //�켱 �ּڰ����� �Է�?
        int tmp =0;
        for(int i=0;i<10;i++){
            tmp = sc.nextInt();//���⼭�� 0~9���� 10�� �Է��ϴµ�
            if(Math.abs(100-min) >= Math.abs(100-min-tmp))
                min += tmp;
            else
                break;
        }
        System.out.println(min);
    }
}
*/
