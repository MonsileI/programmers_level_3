package Today_22_04_01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class Array_lv_2 {
	
	public static void main(String[] args) {
		
		String[] genres = {"classic", "pop", "classic", "classic", "pop"};
		int [] plays = {500,600,150,800,2500};
		
		HashMap<String,Integer> map = new HashMap<>();
		
		for(int i=0;i<genres.length;i++) {
			map.put(genres[i], map.getOrDefault(plays[i], 0)+plays[i]);
		}
		
		ArrayList<String> music = new ArrayList<>();
		
		for(String key : map.keySet()) music.add(key);
		
		Collections.sort(music,(o1,o2)->map.get(o2)-map.get(o1));
		
		ArrayList<Integer> result = new ArrayList<>();
		
		
		for(int i=0;i<music.size();i++) {
			
			String g = music.get(i);
			
			int firIdx = -1;
			int max = 0;
			
			for(int j=0;j<genres.length;j++) {
				if(g.equals(genres[j]) && plays[j]>max) {
					firIdx = j;
					max = plays[j];
				}
			}
			
			int secIdx = -1;
			max = 0;
			
			for(int j=0;j<genres.length;j++) {
				if(g.equals(genres[j]) && plays[j]> max && j != firIdx) {
					secIdx = j;
					max = plays[j];
				}
			}
			
			result.add(firIdx);
			
			if(secIdx >= 0) result.add(secIdx);
			
		}
		
		int[] answer = new int[result.size()];
		
		for(int i =0;i<result.size();i++) answer[i] = result.get(i);
		
		for(int i : answer)System.out.println(i);
		
		
	}

}
