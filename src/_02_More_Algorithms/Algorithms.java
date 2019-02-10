package _02_More_Algorithms;

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
	public static int findTallest(List<Double> peeps) {
		int max=Integer.MAX_VALUE;
		for (int i = 0; i < peeps.size(); i++) {
			if (peeps.get(i)==max) {
				return i;
			}
		}
		return 0;
	}
	public static int findLongestWord(List<String> words) {
		String longest="";
		for (int i = 0; i < words.size(); i++) {
			if (words.get(i).length()==longest.length()) {
				return i;
			}
		}
		return 0;
	}
	public static int containsSOS(List<String> message) {
		for (int i = 0; i < message.size(); i++) {
			if (message.get(i).contains("...---...")) {
				return i;
			}
		}
		return 0;
	}
	public static double sortScores(List<Double> results) {
		for (int i = 0; i < results.size(); i++) {
			
		}
		return 0;
	}
}
