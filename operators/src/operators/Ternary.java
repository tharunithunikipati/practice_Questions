package operators;
import java.util.*;

public class Ternary {
	public static void main(String args[]) {
		int a=12;
		int b=33;
		int min = b<a?b:a;
		System.out.println("min"+min);
		int max = a<b?b:a;
		System.out.println("max"+max);	
	}
}



