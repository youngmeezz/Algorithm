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
        score = sc.nextInt(); // 마리오가 받는 점수
        sum += score;
        }
        //100에 가깝게 만들려면
        //가까운 순서를 어떻게 찾지?
        //이거를 못하겠따
        if(score<max)
        {
            score = max;//score를 더 큰 값으로 치환해주고
            //첫째 줄에 마리오가 받는 점수 출력
        }
    
        //요즘 프로그래머스로 사람 뽑는 구나 중고나라도 계속 채용 공고 뜨겠따..ㅠㅠ
        System.out.println(score);
        

    }
}
*/
/* 우선 이거가 어떻게 돌아갔는지도 궁금
        Scanner sc = new Scanner(System.in);
        int min = sc.nextInt(); //우선 최솟값부터 입력?
        int tmp =0;
        for(int i=0;i<10;i++){
            tmp = sc.nextInt();//여기서도 0~9까지 10개 입력하는데
            if(Math.abs(100-min) >= Math.abs(100-min-tmp))
                min += tmp;
            else
                break;
        }
        System.out.println(min);
    }
}
*/
