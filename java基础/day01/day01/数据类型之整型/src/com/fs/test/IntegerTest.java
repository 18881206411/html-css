package com.fs.test;

public class IntegerTest {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte b = 127;
		
		short s = 30;
		
		int i = 50000;
		
		long l = 500L;
//		八进制:
		int n = 032; // 2*8^0 + 3 * 8^1 = 26
		int m = 0362; // 2*8^0 + 6*8^1 + 3*8^2 = 2 + 48 + 64*3 = 242
		System.out.println("n = " + n);
		System.out.println("n = " + m);
		
		
//		十六进制:  1 2 3 4 5 6 7 8 9 a b c d e f
		int x = 0x109; // 9 * 16 ^ 0 + 0 + 1*16^2 = 265;
		int y = 0xfff; // 
		System.out.println("x = " + x); // 265
		System.out.println("y = " + y); // 4095
	}

}
