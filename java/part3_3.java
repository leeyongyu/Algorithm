package algorithm;

import java.util.*;
public class part3_3 {

	public static void main(String[] args) {
		// 최대 매출
		Scanner input =new Scanner(System.in);
		
		int N = input.nextInt();
		int K = input.nextInt();
		
		int [] a = new int[N];
		for(int i=0; i<N; i++) {
			a[i]=input.nextInt();
		}
		int answer = solution(N,K,a);
		System.out.print(answer);
		
	}
	private static int solution(int N, int K, int [] a) {
		int result=0;
		int sum=0;
		for(int i=0; i<K; i++) {
			sum+=a[i];
		}
		result=sum;
		int p1=K;
		while(p1 < N) {
			sum += (a[p1] - a[p1-K]);
			if(result <sum) {
				result=sum;
			}
			p1++;
		}
		
		return result;
	}
}
