package com.fs.test;

public class People {
	
//	成员变量
	public String name;
	public char sex;
	public int age;
	public float height;
//	成员方法
	/*
	 * 1. 无参无返回
	 * 2. 无参有返回
	 * 3. 有参无返回
	 * 4. 有参又返回
	 * 
	 * 权限修饰符  返回值类型  方法名称([参数列表]){
	 *     方法体
	 * }
	 */
	public void eat() {
		System.out.println("eat....");
	}
	
	public int getAge() {
		
		return 200;
		
	}
	
	public void say(String s) {
		System.out.println(s);
	}
	
	public int getWeight(int a) {
		return a;
	}
	
	public static void main(String[] args) {
		People p = new People();
		p.eat();
		int age = p.getAge();
		System.out.println(age);
		
		int weight = p.getWeight(192);
		System.out.println(weight);
		
		p.say("HelloWorld");
	}
	
}
