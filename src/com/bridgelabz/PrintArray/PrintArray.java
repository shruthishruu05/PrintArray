package com.bridgelabz.PrintArray;

public class PrintArray {
	public static void main(String[] args) {	
		Integer[] integerArr = {5,6,7};
		Double[] doubleArr = {6.33 , 3.89, 7.99};
		Character[] charArr = {'P', 'E', 'R', 'F', 'I', 'O','S'};
		
		toPrint(integerArr);
		toPrint(doubleArr);
		toPrint(charArr);
		}
		
	private static void toPrint(Integer[] a) {
		
		for(int element : a) {
			System.out.println(element);
		}
		
	}
	
	private static void toPrint(Double[] b) {
		
		for(double element : b) {
			System.out.println(element);
		}
		
	}
	
	private static void toPrint(Character[] c) {
		
		for(char element : c) {
			System.out.println(element);
		}
		
	}
}


