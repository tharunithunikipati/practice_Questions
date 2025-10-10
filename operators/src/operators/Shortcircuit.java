package operators;
public class Shortcircuit {
	public static void main(String args[]) {
		int a=90;
		int b=70;
		if(a++==90 | b++==70)
		{
			System.out.println(a+" "+b);
		}
		int c=10;
		int d=10;
		if(c++==10 ||d++==10)
		{
		System.out.println(c+" "+d);
	}
	}
}



