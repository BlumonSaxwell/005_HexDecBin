import java.util.Scanner;

public class HexDecBin {
//
	Scanner kbd = new Scanner(System.in);
	String name = "";
	String Option = "";
	String hex = "";
	String End = "";
	Boolean GameStatus = true;
	int num;
	
	public HexDecBin() {
		System.out.println("Welcome to my Hexadecimal, decimal, or binary conversion prog");
		System.out.println("What is your name?");
		name = kbd.nextLine();
		System.out.println("Very nice to meet you " + name);
		System.out.println("What is your starting base? 1-Hex 2-Dec 3-Bin");
		Option = kbd.nextLine();
		if (Option == "1") {
			HexDecBin baseConverter = new HexDecBin();
			baseConverter.setHexNumber();

		}
		else if (Option == "2") {
			HexDecBin baseConverter = new HexDecBin();
			baseConverter.convert();
			baseConverter.ending();
	}
	}
	public void setHexNumber() {
		System.out.println("\nEnter the hex number");
		hex = kbd.nextLine();
		num = Integer.parseInt(hex, 16);
		System.out.println("you have entered hex " + hex);
		System.out.println("Decimal value is: " + num + "(remember 0-" + num + (num+1) + " values)");
		HexDecBin baseConverter = new HexDecBin();
		baseConverter.ending();
	}
	public void convert() {
		while (GameStatus) {
			String binary = Integer.toBinaryString(num);
		
			System.out.println("Binary value is: " + binary);
			System.out.println("Number of bits is " + binary.length());
			System.out.println("Number of whole nibbles (4 bits) is x with y bits left over");
			HexDecBin baseConverter = new HexDecBin();
			baseConverter.ending();
		}
	}
	public void ending() {
		System.out.println("Do you wish to continue? Y/N");
		End = kbd.nextLine();
		if (End.equalsIgnoreCase("y")) {
			GameStatus = true;
		}else if (End.equalsIgnoreCase("n")) {
			GameStatus = false;
		}else if (End.equalsIgnoreCase("yes")) {
			GameStatus = true;
		}else if (End.equalsIgnoreCase("no")) {
			GameStatus = false;
		}else {
			System.out.println("um i dont think i understand, please retry");
			HexDecBin baseConverter = new HexDecBin();
			baseConverter.ending();
		}
	}
}
