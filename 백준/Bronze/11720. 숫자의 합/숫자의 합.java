//Scanner 로 입력받아 charAt() 을 사용하여 푸는 방법

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		String str = sc.next();
		
		int sum = 0;
		for(int i = 0; i< count; i++) {
			
			sum = sum + (str.charAt(i)-'0');
			// charAt() 은 해당 문자의 아스키코드 값을 반환하므로 
			//반드시 -48 또는 -'0' 을 해주어야 우리가 입력받은 숫자 값 그대로를 사용할 수 있다.
		}
		
		System.out.println(sum);

	}

}