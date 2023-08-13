import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) { //공백채우기
			for(int j = 1; j <= n - i; j++) { 
				System.out.print(" ");
				}
			
			for(int k = 1; k <= (2 * i) - 1; k++) {
				if(i == n || i == 1) { //마지막줄, 첫줄은 전부 *
					System.out.print("*");
				}
				else {
					if(k==1 || k==(2*i)-1) { //시작,끝만 *
						System.out.print("*");
					}else {
						System.out.print(" "); //가운데 공백
						
					}
				}
			}
			System.out.println();
		}
		sc.close();

	}
}