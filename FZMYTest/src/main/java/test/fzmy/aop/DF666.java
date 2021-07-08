package test.fzmy.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * JDK代理操作
 */
public class DF666 implements InvocationHandler {

	private Person person;

	//获取代理对象信息
	public Object getInstance(Person target){
		this.person = target;
		System.out.println("被代理的对象："+target.getClass());
		return Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("代理成功");
		System.out.println("获取的性别是："+this.person.getSex());
		System.out.println("代理操作开始");
		this.person.findRealLove();
		System.out.println("特殊操作");
		return null;
	}
}
