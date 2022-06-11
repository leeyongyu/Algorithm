package algorithm;

import java.util.*;
public class part3_5 {

	public static void main(String[] args) {
		// 연속된 자연수의 합
		Scanner input =new Scanner(System.in);
		
		int n = input.nextInt();
		int answer = solution(n);
		
		System.out.print(answer);

	}
	private static int solution(int n) {
		int result=0;
		int sum=1;
		int lt=1,rt=1;
		
		while(lt < n && rt < n) {
			if(sum==n) {
				result++;
				sum-= lt;
				lt++;
			}else if(sum < n) {
				++rt;
				sum += rt;
			}else if(sum > n) {
				sum -= lt;
				lt++;
			}
		}
		return result;
	}
}
