package com.demo.palindromedemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.demo.service.PalindromeService;

@RestController
public class PalindromeController {

	@Autowired
	private PalindromeService palindromeService;
	
	@RequestMapping(method = RequestMethod.GET, path = "/{input}", produces = MediaType.TEXT_PLAIN_VALUE)
	public String getLongestPalindrome(@PathVariable("input") String _s_) {
		String longestPalindromeSubString = palindromeService.getLongestPalindromeSubString(_s_);
		
		// save the palindrome object to the database
		
		// return the longest palindrome substring
		return longestPalindromeSubString;
	}
	
}
