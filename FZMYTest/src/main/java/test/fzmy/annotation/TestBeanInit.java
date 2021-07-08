package test.fzmy.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import test.fzmy.annotation.configration.MyConfigration;
import test.fzmy.annotation.dto.Person;

/**
 * @author dingfeng
 * 注解实现bean的各种处理
 */
public class TestBeanInit {
	public static void main(String[] args) {
		//获取xml中的配置bean
		//ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
		//获取注解配置的bean
		AnnotationConfigApplicationContext context   = new AnnotationConfigApplicationContext(MyConfigration.class);
		Person person = (Person) context.getBean("person");
		System.out.println(person);

	}
}
