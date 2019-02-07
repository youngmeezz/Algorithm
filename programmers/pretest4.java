package programmers;

public class pretest4{
public int getLargestSquare(int[][] board){

    int result = 0;
    int height = board.length;
    int width = board[0].length;
    int[][] helper = new int[height+1][width+1];

    //새로운 보드 생성
    for(int i=0;i<height;i++){
        for(int j=0;j<width;j++){
            helper[i+1][j+1] = board[i][j];
        }
    }
    //계산
    for(int i=1;i<height+1;i++){
        for(int j=1;j<width+1;j++){
            if(helper[i][j]==1){
                helper[i][j] = helper[i][j]+Math.min(helper[i-1][j-1], Math.min(helper[i][j-1],helper[i-1][j]));
                result = Math.max(result,helper[i][j]);
            }
        }
    }
    //정사각형의 넓이 리턴
    return result*result;
}
}