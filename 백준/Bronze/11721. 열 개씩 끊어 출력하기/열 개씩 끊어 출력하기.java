
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args)  throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String a = br.readLine();
		
		for(int i = 0; i< a.length(); i++) {
			System.out.print(a.charAt(i)); 
			// charAt() : string 으로 저장된 문자열 중 한 글자만 선택해서 char 타입으로 바꿔줌
			
			// 10의 배수일 때 줄바꿈이 발생
			if((i+1)%10==0) { 
				System.out.println();
			}
		}
	}

}
