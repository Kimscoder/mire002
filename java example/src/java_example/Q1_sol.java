package java_example;

import java.util.Scanner;

public class Q1_sol {
	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		float input=0;
		int first =0;
		int seconed =0;
		int third =0;
		int fourth =0;
	
		System.out.print("입력값을 넣어주세요 : ");
		input = scann.nextFloat();
		
		float dumy = input/10000f;
		
		dumy = dumy*10;
		first = (int)dumy;
		dumy = (dumy-first);
		
		dumy = dumy*10;
		seconed = (int)dumy;
		dumy = (dumy-seconed);
		
		dumy = dumy*10;
		third = (int)dumy;
		dumy = (dumy-third);
		
		dumy = dumy*10;
		fourth = (int)(dumy+0.5);
		dumy = (dumy-fourth);
		
		System.out.println(dumy);
		System.out.println("입력 정수 :"+input);
		System.out.println("4자리숫자 : "+fourth);
		System.out.println("3자리숫자 : "+third);
		System.out.println("2자리숫자 : "+seconed);
		System.out.println("1자리숫자 : "+first);
	}
}
