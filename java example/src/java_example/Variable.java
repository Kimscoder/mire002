package java_example;

public class Variable {

	public static void main(String[] args) {
		byte b;
		short s;
		int i;
		long l;
		char c;
		String str;
		
		b=127; //1byte =127(Byte.MAX_VALUE)
		s=32767; //2byte = 32767(Short.MAX_VALUE)
		i=Integer.MAX_VALUE; // Integer.MAX_VALUE;
		l=Long.MAX_VALUE;
		
		str ="\"�ȳ��ϼ���.\"\t\n�ݰ����ϴ�.";
		c ='A';
		
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println("���� : "+c);
		System.out.println("���� : "+(int)c);
	    System.out.println(str);
	}
}
