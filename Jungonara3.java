/*
import java.util.*;
import java.io.*;

class Jungonara3{

    static int first_quad;
    static int second_quad;
    static int third_quad;
    static int four_quad;
    static ArrayList<Point> list;


    public static void main(String[] args){

    }
}


    public static class Point {
	    int x, y;
	 
	    Point(int x, int y) {
	        this.x = x;
	        this.y = y;
	    }
	}

    */
    
//Please don't change class name 'Main'
import java.util.*;

class Main {
	public static class Point {
		public double x, y;
	}
  public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Point pt = new Point();
		pt.x = sc.nextDouble();
		pt.y = sc.nextDouble();
		
		if(pt.x > 0 && pt.y > 0) System.out.print("1");
		else if(pt.x < 0 && pt.y > 0) System.out.print("2");
		else if(pt.x < 0 && pt.y < 0) System.out.print("3");
		else System.out.print("4");
  }
}

