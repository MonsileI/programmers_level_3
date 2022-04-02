package Today_22_04_01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class collections_sort_practice {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> arr = new ArrayList<>();
		
		for(int i=1;i<5;i++) {
			arr.add(i);
		}
		
		Collections.sort(arr,(o1,o2) -> o2 - o1);
		
		
		System.out.println(arr);
		
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		ArrayList<String> list = new ArrayList<String>();
		
		map.put("third", 3);
		map.put("second", 2);
		map.put("first", 1);
		map.put("fifth", 5);
		map.put("fourth", 4);
		
		for(String key : map.keySet()) list.add(key);
		
		
		System.out.println(list);
		
		Collections.sort(list,(o1,o2)->map.get(o1)-map.get(o2));
		
		System.out.println(list);
	}

}
