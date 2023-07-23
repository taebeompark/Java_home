package operator2;

import java.util.Scanner;

public class Operator2 {
	Scanner sc = new Scanner(System.in);
	
	
	public void ex2() {
		System.out.print("정수1입력: ");
		int input1 =sc.nextInt();
		
		System.out.print("정수2입력: ");
		int input2 =sc.nextInt();
		
		System.out.printf("%d /%d =  %d\n",input1,input2,input1/input2);
		System.out.printf("%d %% %d =  %d\n",input1,input2,input1%input2);
		//%%: print에서 %문자 출력하는방법
	}
	//===========ㄷex3()============
	public void ex3() {
		int iNum1 =10;
		int iNum2 =10;
		
		iNum1++;  //iNum1 1증가
		iNum2--;  //iNum2 1감소
		System.out.println("iNum:" +iNum1);
		System.out.println("iNum:" +iNum2);
		
		int temp1 = 5;
		System.out.println(++temp1 + 5);
						//++5 + 5
						// 6  + 5  ==11
		System.out.println("temp1:"+ temp1);
		
		int tmep2 =3 ;
		System.out.println(tmep2-- +2);//5
							//3-- +2   //5
							//2  +2  
		System.out.println("temp2:"+tmep2);
		
		
		
		int a= 3;
		int b =5;
		int c = a++ + --b;
			// 3++ + --5
			// 3   +   4
			// 7
		System.out.printf("%d / %d = %d\n",a,b,a/b);
		
		
		
	}

}
