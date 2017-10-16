import java.util.Scanner;

public class BinPower {
	
	
	Scanner input = new Scanner(System.in);
	//String capped for reason: its a class
	//int is not capped reason: it is a "primitive" type
	//Integer -- full name, with cap is a class
	
	public BinPower() {
		
	}
	
	public void setBinary() {
		
		//2**2 does not work, differs from Python
		
		//we don't need to say Math myMath = newMath(); because we have Static
		double exp = 2;
		double base = 2;
		int ans = 0;
		double answer = 0;
		String name = "";
		
		System.out.println("Hello most person person to person, what is your person name");
		name = input.nextLine();
		System.out.println("Thanks for usign this program or whatever " + name);
		
		System.out.println("What starting base do you want to use");
		base = input.nextDouble();
		System.out.println("you have entered: " + base);
		
		System.out.println(name + " what exponent do you want to use");
		exp = input.nextDouble();
		System.out.println(name + " you have entered: " + exp);
		
		//(int) "Type Casting" -- pow requires double, which makes no sense in binary
		answer = Math.pow(base, exp);
		System.out.println("Answer is: " + answer);
	}
	
}
