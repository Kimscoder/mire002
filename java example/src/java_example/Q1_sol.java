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
	
		System.out.print("�Է°��� �־��ּ��� : ");
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
		System.out.println("�Է� ���� :"+input);
		System.out.println("4�ڸ����� : "+fourth);
		System.out.println("3�ڸ����� : "+third);
		System.out.println("2�ڸ����� : "+seconed);
		System.out.println("1�ڸ����� : "+first);
	}
}
