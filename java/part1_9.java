package algorithm;

import java.util.Scanner;

public class part1_9 {

	public static void main(String[] args) {
		// ���ڸ� ����
		Scanner input = new Scanner(System.in);
		
		String str = input.nextLine();
		
		System.out.print(solution(str));
	}
	private static int solution(String str) {
		String number="";	
		for(int i=0; i<str.length(); i++) {
			if(Character.isAlphabetic(str.charAt(i)) != true) {
				number += str.charAt(i);
			}
		}		
		int result = Integer.parseInt(number);		
		return result;
	}
}
