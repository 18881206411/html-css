package 数据类型转换之自动类型转换;

public class TansTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		自动类型转换
		byte b = 126;
		int i = b;
		short s = b;
		
//		
		int n = 200;
		float f = n; // 200.0
		System.out.println(f);
		
//		强制类型转换
		
		int m = 127;
		byte b2 =(byte) m;
		
		float f2 = 200.125f;
		int x = (int) f2;
		
		System.out.println(x);
	}

}
