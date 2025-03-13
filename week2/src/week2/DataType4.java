package week2;

public class DataType4 {
	public static void main(String[] args) {
		// byte = 1byte(-128~127)
		byte	bData = 127;
		
		// char : 음수가 없다
		char	cData = 90;
		
		float	fData = 3.14f;
		
		long	lData = 1000000000L;		// 정수 : int로 정의됨
		
		boolean	boolData = true;
		
		System.out.println("bData =" + bData);
		System.out.println("cData =" + cData);
		System.out.println("fData =" + fData);
		System.out.println("lData =" + fData);
		System.out.println("boolData =" + boolData);
	}
}

/*
byte	bData = 128;
char	cData = -90;
float	fData = 3.14;
long	lData = 1000000000;
boolean	boolData = 10;

System.out.println("bData =" + bData);
System.out.println("cData =" + cData);
System.out.println("fData =" + fData);
System.out.println("lData =" + fData);
System.out.println("boolData =" + boolData); */