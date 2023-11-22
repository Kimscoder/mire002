package java_example;

import java.util.Scanner;

public class ex_2 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		float inputFloat = 0;
	    float outputFloat = 0f;
	    
	    System.out.print("반올림할 실수를 입력하세요 : ");
	    inputFloat =scann.nextFloat();
	    outputFloat = (int)((inputFloat*100+5)/10)/10f;
	    
		System.out.println("입력값 : "+inputFloat);
		System.out.println("반올림 : "+outputFloat);
		//계산은 정수형태로 하는것이 좋음 실수 형태로 할때 오차범위가 생길 수 있음
		//ex)10000*0.5 는 실수 계산이 들어가있어서 값이 조금씩 틀어질 수 있기에 (10000*100/50)으로 계산
	}

}
