package Strings;

import java.util.HashSet;

public class longestWord {

//	public static void main(String[] args)
//	{

	public class Solution {
	    public static boolean is_unique_within_range(String s, int start, int end) {
	        HashSet<Character> chars = new HashSet<>();
	        for (int i = start; i <= end; i++) {
	            char ch = s.charAt(i);
	            if (chars.contains(ch)) {
	                return false;
	            }
	            chars.add(ch);
	        }
	        return true;
	    }
	    public static int length_of_longest_substring(String s) {
	        int result = 0;
	        for (int i = 0; i < s.length(); i++) {
	            for (int j = i; j < s.length(); j++) {
	                if (is_unique_within_range(s, i, j)) {
	                    result = Math.max(result, j - i + 1);
	                }
	            }
	        }
	        return result;
	    }
	}
	}