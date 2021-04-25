package lukas.learnprogramming;

public class Static {
	private String name = "Static";
	
	public static void one() {
		
	}
	public static void two() {
		
	}
	public static void three() {
		
	}
	
	
	public static void main(String[] args) {
		Static.one();
		one();
		two();
		three();
//		four(); //not static
		
		Static myInstance=new Static();
		myInstance.four();
		
	}
	
	public void four() {
		one();
		two();
		three();
		System.out.println(name);
	}

}
