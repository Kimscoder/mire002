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
        int input =0;// 초기 입력값은 파기하면 안됨
     
        System.out.print("정수 입력 : ");
        input = scann.nextInt();
        
        first = input/(int)1000;
        input = input-(first*(int)1000);
        seconed = input/(int)100;
        input = input-(seconed*(int)100);
        third = input/(int)10;
        input = input-(third*(int)10);
        four = input/(int)1;
        System.out.println("4자리 숫자 : "+first);
        System.out.println("3자리 숫자 : "+seconed);
        System.out.println("2자리 숫자 : "+third);
        System.out.println("1자리 숫자 : "+four);
        
	}
}

//
