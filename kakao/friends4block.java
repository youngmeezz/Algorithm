package kakao;

/*
class Solution {
    public int solution(int m, int n, String[] board) {
        int answer = 0;
        return answer;
    }
  }
*/
//좀 어렵고 긴문제 이분꺼 풀이 포기
/*
import java.util.ArrayList;

public class friends4block{
    public static void main(String[] args){
        System.out.println(getRemoveCount(4,5,new String[]{"CCBDE", "AAADE", "AAABF", "CCBBF"}));
        System.out.println(getRemoveCount(6, 6, new String[]{"TTTANT", "RRFACC", "RRRFCC", "TRRRAA", "TTMMMF", "TMMTTJ"}));
    }
    
    public static int getRemoveCount(int m,int n,String[] arr){
      //입력받은 String 배열을 2차원 ArrayList로 변환
      ArrayList<ArrayList<String>> board = new ArrayList<ArrayList<String>>();
      for(String str : arr){
          ArrayList<String> innerList = new ArrayList<String>();
          for(char c : str.toCharArray()){
              innerList.add(String.valueOf(c));
          }
          board.add(innerList);
      }  
      int totalCnt = 0;
      int hitCnt = 0;
      System.out.print(board);
      //processHit에서 삭제 처리하고 삭제 카운트를 올림
      while((hitCnt = processHit(board)) > 0){
          totalCnt += hitCnt;
          System.out.println(board);
          //빈칸을 탐색하여 위에 있는 요소를 아래로 당김
          arrange(board);
          System.out.println(board);
      }
      return totalCnt;
    }
    private static int processHit(ArrayList<String>> board){
        int hitCnt =0;
        char[][] delMarkBoard = new char[board.size()][board.get(0).size()];

        //삭제되는 블럭 위치는 별도로 delMarkBoard에 체크
        for(int i=0;i<board.size();i++){
            for(int j=0;j<board.size();j++){
                String cur = board.get(i).get(j);
                //빈블럭이 아닌 경우 삭제되는지 확인
                if(!cur.isEmpty()){
                    //현재 i,j위치가 삭제 대상인지 확인
                    if((cur.equals(getValue(i-1,j-1,board)) && cur.equals(getValue(i-1,j,board)) && cur.equals(getValue(i,j-1,board)))
                    
                    )
                }
            }
        }
    }
}
*/
/*
어려워보이지만, 삼성 기출문제 공포의 2048에 비하면 쉬운 문제이다.

2048은 4방향으로 DFS+ 백트래킹을 해야하지만, 이 문제에서는 아래 방향으로만 구현하면 된다.
[출처] 알고리즘 카카오 신입 공채 1차 코딩 테스트 6번 프렌즈4블록 (자바로 구현하기!!) |작성자 호식이
*/
//입력으로 블록의 첫 배치가 주어졌을 때, 지워지는 블록은 모두 몇 개인지 판단하는 프로그램을 제작하라.
