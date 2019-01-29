package baekjoon;

import java.util.*;
import java.io.*;
import java.util.StringTokenizer;

public class baekjoon14890{

    static int N,L,result =0;
    static int[][] map1,map2;
    static int[] slop;//경사로

    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        //여기서 중요한 것은 서로 차이가 1보다 크면 다른 값 그니까
        //위치가 다른 위치로 가니까 지날 수 없는 길이라는 것을 알아야한다.

        N = Integer.parseInt(st.nextToken());
        L = Integer.parseInt(st.nextToken());
        map1 = new int[N][N];
        map2 = new int[N][N];

        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<N;j++){
                map2[j][i] = map1[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for(int i=0;i<N;i++){
            checkBuild(i,map1);
            checkBuild(i,map2);
        }
        System.out.println(result);
    }
    private static void checkBuild(int index,int[][] arr){
        slop = new int[N];
        for(int i=0;i<N-1;i++){
            //다음것과 같지 않은 경우에만 체크
            if(arr[index][i]!=arr[index][i+1]){            //이게 의미하는게 해당 인덱스랑 다음인덱스가 다르고
                int diff = arr[index][i] - arr[index][i+1];
                if(diff !=-1 && diff !=1) //차이가 1보다 크면 지나갈 수 없는 길이다? (아 우선 1,3 이렇게 시작하면 다 안되는 경우)
                return;            //그 차이가 1일때만 검사(왜냐면 1,2,3이 있을떄 새로운 숫자 등장하면 이제 경사로를 세울수 없을 수 있는 경우가 생겨서)

                //그 차이가 -1이라면 해당 인덱스의 다음 부터 경사로를 설치하는 것
                //인덱스 관리에 주의하세요 
                if(diff == -1){
                    //왼쪽 경사로(?) -> 경사로에 왜 왼쪽이 있는지  오른쪽 경사로는 뭘 의미하는거지?그림에서 오른쪽 경사로 왼쪽 경사로 따로 그려져 있다
                    for(int j=0;j<L;j++){
                        if(i-j<0 || slop[i-j]==1) 
                        return;
                        if(arr[index][i] == arr[index][i-j])
                        slop[i-j] =1;
                        else return;
                    }
                }else{
                    //오른쪽 경사로?????
                    for(int j=1;j<=L;j++){
                        if(i+j >=N || slop[i+j] ==1)
                        return;
                        if(arr[index][i]-1 == arr[index][i+j]){
                        slop[i+j] =1;//지금 slop배열이 boolean값이니까 1을 쓰면 true가 나오는듯
                        }
                        else return;
                    }
                }
            }
        }
        result++;
        }
    }
//길은 가로와 세로만 생각하면 되니까 편하게 배열 두개 선언하고
//i,j만 바꿔서 저장한 후에 똑같은 로직을 사용했습니다.
//checkBuild 함수에서는 받은 배열의 index에 저장된 길이를 지날 수 있는지 확인
//지나갈 수 없으면 return을 하고
//지나갈수 있으면 result+1을 해줍니다.
//slop배열은 해당 인덱스에 경사로를 설치 했는지 안했는지를 알려주는 boolean배열입니다.