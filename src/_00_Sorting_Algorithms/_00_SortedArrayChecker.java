package _00_Sorting_Algorithms;

public class _00_SortedArrayChecker {
	// 1. Write a static method called intArraySorted.
	public static boolean intArraySorted(int[] thing) {
		for (int i = 1; i < thing.length; i++) {
			if (thing[i-1] > thing[i]) {
				return false;
			}
		}
		return true;
	}
	// This method takes in an array of integers
	// and it returns a boolean.
	// The method returns true if the integer
	// array is in ascending order and false otherwise

	// 2. Write a static method called doubleArraySorted.
	public static boolean doubleArraySorted(double[] d) {
		for (int i = 1; i < d.length; i++) {
			if (d[i-1] > d[i]) {
				return false;
			}
		}
		return true;
	}
	// This method takes in an array of doubles
	// and it returns a boolean.
	// The method returns true if the double
	// array is in ascending order and false otherwise

	// 3. Write a static method called charArraySorted.
	public static boolean charArraySorted(char[] character) {
		for (int i = 1; i < character.length; i++) {
			if (character[i-1] > character[i]) {
				return false;
			}
		}
		return true;
	}
	// This method takes in an array of characters
	// and it returns a boolean.
	// The method returns true if the character
	// array is in alphabetical order and false otherwise
	// (You can compare characters just like integers)

	// 4. Write a static method called stringArraySorted.
	public static boolean stringArraySorted(String[] strings) {
		for (int i = 0; i < strings.length - 1; i++) {
			if (strings[i].compareTo(strings[i + 1]) >= 0) {
				return false;
			}
		}
		return true;
	}
	// This method takes in an array of Strings
	// and it returns a boolean.
	// The method returns true if the String
	// array is in alphabetical order and false otherwise
	// (Use the compareTo(String) method)

}
