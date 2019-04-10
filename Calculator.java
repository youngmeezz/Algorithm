public interface Calculator{
    public int plus(int i,int j);
    public int multiple(int i,int j);
    //기존에 interface는 추상클래스만 가져서 메서드 구현을 하면 에러가 난다.
    
    default int exec(int i, int j){
        return i + j;
    }
    //자바 8의 인터페이스는 default 키워드를 이용하여 메소드선언 후  구현까지!! 가능
  
    public static int exec2(int i,int j){
        return i*j;
    }
    //인터페이스에서 정의한 static메서드는 interface명.메소드명();
}