package test.fzmy.annotation;

import org.springframework.context.ApplicationContext;
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
		ApplicationContext context   = new AnnotationConfigApplicationContext(MyConfigration.class);
		/*Person person = (Person) context.getBean("updatePerson");
		System.out.println(person);*/
		//将容器所有beanname获取
		String[] nameForBeans = context.getBeanNamesForType(Person.class);
		for(String beanName:nameForBeans){
			System.out.println("TestBeanInit主函数获取的beanName->"+beanName);
		}

	}
}
