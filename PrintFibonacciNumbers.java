
public class PrintFibonacciNumbers {
	public static int Rec_Print_Fibonacci_Numbers(int n) {
		// if n is equals to 1 or less than 1 , return n
		if(n<=1) {
			return n;
	} 
		//  recursive call 
		return  Rec_Print_Fibonacci_Numbers(n-1) + Rec_Print_Fibonacci_Numbers(n-2) ;
	}
	

	public static void main(String[] args) {
		int n = 10;
		// print the first n numbers 
		System.out.println("the first 10 fib numbers are " );
		for (int i = 0; i < n; i++) {
			
			System.out.print( Rec_Print_Fibonacci_Numbers(i) + " ");
		}
		}

	}

