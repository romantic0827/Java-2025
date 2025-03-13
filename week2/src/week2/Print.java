package week2;

public class Print {
	public static void main(String[] args) {
		// main 메소드는 반드시 필요 => JVM이 실행하는 시작점
		// main 단축기 : main  ctrl+spacebar
		// print 단축기 : sysout + ctrl+spacebar
		System.out.println("객체 지향 프로그래맹");
		
		// 실행 단축키 : ctrl+F11
		// 주석 단축키 : ctrl+/ (토글키)
		/* System.out.println("객체");
		System.out.println("지향"); */
		System.out.println("/*객체 지향*/ 프로그래밍");
		
		// 숫자 출력 시 주의사항
		System.out.println("17 + 35 = " + (17+35));
		
		// 프린트 포맷
		// 문자열 출력 포맷 : printf
		// % : 프린트 포맷 기호
		// %s : 문자열
		// %d : 정수
		// %f : 실수
		// %c : 문자
		// \n : 줄바꿈
		
		System.out.printf("이름 : %s\n", "홍길동");
		System.out.printf("나이 : %d세\n", 25);
		
		System.out.printf("과목 : %s %s %s \n", "객체", "지향", "프로그래밍");		// %s를 줄 때는 %s 개수에 맞게 문자를 준다
	}
}
