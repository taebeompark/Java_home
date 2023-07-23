package java_if2;
import java.util.Scanner;
public class Java_if2 {
	Scanner sc =  new Scanner(System.in);
	
	public void ex5() {
		//나이를 입력받아
		//13세이하면 어린이입니다
		//13초과 19세 이하면 :청소년입니다
		//19세 초과시:성인입니다.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이: ");
		int age= sc.nextInt();
		
		if(age<=13) {
			System.out.print("13세 이하면 \"어린이 입니다.\"");
		}else if((age>13)&&(age<=19)) {
			System.out.print("13세 초과 19세 이하면 : \"청소년 입니다.\"");
		}else if(age > 19) {
			System.out.print("19세 초과 시 : \"성인 입니다\".");
		}
	}	
	//==========================ex6()===
	public void ex6() {
Scanner sc = new Scanner(System.in);
		
		System.out.print("점수: ");
		int score = sc.nextInt();
		
		
		if(score>100) {
			System.out.print("잘못입력하셨습니다");
		}else if(score>=90) {
			System.out.print("A");
		}else if(score>=80 && score<90) {
			System.out.print("B");
		}else if(score>=70 && score<80) {
			System.out.print("C");
		}else if(score>=60 && score<70) {
			System.out.print("D");
		}else if(score<60 && score>=0) {
			System.out.print("F");
		}else if(score<0){
			System.out.print("잘못입력하셨습니다");
		}
	}
	//=========================ex7()
	public void ex7() {
		//놀이기구 탑승 제한 검사
		//나이가 12세이상, 키140cm이상일 경우에만 "탑승가능"
		//나이가 12미만: "적정연령이아닙니다"
		//키가 140미만,100초과시:"잘못입력했습니다"
		System.out.print("나이 입력: ");
		int age =sc.nextInt();
		
		String result;
		
		if(age<0 || age>100) {
			result = "잘못 입력하셨습니다";
		}else {
			System.out.print("키 입력: ");
			double height=sc.nextDouble();
			
			if(age<12) {
				result="적정연령아니다";
			}else if(height<140.0) {
				result ="적정키가아니다";
			}else {
				result="탑승가능";
			}
		}
		System.out.println(result);
	}
	//=========================ex8()
	public void ex8() {
		// 놀이기구 탑승 제한 검사 프로그램
		// 조건 - 나이 : 12세 이상
		// - 키 : 140.0cm 이상
		// 나이를 0~100세 사이로 입력하지 않은 경우 : "나이를 잘못 입력 하셨습니다."
		// 키를 0~250.0cm 사이로 입력하지 않은 경우 : "키를 잘못 입력 하셨습니다."
		// -> 입력이 되자 마자 검사를 진행하여 잘못된 경우 프로그램 종료
		// 나이 O , 키 X : "나이는 적절하나, 키가 적절치 않음";
		// 나이 X , 키 O : "키는 적절하나, 나이는 적절치 않음";
		// 나이 X , 키 X : "나이와 키 모두 적절치 않음";
		// 나이 O , 키 O : "탑승 가능"
		
		System.out.println("나이입력:");
		int age =sc.nextInt();
		
		String result;
		if(age<0 || age>100) {
			result="나이를 잘못 입력하셨습니다";
		}else {
			System.out.print("키 입력: ");
			double height=sc.nextDouble();
			
			if(height<0 || height>250) {
				result="키를 잘못입력했음";
			}else {
				if(age<12 && height >=140) {//나이x 키o
					result ="키는 적절하나 나이가 적절치않음";
				}else if(age>=12 && height < 140.0) {
					result ="나이가 적절하나 키가 적절치않음";
				}else if(age <12 && height<140.0) {
					result ="나이와 키가 적절치않음";
				}else {
					result="탑승가능";
				}
			}
		}
		
	}
	//==================================ex9
	public void ex9() {
		
		System.out.print("계절:");
		int month =sc.nextInt();
		
		String result;
		
		switch(month) {
		case 3: result="봄"; break;
		case 6: result="여름";break;
		case 9: result="가을";break;
		case 12:result="겨울";break;
		default : result="해당하는 달이 없습니다.";
		}
		System.out.println(result);
	}
	
	//===========================ex10
	public void ex10(){
		//키보드로 정수입력
		//1이면 "빨간색"
		//1이면 "주황색"
		//1이면 "노란색"
		//1이면 "초록색"
		//1~4사이 숫자아니면 "흰색"
		System.out.print("정수 :");
		int input =sc.nextInt();
		
		String result;
		
		switch(input) {
		case 1: result="빨강색"; break;
		case 2: result="주황색";break;
		case 3: result="노란색";break;
		case 4: result="초록색";break;
		default : result="흰색";
		}
		System.out.println(result);
	}
	
	//===========================ex10
		public void ex11(){
			System.out.print("월 입력: ");
			int month =sc.nextInt();
			
			String result;
			
			switch(month) {
			case 3: case 4: case 5: result="봄";break;
			case 6: case 7: case 8: result="여름";break;
			case 9: case 10: case 11: result="가을";break;
			case 12: case 1: case 2: result="겨울";break;
			default : result="잘못입력";
			}
			System.out.println(result);
			
		}
}




