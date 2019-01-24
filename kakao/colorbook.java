package kakao;

import java.util.Scanner;

public class colorbook{
    
    //visit하는 함수를 하나 만들어 줘라
    
    int[][] pic =new int[100][100];
    boolean[][] map;
    int[] row;
    int[][] col;
    public int[] solution(int m,int n,int[][] picture){
        row = new int[m * n];
        pic = picture;
        //map = new boolean[m][n];
        int numberOfArea = 0;
        int maxSizeOfOneArea = 0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                //System.out.println(pic[i][j]);
                if(pic[i][j]==0)
                  continue;
                //row[pic[i][j]] +=1;
                if(i>0 && pic[i-1][j]==pic[i][j]) //위쪽
                    row[pic[i][j]] +=1;
                else if(j>0 && pic[i][j-1]==pic[i][j])//왼쪽
                    row[pic[i][j]] +=1;
                else if(row[pic[i][j]] != 0) {
                    pic[i][j] += 10000;
                }
                if(picture[i][j]!=0){
                    numberOfArea++;
                   //int sum = traversal(i,j);
                    if(row[pic[i][j]]>maxSizeOfOneArea){
                        maxSizeOfOneArea =  row[pic[i][j]];
                        
                    }
                }
            }
        }
        for(int j=0;j<n;j++) System.out.println(row[j]);
        System.out.println(row.length - 1);
        System.out.println(maxSizeOfOneArea);
        int[] answer = new int[2];
        answer[0] = numberOfArea;
        answer[1] = maxSizeOfOneArea;
        return answer;
    }
    /*
    public int traversal(int i,int j){
        int sum =1;
        /*
        //map[i][j] = true;
        if(i>0 && map[i-1][j]==false && pic[i-1][j]==pic[i][j]){위
            //sum+=traversal(i-1,j);

        }
        if(i+1<map.length && map[i+1][j]==false && pic[i+1][j]==pic[i][j]){아래
            sum+=traversal(i+1,j);
        }
        if(j>0 && map[i][j-1]==false && pic[i][j-1]==pic[i][j]){왼
            sum+=traversal(i,j-1);
        }
        if(j+1<map[i].length && map[i][j+1]==false && pic[i][j+1]==pic[i][j]){오른
            sum+=traversal(i,j+1);
        }
        

        return sum;
        }
        */
        public static void main(String[] args) {

             Scanner sc = new Scanner(System.in);
             //Integer m = new (); // 입력받은 정수 문자열
            int m = sc.nextInt();
            int n = sc.nextInt();
            int input[][] = {{1,1,1,0}, {1,1,2,0}, {1,0,0,1}, {0,0,0,1}, {0,0,0,3}, {0,0,0,3}};
            colorbook sol = new colorbook();
            //System.out.println(sol.solution(m,n,input));
            sol.solution(m,n,input);
            }
            
     }
