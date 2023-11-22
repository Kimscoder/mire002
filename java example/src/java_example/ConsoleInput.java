package java_example;

import java.util.Scanner;//ctrl+shift+o 치면 import선언됨
//주석 ctrl + / 
public class ConsoleInput {

	public static void main(String[] args) {
      Scanner scann= new Scanner(System.in);
      
      
//      scann.nextInt() 정수입력
//      scann.nextFloat() 실수입력
      System.out.print("정수를 입력:");
      int inputInt = scann.nextInt();
      
      System.out.print(("실수를 입력:"));
      float inputFloat = scann.nextFloat();
      
      System.out.println("입력한 정수 :"+inputInt);
      System.out.println("입력한 실수 :"+inputFloat);
	}

}
