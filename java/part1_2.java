package algorithm;

import java.util.Scanner;

public class part1_2 {

	public static void main(String[] args) {
		// ��ҹ��� ��ȯ
		Scanner input = new Scanner(System.in);
		
		String str = input.next();
		
		System.out.print(solution(str));
	}
	public static String solution(String str) {
		String result ="";
		for(char c : str.toCharArray()) {
			if('A'<= c && 'Z' >= c ) {
				result+=Character.toLowerCase(c);
			}else if('a' <= c && 'z' >= c) {
				result+=Character.toUpperCase(c);
			}
		}
		return result;
	}
}
