import java.util.Scanner;
public class Tables{
	static Scanner tb=new Scanner(System.in);
	public static void main(String[] args){
		int a = 1;
		int b = tb.nextInt();
		for(;a<=10;a++){
			System.out.println(a + " X " + b + " = " + a*b);
		}
	}
}