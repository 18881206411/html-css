package com.fs.test;

import javax.security.auth.x500.X500Principal;

public class Test {
//	��Ա����

	public int x = 200;
	public int y = 300;
	
	/**
	 * �������� ��ֵ
	 */
	public void tran(int a,int b) {
		int temp = a;
		a = b;
		b = temp;
		System.out.println("a == " + a + ", b == " + b );
	}
	/**
	 * ���ڽ�����Ա������ֵ
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
//		System.out.println("���ǽ���ǰ: " + m + ","+ n);
//		new Test().tran(m, n);
//		System.out.println("���ǽ�����: " + m + ","+ n);
		Test t = new Test();
		System.out.println("����֮ǰ: " + t.x + "," + t.y);
		t.tran2(t);
		System.out.println("����֮��: " + t.x + "," + t.y);
	}

}
