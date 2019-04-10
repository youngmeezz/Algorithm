package javaFM;

class WrapperEx2{
    public static void main(String[] args){
        int i = new Integer("100").intValue();
        int i2 = Integer.parseInt("100");
        Integer i3 = Integer.valueOf("100");

        //문자 100을 기본형 타입 숫자로 int로
        int i4 = Integer.parseInt("100",2);
        int i5 = Integer.parseInt("100",8);
        int i6 = Integer.parseInt("100",16);
        int i7 = Integer.parseInt("FF",16);
        //int i8 = Integer.parseInt("FF");

        //문자 100을 wrapper 클래스 객체 숫자 Integer로 
        Integer i9 = Integer.valueOf("100",2);
        Integer i10 = Integer.valueOf("100",8);
        Integer i11 = Integer.valueOf("100",16);
        Integer i12 = Integer.valueOf("FF",16);
       /// Integer i13 = Integer.valueOf("FF"); NumberFormatException발생

        System.out.println(i);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println("100(2) -> " +i4);
        System.out.println("100(8) -> " +i5);
        System.out.println("100(16) -> " +i6);
        //System.out.println("FF(16) ->" +i7); 컴파일러가 진수 표시 안해놓으면 10진수로 자동 default로 됨 근데 10진수는 "FF"없으니까 컴파일 에러
        //NumberFormatException발생
        System.out.println("100(2) ->" +i9);
        System.out.println("100(8) ->" +i10);
        System.out.println("100(16) ->" +i11);
        System.out.println("FF(16) ->" +i12);

    }
}