
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		while(sc.hasNext()) {
		System.out.println(sc.nextLine()); 
		// next의 경우 공백문자를 받아들일 수가 없다.
		// nextLine의 경우 공백문자가 포함된 문자열을 입력값으로 모두 저장하여 출력
		}
	}
}
