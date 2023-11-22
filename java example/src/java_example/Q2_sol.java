package java_example;

import java.util.Scanner;

public class Q2_sol {
	public static void main(String[] args) {
		String com=""; //가위 0, 바위 1, 보 2
		int com_num = 0;
		
		String my="";//가위 0,바위 1,보 2
		int my_num = 0;
		
		int menu = 0;
		String juge = "";//이기면 1, 비기면 0,지면 2
		
		
		//입력
		com_num = (int)(Math.random()*3);
		
		System.out.println("컴퓨터는 결정했습니다.");
		System.out.println("당신의 선택은?");
		System.out.println("1.가위 2.바위 3.보");
		
		Scanner scann = new Scanner(System.in);
		menu=scann.nextInt();
		my_num =menu-1;
		
		
		if(com_num==((my_num+1)%3)) {
			//지는 경우
			juge = "졌습니다.";
		}else {
			if(com_num == my_num) {
				//비기는 경우
				juge ="비겼습니다.";
			}else {
				//이긴경우
				juge ="이겼습니다.";
			}
		}
		if(my_num==0) {
			my ="가위";
		}else if(my_num==1) {
			my = "바위";
		}
		else {
			my = "보";
		}
		if(com_num==0) {
			com ="가위";
		}else if(com_num==1) {
			com ="바위";
		}
		else {
			com ="보";
		}
	
		//출력
		System.out.println("컴퓨터 : "+com);
		System.out.println("당신 :"+my);
		System.out.println(juge);
		
	}
}
