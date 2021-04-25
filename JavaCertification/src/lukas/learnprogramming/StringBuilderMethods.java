package lukas.learnprogramming;

public class StringBuilderMethods {
	public static void main(String[] args) {
		//charAt, indexOf. length, substring
		//0 1 2 3 4 5 6 7 8 9 10
		//p r o g r a m m i n g
		StringBuilder sb = new StringBuilder("programming");
		String sub=sb.substring(sb.indexOf("g"), sb.indexOf("mi"));
		int len=sb.length();//11
		char ch=sb.charAt(5);//a
		System.out.println(sub+ " " + len + " " + ch);
		
		//append
		StringBuilder b=new StringBuilder().append(1).append("L");
		b.append("-").append(true);
		System.out.println(b);
		
		
	}
}
