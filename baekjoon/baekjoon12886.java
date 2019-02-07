package baekjoon;

//내 의사코드 풀이
/*
public class baekjoon12886{
    static int A;
    static int B;
    static int C;
    static int X;
    static int Y;

    public static void main(String[] args){


        //크기가 같지 않은 두 그룹 고른다 permutation
        permutation(a,b);
        
        //돌을 같은 갯수로 만들수 있으면 1
        if(X<Y)
        sum = X + Y;
        return 1;

        //돌을 같은 갯수로 만들수 없으면 0
        else
        sum = X - Y;
        return 0;
    }

    int permutation(int a,int b)
    {
        
    }
}
*/
/*
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class baekjoon12886{
    static int max;
    static int[] arr = new int[3];
    public static void main(String[] ars){
        Scanner sc = new Scanner(System.in);
        int sum =0;
        for(int i=0;i<3;i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
            max = Math.max(max, arr[i]);
        }
        //3개로 쪼갤 수 없다면볼 필요 없다.
        if(sum%3!=0)
        System.out.println(0);
        else solve();
    }

    static HashSet<String> set = new HashSet<>();
    private static void solve(){
        Queue<Pair> queue = new LinkedList<>();
        Arrays.sort(arr);
        queue.add(new Pair(arr));
        boolean flag = false;
        while(!queue.isEmpty()){
                Pair t = queue.poll();
                //모두 동일 하다면 종료
                if(t.tArr[0] == t.tArr[1] && t.tArr[0] == t.tArr[2]){
                    flag = true;
                    break;
                }
                int next = t.tArr[0];
                //다른 것 과 비교(sort되어 있기 때문에 1부터)
                for(int i=1;i<3;i++){
                    int[] tArr = new int[3];
                    //원본 복사
                    for(int j=0;j<3;j++){
                        tArr[j] = t.tARr[j];
                        int now = t.tArr[i];
                        if(now>next)
                        {
                            if(now-next>0){
                                tArr[i] = now-next;
                                tArr[t.idx] = next*2;
                            }
                        }else if(now<next){
                            if(next-now>0){
                                tArr[i] = now*2;
                                tArr[t.idx] = next-now;
                            }
                        }
                        //중복 검사를 막자
                        String str ="";
                        Arrays.sort(tArr);
                        for(j=0;j<3;j++)
                        str+=tArr[j];
                        if(!set.contains(str)){
                            queue.add(new Pair(tArr));
                            set.add(str);
                        }
                    }
                }
                if(flag) 
                System.out.println(1);
                else
                System.out.println(0);
            }
            static class Pair{
                int[] tArr = new int[3];
                int idx;
                Pair(int[] t){
                    for(int i=0;i<3;i++)
                    tArr[i] = t[i];
                }
            }
        }
        */

        
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
 
public class baekjoon12886 {
    static int max;
    static int[] arr = new int[3];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for(int i=0;i<3;i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
            max = Math.max(max, arr[i]);
        }
        // 3개로 쪼갤 수 없다면 볼 필요없다.
        if(sum%3!=0) System.out.println(0);
        else solve();
    }
    
    static HashSet<String> set = new HashSet<>();
    private static void solve() {
        Queue<Pair> queue = new LinkedList<>();
        Arrays.sort(arr);
        queue.add(new Pair(arr));
        boolean flag = false;
        while(!queue.isEmpty()) {
            Pair t = queue.poll();
            // 모두 동일하다면 종료
            if(t.tArr[0]==t.tArr[1]
                    &&t.tArr[0]==t.tArr[2]) {
                flag = true;
                break;
            }
 
            int next = t.tArr[0];
            // 다른 것과 비교(sort되어 있기 때문에 1부터)
            for(int i=1;i<3;i++) {
                int[] tArr = new int[3];
                // 원본 복사
                for(int j=0;j<3;j++)
                    tArr[j] = t.tArr[j];
                int now = t.tArr[i];
                if(now>next) {//정렬 안되어있음 2 1 
                    if(now-next>0) {
                        tArr[i] = now-next;
                        tArr[t.idx] = next*2;
                    }
                }else if(now<next) { //정렬 되어 있음 1 2
                    if(next-now>0) {
                        tArr[i] = now*2;
                        tArr[t.idx] = next-now;
                    }
                }
                // 중복 검사를 막자
                String str="";
                Arrays.sort(tArr);
                for(int j=0;j<3;j++)
                    str+=tArr[j];
                if(!set.contains(str)) {
                    queue.add(new Pair(tArr));
                    set.add(str);
                }
            }
        }
        if(flag) System.out.println(1);
        else System.out.println(0);
    }
    
    static class Pair{
        int[] tArr = new int[3];
        int idx;
        Pair(int[] t){
            for(int i=0;i<3;i++)
                tArr[i] = t[i];
        }
    }
}