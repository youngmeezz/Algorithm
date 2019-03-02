package programmers;
import java.util.*;
public class onlinecoding2 {


  public static void main(String []args) {
    int people[] = {2, 3};
    solution(people);
    int tshirts[] = {1, 2, 3};
	solution(tshirts);

}

public int solution(int people[], int tshirts[]) {

    Arrays.sort(people);
    Arrays.sort(tshirts);

    int cnt =0;
    for(int i=0;i<people.length;i++){
        for(int j=0;j<tshirts.length;j++){
            if(people[i]==tshirts[j]){
            cnt++;
            break;
            }
            /*
            if(tshirts[j]==tshirts[j+1])
            continue;
            */
            
        }
    }

    System.out.println(cnt);
    int answer = cnt;
    return answer;
    }
}
