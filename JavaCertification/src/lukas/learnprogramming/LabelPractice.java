package lukas.learnprogramming;

public class LabelPractice {
	public static void main(String[] args) {
		myLabel:
		{
		int[] myArray= {1,2,3};
		}
	
		String[] animals = {"Dog", "Cat", "Lizard", "Bird", "Snake"};
		for(String animal:animals) {
			System.out.println(animal);
		}
		
		MY_LOOP: for(String animal: animals) {
			if(animal.equals("Cat")) {
				break MY_LOOP;
			}
			System.out.println(animal);
		}
		
		animal: for(String animal: animals) {
			if(animal.equals("Cat")) {
				break animal;
			}
		}
		
	}
}
