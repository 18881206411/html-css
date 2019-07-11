# JAVA补习

## 1 开发环境与文件介绍

### 1.1 Java语言基本概述

> Java语言是美国Sun公司（Stanford University Network），在1995年推出的高级的编程语言。所谓编程语言，是计算机的语言，人们可以使用编程语言对计算机下达命令，让计算机完成人们需要的功能。

1995年Sun公司发布Java1.0版本

1997年发布Java  1.1版本

1998年发布Java  1.2版本

2000年发布Java  1.3版本

2002年发布Java  1.4版本

2004年发布Java 1.5版本	=》 java 5*

2006年发布Java 6版本

2009年Oracle甲骨文公司收购Sun公司，并于2011发布Java 7版本

2014年发布Java 8版本*

2017年发布Java 9版本

2018年3月发布java 10版本

### 1.2 开发环境搭建

根据java开发环境搭建文档进行环境搭建

> 文档地址: http://note.youdao.com/noteshare?id=bde683442aa4b3e044cb91f385b62154&sub=39A60C47F12A4A9AA0DCE34CE818A6D1

### 1.3 eclipse的使用

> 1. 编辑器面板介绍
> 2. 创建一个java项目

### 1.4 Java注释

单行注释		 

```java
//
```

多行注释		

```java
/*注释内容*/
```

文档注释	

> 1. 类前: 用于描述一个类的使用
> 2. 方法前: 用于描述方法的参数,返回值及方法的作用
> 3. 变量前: 描述变量的含义

```java
/**
*  注释内容
*  @param i
*/
```

```java
/**
 * 这是一个用于文档注释的测试类
 * @author li
 *
 */
public class Test {	
	/**
	 * 表示年龄
	 */
	public int age;	
	
	/**
	 * 表示姓名
	 */
	public String name;
	
	/**
	 * 表示吃的方法
	 * @param food 传入一种食物名称
	 */
	public void eat(String food) {
		
	}
	
	/**
	 * 
	 * 用于计算行走的路程
	 * @return 返回行走的公里数
	 */
	public int walk() {
		return 1;
	}
}
// Project==> Generation Javadoc
```

### 1.5 标识符与关键字

#### 1.5.1 标识符

> 指在程序中，我们自己定义内容。比如类的名字、方法的名字和变量的名字等等，都是标识符。

HelloWorld案例中，出现的标识符有类名字 HelloWorld 。

**命名规则：** **硬性要求** 

1. 标识符可以包含 英文字母26个(区分大小写) 、 0-9数字 、 $（美元符号） 和 _（下划线） 。 
2. 标识符不能以数字开头。 
3. 标识符不能是关键字。 

**命名规范：** **软性建议** 

1. 类名规范：首字母大写，后面每个单词首字母大写（大驼峰式）。 
2. 方法名规范： 首字母小写，后面每个单词首字母大写（小驼峰式）。 
3. 变量名规范：全部小写。 

> 注意: 
>
> 1. 大小写敏感
> 2. 不能与Java语言的关键字重名
> 3. 避免和Java类库的类名重名
> 4. 不能有空格, @, #, +, -, *, / 等符号
> 5. 长度无限制
> 6. 应该使用有意义的名称, 达到见名知意的目的
> 7. 不可以是true或者false

| 合法标识符 | 非法标识符  |
| ---------- | ----------- |
| Farsight   | Hello World |
| button1    | 1button     |
| _boolean   | boolean     |
| you$me     | you@me#     |
| date       | Date        |

#### 1.5.2 关键字

> **关键字**：是指在程序中，Java已经定义好的单词，具有特殊含义。 
>
> 所有Java关键字都是小写的，DEFAULT、DO、NULL等都不是Java关键字 。
>
> goto和const 虽然从未被使用，但也作为Java关键字保留。
>
> true和false虽然被用作特殊用途，但不是Java关键字
>
> Java中一共有51个关键字

HelloWorld案例中，出现的关键字有 public 、 class 、 static 、 void 等，这些单词已经被Java定义好，全部都是小写字母，notepad++中颜色特殊。 

关键字比较多，不能死记硬背，学到哪里记到哪里即可。 

​                                                                                         表 2-1 关键字表

|              |           |          |          |           |            |
| :----------- | --------- | -------- | -------- | --------- | ---------- |
| abstract     | assert    | boolean  | break    | byte      | continue   |
| case         | catch     | char     | class    | const     | double     |
| default      | do        | extends  | else     | enum      | final      |
| finally      | float     | for      | goto     | long      | if         |
| implements   | import    | native   | new      | null      | instanceof |
| int          | interface | package  | private  | protected | public     |
| return       | short     | static   | strictfp | super     | switch     |
| synchronized | this      | while    | void     | throw     | throws     |
| transient    | try       | volatile |          |           |            |

**数据类型:8种**   

> boolean 布尔型    byte 字节型  char 字符型  double 双精度   float 浮点  int 整型  long 长整型    short 短整型

**访问权限修饰符:3种**

> private 私有的   protected 受保护的   public 公共的

**异常处理:5种**

> catch 处理异常   finally 有没有异常都执行   throw 抛出一个异常对象   try 捕获异常
>
> throws 声明一个异常可能被抛出 

**分支结构:6种**

> if 如果   else 反之  switch 开关  case 返回开关里的结果   default 默认 return 返回

**循环语句:5种**

> while 循环   do 运行   for 循环  continue 继续   break 跳出循环

**其他**

> class 类     extends 扩充,继承     implements实现     interface 接口     super 父类,超类	this 本类	void 无返回值
>
> final 终极,不可改变的  static 静态

### 1.6 Java文件介绍

1.6.1 类介绍

> Java程序的基本组成单元是类，由class声明，类体中包括属性和方法。
>
> 一个Java文件中可以有多个class声明，但由public修饰的类只能有一个，并且类名作为该文件的名称。

1.6.2 main方法介绍

> 每一个应用程序都必须包含一个main()方法，含有main()方法的类称为主类。
>
> main()方法是程序开始执行的位置。
>
> 在类中除main方法之外的方法都是成员方法。
>
> 所有的方法都必须写在类中。

1.6.3 输出语句

> System.out：标准输出
>
> System.err：错误输出
>
> System.in：标准输入

### 1.7 Java语言编码规范

package (包):
			package elearning;
			package cn.com.farsight;

Class (类)
			class	Mobile
			class	TestMobile

Interface (接口)
			interface  Animal;

Method (方法)
			balanceAccount()
			deleteUser()

Variable (变量)
			currentCustomer
			name
			age

Constant (常量)
			CURRENT_POSITION
			MAXNUM_SIZE

PI = 3.1415926

Array（数组）
			String[] args;
			byte[] input;

## 2 数据类型、变量和方法、运算符

### 2.1 数据类型

![数据类型](F:/02work-for-hqyj/12--java/%E5%A4%87%E8%AF%BE/images/%E6%95%B0%E6%8D%AE%E7%B1%BB%E5%9E%8B.png)

#### 2.1.1 数据类型介绍

| 数据类型 | 字节数 | 二进制位数 | 范围                                       | 规律            |
| -------- | ------ | ---------- | ------------------------------------------ | --------------- |
| byte     | 1      | 8          | -128～127                                  | -2^7～2^(7)-1   |
| short    | 2      | 16         | -32768～32767                              | -2^15～2^(15)-1 |
| int      | 4      | 32         | -2147483648～2147483647                    | -2^31～2^(31)-1 |
| long     | 8      | 64         | -9223372036854775808 ~ 9223372036854775807 | -2^63～2^(63)-1 |
| float    | 4      | 32         | 1.4E-45~3.4028235E38                       |                 |
| double   | 8      | 64         | 4.9E-324~1.7976931348623157E308            |                 |
| char     | 2      | 16         | 0～65535                                   | 0~2^(16)-1      |
| boolean  | 1      | 8          | true或false                                | true或false     |

> bit(位):表示信息的最小单位，是二进制数的一位包含的信息;
>
> byte(字节)：用来计量存储容量的一种计量单位；　　
>
> 1 byte = 8 bit(1个字节等于8位);

float是单精度类型,精度是8位有效数字，取值范围是10的-38次方到10的38次方，float占用4个字节的存储空间

double是双精度类型，精度是17位有效数字，取值范围是10的-308次方到10的308次方，double占用8个字节的存储空间

当你不声明的时候，默认小数都用double来表示，所以如果要用float的话，则应该在其后加上f.

```java
//定义字节型变量
byte b = 100;
//定义短整型变量
short s = 1000;
//定义整型变量
int i = 123456;
//定义长整型变量
long l = 12345678900L;
//定义单精度浮点型变量
float f = 5.5F;//float f = 5.5f;
//定义双精度浮点型变量
double d = 8.5; 
//定义布尔型变量
boolean bool = false;
//定义字符型变量
char c = 'A';
```

#### 2.1.2 整形

整数类型用来存储整数数值，即没有小数部分的数值。可以是正数，也可以是负数。

4种整型数据的不同取值范围如下表：

| 类    型 | 占用存储空间 | 表数范围                                     |
| -------- | ------------ | -------------------------------------------- |
| byte     | 1字节        | -128 ~ 127                                   |
| short    | 2字节        | -2^15 ~ 2^(15-1) （-32768~32767）            |
| int      | 4字节        | -2^31 ~ 2^(31-1)    (-2147483648~2147483647) |
| long     | 8字节        | -2^63 ~ 2^(63)-1                             |

Java语言整型常量的三种表示形式： 

十进制整数，如21, -1110, 0。 

八进制整数，要求以0开头，如0123

十六进制数，要求0x或0X开头，如0x12 3

Java语言的整型常量默认为int型

   如： 23，默认的类型为int类型;

声明long型常量可以后加‘ l ’或‘ L ’

   如： long  income = 30000L;

#### 2.1.3 浮点型

浮点类型表示有小数部分的数字，分为单精度浮点类型（float）和双精度浮点类型（double）。它们有不同的取值范围，如下表：

| 类    型 | 占用存储空间 | 表数范围             |
| -------- | ------------ | -------------------- |
| float    | 4字节        | -3.403E38~3.403E38   |
| double   | 8字节        | -1.798E308~1.798E308 |

Java浮点类型常量有两种表示形式
十进制数形式，必须含有小数点
	例如: 3.14       314.0      .314 
科学记数法形式
	例如: 	3.14e2 = 3.14 * 10 ^ 2

​      			 3.14E2 = 3.14 * 10 ^ 2

​      			 314E2 = 314 * 10 ^ 2
Java浮点型常量默认为double型，如要声明一个常量为float型，则需在数字后面加f或F，如：
​		double  d = 3.14;
​		float  f = 3.14f;

#### 2.1.4 字符型  

char型数据用来表示通常意义上“字符”，用来存储单个字符；
字符常量是用**单引号**括起来的单个字符
		char c = 'A';
Java字符采用Unicode编码，每个字符占两个字节，因而可用十六进制编码形式表示（前缀为u表示Unicode）
 	  char  c1 = '\u0061';   // a
Java语言中还允许使用转义字符'\'来将其后的字符转变为其它的含义
		char c2 = '\n';     //代表换行符

| 转义符 | 含义              | Unicode值 |
| ------ | ----------------- | --------- |
| \b     | 退格（backspace） | \u0008    |
| \n     | 换行              | \u000a    |
| \r     | 回车              | \u000d    |
| \t     | 制表符（tab）     | \u0009    |
| \“     | 双引号            | \u0022    |
| \‘     | 单引号            | \u0027    |
| \ \    | 反斜杠            | \u005c    |

#### 2.1.5 布尔型  

boolean类型适于逻辑运算，一般用于程序流程控制中作为条件判断。

boolean类型数据只允许取值true或false，不可以0或非0的整数替代true和false。

布尔值不能与整数类型进行转换。

```java
boolean b = false;
if(b){
    // do something
}
```

#### 2.1.6 基本数据类型转换 

##### 2.1.6.1 自动类型转换

> 将低数据类型的值赋给高数据类型的变量

​		两种类型兼容

​		目标类型表数范围大于源类型

​		有可能会丢失精度（虚线之间）

![1560999804761](F:/02work-for-hqyj/12--java/%E5%A4%87%E8%AF%BE/images/%E8%87%AA%E5%8A%A8%E7%B1%BB%E5%9E%8B%E8%BD%AC%E6%8D%A2.png)

##### 2.1.6.3 强制类型转换 

> 将高数据类型的值赋给低数据类型的变量

```java
//自动类型转换：将低数据类型的值赋给高数据类型的变量
byte b = 100;

short s = b;//byte--->short  将低数据类型的值赋给高数据类型的变量
int i = b;//byte--->int

int j = 123;
double d = j;//int--->double

//强制类型转换：将高数据类型的值赋给低数据类型的变量
int m = 129;
short m1 = (short)m;//int--->short
byte m2 = (byte)m;//int--->byte

float f = 3.14f;
int n = (int)f;//float--->int,有可能丢失精度
System.out.println("n = " + n);

char c1 = '好';
int index = c1;//自动类型转换
System.out.println("index = " + index);

int num = 20320;
char c2 = (char)num;//强制类型转换
System.out.println(c2);
```

### 2.2 局部变量和成员变量  

声明:

​			数据类型 标识符 [ =值 ] [,标识符[=值]...]

#### 2.2.1 局部变量

- 定义在类的方法内或代码块内的变量, 参数也是局部变量
- 局部变量只在定义它的方法体内或代码块内有效
- 局部变量在使用之前，必须先初始化

#### 2.2.2 全局变量（成员变量）

- 一个类中既不在方法体内也不在程序块内定义的变量
- 类中所有的方法和代码块都可以访问成员变量
- 对于没有初始化的成员变量，也可以使用，系统会指定默认的值   

| **数据类型**                            | **默认值** | **数据类型** | **默认值** |
| --------------------------------------- | ---------- | ------------ | ---------- |
| byte                                    | 0          | short        | 0          |
| int                                     | 0          | long         | 0L         |
| float                                   | 0.0f       | double       | 0.0d       |
| char                                    | ‘\u0000’   | boolean      | false      |
| object ref(引用数据类型:  类,接口,数组) | null       |              |            |

#### 2.2.3 成员变量和局部变量区别

```java
/**
	 * 局部变量：
	 * 1、定义在方法或代码块内部的变量，方法的参数也是局部变量
	 * 2、局部变量的作用域范围只在定义它的方法内部有效
	 * 3、局部变量再使用之前必须先初始化
	 * 
	 */
public void aMethod(int i) {
    int a = 10;//声明变量并初始化

    int b;
    b = 20;//先声明变量再初始化

    System.out.println("a + b = " + (a + b));

    int c;
//	System.out.println(c);//错误：局部变量再使用之前必须先初始化
}

public void bMethod() {
//	System.out.println("a + b = " + (a + b));//a和b变脸不在作用域范围内
}

/*
 * 成员变量（全局变量）
 * 1、不在方法内部或代码块内部定义的变量
 * 2、作用域范围是整个类的所有方法中
 * 3、成员变量不用初始化也可以使用
 */
int x = 10;
int y = 200;

public void cMethod() {
    System.out.println("x*y = " + x*y);
}

//成员变量都有默认值
int i;//0
float f;//0.0
char c;//空字符，    \u0000
boolean b;//false
String s;//null  引用数据类型

public static void main(String[] args) {
    ParamTest pt = new ParamTest();
    pt.aMethod(1);

    pt.cMethod();

    System.out.println("i = " + pt.i);//0
    System.out.println("f = " + pt.f);//0.0
    System.out.println("c = " + pt.c);//空字符，    \u0000
    System.out.println("b = " + pt.b);//false
    System.out.println("s = " + pt.s);//null  引用数据类型
}
```

变量根据定义**位置的不同**，我们给变量起了不同的名字。

```java
public class Car {
	String color; // 成员变量
    public void drive(){
        int speed = 80; // 局部变量
        System.out.println("时速 : " + speed);
    }
}
```

- 在类中的位置不同 **重点** 
  - 成员变量：类中，方法外 
  - 局部变量：方法中或者方法声明上(形式参数) 
- 作用范围不一样 **重点** 
  - 成员变量：类中 
  - 局部变量：方法中 
- 初始化值的不同 **重点** 
  - 成员变量：有默认值 
  - 局部变量：没有默认值。必须先定义，赋值，最后使用 
- 在内存中的位置不同 **了解** 
  - 成员变量：堆内存 
  - 局部变量：栈内存 
- 生命周期不同 **了解** 
  - 成员变量：随着对象的创建而存在，随着对象的消失而消失 
  - 局部变量：随着方法的调用而存在，随着方法的调用完毕而消失 

### 2.3 成员方法

#### 2.3.1 成员方法的定义  

> 方法是类或对象的行为特征的抽象。

> 方法: 就是将一个**功能**抽取出来，把代码单独定义在一个大括号内，形成一个单独的功能。
>
> 当我们需要这个功能的时候，就可以去调用。这样即实现了代码的复用性，也解决了代码冗余的现象。

Java中的方法不能独立存在，所有的方法必须定义在类里。

使用“类名.方法”或“对象.方法”的形式调用

语法格式：

```java
权限修饰符   返回值类型   方法名（参数类型   参数名）{  
    ...//方法体
    return  返回值；
}

/*  
 * 方法分为四种
 *   1. 无参数无返回值
 *   2. 有参数没有返回值
 *   3. 没有参数有返回值
 *   4. 有参数有返回值
 */
```

- 举例

  ```java
  //无参数无返回值的方法
  public void aMethod() {
      System.out.println("无参数无返回值的方法");
  }
  
  //有参数但没有返回值的方法
  public void bMethod(int a) {
      System.out.println("有参数但没有返回值的方法");
  }
  
  //没有参数但有返回值的方法
  public int cMethod() {
      System.out.println("没有参数但有返回值的方法");
      return 10;
  }
  
  //有参数有返回值的方法
  public int dMethod(int a) {
      System.out.println("有参数有返回值的方法");
      return a+10;
  }
  
  public static void main(String[] args) {
      //创建MethodTest类的对象
      MethodTest mt = new MethodTest();
  
      //通过"对象.方法"调用
      mt.aMethod();
  }
  ```

#### 2.3.2 成员方法的参数  

方法可有0到多个参数，参数类型可以是任意数据类型

方法参数也是局部变量

参数为引用数据类型时：

​			当对象实例作为参数传递给方法时，传递的是对象的引用，接受参数的方法中可以改变参数的值

参数为简单数据类型时:

​			传递的是参数的副本，为值传递，接受参数的方法中不会改变参数的值

```java
//方法的参数为基本数据类型时：传递的是值的副本（值拷贝），方法中不会改变原实参的值
	public void swap(int a, int b) {//a、b变量称为形参
		int temp = a;
		a = b;
		b = temp;
		System.out.println("swap方法中交换数据后：a = " + a + ", b = " + b);
	}
	
	//当方法的参数是引用类型时：传递的是对象的地址
	int x = 100, y = 200;
	public void swap2(MethodParam m) {
		int temp = m.x;
		m.x = m.y;
		m.y = temp;
		System.out.println("swap2方法中交换数值后：x = " + m.x + ", y = " + m.y);
	}

	public static void main(String[] args) {
		MethodParam mp = new MethodParam();
		int m = 10, n = 20;
		mp.swap(m, n);//m、n变量称为实参
		System.out.println("交换完成后： m = " + m + ", n = " + n);
		
		MethodParam mp = new MethodParam();//用于调用swap2方法的对象
		MethodParam mParam = new MethodParam();//用于传参时使用
		mp.swap2(mParam);
		System.out.println("交换完成后: x = " + mParam.x + ", y = " + mParam.y);
	}
```

#### 2.3.3 成员方法的返回值  

- 方法可以有返回值类型声明，也可以没有，没有时使用void声明
- 方法返回值类型可以是任意类型
- 有返回值的方法体中必须有且仅有"一个return 值"语句能被执行，执行后方法会立即结束
- 返回值与方法返回值类型可以相同或自动转换为方法返回值类型
- 调用有返回值的方法时，可以接收返回值，也可以不接收

```java
//基本数据类型作为返回值
public int aMethod() {
    //		//直接返回该类型
    //		return 1;

    //		//返回值自动类型转换
    //		byte b = 10;
    //		return b;//byte--->int

    //返回值强制类型转换
    double d = 12.5;
    return (int)d;
}


int a = 1000;
//返回值为引用数据类型
public ReturnTest bMethod() {
    System.out.println("bMethod");
    return new ReturnTest();
}

//一个有返回值的方法中有且仅有一条return语句被执行
public String cMethod(int a) {
    if(a > 0) {
        return "a > 0";
    } else {
        return "a < 0";
    }
}

public static void main(String[] args) {
    ReturnTest rt = new ReturnTest();
    rt.bMethod();//没有接收方法的返回值

    ReturnTest x = rt.bMethod();//接收方法的返回值
    System.out.println(x.a);
}
```

### 2.4 运算符

#### 2.4.1 运算符介绍  

#### 2.4.2 算术运算符  

- ##### 算数运算符

| **算数运算符包括：** |                              |
| -------------------- | ---------------------------- |
| \+                   | 加法运算，字符串连接运算     |
| \-                   | 减法运算                     |
| \*                   | 乘法运算                     |
| /                    | 除法运算                     |
| %                    | 取模运算，两个数字相除取余数 |
| ++ 、 --             | 自增自减运算                 |

+-*/%,都是二元运算符,即符号两边都需要操作数

```java
public void aMethod(int a,int b) {
    // a = 10 b = 3
    int add = a + b;
    int reduce = a - b;
    int multiply = a * b; // * 表示乘法运算
    int divide = a / b; // a对b整除后的到的商 / 表示除法 b不能为0
    int residue = a % b; // a对b整除之后得到的余数
    System.out.println("add = " + add);
    System.out.println("reduce = " + reduce);
    System.out.println("multiply = " + multiply);
    System.out.println("divide = " + divide);
    System.out.println("residue = " + residue);
}

/*
 *   add = 13
 *   reduce = 7
 *   multiply = 30
 *   divide = 3
 *   residue = 1
 */
```

#### 2.4.3 关系运算符 

| 比较运算符包括： |                                                              |
| ---------------- | ------------------------------------------------------------ |
| ==               | 比较符号两边地址是否相等，相等结果是true。                   |
| <                | 比较符号左边的数据是否小于右边的数据，如果小于结果是true。   |
| \>               | 比较符号左边的数据是否大于右边的数据，如果大于结果是true。   |
| <=               | 比较符号左边的数据是否小于或者等于右边的数据，如果小于结果是true。 |
| \>=              | 比较符号左边的数据是否大于或者等于右边的数据，如果小于结果是true。 |
| !=               | 不等于符号 ，如果符号两边的数据不相等，结果是true。          |

> 比较运算符，是两个数据之间进行比较的运算，运算结果都是布尔值 true 或者 false 。

#### 2.4.4 逻辑运算符  

| **逻辑运算符包括：** |                                                              |
| -------------------- | ------------------------------------------------------------ |
| & 与                 | 当两边为逻辑量时,两边都是true，结果是true<br>一边为false,结果是false |
| \| 或                | 1. 两边都是false，结果是false    <br/> 2. 一边是true，结果是true |
| ^ 异或               | 相同为false ,  相异为true                                    |
| && 短路与            | 1. 两边都是true，结果是true  <br> 2. 一边是false，结果是false<br/>短路特点：符号左边是false，右边不再运算 |
| \|\| 短路或          | 1. 两边都是false，结果是false    <br/> 2. 一边是true，结果是true    <br/>短路特点： 符号左边是true，右边不再运算 |
| ！ 取反              | 1. ! true 结果是false         <br/>  2. ! false结果是true    |

> 逻辑运算符，是用来连接两个布尔类型结果的运算符，运算结果都是布尔值 true 或者 false

```java
public static void dMethod() {
    int a = 0, b = 0;
    if((a = 10) < b && (b = 10 ) <= a) {
        System.out.println("&& a = "+ a +" b = " + b);
    }
    System.out.println("&& a = "+ a +" b = " + b);
    System.out.println("++++++++++++++++++");
    int c = 0, d = 0;
    if((c = 10) < d & (d = 10 ) <= c) {
        System.out.println("& c = "+ c +" d = " + d);
    }
    System.out.println("& c = "+ c +" d = " + d);
}
//结论是：“&&”当从左到右有条件为false时，就直接跳出if语句，不再往下判断，所以程序中的b不会被赋值；而“&”是无论从左到右的条件是不是为true，都会执行所有的判断条件，所以程序中的d会被赋值为10。
```

```java
public static void eMethod() {
    int x = 0;
    int y = 0;
    if ((x = 10) > y || (y = 10) < x) {
        System.out.println("|| x=" + x + ",y=" + y);
    }
    System.out.println("---------------------------------");

    int a = 0;
    int b = 0;
    if ((a = 10) > b | (b = 10) < a) {
        System.out.println("| a=" + a + ",b=" + b);
    }
}
//结论是：“||”当有一个条件成立时，就不再往下执行判断条件而直接执行if的内容，所以程序中的y不会被赋值为10；“|”从左到右无论是否有条件成立，都会将所有的判断语句执行。
```

> **总结**：一句话概括——当是两个运算符（&&，||）时，当第一个条件成立（||）或违反（&&），就不再继续判断之后的条件，所以效率高一点；当是一个运算符（&，|）时，无论第一个条件是否成立（|）或违法（&），都会继续执行剩下的判断语句，所以效率低一点。

[更多案例](./案例.md)

#### 2.4.5 赋值运算符  

| **赋值运算符包括：** |        |
| -------------------- | ------ |
| =                    | 等于号 |
| +=                   | 加等于 |
| -=                   | 减等于 |
| *=                   | 乘等于 |
| /=                   | 除等于 |
| %=                   | 取模等 |

> 赋值运算符，就是将符号右边的值，赋给左边的变量。

#### 2.4.6 三目运算符  

**格式**

> 数据类型 变量名 = 布尔类型表达式？结果1：结果2

**三元运算符计算方式：** 

> 布尔类型表达式结果是true，三元运算符整体结果为结果1，赋值给变量。 
>
> 布尔类型表达式结果是false，三元运算符整体结果为结果2，赋值给变量。 

```java
public static void main(String[] args) {
    int i = (1==2 ? 100 : 200);
    System.out.println(i);//200
    int j = (3<=4 ? 500 : 600);
    System.out.println(j);//500
}
```

#### 2.4.7 字符串连接符

> +: 字符串连接符 
>
> 只要加号两边任意一边出现了字符串,那么加号就被当成字符串连接符

##### 表达式

> 表达式是运算符和操作数的结合
>
> 允许程序员进行数学运算、值的比较、逻辑操作以及在Java中进行对象的操作。

一些表达式的例子：

```
x
x+10
y = x+10
arr[10]
mobile.getWeight()
```

#### 2.4.8 运算符的优先级

> 优先级口诀:  非 算 关 与或 赋

## 3 数组使用、分支语句、循环语句

### 3.1 数组

#### 3.1.1 数组介绍

> 数组就是存储数据长度固定的容器，保证多个数据的数据类型要一致。

- 数组是用来存储一组相同数据类型数据的数据结构
- 数组的元素可以是简单类型的数据，也可以是引用类型的数据
- 无论数组内容是简单类型还是引用类型，数组自己本身都是一种引用类型
- 每个数组元素都有下标 ，下标从0开始

#### 3.1.2 数组的创建

##### 一维数组

声明:

> 数据类型[] 数组名字;
>
> 数据类型 数组名字[];
>
> 注意: 
>
> ​	在数组定义中,不能指定数组的长度,而需要在数组的创建阶段来指定
>
> int[] a;
>
> float[] b;
>
> String[] c;
>
> Date[] d;

创建:

```java
// 申明一个数组
int[] arr;
// 创建一个数组
arr = new int[2];
arr[0] = 99;
arr[1] = 100;

int[] a = new int[4];
String[] b = new String[3];
double[] c = new double[5];
=========================================================
int[] d = new int[4];
int[] e = d;//将e指向d的空间
int[] f = new int[5];
f = d; // 更改了f的指向 将f指向d的空间
```

##### 一维数组作为参数和返回值

1. 作为参数

```java
// 数组作为参数
public void m1(int[] a) {
    System.out.println("数组的长度:" + a.length);
}
==================================================
// 创建一个数组,传递这个数组的引用
int[] a = { 1, 2, 3, 4 };
ad.m1(a);
// 直接创建数组传值
ad.m1(new int[] {1,55,0,20,30,54,88});
// 传递一个null值,但是数组不可用
ad.m1(null);

```

2. 作为返回值

```java
public String[] m2() {
    String[] s= {"1","2","3"};
    return s;
}
public String[] m3() {
    return new String[] {"1","2"};
}
=================================
String [] s=ad.m2();
System.out.println(s.length);
```

#### 3.1.3 数组的遍历

##### 一维数组的遍历

1. 一维数组的长度使用length属性
2. 一维数组的遍历
   1. for
   2. foreach

#### 3.1.4 数组的排序

##### 一维数组的排序

使用Arrays.sort()对数组排序 

适用于数值型数组 byte, char ,short, int , long, float, double

适实用于String型数组(原因是String实现了Comparable接口, 该技术在后面章节)

#### 3.1.5 Java可变参数

> 类型...参数名
>
> 可变参数在方法中被当做数组来处理
>
> 可变参数传值方式有四种:
>
> 1. 一个值也不传
> 2. null
> 3. 数组
> 4. 一个或多个值

方法重载

```java
public void show(int a) {
    System.out.println("带有一个int型参数的方法");
}

public void show(int ...a) {
    System.out.println("带有可变参数的方法");
}

public static void main(String[] args) {
    Test test = new Test();
    test.show(1);//带有一个int型参数的方法
    test.show();//带有可变参数的方法
    test.show(new int[] {1,2,3});//带有可变参数的方法
    test.show(1,2,3,5,8,5);//带有可变参数的方法
}
```

#### 3.1.6 数组拷贝

浅拷贝

> 在堆内存中不会新分配出空间，而是新增一个引用变量和之前的引用指向相同的堆空间。

举例:

```java
int[] a = {1,2,3,4,5,6,7,8,9,10};
int[] b = a;
```

![1560329023231](F:/02work-for-hqyj/12--java/%E5%A4%87%E8%AF%BE/images/%E6%B5%85%E6%8B%B7%E8%B4%9D.png)

深拷贝

> 在堆内存中分配新空间，将之前的数组堆内存中的内容拷贝到新空间中。

举例: 

```java
int[] a = {1,2,3,4,5,6,7,8,9,10};
int[] b = new int[10];
System.arraycopy(a, 0, b, 0, 10);
```

![1560330738523](F:/02work-for-hqyj/12--java/%E5%A4%87%E8%AF%BE/images/%E6%B7%B1%E6%8B%B7%E8%B4%9D.png)

### 3.2 控制语句

#### 3.2.1 控制语句介绍

> ​			在一个程序执行的过程中，各条语句的执行顺序对程序的结果是有直接影响的。也就是说，程序的流程对运行结果有直接的影响。所以，我们必须清楚每条语句的执行流程。而且，很多时候我们要通过控制语句的执行顺序来实现我们要完成的功能。

- Java程序的执行遵循一定的流程，流程是程序执行的顺序。
- 流程控制语句控制程序中各语句的执行顺序。
- 流程控制的三种基本结构：
  - 顺序结构
  - 选择结构
  - 循环结构

**顺序执行**

```java
public static void main(String[] args){
    //顺序执行，根据编写的顺序，从上到下运行
    System.out.println(1);
    System.out.println(2); 
    System.out.println(3);
}
```

#### 3.2.2 if语句

**if语句第一种格式： if**

```java
if(关系表达式){
	语句体;
}
```

- **执行流程** 
  - 首先判断关系表达式看其结果是true还是false 
  - 如果是true就执行语句体 
  - 如果是false就不执行语句体 

![if流程图](F:/02work-for-hqyj/12--java/%E5%A4%87%E8%AF%BE/images/if%E6%B5%81%E7%A8%8B%E5%9B%BE.png)

```java
public static void main(String[] args) {
    System.out.println("开始");
    // 定义两个变量
    int a = 10, b = 20;
    // 变量使用if来判断
    if(a == b) {
        System.out.println("a等于b");
    }
    int c = 10;
    if(a == c) {
        System.out.println("a等于c");
    }
    System.out.println("结束");
}
```

**if语句第二种格式：** if...else

```java
if(关系表达式) {
	语句体1;
}else {
	语句体2;	
}
```

- 执行流程 
  - 首先判断关系表达式看其结果是true还是false 
  - 如果是true就执行语句体1 
  - 如果是false就执行语句体2 

![ifelse流程图](F:/02work-for-hqyj/12--java/%E5%A4%87%E8%AF%BE/images/ifelse%E6%B5%81%E7%A8%8B%E5%9B%BE.png)

```java
public static void main(String[] args){
    // 判断给定的数据是奇数还是偶数
    // 定义变量
    int a = 1;
    if(a % 2 == 0) {
    	System.out.println("a是偶数");
    } else{
    	System.out.println("a是奇数");
    }
    System.out.println("结束");
}
```

**if语句第三种格式：** if...else if ...else

```java
if (判断条件1) {
	执行语句1;
} else if (判断条件2) {
	执行语句2;
}
...
}else if (判断条件n) {
	执行语句n;
} else {
	执行语句n+1;
}
```

- **执行流程** 
  - 首先判断关系表达式1看其结果是true还是false 
  - 如果是true就执行语句体1 
  - 如果是false就继续判断关系表达式2看其结果是true还是false 
  - 如果是true就执行语句体2 
  - 如果是false就继续判断关系表达式…看其结果是true还是false 
  - … 
  - 如果没有任何关系表达式为true，就执行语句体n+1。

![ifelseif](F:/02work-for-hqyj/12--java/%E5%A4%87%E8%AF%BE/images/ifelseif.png)

```java
public static void main(String[] args) {
    // x和y的关系满足如下：
    // x>=3 y = 2x + 1;
    //‐1<=x<3 y = 2x;
    // x<=‐1 y = 2x – 1;
    // 根据给定的x的值，计算出y的值并输出。
    // 定义变量
    int x = 5;
    int y;
    if (x>= 3) {
    	y = 2 * x + 1;
    } else if (x >= ‐1 && x < 3) {
    	y = 2 * x;
    } else {
    	y = 2 * x ‐ 1;
    }
    System.out.println("y的值是："+y);
}
```

练习

> 指定考试成绩，判断学生等级 
>
> ​	90-100             优秀 
>
> ​	80-89               好 
>
> ​	70-79               良 
>
> ​	60-69               及格 
>
> ​	60以下            不及格

```java
public static void main(String[] args) {
    int score = 100;
    if(score<0 || score>100){
    	System.out.println("你的成绩是错误的");
    }else if(score>=90 && score<=100){
    	System.out.println("你的成绩属于优秀");
    }else if(score>=80 && score<90){
    	System.out.println("你的成绩属于好");
    }else if(score>=70 && score<80){
    	System.out.println("你的成绩属于良");
    }else if(score>=60 && score<70){
    	System.out.println("你的成绩属于及格");
    }else {
    	System.out.println("你的成绩属于不及格");
    }
}
```

**if语句和三元运算符的互换**

> 在某些简单的应用中，if语句是可以和三元运算符互换使用的。

```java
public static void main(String[] args) {
    int a = 10;
    int b = 20;
    //定义变量，保存a和b的较大值
    int c;
    if(a > b) {
    	c = a;
    } else {
        c = b;
    }
    //可以上述功能改写为三元运算符形式
    c = a > b ? a:b;
}
```

#### 3.2.3 switch语句

**switch语句格式：**

```java
switch(表达式) {
    case 常量值1:
    	语句体1;
    break;
    case 常量值2:
    	语句体2;
    break;
    ...
    default:
    	语句体n+1;
    break;
}
```

- **执行流程** 
  - 首先计算出表达式的值 
  - 其次，和case依次比较，一旦有对应的值，就会执行相应的语句，在执行的过程中，遇到break就会结束。 
  - 最后，如果所有的case都和表达式的值不匹配，就会执行default语句体部分，然后程序结束掉。 

![switch](F:/02work-for-hqyj/12--java/%E5%A4%87%E8%AF%BE/images/switch.png)

```java
public static void main(String[] args) {
    //定义变量，判断是星期几
    int weekday = 6;
    //switch语句实现选择
    switch(weekday) {
        case 1:
        	System.out.println("星期一");
        break;
        case 2:
        	System.out.println("星期二");
        break;
        case 3:
        	System.out.println("星期三");
        break;
        case 4:
        	System.out.println("星期四");
        break;
        case 5:
        	System.out.println("星期五");
        break;
        case 6:
        	System.out.println("星期六");
        break;
        case 7:
        	System.out.println("星期日");
        break;
        default:
        	System.out.println("你输入的数字有误");
        break;
    }
}
```

#### 3.2.4 break在分支语句中的作用

switch语句中，表达式的数据类型，可以是byte，short，int，char，JDK7后可以接收字符串。

在switch语句中，如果case的后面不写break，将出现穿透现象，也就是不会在判断下一个case的值，直接向后运行，直到遇到break，或者整体switch结束。 

```java
public static void main(String[] args) {
    int i = 5;
    switch (i){
        case 0:
        	System.out.println("执行case0");
        break;
        case 5:
        	System.out.println("执行case5");
        case 10:
        	System.out.println("执行case10");
        default:
        	System.out.println("执行default");
    }
}
```

上述程序中，执行case5后，由于没有break语句，程序会一直向后走，不会在判断case，也不会理会break，直接运行完整体switch。 

由于case存在穿透性，因此初学者在编写switch语句时，必须要写上break。 

### 3.3 循环语句

#### 3.3.1 循环语句介绍

#### 3.3.2 for循环

> for循环可以用来重复执行某条语句，直到某个条件得到满足。

> for语句格式:
>       for (表达式 1 ; 表达式 2 ; 表达式 3) {
>           语句序列
>       }
>       表达式 1：初始化表达式，负责完成变量的初始化。
>       表达式 2：循环条件表达式，值为boolean型的表达式，指定循环条件。
>       表达式 3：循环后操作表达式，负责修整变量，改变循环条件。

死循环

```java
for(;;){
    System.out.println("这是一个死循环!!")
}
```

![for循环流程图](F:/02work-for-hqyj/12--java/%E5%A4%87%E8%AF%BE/images/for%E5%BE%AA%E7%8E%AF%E6%B5%81%E7%A8%8B%E5%9B%BE.png)

#### foreach

foreach语句是for语句的特殊简化版本，不能完全取代for语句，但任何foreach语句都可以改写为for语句版本。

foreach语句格式：

```java
for(元素类型    元素变量 x ：遍历对象 obj) {
    引用了x的Java语句
}
```

foreach语句中的元素变量x，不必对其进行初始化。

#### 3.3.3 while循环

> while语句也称条件判断语句，它的循环方式为利用一个条件来控制是否要继续反复执行这个语句。

while语句格式:

```java
init_statement
while ( boolean  _expr ){
    statement or block;
    alter_expr;
}
```

> do...while与while语句类似，但区别在于while语句是先判断条件是否成立再执行循环体，而do...while则是先执行一次循环体后，再来判断条件是否成立。

do…while语句格式：

```java
[init_expr]
do{
    body_statement;
    [alter_expr;]
}while(test_expr);
```

```java
public void aMethod() {
//		while(true) {
//			System.out.println("死循环");
//		}
    while(1 > 0) {//true
        System.out.println("死循环");
    }
}

//使用while循环实现2~200之间所有偶数的和
public void bMethod() {
    int sum = 0;
    int i = 2;
    //		while(i <= 200) {
    //			sum += i;
    //			i += 2;
    //		}

    while(true) {
        if(i > 200) {
            break;//结束循环
        }
        sum += i;
        i += 2;
    }
    System.out.println("sum = " + sum);
}

public void cMethod() {
    int i = 0;
    while(true) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("i = " + i++);
    }
}

//如果条件不满足，至少执行了一次循环体
public void dMethod() {
    do{
        System.out.println("执行了do");
    }while(false);
}

public static void main(String[] args) {
    WhileDemo wd = new WhileDemo();
    wd.dMethod();
}
```

#### 3.3.4 break

> 使用break语句可以终止switch语句或者循环语句的执行
> break语句和标签（label）的结合可以用来指定从多个嵌套循环的某个循环中跳出。

```java
public void aMethod() {
    for (int i = 0; i < 100; i++) {
        if(i == 10) {
            break; // 如果条件满足,则结束循环
        }
        System.out.println(i);
    }
}

private void bMethod() {
    int i = 0;
    while(true) {
        System.out.println(i++);
        if(i > 10) {
            break; // 条件满足是结束while循环
        }
    }
}

private void cMethod() {
    int sum  = 0;
    out: // 标签
    for (int i = 0; i < 10; i++) {
        for (int j = 0; j < 5; j++) {
            if(i % 2 == 0) {
                break out; // 根据标签结束for循环
            }
            sum = i * j;
            System.out.print(i + "*" + j + "= " + sum + "\t");
        }
        System.out.println();
    }
}
```

#### 3.3.5 continue

> continue语句用来略过循环中剩下的语句，重新开始新的循环，这和break语句的完全跳出循环是不一样的。
>
> continue 仅仅出现在while/do…while/for语句的子语句块中。
>
> 也可以使用和标签结合的方式来选择需要终止的嵌套循环的层级。

```java
//continue在for循环中的使用
public void aMethod() {
    for (int i = 0; i < 11; i++) {
        if(i%3 == 0) {
            continue;//只要是3的倍数，那么则结束这一次的循环，重新开始下一次新的循环
        }
        System.out.println(i);
    }
}

//continue在while循环中的使用
public void bMethod() {
    int i = 0;
    while(i < 20) {
        i++;
        if(i%2 == 1) {
            continue;//只要是奇数，那么略过后面的语句，重新开始下一次循环
        }
        System.out.println(i);
    }
}

//continue与标签的使用
public void cMethod() {
    int sum = 0;
    out://标签
    for (int i = 1; i < 10; i++) {
        for (int j = 1; j < 5; j++) {
            if(i == 2) {
                continue out;//根据标签结束当次for循环，开始下一次新的循环
            }
            sum = i + j;
            System.out.print(i + " + " + j + " = "  + sum + "\t");
        }
        System.out.println();
    }
}
```

#### 3.3.6 return语句

> 返回值  用于返回数据类型(对象),变量