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
		
		System.out.print("ù��° ������ ���� �Է��ϼ��� :");
		firstInt =scann.nextInt();
		System.out.print("�ι�° ������ ���� �Է��ϼ��� :");
		seconedInt = scann.nextInt();
		
		sum = firstInt+seconedInt;
		minus = firstInt-seconedInt;
		multi = firstInt*seconedInt;
		divid = firstInt/(float)seconedInt;
		
		mock = seconedInt/firstInt;
		namuji = seconedInt%firstInt;
		
		System.out.println("ù��° ���� : "+firstInt);
		System.out.println("�ι�° ���� : "+seconedInt);
		System.out.println("���ϱ� : "+sum);
		System.out.println("���� : "+minus);
		System.out.println("���ϱ� : "+multi);
		System.out.println("������ : "+divid);
		System.out.println();
		System.out.println("�� : "+mock);
		System.out.println("������ : "+namuji);
		
	}

}
