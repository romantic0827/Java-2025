package week3;

public class ProductPrice {

	public static void main(String[] args) {
		// 상품 가격 계산하기
		int mk = 4500;
		int mkCount = 1;
		int ct = 1000;
		int ctCount = 3;
		int sk = 1500;
		int skCount = 2;
		
		int allPrice = mk * mkCount;
		allPrice += ct * ctCount;
		allPrice += sk * skCount;
		
		// 할인 전 상품 가격
		System.out.println("할인 전 상품 가격 : " + allPrice + "원");
		
		// 할인 금액 : 10% => 10 /  100 = 0.1
		double discount = allPrice * 0.1;
		
		System.out.println("할인 금액 : " + discount + "원");

		// 최종 금액
		double finalPrice = allPrice - discount;
		
		System.out.println("할인 금액 : " + finalPrice + "원");
		
		

	}

}
