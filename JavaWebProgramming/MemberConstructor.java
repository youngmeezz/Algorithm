package JavaWebProgramming;

public class MemberConstructor{
    //�ʵ�(Field)
    private int memberNumber; //�����ȣ
    private String memberName; //����̸�
    private String memberAddress; //����ּ�

    //������
    public MemberConstructor(){

    }
    public MemberConstructor(int memberNumber){
        this.memberNumber = memberNumber;
    }
    public MemberConstructor(int memberNumber,String memberName){
        super();
        this.memberNumber = memberNumber;
        this.memberName = memberName;
    }
    public MemberConstructor(int memberNumber, String memberName, String memberAddress){
        super();
        this.memberNumber = memberNumber;
        this.memberName = memberName;
        this.memberAddress = memberAddress;
    }

    //�޼ҵ�(Method)
    public int getMemberNumber(){
        return memberNumber;
    }
    public void setMemberNumber(int memberNumber){
        this.memberNumber = memberNumber;
    }
    public String getMemberName(){
        return memberName;
    }
    public void setMemberName(String memberName){
        this.memberName = memberName;
    }
    public String getMemberAddress(){
        return memberAddress;
    }
    public void setMemberAddress(String memberAddress){
        this.memberAddress = memberAddress;
    }
    public void displayMember(){
        System.out.println("�����ȣ : "+ memberNumber);
        System.out.println("����̸� : "+ memberName);
        System.out.println("����ּ� : "+ memberAddress);
    }
}
