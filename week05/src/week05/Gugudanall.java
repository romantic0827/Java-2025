package week05;

public class Gugudanall {

	public static void main(String[] args) {
		// 2~9단까지 구구단 출력
		// 바깥 for 문 : 단의 출력
		
		for (int i = 2; i <= 9; i++) {
			// 단이 바뀌는 지점
			System.out.println("===========");
			System.out.println("구구단 " +i + "단");
			System.out.println("===========");
			// 안쪽 for 문 : 1~9까지 반복
			for (int j = 1; j <= 9; j++)
				System.out.printf("%d x %d = %d\n", i, j, i*j);
		}

	}

}
