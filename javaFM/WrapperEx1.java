package javaFM;

class WrapperEx1{
    public static void main(String[] args){
        Integer i = new Integer(100);
        Integer i2 = new Integer(100);

        System.out.println("i==i2 ? "+(i==i2)); //객체 생성한 것이니까 == 은 객체가 가리키는 참조값 가짐 서로 가리키는 주소값이 달라서 false
        System.out.println("i.equals(i2) ? " + i.equals(i2)); //내용은 100으로 같으니까 값이 같으면 true
        System.out.println("i.compareTo(i2)="+i.compareTo(i2));
        System.out.println("i.toString()="+i.toString());

        System.out.println("MAX_VALUE="+Integer.MAX_VALUE);
        System.out.println("MIN_VALUE="+Integer.MIN_VALUE);
        System.out.println("SIZE="+Integer.SIZE+" bits");
        System.out.println("BYTES="+Integer.BYTES+" bytes");
        System.out.println("TYPE="+Integer.TYPE);
    }
}
