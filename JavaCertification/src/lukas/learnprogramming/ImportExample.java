package lukas.learnprogramming;

import java.util.Random;

/**
 * 
 * @author Lukas Fenkam
 * 
 */
public class ImportExample {
	public static void main(String[] args) {
		int myInt=10;
		printSum(15,200);
	}
	private static void printSum(Integer first, Integer second) {
		Integer sum=first+second;
		System.out.println("sum= "+sum);
	}
}