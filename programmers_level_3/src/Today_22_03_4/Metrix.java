package Today_22_03_4;


public class Metrix {

	public static void main(String[] args) {
		
	int rows = 6;
	int columns = 6;
	int[][]queries = {{2,2,5,4},{3,3,6,6},{5,1,6,3}};
	int []answer = new int[queries.length];
	int[][]board = new int[rows][columns];
	int[][]temp = new int[rows][columns];
	
	int a = 1;
	for(int i=0;i<rows;i++) {
		for(int j=0;j<columns;j++) {
			board[i][j] = a;
			temp[i][j] = a;
			a++;}
		}
	
	for(int i=0;i<queries.length;i++) {
	
		int y1 = queries[i][0]-1;
		int x1 = queries[i][1]-1;
		int y2 = queries[i][2]-1;
		int x2 = queries[i][3]-1;
		
		int minNum = board[x1][y1];
		
		//최소값찾기~~~~
		
		for(int j=y1;j<=y2;j++) {
			if(minNum>board[x1][j]) minNum = board[x1][j];
			if(minNum>board[x2][j]) minNum = board[x2][j];
		}
		
		for(int j=x1;j<=x2;j++) {
			if(minNum>board[j][y1]) minNum = board[j][y1];
			if(minNum>board[j][y2]) minNum = board[j][y2];
			
		}
		
		
		for(int j=x1+1;j<=x2;j++) temp[j][y1] = board[j-1][y1];
		for(int j=x1;j<=x2-1;j++) temp[j][y2] = board[j+1][y2];
		for(int j=y1+1;j<=y2;j++) temp[x1][j] = board[x1][j-1];
		for(int j=y1;j<=y2-1;j++) temp[x2][j] = board[x2][j+1];
		
		for(int k=0;k<rows;k++) {
			for(int j=0;j<columns; j++) board[k][j] = temp[k][j];
		}
	
		answer[i] = minNum;
		
		}
	
	for(int i : answer) System.out.println(i);
	}
}
