package test.fzmy.annotation.configration;
/**
 * @author dingfeng
 * 通过注解实现bean注入
 */

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import test.fzmy.annotation.dto.Person;

/**
 * @Configuration作用类似applicationContext.xml，再配合其他注解实现bean的注入
 *
 * @ComponentScan(value = "test.fzmy.annotation")会扫描value目录下所有注解
 */
@Configuration
@ComponentScan(value = "test.fzmy.annotation")
public class MyConfigration {
	/**
	 * @Bean是bean注入的一种方式，比较常见的,类型为返回值类型,也可以通过@Bean("updatePerson")改名，如果默认则是person
	 * @return
	 */
	@Bean
	public Person person1(){
		return new Person("丁峰1",26,"男");
	}

	@Bean
	public Person person2(){
		return new Person("丁峰2",27,"男");
	}

}
