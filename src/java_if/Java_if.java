package java_if;
import java.util.Scanner;
public class Java_if {
	Scanner sc =  new Scanner(System.in);
	public void ex1() {
		System.out.printf("정수입력: ");
		int input = sc.nextInt();
		
		//입력된 정수가 양수인지 검사
		String result;
		if(input>=0) {
			result="양수입니다";
		}else {
			result="음수입니다";
		}
		System.out.println(result);
	}
	
	//================ex2()==========
	public void ex2() {
		//홀짝검사
		System.out.print("정수 입력: ");
		int input =sc.nextInt();
		String result;
		if(input%2!=0) {
			result="홀수입니다";
		}else {
			if(input==0) {
				result="0입니다";
			}else {
				result="짝수입니다";
			}
		}
		System.out.println(result);
	}
	//=================ex3()=========
	public void ex3() {
		System.out.print("정수입력:");
		int input = sc.nextInt();
		
		if(input>0) {
			System.out.println("양수입니다.");
		}else if(input<0){
			System.out.println("음수입니다");
		}else {
			System.out.println("0입니다");
		}
	}
	//========================ex4()
	public void ex4() {
		//달()month 입력받아 해당 달에 맞는 계절 출력
		//단, 겨울일때 온도가 -15도 이하"한파 경보",-12이하 "한파주의보"
		//여름일때 온도가 35도이상 "폭염경보",33도 이상 "폭염주의보"
		//1~12 사이가 아닐땐 "해당하는 계절이 없습니다"출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("달입력: ");
		int month = sc.nextInt();
		
		int temp = -16;
		String season; //아래 조건문 수행 결과를 저장할 변수 선언

		
		if(month==1 || month==2 || month==12 ) {
			season = "겨울";
			if(temp<=-15) {
		
				season +="한파경보";
				
			}else if(temp<=-12) {
				season += "한파주의보";
			}
			
		}else if(month>=3 && month <=5){
			season="봄";
		}else if((month>= 6) && (month<=8)){
			season="여름";
			if(temp>=35) {
				
				season +="폭염경보";
				
			}else if(temp>=33) {
				season += "폭염주의보";
			}
			
		}else if(month >= 9 && month<=11) {
			season="가을";
		}else {
			season="해당하는 계절이 없습니다.";
		}
		
		System.out.println(season);
						
	}
	
}
