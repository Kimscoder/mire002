package java_example;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		double random = Math.random();
		int input = 0;
		int target = (int)(random*3+1);
		
		System.out.println("1.가위 2.바위 3.보");
		System.out.print("당신 : ");
		input = scann.nextInt();
		System.out.println();
		
		if(target ==1 ) {
			System.out.println("컴퓨터 : 가위");
		}
		else if(target ==2) {
			System.out.println("컴퓨터 : 바위");
		}
		else {
			System.out.println("컴퓨터 : 보");
		}
		
		if(input == 1) {
			System.out.println("당신 : 가위");
		}
		else if(input==2) {
			System.out.println("당신 : 바위");
		}
		else {
			System.out.println("당신 : 보");
		}

		if(input==target) {
			System.out.println("비겼습니다.");
		}
		else if(input<target) {
			if((input==1)&&(target==3)) {
				System.out.println("이겼습니다.");
			}
			else {
				System.out.println("졌습니다.");
			}
		}
		else {
			if((input==3)&&(target==1)) {
				System.out.println("졌습니다.");
			}
			else {
				System.out.println("이겼습니다.");
			}
		}
	}

}