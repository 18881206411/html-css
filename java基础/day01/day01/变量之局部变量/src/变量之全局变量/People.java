package ����֮ȫ�ֱ���;

public class People {
	public String name; // null
	public int age; // 0
	public char sex; // \u0000 ���ַ�
	public float height; // 0.0 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		People p = new People();
		
		System.out.println(p.name);
		System.out.println(p.age);
		System.out.println(p.sex);
		System.out.println(p.height);
		
		p.name = "����";
		p.age = 20;
		p.sex = '��';
		p.height = 192.01f;
		
		System.out.println(p.name);
		System.out.println(p.age);
		System.out.println(p.sex);
		System.out.println(p.height);
	}

}
