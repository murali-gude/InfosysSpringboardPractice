package loops;

public class geometricSequence {

	public static void main(String[] args) {
		int num=5;
		int n=1;
		int i=1;
		
		
		while(i<=num) {
			System.out.print(n);
			
			if(i!=num) {
				System.out.print(",");
			}	
			n=n*2;
			i++;
			
		}

	}

}
