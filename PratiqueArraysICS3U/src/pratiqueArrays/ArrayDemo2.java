package pratiqueArrays;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayDemo2 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String[] activities= {"Soccer","Basketball","Natation","Dessin","Lecture"};
		
		int placement = 0;
		int[] placements= {placement,placement,placement,placement,placement,placement};
		
		System.out.println("Place les activites de 1 à 5 par rapport a combien vous les aimez: ");
		for(int i=0;i<activities.length;i++) {
			
			System.out.println(activities[i]);
			placement=in.nextInt();
			
			placements[i]=placement;
			
		}
		
		System.out.println("Vos placements: \n Soccer: "+placements[0]+"\n Basketball: "+placements[1]+"\n Natation: "+placements[2]+"\n Dessin: "+placements[3]+"\n Lecture: "+placements[4]+".");
		
	}
	}
