package test;

import java.util.ArrayList;
public class testtest {
	
	public static void main(String[] args)   {
		
		
		ArrayList<Integer>a = new ArrayList<>();
		if(a instanceof ArrayList ) {
			System.out.println("true");
		}
		
		String str = "신수";
		
		if(str instanceof String) {
			System.out.println(str);
		}
		
		Integer num = 8;
		
		if(num instanceof Integer) {
			System.out.println(num);
		}
		
		Long yes = 8L;
		
		if(yes instanceof Long) {
			System.out.println(yes);
		}
	
		try {
			soo(str);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	private static  String soo(String str) throws Exception {
		
		Integer.parseInt(str);
		
		return "";
		
	}

}
