//br.read()로 데이터를 입력하자마자 바로 계산하여 결과를 출력

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// BufferedReader 선언 및 반복할 문자열 변수 N 선언
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		// 합계 변수 선언
		int sum = 0;
		// 반복문을 사용 입력하면 바로 계산
		for(int i =0; i<n; i++) {
			sum += br.read() - 48;
		}
		// 결과 출력
		System.out.println(sum);

	}

}
