package week04;

import java.util.Scanner;

public class BodyBMI {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름 입력 : ");
		String name = sc.next();
		
		System.out.println("키(cm) 입력 : ");
		int height = sc.nextInt();
		
		System.out.println("몸무게(kg) 입력 : ");
		int weight = sc.nextInt();
		
		// BMI 계산
		double mHeight = height / 100.0;
		System.out.println(mHeight);
		double bmi = weight / (mHeight * mHeight);	
		
		String result = "";
		if (bmi >= 30) 
			result = "고도비만";
		else if (bmi >= 25 && bmi < 30) 
			result = "비만";
		else if (bmi >= 23 && bmi < 25) 
			result = "과체중";
		else if (bmi >= 18.5 && bmi < 23) 
			result = "정상";
		
		System.out.println(name+"님의 키는 "+ height+ "이고 몸무게는 "+ weight +"kg입니다");
		System.out.printf("bmi는 %.2f %s입니다 \n" ,bmi , result);
		
		sc. close();
	}

}
