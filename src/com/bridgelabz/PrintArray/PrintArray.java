package com.bridgelabz.PrintArray;

public class PrintArray 
{
		public static void main(String[] args) 
		{		
			Integer[] integerArr = {5,6,7};
			Double[] doubleArr = {6.33 , 3.89, 7.99};
			Character[] charArr = {'P', 'E', 'R', 'F', 'I', 'O','S'};
			toPrint(integerArr);
			toPrint(doubleArr);
			toPrint(charArr);
			}
			
			
		private static <e> void toPrint(e[] inputArr) 
		{
			for(e element : inputArr)
			{
				System.out.println(element);
			}
		}
}




