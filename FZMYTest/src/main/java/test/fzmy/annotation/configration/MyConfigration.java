package test.fzmy.annotation.configration;
/**
 * @author dingfeng
 * 通过注解实现bean注入
 */

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import test.fzmy.annotation.dto.Person;

/**
 * @Configuration作用类似applicationContext.xml，再配合其他注解实现bean的注入
 */
@Configuration
public class MyConfigration {
	/**
	 * @Bean是bean注入的一种方式，比较常见的,类型为返回值类型
	 * @return
	 */
	@Bean
	public Person person(){
		return new Person("丁峰1",26,"男");
	}

}
