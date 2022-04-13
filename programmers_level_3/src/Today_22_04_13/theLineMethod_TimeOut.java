package Today_22_04_13;

import java.util.ArrayList;

public class theLineMethod_TimeOut {
	

	static ArrayList<String> arr = new ArrayList<>();
	
	public static void main(String[] args) {
		
		int n = 3;
		int k = 5;
		
		
		int [] comp = new int[n];
		
		boolean[] isVisited = new boolean[n];
		
		for(int i=1;i<=n;i++) comp[i-1] = i;
		
		
		dfs("",comp,n,0,isVisited);
		
		String answer = arr.get(k-1);
		
		System.out.println(answer);
		
		String[]check = answer.split(" ");
		
		int[]result = new int[check.length];
		
		for(int i = 0 ; i<check.length;i++) result[i] = Integer.parseInt(check[i]);
		
		
		
		
	}
	
	public static void dfs(String now,int comp[],int n,int depth,boolean[]isVisited) {
		
		
		if(depth==n) {
			now = now.substring(1,now.length());
			arr.add(now);
		}
		
		
		for(int i=0;i < comp.length;i++) {
			if(!isVisited[i]) {
				isVisited[i] = true;
				String s = now +" " + String.valueOf(comp[i]);
				dfs(s,comp,n,depth+1,isVisited);
				isVisited[i] = false;
				
				
			}
		}
		
	}

}


