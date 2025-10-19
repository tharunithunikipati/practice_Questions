package operators;
import java.util*;
public class Prime {
	    public static void main(String[] args) {
	        System.out.println("Prime numbers from 1 to 10:");
	        for (int num = 2; num <= 10; num++) {
	            boolean isPrime = true;
	            for (int i = 2; i <= num / 2; i++) {
	                if (num % i == 0) {
	                    isPrime = false;
	                    break;
	                }
	            }
	            if (isPrime) {
	                System.out.print(num + " ");
	            }
	        }
	    }
	}
