package JavaWebProgramming;

import java.lang.reflect.Member;

public class MemberConstructorMain{
    public static void main(String[] args){
    MemberConstructor m2 = new MemberConstructor(2000);
    m2.displayMember();
    System.out.println("====================");

    MemberConstructor m3 = new MemberConstructor(3000,"�Ӳ���");
    m3.displayMember();
    System.out.println("====================");

    MemberConstructor m4 = new MemberConstructor(4000,"����ġ","��õ�� ���̱�");

    m4.displayMember();
    System.out.println("====================");
    
    //�����ڰ� ����Ǿ� ���� ������ �ν��Ͻ��� ���� �� �� ����.
    //MemberConstructor m5 = new MemberConstructor(400,"����","������","��");
    }
}

