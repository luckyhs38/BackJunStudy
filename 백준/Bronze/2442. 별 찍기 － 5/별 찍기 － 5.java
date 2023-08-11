
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		
		for(int i =1; i<=count; i++) {
			
			for(int j = (count-i); j>0; j--) {
				System.out.print(" ");
			}
			for(int j=(2*i-1); j>0; j--) {
				System.out.print("*");
			}
			System.out.println();
			
		}

	}

}
