

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); //입력 받고자 하는 수의 갯수
		
		int[] arr = new int[N]; //입력 받은 정수를 저장할 배열 생성
		
		for(int i = 0; i<N; i++) {
			int a = Integer.parseInt(sc.next());
			arr[i] = a; //입력받은 정수를 배열에 저장
		}
		//최솟값 구하기
		int min = arr[0];
		for(int i=1; i<arr.length; i++) { // 두 번째부터 마지막 배열의 값까지 반복
			if(min > arr[i]) min = arr[i]; // 각 배열의 값을 차례대로 min의 값과 비교하여 더 작은 값을 min에 대입
		}
		System.out.print(min +" ");
		
		//최댓값 구하기
		int max = arr[0];
		for(int i=1; i<arr.length; i++) { // 두 번째부터 마지막 배열의 값까지 반복
			if(max < arr[i]) max = arr[i]; // 각 배열의 값을 차례대로 max의 값과 비교하여 더 큰 값을 max에 대입
		}
		System.out.println(max);
		

	}

}