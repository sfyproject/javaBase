package com.sunfy.singleton;
/*
 * 单例模式Singleton
 * 应用场合：有些对象只需要一个就足够了，如古代皇帝、老婆
 * 作用：保证整个应用程序中某个实例有且只有一个
 * 类型：饿汉模式、懒汉模式
 *
 * static 静态的成员，是类所有，这样的对象会在类加载时就会创建类的唯一一个实例（饿汉模式）
 */
public class Singleton {
	//1.将构造方法私有化，不允许外部直接创建对象
	private Singleton(){		
	}
	
	//2.创建类的唯一实例，使用private(控制访问，安全考虑) static修饰
	private static Singleton instance=new Singleton();
	
	//3.提供一个用于获取实例的方法，使用public static（改为类所有，可以直接点）修饰
	public static Singleton getInstance(){
		return instance;
	}
}
