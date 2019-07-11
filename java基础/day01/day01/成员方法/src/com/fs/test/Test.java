package com.fs.test;

import javax.security.auth.x500.X500Principal;

public class Test {
//	成员变量

	public int x = 200;
	public int y = 300;
	
	/**
	 * 交换变量 的值
	 */
	public void tran(int a,int b) {
		int temp = a;
		a = b;
		b = temp;
		System.out.println("a == " + a + ", b == " + b );
	}
	/**
	 * 用于交换成员变量的值
	 * @param args
	 */
	
	public void tran2(Test t) {
		int temp = t.x;
		t.x = t.y;
		t.y = temp;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int m = 20 , n = 30;
//		System.out.println("这是交换前: " + m + ","+ n);
//		new Test().tran(m, n);
//		System.out.println("这是交换后: " + m + ","+ n);
		Test t = new Test();
		System.out.println("交换之前: " + t.x + "," + t.y);
		t.tran2(t);
		System.out.println("交换之后: " + t.x + "," + t.y);
	}

}
