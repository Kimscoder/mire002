package java_example;

import java.util.Scanner;

public class ex_2 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		float inputFloat = 0;
	    float outputFloat = 0f;
	    
	    System.out.print("�ݿø��� �Ǽ��� �Է��ϼ��� : ");
	    inputFloat =scann.nextFloat();
	    outputFloat = (int)((inputFloat*100+5)/10)/10f;
	    
		System.out.println("�Է°� : "+inputFloat);
		System.out.println("�ݿø� : "+outputFloat);
		//����� �������·� �ϴ°��� ���� �Ǽ� ���·� �Ҷ� ���������� ���� �� ����
		//ex)10000*0.5 �� �Ǽ� ����� ���־ ���� ���ݾ� Ʋ���� �� �ֱ⿡ (10000*100/50)���� ���
	}

}
