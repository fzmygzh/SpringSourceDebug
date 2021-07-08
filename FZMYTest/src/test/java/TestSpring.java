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
}
