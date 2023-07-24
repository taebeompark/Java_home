package control.continue1;
import java.util.Scanner;
public class Continue1 {
	Scanner sc = new Scanner(System.in);
	
	public void ex5() {
		//break : 반복문을 바로 멈춤
		//continue : 다음 반복으로 넘어감
		
		//1~10까지 1씩 증가하며 출력
		//단, 3의 배수제외
		
		for(int i=1;i<=10;i++) {
			if(i%3==0) {
				continue;
			}
			
			System.out.print(i+" ");
		}
		
	}
	public void ex6() {
		//1~100까지 1씩 증가하며 출력하는 반복문
		//단, 5의 배수는 건너뛰고
		//증가하는 값이 40이 되었을때 반복멈춤
		
		//1
		//2
		//3
		//..
		//39
		
		for(int i=1; i<=100;i++) {
			
			if(i==40) {
				break;
			}
			if(i%5==0) {
				continue;
			}
			System.out.println(i);
		}
	}
	
	
	public void RSPGame() {
		System.out.println("[가위 바위 보 게임]");
		System.out.println("몇판?:");
		int round=sc.nextInt();
		
		//승패 기록용 변수
		int win=0;
		int draw=0;
		int lose=0;
		
		for(int i=1 ;i<=round; i++) {
			System.out.println("\n"+i+"번째게임");
			System.out.print("가위/바위/보중하나입력: ");
			
			String input= sc.next();
			
			//Math.random();
			//난수 생성 -> 0.0이상 1.0미만의 난수 생성
			
			//1)1~3사이의 난수생성
			//2)1이면 가위,2면 바위,3이면 보지정
			
			int random=(int)(Math.random()*3+1);
			//0.0 <=x <1.0
			//0.0 <=x*3 <3.0
			//1.0 <=(x*3+1)<4.0
			//1<=(int)(x*+1)<4
			//1이상 4미만의 정수  ->>1,2,3
			
			String com = null;//컴퓨터가 선택한 가위/바위/보를 저장하는 변수
			//null:아무것도 참조하지않음
			
			switch(random) {
			case 1: com="가위"; break;
			case 2: com="바위"; break;
			case 3: com="보"; break;
			}
			
			//컴퓨터는 [바위]를 선택햇습니다
			System.out.printf("컴퓨터는 [%s]를 선택햇습니다\n",com);
			
			//컴퓨터와 플레이어 가위 바위 보 판별
			if(input.equals(com)) {
				System.out.println("비겼다");
				draw++;
			}else {
				boolean win1 =input.equals("가위") && com.equals("보");
				boolean win2 =input.equals("가위") && com.equals("가위");
				boolean win3 =input.equals("가위") && com.equals("바위");
				if(win1 || win2||win3) {
					System.out.println("플레이어승");
				}else {
					System.out.println("졌습니다");
					lose++;
				}
			}
			
			System.out.printf("현재기록: %d승 %d무 %d패\n",win,draw,lose);
		}
	}
}
