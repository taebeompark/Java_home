package loop_while;
import java.util.Scanner;
public class loop_while {
	Scanner sc =new Scanner(System.in);
	public void ex1() {
		int input = 0;
		
		while(input!=9) {
			//input에 저장된 값이 9가 아닌경우 반복
			System.out.println("--메뉴선택--");
			System.out.println("1.떡볶이");
			System.out.println("2.쫄면");
			System.out.println("3.김밥");
			System.out.println("9.종료");
			
			System.out.println("메뉴선택>>");
			input =sc.nextInt();
			
			switch(input) {
			case 1:System.out.println("떡볶이 주문완료");break;
			case 2:System.out.println("쫄면 주문완료");break;
			case 3:System.out.println("김밥 주문완료");break;
			case 9:System.out.println("메뉴선택종료");break;
			default: System.out.println("잘못입력");
			}
		}
	}
	
	//=====================ex2()
	public void ex2() {
		//입력 되는 모든 정수의합구하기
		//단,0이 입력되면 반복 종료후 결과출력
		//->0이 입력 되지 않으면 계속반복
		
		int input =-1; //입력받은값을 저장할 변수
		int sum=0; //모든정수합 저장변수
		while(input!=0) {
			System.out.print("정수입력:");
			input =sc.nextInt();
			
			sum+=input;
		}
		System.out.println("합계"+sum);
	}
	
	
	//=====================ex3()
	public void ex3() {
		//입력 되는 모든 정수의합구하기
		//단,0이 입력되면 반복 종료후 결과출력
		//->0이 입력 되지 않으면 계속반복
		
		int input=0;
		int sum=0;
		
		do {
			System.out.print("정수입력:");
			input =sc.nextInt();
			
			sum+=input;
		}while(input!=0);
		System.out.println("합계"+sum);
	}
}
