package kakao;

/*
class Solution {
    public int solution(int m, int n, String[] board) {
        int answer = 0;
        return answer;
    }
  }
*/
//�� ��ư� �乮�� �̺в� Ǯ�� ����
/*
import java.util.ArrayList;

public class friends4block{
    public static void main(String[] args){
        System.out.println(getRemoveCount(4,5,new String[]{"CCBDE", "AAADE", "AAABF", "CCBBF"}));
        System.out.println(getRemoveCount(6, 6, new String[]{"TTTANT", "RRFACC", "RRRFCC", "TRRRAA", "TTMMMF", "TMMTTJ"}));
    }
    
    public static int getRemoveCount(int m,int n,String[] arr){
      //�Է¹��� String �迭�� 2���� ArrayList�� ��ȯ
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
      //processHit���� ���� ó���ϰ� ���� ī��Ʈ�� �ø�
      while((hitCnt = processHit(board)) > 0){
          totalCnt += hitCnt;
          System.out.println(board);
          //��ĭ�� Ž���Ͽ� ���� �ִ� ��Ҹ� �Ʒ��� ���
          arrange(board);
          System.out.println(board);
      }
      return totalCnt;
    }
    private static int processHit(ArrayList<String>> board){
        int hitCnt =0;
        char[][] delMarkBoard = new char[board.size()][board.get(0).size()];

        //�����Ǵ� �� ��ġ�� ������ delMarkBoard�� üũ
        for(int i=0;i<board.size();i++){
            for(int j=0;j<board.size();j++){
                String cur = board.get(i).get(j);
                //����� �ƴ� ��� �����Ǵ��� Ȯ��
                if(!cur.isEmpty()){
                    //���� i,j��ġ�� ���� ������� Ȯ��
                    if((cur.equals(getValue(i-1,j-1,board)) && cur.equals(getValue(i-1,j,board)) && cur.equals(getValue(i,j-1,board)))
                    
                    )
                }
            }
        }
    }
}
*/
/*
�������������, �Ｚ ���⹮�� ������ 2048�� ���ϸ� ���� �����̴�.

2048�� 4�������� DFS+ ��Ʈ��ŷ�� �ؾ�������, �� ���������� �Ʒ� �������θ� �����ϸ� �ȴ�.
[��ó] �˰��� īī�� ���� ��ä 1�� �ڵ� �׽�Ʈ 6�� ������4��� (�ڹٷ� �����ϱ�!!) |�ۼ��� ȣ����
*/
//�Է����� ����� ù ��ġ�� �־����� ��, �������� ����� ��� �� ������ �Ǵ��ϴ� ���α׷��� �����϶�.
