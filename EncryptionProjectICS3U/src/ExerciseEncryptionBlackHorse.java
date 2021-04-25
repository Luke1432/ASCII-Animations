import java.util.ArrayList;
import java.util.Arrays;
import java.lang.String;
import java.util.Collections;
/*
 * Lukas Fenkam
 * 18 Septembre 2020
 * ICS3U
 * 
 */
public class ExerciseEncryptionBlackHorse {

	public static void main(String[] args) {
		String blackHorse="black horse";
		char[] blackHorseLetters= {'b','l','a','c','k',' ','h','o','r','s','e'};
		String[] blackHorseNumbers= {"1","2","3","4","5","6","7","8","9"};
		ArrayList blackHorseNumberList=new ArrayList<String>();
		char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		int[] numbers = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26};
		int i=0;
		for(int j=0; j<String.valueOf(blackHorseNumbers).length()-1; j++) {
		
			
			
		if(String.valueOf(blackHorseLetters).contains(String.valueOf(alphabet[i]))){
			blackHorseNumberList.add(numbers[i]);
			
		}i++;
		
		
		}
		for(i=0; i<=blackHorseNumberList.size()-1;i++) {
			
		}
	System.out.println(blackHorseLetters);
	System.out.println(String.valueOf(blackHorseNumberList));
	
	
	}

}
