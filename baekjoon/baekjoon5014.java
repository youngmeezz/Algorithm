package baekjoon;
//BFS로 풀면 된다.
//1. 시작 점부터 큐에 넣어 up,down 이동 경로를 다시 큐에 넣는다.
//2. 큐에서 나온 점이 도착점과 같다면 종료한다.
//3. 범위가 0보다 작거나 최댓값인 F보다 크다면 패스한다.
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class baekjoon5014{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");

        int F = Integer.parseInt(str[0]);
        int S = Integer.parseInt(str[1]);
        int G = Integer.parseInt(str[2]);
        int U = Integer.parseInt(str[3]);
        int D = Integer.parseInt(str[4]);
        int arr[] = new int[F+1];
        System.out.println(BFS(F,S,G,U,D,arr));
    }

    public static String BFS(int Floor, int start, int end, int up, int down, int arr[]){
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(start);
        arr[start] = 1;

        while(!q.isEmpty()){
            int current = q.poll();
            if(current == end){
                return String.valueOf(arr[current] -1);
            }
            //다음 up 이동할 위치가 최대 값보다 작고 방문하지 않은 지점이여야 한다.
            if(current + up <= Floor){
                if(arr[current + up] == 0){
                    arr[current + up] = arr[current] + 1;
                    q.add(current + up);
                }
            }
            //다음 down이동할 위치가 최대 값보다 작고 방문하지 않은 지점이여야 한다.
            if(current - down > 0){
                if(arr[current - down] == 0){
                    arr[current - down] = arr[current] + 1;
                    q.add(current - down);
                }
            }   
        }
        return "use the stairs";


        }
    }
