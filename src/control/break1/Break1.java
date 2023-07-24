package control.break1;

import java.util.Scanner;

public class Break1 {
	Scanner sc =new Scanner(System.in);
	//1부터 10까지 1씩 증가 하는 반복문
	//단, 5를 출력하면 반복문 종료
	
	//1 2 3 4 5
	public void ex1() {
		for(int i=1; i<=10;i++) {
			System.out.print(i+" ");
			if(i==5) {
				break;
			}
		}
	}
	
	//=====================ex2()
	public void ex2() {
		//0이 입력 될때 까지의 모든 정수 합구하기
		int input=0;
		int sum=0;
		
		while(true) {
			System.out.print("정수 입력:");
			input = sc.nextInt();
			
			if(input==0) {
				break;
			}
			sum+=input;
		}
		
		System.out.println("합계:"+sum);
	}
	
	//=====================ex3()
	public void ex3() {
		//입력받은 모든 문자열을 누적
		//단,"exit@"입력시 문자열 누적종료하거 결과출력
		String str="";//빈문자열
		
		while(true) {
			System.out.print("문자열 exit@입력시 종료:");
			
			String input=sc.nextLine();
			//next(): 다음한단어 (띄어쓰기포함x)
			//nextLine(): 다음한줄(띄어쓰기포함o)
			if(input.equals("exit@")) {
				//String 자로형은 비교연산자( ==) 같은문자열 판별어렵다
				//해결법: 문자열1.equals(문자열2) 
				break;
			}
			str+=input+"\n";
		}
		System.out.println("===============");
		System.out.println(str);
	}
		
	//=====================ex4()
	public void ex4() {	
		//중첩 반복문 내부에서 break사용하기
		//구구단
		//단 2단은 *2까지,3단 *3까지...9단은 *9까지 출력
		for(int dan=2; dan<=9; dan++) {
			for(int num=1;num<=9;num++) {
				System.out.printf("%d x %d = %2d ",dan,num,dan*num);
				if(num==dan) {
					break;
				}
			}
			System.out.println();
		}
	}
}
