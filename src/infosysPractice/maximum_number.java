package infosysPractice;

public class maximum_number {
	public static void main (String[]args) {
		
		int num1 =10;
		int num2 = 25;
		int num3 = 6;
		
		if(num1>=num2 && num1>=num3) {
			System.out.println("Num1 is largest");
		}
		else if(num2>=num1 && num2>=num3) {
			System.out.println("Num2 is largest");
		}
		else {
			System.out.println("Num3 is largest");
		}
	}

}
