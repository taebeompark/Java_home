package java_if3;
import java.util.Scanner;
public class Java_if3 {
	Scanner sc = new Scanner(System.in);
	public void practice1() {
		System.out.print("숫자를 한개 입력: ");
		int input = sc.nextInt();
		
		String result;
		
		if(input<=0) {
			result="양수만 입력하세요";
		}else if(input%2==0) {
			result="짝수";
		}else {
			result="홀수";
		}
		
		System.out.println(result);
	}
	
	//=========================practice2()
	public void practice2() {
		System.out.print("국어점수: ");
		int kor = sc.nextInt();
		
		System.out.print("수학점수: ");
		int math = sc.nextInt();
		
		System.out.print("영어점수: ");
		int eng = sc.nextInt();
		
		int sum =kor +math + eng;// 합계
		double avg=(kor +math + eng)/3.0;
		
		if(kor>=40 && math>=40 && eng>=40 && avg>=60) {
			System.out.println("국어:"+kor);
			System.out.println("수학:"+math);
			System.out.println("영어:"+eng);
			System.out.println("합계:"+sum);
			System.out.println("평균:"+avg);
			
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
	}
	//========================practice3()
	public void practice3() {
		System.out.print("1~12 사이 정수 입력:");
		int month =sc.nextInt();
		
		switch(month) {
		case 1: case 3: case 7: case 8: case 10: case 12:
			System.out.println(month+"월은 31일까지 있습니다");
			break;
		case 4: case 6: case 9: case 11:
			System.out.println(month+"월은 30일까지 있습니다");
			break;
		case 2:
			System.out.println(month +"월은 28일까지 있습니다");
		default: System.out.println(month +"월은 잘못 입력된 달입니다.");
		}
	}
	//============================practice4()
	public void practice4() {
	/*키 무게를 double로 입력 받고 bmi지수 계산하여 계산결과에따라
	 * 저체중/정상체중/과체중/비만/고도비만 출력
	 * 
	 * bmi = 몸무게 / 키* 키
	 * bmi가 18.5미만 일경우 저체중
	 * 18.5이상이면 정상체중
	 * 23이상 25미만경우 과체중
	 * 25이상 30미만경우 비만
	 * 30이상 고도비만
	 * 
	 * */	
		
	 System.out.print("키입력: ");
	 double height = sc.nextDouble();
	 
	 System.out.print("몸무게 입력: ");
	 double weight = sc.nextDouble();
	 
	 double bmi =weight/(height*height);
	 String result;
	 if(bmi<18.5) {
		 result="저체중";
	 }else if(bmi>=18.5) {
		 result="정상체중";
	 }else if(bmi>=23 && bmi<25) {
		 result="과체중";
	 }else if(bmi>=25 && bmi<30) {
		 result="비만";
	 }else {
		 result="고도비만";
	 }
	 System.out.println(result);
	}
	
	//==================practice5()
	public void practice5() {
		System.out.print("중간고사 점수: ");
		double mid =sc.nextDouble();
		
		System.out.print("기말고사 점수: ");
		double final1 =sc.nextDouble();
		
		System.out.print("과제 점수: ");
		double report =sc.nextDouble();
		
		System.out.print("출석 횟수: ");
		double attendance =sc.nextDouble();
		
		//각각의 점수를 비율에 맞게 변경
		mid *=0.2;
		final1 *=0.3;
		report *=0.3;
		System.out.println("===========결과========");
		
		if(attendance<=20*(1-0.3)) {//14번 이하 출석경우
			System.out.println("Fail[출석횟수 부족]("+(int)attendance+"/20");
			
		}else {
			System.out.printf("중간고사점수(20) : %.1f \n",mid);
			System.out.printf("기말고사점수(30) : %.1f \n",final1);
			System.out.printf("과제점수(30) : %.1f \n",report);
			System.out.printf("출석점수(20) : %.1f \n",attendance);

		}

		 double sum= mid + final1+report+attendance;
		 
		 System.out.printf("총점: %.1f \n",sum);
		 
		 if(sum>=70) {
			 System.out.println("pass");
		 }else {
			 System.out.println("Fail[점수미달]");
		 }
	}
}
