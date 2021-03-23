package com.example.demo;

public class BinaryReverse {

	public static void main(String[] args) {
		String binaryString = Integer.toBinaryString(47);
		int binaryReverse = binaryReverse(binaryString);
		System.out.println(binaryReverse);
	}
	
	private static int binaryReverse(String binaryString) {
		int length = binaryString.length();
		
		//pad the string with the 0's to form the nearest 8bits binary representation
		int a = (int)Math.ceil(length / 8.0);
		for(int i=0; i<a*8-length; i++) {
			binaryString = '0' + binaryString;
		}
		
		// reverse the binary string
		binaryString = new StringBuilder(binaryString).reverse().toString();
		
		// get the decimal representation of the reversed binary string
		int result = Integer.parseInt(binaryString, 2);
		return result;
	}
	
}
