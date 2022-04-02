package Today_22_04_01;

import java.util.PriorityQueue;

public class queue_level_3_no_2 {

	public static void main(String[] args) {
		
		String[]operations = {"I 4", "I 3", "I 2", "I 1", "D 1", "D 1", "D -1", "D -1", "I 5", "I 6"};
		
		int []answer = {0,0};
		
		//i면 insert d 1이면 최댓값 삭제 d -1이면 최솟값 삭제
		
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		PriorityQueue<Integer> pqMax = new PriorityQueue<Integer>((o1,o2)->o2-o1);
		
		for(int i=0;i<operations.length;i++) {
			
			String[]check = operations[i].split(" ");
			String action = check[0];
			String num = check[1];
			int number = Integer.parseInt(num);	
			
			if(action.equals("I")) {
			
				pq.offer(number);
				pqMax.offer(number);			
				continue;
				
			}
			
			if(action.equals("D")) {
			
				if(pqMax.size()<1) continue;
				if(number==-1){
					int delNum = pq.poll();
					pqMax.remove(delNum);
					
				}else if(number==1) {
					int delNum = pqMax.poll();
					pq.remove(delNum);
				}
				
				
			}
			
			
		}
		
		answer[0] = pqMax.peek();
		answer[1] = pq.peek();
		
		if(pq.size()<0) answer[1] = 0;
		if(pqMax.size()<0) answer[0] = 0;
		
		
		
		for(int i : answer)System.out.println(i);
		
	}
}
