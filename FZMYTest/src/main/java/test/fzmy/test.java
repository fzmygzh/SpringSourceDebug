package test.fzmy;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import test.fzmy.bean.StudentBean;

public class test {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
		StudentBean student = applicationContext.getBean(StudentBean.class);
		System.out.println(student.toString());
	}
}
