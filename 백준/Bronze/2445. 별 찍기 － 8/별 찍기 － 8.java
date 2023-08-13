import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		
		for (int i=1; i<=count; i++) {
			for (int j=1; j<=i; j++) {
				System.out.print('*');
			}
			for (int j=1; j<=2*(count-i); j++) {
				System.out.print(" ");
			}
			for (int j=1; j<=i; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
		for (int i=count-1; i>=1; i--) {
			for (int j=1; j<=i; j++) {
				System.out.print('*');
			}
			for (int j=1; j<=2*(count-i); j++) {
				System.out.print(" ");
			}
			for (int j=1; j<=i; j++) {
				System.out.print('*');
			}
			System.out.println();
		}

	}

}
