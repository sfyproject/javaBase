package com.sunfy.proxy.three.one.proxy;

public class Client {

	/**
	 * 测试类
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		Moveable m = (Moveable)Proxy.newProxyInstance(Moveable.class);
		m.move();
	}

}
