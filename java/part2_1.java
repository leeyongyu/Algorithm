package algorithm;
import java.util.*;
public class part2_1 {

	public static void main(String[] args) {
		// ū �� ����ϱ�
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		int [] numArr = new int[n];
		for(int i=0; i<n; i++) {
			numArr[i] = input.nextInt();
		}
		solution(numArr,n);
	}
	private static void solution(int [] array, int n) {
		String result ="";
		for(int i=0; i<array.length; i++) {
			if(i==0) {
				result+= array[i] + " ";
			}else if(array[i] > array[i-1]){
				result += array[i] + " ";
			}
		}
		System.out.print(result);
	}
}
