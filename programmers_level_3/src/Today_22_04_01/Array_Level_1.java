package Today_22_04_01;

import java.util.Arrays;

public class Array_Level_1 {


	public static void main(String[] args) {
		
	int[]array = {1, 5, 2, 6, 3, 7, 4};
	int[][]commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
	
	int[]answer = new int[commands.length];
	
	for(int i=0;i<commands.length;i++) {
		
		int Idx1 = commands[i][0];
		int Idx2 = commands[i][1];
		int choice = commands[i][2];
		
		int[]temp = Arrays.copyOfRange(array, Idx1-1, Idx2);
		
		Arrays.sort(temp);
		
		answer[i] = temp[choice-1];
		System.out.println(answer[i]);
		
	}
	
		
	}
	
}
