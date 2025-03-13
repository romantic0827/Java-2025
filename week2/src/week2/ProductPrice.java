package week2;

public class ProductPrice {
	public static void main(String[] args) {
		int totalPrice = 5700;
		int cnt = 7;
		
		// 상품 단가 구하기 = 총 금액 / 개수
		// int/int => int
		double aPrice = (double)totalPrice / cnt;
		
		System.out.printf("구매 수량 : %d개 \n", cnt);
		System.out.printf("총 구매금액 : %d원 \n", totalPrice);
		System.out.printf("상품 단가 : %.1f원 \n", aPrice);
	}
}
