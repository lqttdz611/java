package learnoop;
import java.util.Scanner;

public class Learnoop {

    public static void main(String[] args) {
        // TODO code application logic here
//
//            int a = 2468;
//            int b = 1234;
//            System.out.println(a + " + " + b + "=" + (a + b));
//            System.out.println(a + " - " + b + "=" + (a - b));
//            System.out.println(a + " * " + b + "=" + (a * b));
//            System.out.println(a + " / " + b + "=" + (a / b));



//		Scanner s= new Scanner(System.in);
//		System.out.println("Hello " + s.next());


		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

	    for (int i = 0; i < n; i++) {
	        for (int j = i + 1; j < n; j++) {
	            if (arr[i] > arr[j]) {
	                // Nếu arr[i] > arr[j] thì hoán đổi giá trị của arr[i] và arr[j]
	                int temp = arr[i];
	                arr[i] = arr[j];
	                arr[j] = temp;
	            }
	        }
	    }
	    
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}

        
    



