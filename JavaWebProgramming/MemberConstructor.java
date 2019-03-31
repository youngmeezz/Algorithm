package JavaWebProgramming;

public class MemberConstructor{
    //필드(Field)
    private int memberNumber; //멤버번호
    private String memberName; //멤버이름
    private String memberAddress; //멤버주소

    //생성자
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

    //메소드(Method)
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
        System.out.println("멤버번호 : "+ memberNumber);
        System.out.println("멤버이름 : "+ memberName);
        System.out.println("멤버주소 : "+ memberAddress);
    }
}
