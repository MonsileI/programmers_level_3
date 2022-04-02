package Today_22_04_01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class heap_level_3 {
	
	public static void main(String[] args) {
	
	int[][]jobs = {{0, 3}, {1, 9}, {2, 6}};	
		
	int answer = 0;

	//작은것부터 정렬(배열 1번 값이 더 작은것부터 정렬)
	
	//stack으로 쌓아서 뽑아내면서 길이를 보자
	
	Arrays.sort(jobs,((o1,o2) -> o1[0]-o2[0]));
	
	
	System.out.println(schedule(jobs));
	
	}
	
	static int schedule(int[][] jobs) {
		
		
		PriorityQueue<int[]> queue = new PriorityQueue<>((o1,o2)->o1[1]-o2[1]);
		
		int answer = 0;
		int count = 0;
		int now = 0;
		int idx = 0;
		while(count < jobs.length) {
			while(idx<jobs.length&&jobs[idx][0] <= now) {
				queue.add(jobs[idx++]);
			}
			
			if(queue.isEmpty()) {
				now = jobs[idx][0];
			}else {
				int [] tmp = queue.poll();
				answer += tmp[1] + now - tmp[0];
				now += tmp[1];
				count++;
				System.out.println(answer);
			}
		}
		
		return answer/jobs.length;
	}

}
