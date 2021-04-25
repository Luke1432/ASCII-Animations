package lukas.learnprogramming;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratingList1 {
	public static void main(String[] args) {
		List<Integer> numbers=new ArrayList<>();
		numbers.add(2);
		numbers.add(4);
		numbers.add(6);
		
		for(int i=0; i<numbers.size(); i++) {
			System.out.println("element at index "+i+" is "+numbers.get(i));
			//numbers.remove(i);//index out of bounds error
		}
		
		for(Integer number:numbers) {
			System.out.println("number= "+number);
//			numbers.remove(2);//concurrent modification error
		}
		
		for(Iterator<Integer> iterator=numbers.iterator(); iterator.hasNext();) {
			Integer number=iterator.next();
			
		}
	} 
}
