package test.fzmy;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 86187
 *用实际实例替换任何存根属性源
 */
public class MyClassPathXmlApplication extends ClassPathXmlApplicationContext {

	/**
	 * 这个构造方法的作用是将传入的资源走的是父类
	 */

	public MyClassPathXmlApplication(String... configLocation){
		super(configLocation);
	}


	@Override
	protected void initPropertySources(){
		System.out.println("自定义扩展initPropertySources方法");
		getEnvironment().setRequiredProperties("abc");

	}
}
