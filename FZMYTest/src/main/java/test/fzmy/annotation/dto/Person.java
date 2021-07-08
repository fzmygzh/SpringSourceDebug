package test.fzmy.annotation.dto;

import lombok.Data;

@Data
public class Person {
	private String name;
	private Integer age;
	private String sex;

	public Person(String name, int age, String sex) {
		this.name=name;
		this.age=age;
		this.sex=sex;
		//System.out.println("Person实体类获取数据====姓名："+name+"**年龄："+age+"**性别："+sex);
	}
}
