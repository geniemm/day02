package scanner;

import java.util.Scanner;

public class TestClass03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		String name;
		System.out.print("당신의 이름은 무엇입니까? ");
		name=sc.next();
		
		int kor,eng,mat;
		System.out.print(name+"님의 국어 점수: ");
		kor = sc.nextInt();
		System.out.print(name+"님의 영어 점수: ");
		eng = sc.nextInt();
		System.out.print(name+"님의 수학 점수: ");
		mat =sc.nextInt();
		int sum = kor+eng+mat;
		
		System.out.println();
		System.out.println("=============");
		System.out.println("이름 : "+name);
		System.out.println("=============");
		System.out.println("국어 : "+kor);
		System.out.println("영어 : "+eng);
		System.out.println("수학 : "+mat);
		System.out.println("=============");
		System.out.println("합계 : "+sum);
		System.out.println("=============");
		

	}
}
