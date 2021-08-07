
package com.andile.assginemt2;

import java.util.Arrays;
import java.util.Scanner;

public class JavaBasics {

	public static void main(String[] args) {
			
			System.out.println("Enter the required size of the List :: ");
		      Scanner scanner = new Scanner(System.in);
		      int size = scanner.nextInt();
		      int myList[] = new int [size];
		      System.out.println("Enter the elements of the List one by one ");
		 
		      for(int i = 0; i<size; i++) {
				  myList[i] = scanner.nextInt();
		     }
		     Mountain.max_min(myList);
		     System.out.println("Contents of the array are: "+Arrays.toString(myList));
		     System.out.println(" Maximum value for the above List = " + Mountain.getMax());
		     System.out.println(" Minimum value for the above List = " + Mountain.getMin());
		     
		}

}
