package test.fzmy.annotation.configration;
/**
 * @author dingfeng
 * 通过注解实现bean注入
 */

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;
import test.fzmy.annotation.dto.Person;

/**
 * @Configuration作用类似applicationContext.xml，再配合其他注解实现bean的注入
 *
 * @ComponentScan(value = "test.fzmy.annotation")会扫描value目录下所有注解
 * includeFilters:只获取某些bean，@Filter表示选择方式，可以正则、注解类型等等，
 * useDefaultFilters:如果是false，则表示只获取@ComponentScan.Filter设置的,true获取excludeFilters之外的bean
 * excludeFilters：和includeFilters相反
 */
@Configuration
@ComponentScan(value = "test.fzmy.annotation",excludeFilters = {
		@ComponentScan.Filter(type = FilterType.ANNOTATION,classes = {Controller.class})
},useDefaultFilters = true)
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
