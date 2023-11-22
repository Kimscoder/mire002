package java_example;

import java.util.Scanner;

public class ex_3 {
	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int kor=0;
		int eng=0;
		int math=0;
		int scien=0;
		
		int total = 0;
		float evg = 0f;
	    
		System.out.print("국어점수 :");
		kor = scann.nextInt();
		
		System.out.print("영어점수 :");
		eng = scann.nextInt();
		
		System.out.print("수학점수 :");
		math = scann.nextInt();
		
		System.out.print("과학점수 :");
		scien = scann.nextInt();
		
		total = kor+eng+math+scien;
		evg = (int)(total*100/4+5)/100f;
		System.out.println("국어\t영어\t수학\t과학\t총점\t평균");
		System.out.printf("%d\t%d\t%d\t%d\t%d\t%f", kor,eng,math,scien,total,evg);
		System.out.println();
		System.out.println("총점 : "+total);
		System.out.println("평균 : "+evg);
	}
}
