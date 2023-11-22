package java_example;

public class LoginOperation {

	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		int c = 0;

		boolean result;
		
		a = 1;
		b = 2;
		c = 3;
		result = a < b || c < 2;// 논리 연산자를 기준으로 왼쪽이 참일때 오른쪽이 실행이됨

		System.out.println("a :" + a);
		System.out.println("b :" + b);
		System.out.println("c :" + c);
	}

}
