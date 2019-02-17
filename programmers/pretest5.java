//우선 직관적 풀이를 확인하자
package programmers;

class pretest5{
    int pretest5(int[][] board,int size){
        int result =0;

        for(int i=0;i<size-1;i++){
            board[i+1][0] += Math.max(board[i][1],Math.max(board[i][2],board[i][3]));
            board[i+1][1] += Math.max(board[i][0],Math.max(board[i][2],board[i][3]));
            board[i+1][2] += Math.max(board[i][0],Math.max(board[i][1],board[i][3]));
            board[i+1][3] += Math.max(board[i][0],Math.max(board[i][1],board[i][2]));
        }
        result = Math.max(board[size-1][0], Math.max(board[size-1][1],Math.max(board[size-1][2],board[size-1][3])));
        return result;
        }
        public static void main(String[] args){
            pretest5 pre = new pretest5();
            int[][] test = { { 1, 2, 3, 5 }, { 5, 6, 7, 8 }, { 4, 3, 2, 1 } };
            System.out.println(pre.pretest5(test, 3));
        }
    }
