package Today_22_03_4;

public class hard {
	
	public static void main(String[] args) {
		
		int a = 3000;
		int daya =20;
		int b = 5000;
		int dayb = 34;
		
		for(int i=0;i<=55;i++) {
			
			int sum  = 0;
			
			if(daya<=i&&daya+30>=i) {
				sum += a;
			}
			if(dayb<=i&&dayb+30>=i) {
				sum += b;
			}
			
			System.out.println(sum);
			
		}
	}

}
