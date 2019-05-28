package com.paula.LetterCombination;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombination {
	// List resultList to save the output strings.
		public List<String> resultList = null;

		// Map<Integer, String> mapping to save the mapping of digits and letters.
		public Map<Integer, String> mapping = null;

		// Initial resultList and mapping
		public LetterCombination() {
			resultList = new ArrayList<String>();
			mapping = new HashMap<Integer, String>();
			mapping.put(0, "");
			mapping.put(1, "");
			mapping.put(2, "abc");
			mapping.put(3, "def");
			mapping.put(4, "ghi");
			mapping.put(5, "jkl");
			mapping.put(6, "mno");
			mapping.put(7, "pqrs");
			mapping.put(8, "tuv");
			mapping.put(9, "wxyz");
		}

		/**
		 * convert digits to letters
		 * 
		 * @param digits
		 * @return resultList
		 */
		public List<String> combineLetters(String digits) {
			StringBuilder tempString = new StringBuilder();
			combineLetters(digits, tempString);
			return resultList;
		}

		/**
		 * Convert digits to letters and combine letters according to the order of digits.
		 * 
		 * @param digits
		 * @param tempList
		 * 
		 */
		public void combineLetters(String digits, StringBuilder tempString) {
			
			//add letter to resultList
			if (digits.length() == 0 && tempString.length() != 0) {
				resultList.add(tempString.toString());
				return;
			} else if (digits.length() == 0) {
				return;
			}
			
			//if letter is 0 or 1, then skip it.
			while(digits.length() > 0 && (digits.substring(0, 1).equals("0") || digits.substring(0,1).equals("1"))) {
				digits = digits.substring(1);
			}
			
			//if now digits is blank, then return
			if(digits.length() == 0) return;
			
			//combine letters
			Integer cur = Integer.valueOf(digits.substring(0, 1));
			String letters = mapping.get(cur);
			for (int i = 0; i < letters.length(); i++) {
				tempString = tempString.append(letters.charAt(i));
				combineLetters(digits.substring(1), tempString);
				tempString = tempString.deleteCharAt(tempString.length()-1);
			}
		}

		/**
		 * Clear resultList
		 */
		public void clearLetters() {
			resultList.clear();
		}
}
