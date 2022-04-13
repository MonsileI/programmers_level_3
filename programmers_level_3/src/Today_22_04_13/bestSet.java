package Today_22_04_13;

import java.util.ArrayList;
import java.util.Arrays;

public class bestSet {


	public static void main(String[] args) {

		int n = 2;
		int s = 9;
		
		int [] answer;
		
		if(n > s) {
			answer = new int[] {-1};
		}
			answer = new int[n];
		if(s % n==0) {
			for(int i=0;i<n;i++) {
				
				answer[i] =s /n;
			}
		}else {
			int rem = s%n;
			int po = n-rem;
			for(int i=0;i<po;i++) {
				answer[i] = s/n;
			}
			for(int i=po;i<n;i++) {
				answer[i] = s/n+1;
			}
		}
		
		for(int i : answer)System.out.println(i);
		
	}
}