package Today_22_04_01;

import java.util.ArrayList;
import java.util.HashSet;

public class Exhaustive_Search_lv_2 {

	static HashSet<Integer> set = new HashSet<Integer>();
	
	public static void main(String[] args) {
		
		String numbers = "011";
		
		boolean[] isVisited = new boolean[numbers.length()];
	
		make(numbers,isVisited,"");
		
		System.out.println(set);
	}
	
	static void make(String numbers,boolean[]isVisited,String now) {
		
		
		
		for(int i=0;i<numbers.length();i++) {
			
			if(!isVisited[i]) {
				isVisited[i] = true;
				String newNum = now + numbers.charAt(i);
				check(newNum);
				make(numbers,isVisited,newNum);
				isVisited[i] = false;
			}
			
		}
	}
	static void check(String newNum) {
		
		int a = Integer.parseInt(newNum);
		boolean flag = true;
		
		if(a<=1) flag = false;
		
		
		
		for(int i =2;i<=Math.sqrt(a);i++) {

			if(a%i==0) {
				flag=false;
				break;
			}
		}
		
		if(flag) set.add(a);
	}
}
