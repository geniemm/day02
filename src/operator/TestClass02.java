package operator;

import java.util.Scanner;

public class TestClass02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("수 입력: ");
		int num = sc.nextInt();
		String result = (num%2==0)?"짝수":"홀수";
		System.out.println(num+" = "+result);
		String result2 = (num%3==0)?"3의 배수이다":"3의 배수가 아니다";
		System.out.println(num+" = "+result2);
		System.out.println();
		int num1, num2;
		System.out.print("두 수 입력: ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		System.out.println("num1 :"+num1+", num2 :"+num2);
		String result3 = (num1>num2)?"num1이 num2보다 크다":"num2가 num1보다 크다";
		System.out.println(result3);
	}
}
