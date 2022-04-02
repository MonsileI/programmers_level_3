package Today_22_04_01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class hash_Level_03 {

	
	public static void main(String[] args) {
		
		String[]genres = {"classic", "pop", "classic", "classic", "pop"};
		int [] plays = {500,600,150,800,2500};
					   //0   1   2   3   4 (고유번호)

		HashMap<String, Integer>map = new HashMap<>();
		
		for(int i=0;i<genres.length;i++) {
			
			map.put(genres[i], map.getOrDefault(plays[i], 0)+plays[i]);
			
		}
		
		
		ArrayList<String> music = new ArrayList<String>();
		ArrayList<Integer> result = new ArrayList<>();
		for(String key : map.keySet()) music.add(key);
		
		Collections.sort(music,(o1,o2) -> map.get(o2) - map.get(o1));
		
		for(int i=0;i<music.size();i++) {
			
			String g = music.get(i);
			
			int max = 0;
			int firstIdx = -1;
			
			for(int j=0;j<genres.length;j++) {
				if(g.equals(genres[j]) && max<plays[j]) {
					max = plays[j];
					firstIdx = j;
				}
			}
			
			
			max = 0;
			int secondIdx = -1;
			
			for(int j=0; j<genres.length;j++) {
				
				if(g.equals(genres[j]) && firstIdx != j && max < plays[j]) {
					max = plays[j];
					secondIdx = j;
				}
				
			}
			
			
			result.add(firstIdx);
			if(secondIdx!= -1) result.add(secondIdx);
			
			
			
		}
		
		int [] answer = new int[result.size()];
		
		for(int i =0;i<result.size();i++) answer[i] = result.get(i);
		
		for(int i : answer)System.out.println(i);
	}
}
