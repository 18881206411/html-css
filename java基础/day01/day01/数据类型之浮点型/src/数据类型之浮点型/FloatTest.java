package 数据类型之浮点型;

public class FloatTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float f = 3.14F; // 默认创建为double类型  如果想要创建float类型则需要添加f或者F
		
		double d = 3.14;
		double d2= 3; // 3.0
		
		double d3 = .132; // 0.132
			
		
		System.out.println("d = " + d);
		System.out.println("d2 = " + d2);
		System.out.println("d3 = " + d3);
		
		double d4; // 声明
		d4 = 2.01; // 赋值
		
//		double d5 = 2.0, d6 = 3.0;
		// e和E无区别     e的后面必须是整数
		double d7 = 3.14E2; // 3.14 *10^2 
	}

}
