package kakao;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Collections;
import java.util.Scanner;

class camping{
static int solution(int n,int[][] data){

    //��ǥ ����
    ArrayList<Integer> xList = new ArrayList<>();
    ArrayList<Integer> yList = new ArrayList<>();

    for(int i=0;i<n;i++){

        xList.add(data[i][0]);
        yList.add(data[i][1]);
    }

    ArrayList<Integer> uniqueXList = new ArrayList<>(new HashSet<>(xList));
    ArrayList<Integer> uniqueYList = new ArrayList<>(new HashSet<>(yList));

    Collections.sort(uniqueXList);
    Collections.sort(uniqueYList);

    //������ �迭
    int[][] S = new int[n][n];

    for(int i=0;i<n;i++){
        int x = uniqueXList.indexOf(new Integer(data[i][0]));
        int y = uniqueYList.indexOf(new Integer(data[i][1]));

        //��ǥ ���� ����
        data[i][0] = x;
        data[i][1] = y;

        //���� �� �迭 �ʱⰪ
        S[x][y] = 1;
    }

    //N^2 ������ ���ϱ�
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){

            S[i][j] += (i-1 >=0 ? S[i-1][j] : 0)
                    + (j-1 >=0 ? S[i][j-1] : 0)
                    - (j-1 >=0 && j-1 >=0 ? S[i-1][j-1] : 0);
    }
}

int ans =0;
//N^2 ��� ���� ���տ� ���Ͽ� �˻�
for(int i=0;i<n;i++){
    for(int j= i+1;j<n;j++){

        //����#1 �˻� : ���簢���� �ƴѰ��
        if(data[i][0] == data[j][0] || data[i][1] == data[j][1])continue;

        //����#2 �˻� : ���ο� ���Ⱑ �����ϴ� ���
        int startX, startY, endX, endY;

        startX = Math.min(data[i][0], data[j][0]);
        startY = Math.min(data[i][1], data[j][1]);
        endX = Math.max(data[i][0], data[j][0]);
        endY = Math.max(data[i][1], data[j][1]);

        int cnt;

        if(startX + 1 > endX -1 || startY + 1 > endY -1){
            cnt =0;

        }else {
             cnt = S[endX -1][endY -1] - S[endX -1][startY] - S[startX][endY -1] + S[startX][startY];
        }

        if(cnt ==0) ans++;
    }
}

return ans;

}
public static void main(String args[]) {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int data[][] = {{0,0}, {1,1}, {0,2}, {2,0}};
  
    //Solution sol = new Solution();
    System.out.println(solution(n,data));

}


}

