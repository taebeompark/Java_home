package loop_for1;
import java.util.Scanner;

public class loop_for1 {
	Scanner sc = new Scanner(System.in);
	public void ex1() {
		//1~10 까지 1씩증가하며 출력
		for(int i =1; i<=10; i++) {
			System.out.print(i);
		}
	}
	
	
	
	//==================ex2()
	public void ex2() {
		//3부터 7까지 1씩 증가하며출력
		// 3 4 5 6 7
		for(int i=3 ; i<=7 ; i++) {
			System.out.print(i);
		}
	}
	
	
	
	//=====================ex3()
	public void ex3() {
		//2부터 15까지 1씩증가 출력
		//2 3 4 5...14 15
		for(int i=2; i<=15; i++) {
			System.out.print(i);
		}
	}
	
	
	
	//=====================ex4()
		public void ex4() {
			//1부터 입력받은 수까지 1씩 증가하며 출력
			System.out.print("정수입력:");
			int input=sc.nextInt();
			
			for(int i=1; i<=input; i++) {
				System.out.print(i);
			}
		}
		
	
		
		//======================ex5()
		public void ex5() {
			//1부터 입력받은 수까지 2씩 증가하며 출력
			System.out.print("입력: ");
			int input=sc.nextInt();
			
			for(int i=1; i<=input; i+=2) {
				System.out.print(i);
			}
		}
		
		
		
		//======================ex6()
		public void ex6() {
			//1.0부터 입력받은 수까지 0.5씩증가하며 출력
			System.out.print("입력:");
			double input = sc.nextDouble();
			
			for(double i=1.0 ;i<=input; i+=0.5) {
				System.out.println(i);
			}
		}
		
		//======================ex7()
		public void ex7() {
			//영어 알파벳 A부터 z까지 한줄출력
			//ABC..Z
			//*char 자료형은 문장형이지만 실제로 정수(문자표번호)를 지정한다
			
			for(int i='A';i<='Z';i++) {//case1
				System.out.print((char)i);
			}
			
			
			System.out.println("\n------------------");
			
			for(char i='A';i<='Z';i++) {//case2
				System.out.print(i);
			}
		}
		
		
		
		
		//=========================ex8()
		public void ex8() {
			//10에서 1까지 1감소하며 출력
			for(int i=10; i>=1; i--) {
				System.out.println(i);
			}
		}
		
		
		
		
		//=========================ex9()
		public void ex9() {
			//for문 응용 1 :
			//1부터 10까지 모든정수 합구하기
			int sum = 0;//반복되어 증가되는 i값합계 저장할 변수
			for(int i=1; i<=10;i++) {
				//sum=sum+i;
				sum+=i;
				
			}
			System.out.println(sum);
		}
		
		
		
		
		//=========================ex10()
		public void ex10() {
			//입력 1: 10
			//입력 2: 20
			//입력 3: 30
			//입력 4: 40
			//입력 5: 50
			//합계:150
			
			int sum=0;
			
			for(int i=1;i<=5;i++) {
				System.out.println("입력"+i+":");
				int input =sc.nextInt();
				
				sum+=input;
			}
			System.out.println("합계"+sum);
		}	
		
		//=========================ex11()
		public void ex11() {
			//입력받을 정수개수:3
			//입력1 :10
			//입력2 :20
			//입력3 :30
			//합계 :60
			
			//ex)
			//입력받을 정수개수:2
			//입력1:10
			//입력2:20
			//합계:30
			System.out.print("입력받을 정수개수:");
			int input =sc.nextInt();
			int sum=0;
			for(int i=1; i<=input; i++) {
				System.out.print("입력"+i+":");
				int input2=sc.nextInt();
				
				sum+=input2;
			}
			System.out.println("합계 :"+sum);
			
			
		}
		
		
		//=========================ex13()
		public void ex13() {
			//1부터 20까지 1씩 증가하면서 출력
			//단, 입력 받은 수의 배수는 ()표시
			
			//ex)
			//괄호 표시배수:3
			//12(3)45(6)...
			
			System.out.println("괄호를 표시할 배수:");
			int num = sc.nextInt();
			
			
			for(int i=1 ;i<=20;i++) {
				if(i%num==0) {
					System.out.print("("+i+")");
				}else {
					System.out.print(i+" ");
				}
			}
			
		}
		public void ex14() {
			//구구단 출력
			//2~9사이 입력받아 
			//해당 단 출력
			//단, 입력받은 수가 숫자가 아니면 "잘못입력하셧습니다"
			System.out.print("단 입력:");
			int dan =sc.nextInt();
			
			if(dan>=2 && dan<=9) {
				for(int i=1;i<=9;i++) {
					System.out.printf("%d x %d = %d\n",dan,i,dan*i);
				}
			}else {
				System.out.println("잘못입력");
			}
			
		}
		
}
