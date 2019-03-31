//최빈수 구하기
/*
package swea;

import java.io.*;
import java.util.*;

public class swea1204 {
    // static int arr[];
    static int score;
    static int t;
    static int cnt;

public static void main(String[] args)throws IOException{

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //StringTokenizer st = new StringTokenizer(br.readLine());

    int arr[] = new int[1000];
    score = Integer.parseInt(br.readLine());
    //int cnt[] = new int[];
    //int max =100;
    t = Integer.parseInt(br.readLine());
for(int test_case =1;test_case<=t;test_case++){


    for(int i=0;i<100;i++){
        for(int j=0;j<100;j++){
        if(arr[i] == arr[j]){
            cnt++;
            }
        }
    if(arr[cnt]<arr[cnt+i])
        System.out.print("# "+arr[cnt+i]);
    else
        System.out.print("# "+arr[cnt]);
        
  
            }
        }
    }
}
*/

package swea;

import java.io.*;
import java.util.*;

public class swea1204 {
    static int t;
public static void main(String[] args)throws IOException{

    Scanner sc = new Scanner(System.in);
    //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    t = sc.nextInt();

for(int test_case =1;test_case<=t;test_case++){
    //테스트케이스 번호
       int num = sc.nextInt();
    //1000명의 학생 점수 저장할 배열
    int score[] = new int[1000];

    //1000명에 해당하는 학생 점수 저장 잊지 말기
    //student가 학생수 score가 학생점수
    for(int student=0;student<1000;student++){
        score[student] = sc.nextInt();
    }
    
    //카운팅할 배열 선언 0~100점까지count는 점수의 갯수이다. 
    int count[] = new int[101];

    //이런식으로 count배열인덱스 안에 student를 넣으면
    //0점인 사람입력됬으면count[0]++
    //1점인 사람 입력 안됬으면 count[1]은 ++조차 안되고 count[1]이라는것 자체가 없을 것이기떄문에
    //다시 생각해보면
    //score[0] = 100 score[1] =92 score[2] = 100 score[3] = 92 score[4] = 92 score[5] = 100  
    //count[score[0]]++ 은 count[100]++; count[100]이 1증가
    //count[score[1]]++ 은 count[92]++; count[92]이 1증가
    //count[score[2]]++ 은 count[100]++; count[100]이 1증가 => 2가됨
    //count[score[3]]++ 은 count[92]++; count[92]이 1증가 -> 2가됨
    //count[score[4]]++ 은 count[92]++; count[92]이 1증가 -> 3이됨
    //count[score[5]]++ 은 count[100]++; count[100]이 1증가 -> 3이됨
    for(int i=0;i<1000;i++){
        count[score[i]]++;
    }

    //목표가 최대로 많이 나온 숫자 중 찾는건데
    //많이 나온 숫자가 같은 갯수로 많이 나왔으면 그것보다 더 큰 수 써야 됨 그래서 
    int result =0;
    int temp =0;

    for(int max=100;max>=0;max--){
        //100점은 1명있다. 0<1 이니까 result에 1대입하고 temp에 100점이 들어감
        //99점은 2명있다. 1<2 이니까 result에 2대입하고 temp에 99점이 들어감
        //98점은 3명있다. 2<3 이니까 result에 3대입하고 temp에 98점이 들어감
        //97점은 1명있다. 3<1 이니까 if문 빠져나오고 for문돌면서 max 1감소
        //96점은 4명있다. 3<4 이니까 result에 4 대입하고 temp에 96점이 들어감
        //95점은 4명있다. 4<4 이니까 if문빠져나오고 for문 돌면서 max 1감소
        //나머지 점수 4보다 작은 3,2,1,0숫자가 들어감 그러면
        //많이나온 숫자 중에서(4가 나온 96,95) 가장 큰 점수는 96점출력하게됨
        //이런식으로 max가 0까지 다 돌게 된다.
        if(result < count[max]){
            result = count[max];
            temp = max;
        }
    }

        System.out.println("#"+num+" "+temp);
            }
        }
    }    
/*
package swea;
import java.util.Scanner;

public class swea1204 {
 
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
 
        int N = s.nextInt();
         
        // 테스트 케이스 1~10개
        for (int i = 1; i <= N; i++) {
            int num = s.nextInt();  // 테스트케이스 번호
            int[] array = new int[1000]; // 1000명 학생 점수 저장할 배열
             
            for (int j = 0; j < array.length; j++) { // 1000명 학생 점수 저장
                array[j] = s.nextInt();
            }
             
            // 카운팅할 배열 선언 0~100
            int[] countarray = new int[101];
             
            for (int j = 0; j < array.length; j++) {
                countarray[array[j]]++;  // 카운팅하는 부분
            }
 
            int result = 0;
            int temp = 0;
             
            for (int max = 100; max >=0 ; max--) {
                if(result < countarray[max]) {
                    result = countarray[max];
                    temp = max;
                }
            }
             
            System.out.println("#"+num+" "+temp);
                 
        } // end of for
         
         
         
         
    } // end of main
 
}// end of class
*/