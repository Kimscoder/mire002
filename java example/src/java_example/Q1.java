package java_example;

import java.util.Scanner;

public class Q1 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
        Scanner scann = new Scanner(System.in); 
		int first=0;
        int seconed=0;
        int third=0;
        int four =0;
        int input =0;// �ʱ� �Է°��� �ı��ϸ� �ȵ�
     
        System.out.print("���� �Է� : ");
        input = scann.nextInt();
        
        first = input/(int)1000;
        input = input-(first*(int)1000);
        seconed = input/(int)100;
        input = input-(seconed*(int)100);
        third = input/(int)10;
        input = input-(third*(int)10);
        four = input/(int)1;
        System.out.println("4�ڸ� ���� : "+first);
        System.out.println("3�ڸ� ���� : "+seconed);
        System.out.println("2�ڸ� ���� : "+third);
        System.out.println("1�ڸ� ���� : "+four);
        
	}
}

//
