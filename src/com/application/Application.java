package com.application;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// Multithreading should be applied for number inputs and character and alphabets ;
		
		// first simply develop this for number and characters;
		
		// or what about ASCII or short data type ;
		
		
		
		//char s = 'a';
		
		//int j= s;
		
		//System.out.println(j);
		
		
		byte res =  generateRandomNumber();
		System.out.println("The input : "+ res );
		
		System.out.println("Enter the digit: ");
		
		Scanner sc  = new Scanner(System.in);
		
		Byte ans = sc.nextByte();
		
		if(ans==res)
			System.out.println("Ys");
		else
			System.out.println("N");
		
		
	}

	private static Byte generateRandomNumber() {
		// TODO Auto-generated method stub
		
		
		//int a = (int) Math.random();
		//int doesnt support much operations;
		
		//Integer a = (Integer) Math.random();//Cannot cast from double to Integer
		
		Double d = Math.random();
		
		//Integer a = 
		
		// i need only 1 number, so 2 ways;
		//1: use some function to reduce it to single digit
		
		//2: make use of String builder and all;
		
		String in = new String(d.toString());
		
		Byte ret = Byte.valueOf((byte) in.charAt(in.length()-1));
		
		return ret;
		
	}

}
