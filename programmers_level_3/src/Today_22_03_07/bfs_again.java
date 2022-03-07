package Today_22_03_07;

import java.util.LinkedList;
import java.util.Queue;

public class bfs_again {

	static int[] dx = {1,0,-1,0}; //좌우
	static int[] dy = {0,1,0,-1}; //상하
	
	public static void main(String[] args) {
		
		int [][]maps = {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},
					{1,1,1,0,1},{0,0,0,0,1}};
		
		int [][] visited = new int[maps.length][maps[0].length];
		int answer = 0;
		bfs(maps,visited);
		
		
		answer = visited[maps.length-1][maps[0].length-1];
		
		System.out.println(answer);
		
	
	}
	
	public static void bfs(int[][]maps,int[][]visited) {
		
		
		int x = 0;
		int y = 0;
		visited[x][y] = 1;
		Queue<int[]>queue = new LinkedList<>();
		queue.add(new int[] {x,y});
		
		while(!queue.isEmpty()) {
			
			int[]current = queue.remove();
			int cx = current[0];
			int cy = current[1];
			
			for(int i=0;i<4;i++) {
				
				int nx = cx + dx[i];
				int ny= cy + dy[i];
				
				if(nx<0||nx>maps.length-1||ny<0||ny>maps[0].length-1) {
					continue;
				}
				
				
				if(visited[nx][ny]==0&&maps[nx][ny]==1) {
					visited[nx][ny] = visited[cx][cy]+1;
					queue.add(new int[] {nx,ny});
				}
				
			}
			
			
		}
		
		
		
	}
}