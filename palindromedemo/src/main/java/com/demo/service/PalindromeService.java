package com.demo.service;

import org.springframework.stereotype.Service;

@Service
public class PalindromeService {
	
	public String getLongestPalindromeSubString(String _s_) {
	    // All subStrings of length 1 are palindromes
	    int maxLength = 1, start = 0;
	 
	    // Nested loop to mark start and end index
	    for (int i = 0; i < _s_.length(); i++) {
	        for (int j = i; j < _s_.length(); j++) {
	            int flag = 1;
	 
	            // Check palindrome
	            for (int k = 0; k < (j - i + 1) / 2; k++)
	                if (_s_.charAt(i + k) != _s_.charAt(j - k))
	                    flag = 0;
	 
	            // Palindrome
	            if (flag!=0 && (j - i + 1) > maxLength) {
	                start = i;
	                maxLength = j - i + 1;
	            }
	        }
	    }
	 
	    System.out.print("Longest palindrome subString is: ");
	    String longestPalindrome = _s_.substring(start, start + maxLength);
	    System.out.println(longestPalindrome);
	    return longestPalindrome;
	}	
}
