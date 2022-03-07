package Today_22_03_4;

import java.util.LinkedList;
import java.util.Queue;

public class test {

	static int[] dx = {1,0,-1,0}; //좌우
	static int[] dy = {0,1,0,-1}; //상하
	
	public static void main(String[] args) {
		
		int [][]maps = {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},
					{1,1,1,0,1},{0,0,0,0,1}};
		
		int[][] visited = new int[maps.length][maps[0].length];
		int answer = 0;
		bfs(maps, visited);
		answer = visited[maps.length-1][maps[0].length-1];
		
		if(answer == 0) {
			answer = -1;
		}
		
		System.out.println(answer);
		
	}
		
	public static void bfs(int[][] maps, int[][] visited) {
		int x = 0;
		int y = 0;
		visited[x][y] = 1;
		Queue<int[]> queue = new LinkedList<>();
		queue.add(new int[] {x,y});
		
		while(!queue.isEmpty()) {
			int[] current = queue.remove();
			int cX = current[0];
			int cY = current[1];
			
			for(int i=0;i<4;i++) {
				
				int nX = cX + dx[i];
				int nY = cY + dy[i];
				
				if(nX < 0 || nX > maps.length -1 || nY < 0 || nY > maps[0].length-1) {
					
					continue;
				}
				
				if(visited[nX][nY] == 0 && maps[nX][nY]==1){
					visited[nX][nY] = visited[cX][cY] + 1;
					queue.add(new int[] {nX,nY});
				}
			}
		}
		
		
	
	}
}