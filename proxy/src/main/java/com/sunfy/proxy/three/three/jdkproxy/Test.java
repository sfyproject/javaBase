package com.sunfy.proxy.three.three.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import com.sunfy.proxy.three.two.proxy.Car;
import com.sunfy.proxy.three.two.proxy.Moveable;

public class Test {

	/**
	 * JDK动态代理测试类
	 */
	public static void main(String[] args) {
		Car car = new Car();
		InvocationHandler h = new TimeHandler(car);
		Class<?> cls = car.getClass();
		/**
		 * loader  类加载器
		 * interfaces  实现接口
		 * h InvocationHandler
		 */
		Moveable m = (Moveable)Proxy.newProxyInstance(cls.getClassLoader(),
												cls.getInterfaces(), h);
		m.move();
	}

}
