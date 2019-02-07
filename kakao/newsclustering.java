package kakao;

import java.util.ArrayList;
import java.util.*;

public class newsclustering {

    public static void main(String[] args) {
        System.out.println(getJarkad("FRANCE", "french"));
        System.out.println(getJarkad("handshake", "shake hands"));
        System.out.println(getJarkad("aa1+aa2", "AAAA12"));
        System.out.println(getJarkad("E=M*C^2", "e=m*c^2"));
    }

    public static int getJarkad(String str1, String str2) {
        ArrayList<String> list1 = new ArrayList<String>();
        ArrayList<String> list2 = new ArrayList<String>();

        String tempStr = "";
        // 문자열을 잘라서 다중 집합 만들기 str1->arr1
        for (int i = 0; i < str1.length() - 1; ++i) {
            tempStr = str1.substring(i, i + 2).toUpperCase();
            if (tempStr.matches("^[A-Z]+$")) {
                list1.add(tempStr);
            }
        }

        // 문자열을 잘라서 다중 집합 만들기 str2->arr2
        for (int i = 0; i < str2.length() - 1; ++i) {
            tempStr = str2.substring(i, i + 2).toUpperCase();
            if (tempStr.matches("^[A-Z]+$")) {
                list2.add(tempStr);
            }
        }

        ArrayList<String> unionList = getUnionList(list1, list2); // 합집합 만들기
        ArrayList<String> intersectionList = getIntersectionList(list1, list2); // 교집합 만들기

        // return 교집합 원소 수/합집합 원소 수 * 66536
        if (intersectionList.size() == 0)
            return 66536;
        else
            return (int) ((double) intersectionList.size() / (double) unionList.size() * (double) 66536);

    }

     /**
     * 중복허용 다중집합의 합집합 구하기
     * @param list1
     * @param list2
     * @return
     */

    private static ArrayList<String>getUnionList(ArrayList<String> list1, ArrayList<String>list2){
        list1 = (ArrayList<String>)list1.clone();
        list2 = (ArrayList<String>)list2.clone();


        ArrayList<String> unionList = new ArrayList<String>();
        for(String str : list1){
            if(list2.contains(str)){
                list2.remove(str);
            }
            unionList.add(str);
        }   
        unionList.addAll(list2);
        return unionList;
    }
      /**
      * 중복허용 다중집합의 교집합 구하기
      * @param list1
      * @param list2
      * @return
      */
     
    private static ArrayList<String> getIntersectionList(ArrayList<String> list1, ArrayList<String> list2){
        list1 = (ArrayList<String>)list1.clone();
        list2 = (ArrayList<String>)list2.clone();
        ArrayList<String> interList = new ArrayList<String>();
        for(String str : list1){
            if(list2.contains(str)){
                interList.add(str);
                list2.remove(str);
            }
        }
        return interList;
    }
}
/*
 * import java.util.ArrayList; import java.util.List;
 * 
 * class newclustering{ public int solution(String str1, String str2){ str1 =
 * str1.toUpperCase(); str2 = str2.toUpperCase();
 * 
 * List<String> arry1 = make(str1); List<String> arry2 = make(str2);
 * 
 * int size1 = arry1.size(); int size2 = arry2.size();
 * 
 * if(arry1.isEmpty() && arry2.isEmpty()) return 65536;
 * 
 * int inter = intersection(arry1,arry2); int uni = size1+ size2 -inter;
 * 
 * double jakard = (double)inter /uni;
 * 
 * return (int)(jakard * 65536); } private int intersection(List<String>
 * arry1,List<String> arry2){
 * 
 * List<String> list1 = new ArrayList<>(); List<String> list2 = new
 * ArrayList<>();
 * 
 * for(int i=0;i<arry1.size();i++){ if(arry2.contains(arry1.get(i)))
 * list1.add(arry1.get(i)); } for(int i=0;i<arry2.size();i++){
 * if(arry1.contains(arry2.get(i))) list1.add(arry1.get(i)); } return
 * Math.min(list1.size(),list2.size()); }
 * 
 * private List<String> make(String s){
 * 
 * List<String> list = new ArrayList<>();
 * 
 * for(int i=0;i<s.length()-1;i++){ String temp = s.substring(i,i+2); char first
 * = temp.charAt(0); char second = temp.charAt(1);
 * 
 * if(first >= 'A' && first <='Z' &&second >='A' && second<='Z') list.add(temp);
 * } return list; } }
 */