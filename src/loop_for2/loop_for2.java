package loop_for2;
import java.util.Scanner;
public class loop_for2 {
	Scanner sc=new Scanner(System.in);
	public void ex16() {
		//구구단 모두구하기
		for(int dan=2; dan<=9;dan++) {//2단~9단 차례로증가
			
			for(int num=1; num<=9;num++) {//각단에 곱해질수
				System.out.printf("%2d x %2d =%2d",dan,num,dan*num);
			}
			System.out.println();
		}
		
	}
	
	
	
	//============================ex17()
	public void ex17() {
		//구구단 역순 출력
		///9단 ->2단까지 역방향
		//곱해지는 수는1->9정방향
		for(int dan=9;dan>=2;dan--) { //단 9->2역
			for(int num=1;num<=9;num++) {//수 1>9정
				System.out.printf("%2d x %2d =%2d",dan,num,dan*num);
			}
			System.out.println();
		}
	}
	
	
	
	//============================ex18()
	public void ex18() {
		//2중 for문을 이용해서 다음모양 출력
		//12345
		//12345
		//12344
		//12345
		//12345
		for(int i=1;i<=5;i++) {  //5바퀴반복 for문
			for(int j=1;j<=5;j++) { //12345출력 for문
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
	
	//============================ex19()
	public void ex19() {
	//2중 for문 이용하여 다음출력하시오
		//1
		//12
		//123
		//1234
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		System.out.println("===================");
		//4321
		//321
		//21
		//1
		for(int x=4;x>=1;x--) {
			for(int y=x;y>=1;y--) {
				System.out.print(y);
			}
			System.out.println();
		}
	}
	
	
	//============================ex20()
	public void ex20() {
		//숫자세기
		
		//1부터 20까지 1씩증가하면서
		//3의배수의 총 개수 출력
		//3의배수의 합계 출력
		
		// 3 6 9 12 15 18:6개
		//3의 배수 합계 : 63
		
		int count =0;//3의 배수의 개수를 세기 위한 변수
		int sum =0;//3의 배수의 합계를 구하기 위한 변수
		
		for(int i=1; i<=20; i++) {
			if(i%3==0) {
				System.out.print(i+" ");
				count++;
				sum+=i;
			}
		}
		System.out.println(":"+count+"개");
		System.out.println("3의배수합계:"+sum);
	}
	
	
	
	//============================ex21()
	public void ex21() {
		//2중 for 문과 count를 이용해서 아래모양 출력하기
		// 1  2 3  4
		// 5  6 7  8
		// 9 10 11 12
		int count=1;
		for(int x=1; x<=3; x++) {//3줄
			for(int y=1;y<=4;y++) {//4칸
				System.out.printf("%3d",count);
				count++;
				
			}
			System.out.println();
		}
		
	}
	
}
