package kakao;

import java.util.Scanner;

class Solution{
 
    private int[][] arr =new int[100][100];
    public int[] solution(int m,int n,int[][] picture){
        int numberOfArea =0;
        int maxSizeOfOneArea =0;

        int[] answer = new int[2];
        arr = picture;
        if(1<=m && n<=100){
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    if(this.arr[i][j]!=0){
                        numberOfArea +=1;
                        int currentSize = sizing(this.arr[i][j],i,j,this.arr.length,this.arr[0].length);
                        System.out.println(currentSize);
                        if(maxSizeOfOneArea <=currentSize){
                            maxSizeOfOneArea = currentSize;
                        }
                        else continue;
                    }
                }
            }
        }
            answer[0] = numberOfArea;
            answer[1] = maxSizeOfOneArea;
            return answer;
        }
    

        private int sizing(int number,int i,int j,int col,int row){
            if(i>=col || j>=row || i<0 || j<0 || number!=this.arr[i][j]){
                return 0;
            }
            this.arr[i][j] =0;
            int size =1;
            size+=sizing(number,i-1,j,col,row);
            size+=sizing(number,i,j-1,col,row);
            size+=sizing(number,i-1,j,col,row);
            size+=sizing(number,i,j+1,col,row);
            return size;
        }


    public static void main(String[] args) {

            
        Scanner sc = new Scanner(System.in);
        //Integer m = new (); // 입력받은 정수 문자열
       int m = sc.nextInt();
       int n = sc.nextInt();
       int input[][] = {{1,1,1,0}, {1,2,2,0}, {1,0,0,1}, {0,0,0,1}, {0,0,0,3}, {0,0,0,3}};
        Solution sol = new Solution();
       
     //  System.out.println(sol.solution(m,n,input));
       sol.solution(m,n,input);
       }
       
}