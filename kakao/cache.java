package kakao;


import java.util.LinkedList;
import java.util.*;
public class cache{
    static final int HIT = 1;
    static final int MISS = 5;

    public static void main(String[] args){
        String[] cities = {"Jeju","Pangyo","Seoul","NewYork","LA","Jeju","Pangyo","Seoul","NewYork","LA"};
        int cacheSize = 3;

        System.out.println(solution(cacheSize,cities));
    }
    static int solution(int cacheSize,String[] cities){
        int answer = 0;

        Queue<String> queue = new LinkedList<>();

        for(String city : cities){
            String c = city.toLowerCase();

            //HIT
            if(queue.contains(c)){
                queue.remove(c);
                queue.add(c);
                answer +=HIT;
            }
            //MISS
            else{
                if(queue.size() < cacheSize){
                    queue.add(c);
                }
                //������ ��ü
                else{
                    queue.poll();

                    if(queue.size() <cacheSize) queue.add(c);
                }
                answer += MISS;
            }
        }
        return answer;
    }
}