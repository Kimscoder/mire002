package java_example;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		double random = Math.random();
		int input = 0;
		int target = (int)(random*3+1);
		
		System.out.println("1.���� 2.���� 3.��");
		System.out.print("��� : ");
		input = scann.nextInt();
		System.out.println();
		
		if(target ==1 ) {
			System.out.println("��ǻ�� : ����");
		}
		else if(target ==2) {
			System.out.println("��ǻ�� : ����");
		}
		else {
			System.out.println("��ǻ�� : ��");
		}
		
		if(input == 1) {
			System.out.println("��� : ����");
		}
		else if(input==2) {
			System.out.println("��� : ����");
		}
		else {
			System.out.println("��� : ��");
		}

		if(input==target) {
			System.out.println("�����ϴ�.");
		}
		else if(input<target) {
			if((input==1)&&(target==3)) {
				System.out.println("�̰���ϴ�.");
			}
			else {
				System.out.println("�����ϴ�.");
			}
		}
		else {
			if((input==3)&&(target==1)) {
				System.out.println("�����ϴ�.");
			}
			else {
				System.out.println("�̰���ϴ�.");
			}
		}
	}

}