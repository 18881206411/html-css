package 变量之局部变量;

public class ParamsTest {
	
	public void method1() {
		int i = 100;
		System.out.println("i == "+i);
	}
	
	public void method2() {
		int j = 200;
		System.out.println("j == " + j);
	}
	
	public void method3() {
		int x;
//		System.out.println("x == " + x);// 错误: 局部变量必须赋值才能使用
	}
//	variable
	public void method4() {
//		System.out.println("i ==" + i); // 错误: 变量只能在申明的代码块或者方法体重使用
	}
	
	public void method5(int a) {
		System.out.println(a);
	}

	public static void main(String[] args) {

		ParamsTest pt = new ParamsTest();
		pt.method1();
		pt.method2();
		pt.method5(50);

	}

}
