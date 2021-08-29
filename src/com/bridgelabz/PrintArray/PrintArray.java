package com.bridgelabz.PrintArray;

public class PrintArray<E>
{
	private E[] inputArray;
	public static void main(String[] args) {
		Integer[] integerArr = {5,6,7};
		Double[] doubleArr = {6.33,3.89,7.99};
		Character[] charArr = {'P', 'E', 'R', 'F', 'I', 'O','S'};
		new PrintArray(integerArr).toPrint();
		PrintArray.toPrint(doubleArr);
		PrintArray.toPrint(charArr);
	}
	public PrintArray(E[] inputArray) {
		this.inputArray = inputArray;
	}
	
	public void toPrint() {
		PrintArray.toPrint(this.inputArray);
	}
	
	private static <E> void toPrint(E[] inputArray) {
		for(E element : inputArray) {
			System.out.println(element);
		}
	}	
}





