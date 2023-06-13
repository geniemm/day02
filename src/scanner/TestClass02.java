package scanner;

import java.util.Scanner;

public class TestClass02 {
	public static void main(String[] args) {
		/*
		 초기화 방법
		 - 자료형의 첫 문자가 소문자면 0으로 초기화한다.
		 - 자료형의 첫 문자가 대문자면 null으로 초기화한다.
		 */
		
		
		int num = 0;
		// 쓰레기값이 있기때문에 이대로 출력하면 오류가 난다
		// 초기화는 보통 0으로 많이 한다
		String name = null; // String 의 변수의 값은 0으로 초기화 불가
		Boolean bool = null;
		Scanner sc = null;
		
		System.out.println(num);
		System.out.println(name);
		System.out.println(bool);
		System.out.println(sc);
		
		int kor =100, eng=90, sum ;
	
		sum = kor+eng;
		System.out.println("합계는: "+sum);
	}
}
