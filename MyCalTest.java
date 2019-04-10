public class MyCalTest{
    public static void main(String[] args){
        Calculator cal = new MyCal();//Calculator타입으로 cal 계산기 만듬 내가 만든계산기 MyCal()을 만든다.
        System.out.println(cal.plus(3,4));
        System.out.println(cal.multiple(2,3));
        int i = cal.exec(5,6); //default로 구현했던 메서드
        System.out.println(i);//정수값을 리턴하니까 
        //아까 default로 구현한 메서드도 사용 되어짐 인터페이스에다가 구현한 메서드도 잘 실행됨.


        //자바 8에서는 왜 default메서드를 만들었을까? 인터페이스가 변경이 되면 그 인터페이스를 구현하고 있는 모든 클래스에 해당하는 모든 클래스를 구현해야 하는 문제점
        //모두 구현해야 하는 불편함이 있다.
        //인터페이스에 메서드를 구현해 놓을 수 있도록 추가해 놓음

        //그리고, 자바 8의 인터페이스는 static 키워드를 이용하여 메소드 구현!!!이 가능
        //인터페이스에서 static한 메서드를 선언함으로서 인터페이스를 이용해서 간단한 기능을 가지는 utility성 인터페이스를 만들 수 있게 된다.
        //static한 메서드 이름은 인터페이스명.메소드명();(O)static한 메서드를 할때 호출방법 인터페이스명.메서드명 꼭 기억하기
        //cal.exec2(3,4);참조변수명.메소드명();은 불가
        Calculator.exec2(3,4);

    }
}

//자바 8이 등장하면서 인터페이스가 변경한게 있다.
//기본 인터페이스는 추상메서드만 가능했다.
//자바 8들어와서 default method와 static method정의 가능
//인터페이스가 default키워드로 선언되면 메서드를 구현할 수 있고,또한 구현한 클래스는 이런 default메서드를 오버라이딩 할 수 도 있다. 