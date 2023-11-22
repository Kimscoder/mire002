package java_example;

import java.util.Scanner;

public class ex_1 {

	public static void main(String[] args) {
		Scanner scann =new Scanner(System.in);
		int firstInt =0;
		int seconedInt =0;
		
		float sum=0f;
		float minus=0f;
		float multi=0f;
		float divid=0f;
		
		int mock=0;
		int namuji=0;
		
		System.out.print("첫번째 정수의 값을 입력하세요 :");
		firstInt =scann.nextInt();
		System.out.print("두번째 정수의 값을 입력하세요 :");
		seconedInt = scann.nextInt();
		
		sum = firstInt+seconedInt;
		minus = firstInt-seconedInt;
		multi = firstInt*seconedInt;
		divid = firstInt/(float)seconedInt;
		
		mock = seconedInt/firstInt;
		namuji = seconedInt%firstInt;
		
		System.out.println("첫번째 정수 : "+firstInt);
		System.out.println("두번째 정수 : "+seconedInt);
		System.out.println("더하기 : "+sum);
		System.out.println("빼기 : "+minus);
		System.out.println("곱하기 : "+multi);
		System.out.println("나누기 : "+divid);
		System.out.println();
		System.out.println("몫 : "+mock);
		System.out.println("나머지 : "+namuji);
		
	}

}
