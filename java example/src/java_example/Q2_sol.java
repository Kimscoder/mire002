package java_example;

import java.util.Scanner;

public class Q2_sol {
	public static void main(String[] args) {
		String com=""; //���� 0, ���� 1, �� 2
		int com_num = 0;
		
		String my="";//���� 0,���� 1,�� 2
		int my_num = 0;
		
		int menu = 0;
		String juge = "";//�̱�� 1, ���� 0,���� 2
		
		
		//�Է�
		com_num = (int)(Math.random()*3);
		
		System.out.println("��ǻ�ʹ� �����߽��ϴ�.");
		System.out.println("����� ������?");
		System.out.println("1.���� 2.���� 3.��");
		
		Scanner scann = new Scanner(System.in);
		menu=scann.nextInt();
		my_num =menu-1;
		
		
		if(com_num==((my_num+1)%3)) {
			//���� ���
			juge = "�����ϴ�.";
		}else {
			if(com_num == my_num) {
				//���� ���
				juge ="�����ϴ�.";
			}else {
				//�̱���
				juge ="�̰���ϴ�.";
			}
		}
		if(my_num==0) {
			my ="����";
		}else if(my_num==1) {
			my = "����";
		}
		else {
			my = "��";
		}
		if(com_num==0) {
			com ="����";
		}else if(com_num==1) {
			com ="����";
		}
		else {
			com ="��";
		}
	
		//���
		System.out.println("��ǻ�� : "+com);
		System.out.println("��� :"+my);
		System.out.println(juge);
		
	}
}
