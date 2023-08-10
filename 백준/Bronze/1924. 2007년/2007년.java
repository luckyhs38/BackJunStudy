/*************************************
1. 월의 일 수와 요일을 배열에 담아준다.
2. 입력받은 월( -1 )의 합을 sum 변수에 저장한다.
3. 입력받은 일 수를 sum 변수에 저장한다.
4. 총 합의 7로 나눈 나머지를 요일로 출력한다. 
************************************/
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = Integer.parseInt(sc.next());
		int y = Integer.parseInt(sc.next());
		
		int[] month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};		
		String[] days = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
		
		int sum = 0;
		for(int i =0; i<x-1; i++) {
			sum += month[i];
			
		}
		sum += y;
		System.out.println(days[sum%7]);
		
//1월 1일은 days[1] 이므로 MON이 출력되고,
//3월 14일은 31+28+14=73인데 여기서 7로 나누면 나머지가 3이다. 
//그러므로 WEDr가 출력되는 것을 알 수 있다.
	}

}