package sample;
import java.util.Scanner;

public class question99_2 {

	public static void main(String[] args) {
		//java.util 패키지의 Scanner 클래스 (객체생성 시 준용되는 설계도 -멤버변수+메소드)
		//scanner : 클래스(설계도)를 현실화 한 객체
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("첫번째 수:");
		//.nextLine() => ()가 붙으면 객체의 메소드(행위) =>Enter 키 이전까지 입력되 문자열을 읽음
		String strNum1 = scanner.nextLine();  //scanner 객체의 nextLine()메소드 
		
		System.out.println("두번째 수:");
		//Enter 키 이전까지 입력된 문자열을 읽어서 strNum2라는 문자형 변수에 할당(대입)을 함
		String strNum2 = scanner.nextLine();
		
		System.out.println(strNum1 + strNum2);
		//숫자형문자 : "32"
		//Integer.parseInt(숫자형문자) => 숫자
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		int result = num1 + num2;
		System.out.println("덧셈결과 :" +result);
		
		//strNum1 변수에 대입되어있는 문자열을 숫자형으로 형변화 =>num1  숫자형 변수에 대입
	}

}
