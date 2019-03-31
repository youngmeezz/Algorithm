package baekjoon;

import java.util.*;
import java.io.*;

//풀이 방법은 while문으로 무한 루프를 돌려 준다음 1분단위로 total값을 ++을 해줍니다.
//이후에 운동이 가능한 경우
//운동이 불가능한 경우 휴식을 취하는데 맥박은 초기 m값 이하로 떨어지지 않아서 조건 추가
//마지막으로 운동을 마칠수 없는 경우는 다음과 같다
//최대 맥박수 - 최소맥박수 값이 운동할때 증가하는 맥박수 T보다 작게 되면
//ex) 100 - 90 < 20이라면 운동을 할수 없게 되니까


public class baekjoon1173{

    static int T;
    static int N;
    static int m;
    static int M;
    static int R;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt(); //운동하는 시간 N
        m = sc.nextInt(); //처음 맥박 m
        M = sc.nextInt(); //최대 맥박 M
        T = sc.nextInt(); //맥박이 증가하는 만큼 T
        R = sc.nextInt(); //맥박이 감소하는 만큼 R

        int min = m;
        int ans =0;
        int total =0;
        
        //만약 운동을 끝낼 수 없다면 -1을 출력한다.
        if(M<m+T){
            System.out.println(-1);
        }
        //풀이 방법은 while문으로 무한 루프를 돌려 준다음 1분단위로 total값을 ++을 해줍니다.
        while(true){
            //해답(총 운동하는 시간)이랑 운동하는 시간이랑 같으면 멈춰라
            if(ans == N){
                break;
            }
            //total++;

            //이후에 운동이 가능한 경우
            if(m+T<=M){ //운동할때
                ans++;
                m+=T;
                total+=1;

        //최대 맥박수 - 최소맥박수 값이 운동할때 증가하는 맥박수 T보다 작게 되면
            }else if(m+T>T){ //최대 맥박수 넘어가면 휴식 시간
                total+=1;
                m-=R;
        //운동이 불가능한 경우 휴식을 취하는데 맥박은 초기 m값 이하로 떨어지지 않아서 조건 추가
                if(m<min)
                m = min;// m 값 이하론 떨어지지 않는다.
            }
        }

                                          .        //영식이가 운동 과정을 끝내는데 걸리는 시간의 최솟값을 출력하는 프로그램을 작성하시오.
        System.out.println(total);

        //영식이의 맥박이 처음에 m이고, 영식이가 운동을 N분 하려고 할떄,(이 시간이 꼭 연속이 될 필요는 없다)
        //영식이가 운동 과정을 끝내는데 걸리는 시간의 최솟값을 출력
        /*
        if(m>=50 && m<=200 && M>=m && M<=200){
   
        }
        else
            return -1;
*/

    }
}