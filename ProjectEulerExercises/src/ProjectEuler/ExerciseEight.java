package ProjectEuler;

import java.math.BigInteger;
import java.util.ArrayList;

/*
 * Lukas Fenkam
 * 05 Novembre 2020
 * Project Euler #8
 * Ce programme d�termine le plus grand produit de 13 chiffres qui se trouvent cons�cutivement dans un tr�s long nombre
 */
public class ExerciseEight {

	public static void main(String[] args) {
		/*String number="123456789";
		int[] arrayOfNumber=convertNumberToArray(number);
		int largest=getLargestElementOfArray(arrayOfNumber);
		System.out.println(largest);
		*/
		/*String number="73167176531330624919225119674426574742355349194934" + 
				"96983520312774506326239578318016984801869478851843" + 
				"85861560789112949495459501737958331952853208805511" + 
				"12540698747158523863050715693290963295227443043557" + 
				"66896648950445244523161731856403098711121722383113" + 
				"62229893423380308135336276614282806444486645238749" + 
				"30358907296290491560440772390713810515859307960866" + 
				"70172427121883998797908792274921901699720888093776" + 
				"65727333001053367881220235421809751254540594752243" + 
				"52584907711670556013604839586446706324415722155397" + 
				"53697817977846174064955149290862569321978468622482" + 
				"83972241375657056057490261407972968652414535100474" + 
				"82166370484403199890008895243450658541227588666881" + 
				"16427171479924442928230863465674813919123162824586" + 
				"17866458359124566529476545682848912883142607690042" + 
				"24219022671055626321111109370544217506941658960408" + 
				"07198403850962455444362981230987879927244284909188" + 
				"84580156166097919133875499200524063689912560717606" + 
				"05886116467109405077541002256983155200055935729725" + 
				"71636269561882670428252483600823257530420752963450";
		*/
		String number="7293";
		int[] arrayOfNumber=convertNumberToArray(number);
		/*for(int i=0; i<arrayOfNumber.length; i++) {
			System.out.println(arrayOfNumber[i]);
		}*/
		int largest=getLargestElementOfArray(arrayOfNumber);
		System.out.println(largest);
		int largestProduct=getLargestProductOfNumbers(arrayOfNumber);
		System.out.println(largestProduct);
	}
	public static int[] convertNumberToArray(String longNumber) {
		int largestNumber=0;
		int[] longNumberArray=new int[longNumber.length()];
		for(int i=0; i<longNumber.length(); i++) {
			longNumberArray[i]=Integer.parseInt(String.valueOf(longNumber.charAt(i)));
		}
		
		return longNumberArray;
	}
	public static int getLargestElementOfArray(int[] longNumberArray) {
		int max=0; 
		for(int i=0; i<longNumberArray.length; i++) {
			if(longNumberArray[i]>max) {
				max=0;
				max=longNumberArray[i];
			}
		}
		return max;
	}public static int getLargestProductOfNumbers(int[] longNumberArray) {
		int max=0;
		int product=1;
		int amountOfMultipliers=1;
		
		
		/*
		for(int i=0; i<longNumberArray.length-amountOfMultipliers; i++) {
			if(i==0) {
				product=longNumberArray[i+amountOfMultipliers]*longNumberArray[i+amountOfMultipliers-1]*longNumberArray[i+amountOfMultipliers-2];//*longNumberArray[i+amountOfMultipliers-3];
			}else if(i==longNumberArray.length-1) {
				product=longNumberArray[i-amountOfMultipliers]*longNumberArray[i-amountOfMultipliers+2]*longNumberArray[i-amountOfMultipliers+1]*longNumberArray[i-amountOfMultipliers];
			}else {
				product=longNumberArray[i+amountOfMultipliers-2]*longNumberArray[i+amountOfMultipliers-1]*longNumberArray[i+amountOfMultipliers];
			}
		}*/
		for(int i=0; i<=longNumberArray.length-amountOfMultipliers; i++) {
			
				for(int j=i+amountOfMultipliers; j>=i; j--) {
					int k=i+amountOfMultipliers-j;
				product=longNumberArray[k]*product;
				}
		
			if(product>max) {
				max=product;
			}
			product=1;
		
		}	
		return max;
	
	
	}
}
