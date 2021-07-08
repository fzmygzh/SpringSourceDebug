package test.fzmy.aop;

import test.fzmy.aop.Impl.FzmyImpl;

//JDK代理简单实现
public class Test {
	public static void main(String[] args) {
		//代理测试
		//new FzmyImpl().findRealLove();
		/**
		 * jdk生成代理对象原理
		 * 1、获取被代理对象的引用，然后获取它的接口
		 * 2、JDK重新生成一个类，同时实现我们给的代理对象所实现的接口
		 * 3、把被代理对象的引用也拿到
		 * 4、通过invoke方法，动态生成一个class字节码，再编译
		 */
		Person o = (Person) new DF666().getInstance(new FzmyImpl());
		System.out.println("代理后的对象："+o.getClass());
		o.findRealLove();

	}
}
