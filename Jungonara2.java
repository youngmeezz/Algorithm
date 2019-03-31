import java.util.*;

class Jungonara2 {

  public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        int m = sc.nextInt();
    
		int arr1[] = new int[n];
        int arr2[] = new int[m];
        int arr3[] = new int[n+m];
        
        for(int i =0; i<arr1.length;i++){
            arr1[i] = sc.nextInt();
            arr3[i] = arr1[i];
        }

        for(int j=0; j<arr2.length;j++){
            arr2[j] = sc.nextInt();
            arr3[j+arr1.length] = arr2[j];
        }
	
        
        //정렬
        Arrays.sort(arr3);

        for(int i=0;i<arr3.length;i++){
        System.out.print(arr3[i] +" ");
        }
		
  }
}

/*

    //Please don't change class name 'Main'
import java.util.*;

class Main {

  public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int arr1[] = new int[n];
		int arr2[] = new int[m];
		int arr3[] = new int[n+m];
		
		for(int i=0;i<arr1.length;i++){
			arr1[i] = sc.nextInt();
			arr3[i] = arr1[i];
		}
		
		for(int i=0;i<arr2.length;i++){
			arr2[i] = sc.nextInt();
			arr3[i+arr1.length] = arr2[i];
		}
		
		//정렬
		Arrays.sort(arr3);
		
		for(int i=0;i<arr3.length;i++)
				System.out.print(arr3[i]+" ");
	}
}

*/