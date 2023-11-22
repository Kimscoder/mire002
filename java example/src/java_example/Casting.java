package java_example;

public class Casting {

	public static void main(String[] args) {
		
		byte b = 13;
		short s = 3;
		int i = 2;
		long l= 9l;// 왼쪽의 상태는 int형의 9를 l에 대입한 것, long형태로 줄려면 9l로 줘야함
		float f = 2f;
		double d = 2;
		
		b = (byte)i;
		System.out.println(b);
		System.out.println(s+i);
		System.out.println(s+f);
		System.out.println(s/i);
		System.out.println(s/f);
		System.out.println("몫 : "+s/i);
		System.out.println("나머지 : "+s%i);
		
	}
	//int -> long으로 갈때는 문제 X , long -> int로 갈때는 문제있음(byte 차이)
	// a=b 일때 a,b는 type 동일
	//정수/정수 -> 몫을 구할때 사용
}
