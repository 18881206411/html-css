package com.fs.test;

import java.util.Scanner;

/**
 * 
 * 这是一个用于说明java注释的类
 * 
 * @author root
 *
 */
public class TestDome {

	// 单行注释

	/*
	 * 多行注释
	 * 
	 * 用于注释代码块
	 */

	/**
	 * 
	 * @param i
	 *            这是一个int类型的变量
	 */

	public void m1(int i) {

	}

	/**
	 * 这是一个用于吃的方法
	 * 
	 * @param food
	 *            传入一种食物名称
	 */

	public void eat(String food) {

	}

	/**
	 * 这是一个用于返回年龄的方法
	 * 
	 * @return 需要返回一个整型数值
	 */

	public int age() {
		System.out.println("age");
		return 1;
	}

	/**
	 * 文档注释
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
//		TestDome td = new TestDome();
//		td.age();
//		System.out.println("TestDome");
//		System.out.println();
		System.out.print("输出一个没有换行的语句");
		System.out.println("输出一个换行语句");
		System.out.print("输出一个没有换行的语句");
		
		System.err.println("error");
		
		Scanner scanner = new Scanner(System.in);
		scanner.nextLine();
	}
}
