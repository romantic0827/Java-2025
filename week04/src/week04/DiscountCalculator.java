package week04;

import java.util.Scanner;

public class DiscountCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("상품 구매 금액 >>");
		int price = sc.nextInt();
		
		int rate = 0;
		int finalAmt;
		
		// 할인 조건 적용
		if (price >= 100000)
			rate = 10;
		else if (price >= 50000)
			rate = 5;
		
		// 할인 금액 계싼
		int discountAmt = price * rate / 100;
		finalAmt = price - discountAmt;
		
		// 결과 출력
		System.out.println("원래 금액 : " + price);
		System.out.println("할인율 : " + rate + "%");
		System.out.println("최종 금액 : " + finalAmt + "원");
		
		
		sc. close();

	}

}
