package Today_22_04_01;

public class Array_Level_1_again {

	static int answer = 0;
	
	public static void main(String[] args) {
		
		int[]numbers = {6,10,2};
		
		String[]temp = new String[numbers.length];
		
		for(int i=0;i<numbers.length;i++) temp[i] = String.valueOf(numbers[i]);
		
		boolean[]isVisited = new boolean[temp.length];
		
		dfs(temp,isVisited,0,"");
		
		String result = String.valueOf(answer);
		
		System.out.println(result);
	}
	
	static void dfs(String[]temp,boolean[]isVisited,int depth,String now) {
		
		if(depth==temp.length) {
			answer = Math.max(answer, Integer.parseInt(now));
		}
		
		for(int i=0;i<temp.length;i++) {
			
			if(!isVisited[i]) {
				isVisited[i] = true;
				String number = now + temp[i];
				dfs(temp,isVisited,depth+1,number);
				isVisited[i] = false; 
				
			}
			
		}
		
		
	}
}