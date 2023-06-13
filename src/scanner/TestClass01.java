package scanner;

import java.util.Scanner;
// 특정기능을 현재페이지로 불러와서 사용
public class TestClass01 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
	
		int num;
		String name;
		
		System.out.print("이름 입력: ");
		name=input.next(); // 문자열입력

		System.out.print("수 입력: ");
		num = input.nextInt(); // 정수입력
		System.out.println();
		System.out.println("이름: "+name);
		System.out.println("입력 수: "+num);
	}

}
