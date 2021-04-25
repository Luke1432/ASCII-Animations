package lukas.learnprogramming;

import java.util.Arrays;

public class UsingArrays {
	public static void main(String[] args) {
		String[] pets= {"bird", "dog", "cat"};
		for(String name:pets) {
			System.out.println(name+"," );
		}
		
		StringBuilder[] builders= {
				new StringBuilder("For"),
				new StringBuilder("Loop")
		};
		for(StringBuilder builder : builders) {
			System.out.println(builder);
		}
		for(StringBuilder builder : builders) {
			builder.append("123");
		}
		for(StringBuilder builder : builders) {
			System.out.println(builder);
		}
	}
}
