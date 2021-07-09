import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import test.fzmy.annotation.configration.MyConfigration;
import test.fzmy.annotation.dto.Person;

public class TestSpring {
	@Test
	public void test(){
		ApplicationContext context   = new AnnotationConfigApplicationContext(MyConfigration.class);
		String[] nameForBeans = context.getBeanDefinitionNames();
		for(String beanName:nameForBeans){
			System.out.println("TestSpring-test获取的beanName->"+beanName);
		}
	}

	@Test
	public void test1(){
		AnnotationConfigApplicationContext context   = new AnnotationConfigApplicationContext(MyConfigration.class);
		String[] nameForBeans = context.getBeanDefinitionNames();
		for(String beanName:nameForBeans){
			System.out.println("TestSpring-test1获取的beanName->"+beanName);
		}
		//从容器中去两次实例，确认是否是同一个bean
		Object a = context.getBean("person1");
		Object b = context.getBean("person1");
		System.out.println("a、b是否是同一个实例----->"+a.equals(b));
	}
}
