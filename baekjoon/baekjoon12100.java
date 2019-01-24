package baekjoon;

import java.util.*;

public class baekjoon12100{
    
    static int N;
    static int max = 0;
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        N = scan.nextInt();
        int[][] m = new int[N][N];
        for(int i=0;i<N;i++)
            for(int j=0;j<N;j++)
                m[i][j] = scan.nextInt();
                Puzzle(0,m);
                System.out.println(max);
    }
    static void Puzzle(int depth,int[][] m){
        if(depth==5){
            for(int j=0;j<N;j++)
                for(int k=0;k<N;k++)
                if(m[j][k]>max)
                max = m[j][k];
                return;
        }else
        {
            for(int i=0;i<4;i++){
                int[][] tmap = new int[N][N];
                for(int j=0;j<N;j++)
                    for(int k=0;k<N;k++)
                        tmap[j][k]=m[j][k];
                        move(i,m);
                        Puzzle(depth+1,m);
                for(int j=0;j<N;j++)
                    for(int k=0;k<N;k++)
                        m[j][k]=tmap[j][k];
            }
        }
    }
    static void move(int d,int[][] m){
        switch(d){
            case 0:
            for(int i=0;i<N;i++)
                for(int j=0;j<N-1;j++){
                    for(int k=j+1;k<=N-1;k++){
                        if(m[i][j]==0){ // 행과 열이 0인경우 아무것도 없을떄 
                            m[i][j]=m[i][k]; //k는 j+1 j보다 하나 큰값 그니까 배열상으로 0,0 에서 0,1 아래로 내려간것 열이 커져서  
                            m[i][k]=0;
                        }
                        if(m[i][j]>0) //행과 열이 0보다 큰 경우
                        if(m[i][j]==m[i][k]){ //행과열이 하나 열값한 
                             m[i][j]*=2;
                             m[i][k]=0;
                             break;
                        }
                        else if (m[i][j]!=m[i][k]){ //
                            if(m[i][k]==0)
                                continue;
                                else break;
                        }
                    }
                }
                break;
            
                case 1:
                    for(int i=N-1;i>=0;i--)
                        for(int j=N-1;j>0;j--){
                            for(int k=j-1;k>=0;k--){
                                if(m[i][j]==0){
                                    m[i][j]=m[i][k];
                                    m[i][k]=0;
                                }
                                if(m[i][j]>0)
                                    if(m[i][j]==m[i][k]){
                                        m[i][j]*=2;
                                        m[i][k]=0;
                                        break;
                                    }
                                    else if(m[i][j]!=m[i][k]){
                                        if(m[i][k]==0)
                                        continue;
                                        else break;
                                    }
                                        
                            }
                        }
                        break;
                case 2:
                        for(int i=0;i<N;i++)
                            for(int j=0;j<=N-1;j++){
                                for(int k=i+1;k<=N-1;k++){
                                    if(m[i][j]==0){
                                        m[i][j]=m[k][j];
                                        m[k][j]=0;
                                    }
                                    if(m[i][j]>0)
                                    if(m[i][j]==m[k][j]){
                                        m[i][j]*=2;
                                        m[k][j]=0;
                                        break;
                                    }
                                    else if(m[i][j]!=m[k][j]){
                                        if(m[k][j]==0)continue;
                                        else break;
                                    }
                                }
                            }
                            break;
                case 3:
                        for(int i=N-1;i>=0;i--)
                            for(int j=N-1;j>=0;j--){
                                 for(int k=i-1;k>=0;k--){
                                     if(m[i][j]==0){
                                         m[i][j]=m[k][j];
                                         m[k][j]=0;
                                     }
                                     if(m[i][j]>0)
                                        if(m[i][j]==m[k][j]){
                                            m[i][j]*=2;
                                            m[k][j]=0;
                                            break;
                                        }
                                        else if(m[i][j]!=m[k][j]){
                                            if(m[k][j]==0) continue;
                                            else break;
                                        }
                                     }
                                 }
                                 break;
                            }
                         }
                    }



