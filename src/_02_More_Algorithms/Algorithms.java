package _02_More_Algorithms;

import java.util.Collections;
import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		for (int i = 0; i < eggs.size(); i++) {
			if (eggs.get(i)=="cracked") {
				return i;
			}
		}
		return 0;
	}
	public static int countPearls(List<Boolean> oysters) {
		for (int i = 0; i < oysters.size(); i++) {
			if (oysters.get(i)==true) {
				return i;
			}
		}
		return 0;
	}
	public static double findTallest(List<Double> peeps) {
		double max=Integer.MIN_VALUE;
		for (int i = 0; i < peeps.size(); i++) {
			if (peeps.get(i)>max) {
				max=peeps.get(i);
				
			}
		}
		return max;
	}
	public static String findLongestWord(List<String> words) {
		String longest="";
		for (int i = 0; i < words.size(); i++) {
			if (words.get(i).length()>longest.length()) {
				longest=words.get(i);
				
			}
		}
		return longest;
	}
	public static boolean containsSOS(List<String> message) {
		for (int i = 0; i < message.size(); i++) {
			if (message.get(i).contains("... --- ...")) {
				return true;
			}
		}
		return false;
	}
	public static List<Double> sortScores(List<Double> results) {
		boolean swap=true;
		while(swap){
			swap=false;
		for (int i = 0; i < results.size()-1; i++) {
			if (results.get(i)>results.get(i+1)) {
				double temp=0;
				temp=results.get(i);
				results.set(i, results.get(i+1));
				results.set(i+1, temp);
				swap=true;
				//Collections.sort(results, (d1, d2)->{d1.compareTo(d2)});
			}
		}
		
	}
		return results;
	}
	public static testSortStringLength(List<String> unsortedSequences) {
		String longest="";
		for (int i = 0; i < unsortedSequences.size(); i++) {
			if (unsortedSequences.get(i).length()>longest.length()) {
				String temp="";
				temp=unsortedSequences.get(i);
				unsortedSequences.set(i, longest);
			}
		}
	}
		
	
}
