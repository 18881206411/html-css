package 变量之全局变量;

public class People {
	public String name; // null
	public int age; // 0
	public char sex; // \u0000 空字符
	public float height; // 0.0 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		People p = new People();
		
		System.out.println(p.name);
		System.out.println(p.age);
		System.out.println(p.sex);
		System.out.println(p.height);
		
		p.name = "张三";
		p.age = 20;
		p.sex = '男';
		p.height = 192.01f;
		
		System.out.println(p.name);
		System.out.println(p.age);
		System.out.println(p.sex);
		System.out.println(p.height);
	}

}
