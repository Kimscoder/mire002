package java_example;

import java.util.Scanner;//ctrl+shift+o ġ�� import�����
//�ּ� ctrl + / 
public class ConsoleInput {

	public static void main(String[] args) {
      Scanner scann= new Scanner(System.in);
      
      
//      scann.nextInt() �����Է�
//      scann.nextFloat() �Ǽ��Է�
      System.out.print("������ �Է�:");
      int inputInt = scann.nextInt();
      
      System.out.print(("�Ǽ��� �Է�:"));
      float inputFloat = scann.nextFloat();
      
      System.out.println("�Է��� ���� :"+inputInt);
      System.out.println("�Է��� �Ǽ� :"+inputFloat);
	}

}
