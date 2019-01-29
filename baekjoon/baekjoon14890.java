package baekjoon;

import java.util.*;
import java.io.*;
import java.util.StringTokenizer;

public class baekjoon14890{

    static int N,L,result =0;
    static int[][] map1,map2;
    static int[] slop;//����

    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        //���⼭ �߿��� ���� ���� ���̰� 1���� ũ�� �ٸ� �� �״ϱ�
        //��ġ�� �ٸ� ��ġ�� ���ϱ� ���� �� ���� ���̶�� ���� �˾ƾ��Ѵ�.

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
            //�����Ͱ� ���� ���� ��쿡�� üũ
            if(arr[index][i]!=arr[index][i+1]){            //�̰� �ǹ��ϴ°� �ش� �ε����� �����ε����� �ٸ���
                int diff = arr[index][i] - arr[index][i+1];
                if(diff !=-1 && diff !=1) //���̰� 1���� ũ�� ������ �� ���� ���̴�? (�� �켱 1,3 �̷��� �����ϸ� �� �ȵǴ� ���)
                return;            //�� ���̰� 1�϶��� �˻�(�ֳĸ� 1,2,3�� ������ ���ο� ���� �����ϸ� ���� ���θ� ����� ���� �� �ִ� ��찡 ���ܼ�)

                //�� ���̰� -1�̶�� �ش� �ε����� ���� ���� ���θ� ��ġ�ϴ� ��
                //�ε��� ������ �����ϼ��� 
                if(diff == -1){
                    //���� ����(?) -> ���ο� �� ������ �ִ���  ������ ���δ� �� �ǹ��ϴ°���?�׸����� ������ ���� ���� ���� ���� �׷��� �ִ�
                    for(int j=0;j<L;j++){
                        if(i-j<0 || slop[i-j]==1) 
                        return;
                        if(arr[index][i] == arr[index][i-j])
                        slop[i-j] =1;
                        else return;
                    }
                }else{
                    //������ ����?????
                    for(int j=1;j<=L;j++){
                        if(i+j >=N || slop[i+j] ==1)
                        return;
                        if(arr[index][i]-1 == arr[index][i+j]){
                        slop[i+j] =1;//���� slop�迭�� boolean���̴ϱ� 1�� ���� true�� �����µ�
                        }
                        else return;
                    }
                }
            }
        }
        result++;
        }
    }
//���� ���ο� ���θ� �����ϸ� �Ǵϱ� ���ϰ� �迭 �ΰ� �����ϰ�
//i,j�� �ٲ㼭 ������ �Ŀ� �Ȱ��� ������ ����߽��ϴ�.
//checkBuild �Լ������� ���� �迭�� index�� ����� ���̸� ���� �� �ִ��� Ȯ��
//������ �� ������ return�� �ϰ�
//�������� ������ result+1�� ���ݴϴ�.
//slop�迭�� �ش� �ε����� ���θ� ��ġ �ߴ��� ���ߴ����� �˷��ִ� boolean�迭�Դϴ�.