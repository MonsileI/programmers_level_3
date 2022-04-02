package Today_22_04_01;

import java.util.ArrayList;

public class Exhaustive_Search_lv_1 {

	public static void main(String[] args) {
		
		int [] answers = {1,3,2,4,2};
		
		int [] fir = {1,2,3,4,5};
		int [] sec = {2,1,2,3,2,4,2,5};
		int [] thi = {3,3,1,1,2,2,4,4,5,5};
		
		int first = 0;
		int second = 0;
		int third = 0;
		
		for(int i=0;i<answers.length;i++) {
			
			if(fir[i%5]==answers[i]) first++;
			if(sec[i%8]==answers[i]) second++;
			if(thi[i%10]==answers[i]) third++;
			
		}
		
		int max = Math.max(Math.max(first, second), third);
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		if(max==first) arr.add(1);
		if(max==second) arr.add(2);
		if(max==third) arr.add(3);
				
			
		int [] answer = new int[arr.size()];
		
		for(int i=0;i<arr.size();i++) answer[i] = arr.get(i);
		
		for(int i : answer) System.out.println(i);
		
		
	}
}
