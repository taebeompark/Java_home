package operator4;
import java.util.Scanner;
public class Operator4 {
	Scanner sc = new Scanner(System.in);
	public void ex8() {
		//삼항식 연산자: 조건식1? 식1:식2
		//조건식 결과가 true이면 식1,
		//false이면 식 2를 수행하는 연산자
		//조건식 : 연산결과가 true/false식
		int num =30;
		//num이 30보다 크면 "num은 30보다 큰수이다
		//아니면 num은 30이하의 수이다 출력
		
		String result=(num>30)? "30보다큰수이다": "30보다작은수이다";
		System.out.print(result);
		
		System.out.println("\n================");
		
		//입력받은 정수가 음수인지 양수인지 구분
		//단,0은 양수로 처리
		
		//ex)
		//정수입력: 4
		//양수입니다
		
		//예) 
		//정수입력:-5
		//음수입니다
		
		System.out.print("정수입력: ");
		int input = sc.nextInt();
		String result2= (input >=0)? "양수입니다":"음수입니다";
		System.out.println(result2);
	}
}
