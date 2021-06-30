package test.fzmy;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import test.fzmy.bean.StudentBean;

public class test {
	public static void main(String[] args) {
		//MyClassPathXmlApplication myClassPathXmlApplication = new MyClassPathXmlApplication("applicationContext.xml");

		ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring-${username}.xml");
		StudentBean student = applicationContext.getBean(StudentBean.class);
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext();
		annotationConfigApplicationContext.getBean("aaa");
		System.out.println(student.toString());
	}
}
