package operator3;
import java.util.Scanner;
public class Operator3 {
	Scanner sc = new Scanner(System.in);
	private int input;
	//================ex4()======
	public void ex4() {
		
		int a =10;
		int b =20;
		
		System.out.println(a<b);  //true
		System.out.println(a>b);  //false
		System.out.println(a!=b); //true
		System.out.println(a==b);//false
		
		System.out.println("-----------");
		
		int c =4;
		int d =5;
		
		System.out.println(c<d);
		System.out.println(c+1<=d);
		System.out.println(c>=d-1);
		System.out.println((++c != d)==(--c !=d));
		
		System.out.println("---------------------");
		
		int temp =723;
		
		System.out.println("temp는 짝수인가?" + (temp % 2 == 0)); //false
		System.out.println("temp는 짝수인가?" +(temp % 2 != 1)); //false
		
		System.out.println("temp는 홀수인가?"+(temp % 2 == 1));  //true
		System.out.println("temp는 홀수인가?"+(temp % 2 != 0));  //true
		
		System.out.println("temp는 3의 배수인가?"+ (temp%3==0)); //true
		System.out.println("temp는 3의 배수인가?"+ (temp%4==0)); //false
		System.out.println("temp는 3의 배수인가?"+ (temp%5==0)); //false
		
	}
	
	
	
	//==============================ex5()=======
	public void ex5() {
		
		int a = 101;
		
		//a는 100이상이면서 짝수인가?
		System.out.println(a>=100);  //a는100이상 ?true
		
		//a는 짝수?
		System.out.println(a % 2 ==0); //true
		
		System.out.println((a>=100)&&(a % 2 ==0)); //false
		
		
		int b =5;
		//b는 1부터 10까지 숫자범위에 포함되어 있는가?
		//==>b는 1부터 10사이의 숫자인가?
		//==>b는 1보다 크거나 같으면서,10보다 작거나 같은가?
		
		System.out.println(b>=1);// b는 1이상인가? true
		System.out.println(b<=10);// b는 10이하인가? true
		System.out.println((b>=1) && (b <= 10));//  true
		
		
		
		
		
		System.out.println("=============================");
		
		// || (OR) 연산자 : 둘다 false면 false , 나머지는 true(AND의 반대)
		//~또는 , ~이거나 , ~거나
		
		int c = 10;
		
		//c는 10을 초과했거나 짝수인가?
		System.out.println(( c > 10) || (c % 2 == 0) );
		
		
		}
	
	
	

	//=============ex6()====================
	public void ex6() {
		//논리부정 연산자. !
		boolean bool1 =true;
		boolean bool2 = !bool1;
		
		System.out.println("bool1 :" +bool1);
		System.out.println("bool2 :" +bool2);
		
		//정수를 하나 입력 받았을때
		//1)해당정수가 1부터 100사이값이 맞는지 확인(1이상100이하)
		//2)(반대)1부터 100사이 값이 아닌지확인
		
		System.out.print("정수입력:");
		int input = sc.nextInt();
		
		//1<=input<=100
		boolean result1 =	(1 < input) && (input <=100);
		
		System.out.printf("%d는 1이상,100이하의 정수인가? : %b\n",input,result1);
		
		
	
		//1이상 이면서 100이하 <->1미만 또는 100초과
		boolean result2 = (input < 1) || (input>100);
		boolean result3 = !((input < 1) || (input>100));
		
		System.out.printf("%d는  1미만, 100 초과정수 인가? :%b /%b\n",input,result2,result3);
	}
	//==========================ex7()--========
	public void ex7() {
		//복합 대입 연산자 : +=, -=, *=, /=, %=
		//피연산자가 자신과 연산후 결과를 다시 자신에게 대입
		
		int a = 10;
		
		// a를 1증가
		a++;  // a = a + 1
		System.out.println("a를 1증가: " + a);//11
		
		//a를 4증가
		a += 4;  //a = a + 4
		System.out.println("a를 4증가: "+ a);//15
		
		//a를 10감소
		a-=10; //a=a+10
		System.out.println("a를 10 감소 :" + a);//5;
		
		//a를 3배 증가
		a*=3;
		System.out.println("a를 3배증가 : " +a); //15
		
		//a를 6으로 나눴을때 몫
		a/=6;
		System.out.println("a를 6으로 나눴을때 몫 : "+a); // 2
		
		//a를 2로 나눴을때나머지
		a%=2;
		System.out.println("a를 2로 나눴을때나머지 : "+a);//0
	}
}

