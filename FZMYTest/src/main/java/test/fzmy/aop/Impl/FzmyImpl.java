package test.fzmy.aop.Impl;

import test.fzmy.aop.Person;

public class FzmyImpl implements Person {
	private String sex="男";
	private Integer age=25;
	private String name = "非中没音";
	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@Override
	public void findRealLove() {
		System.out.println("测试1");
		System.out.println("测试2");
		System.out.println("测试3");
		System.out.println("测试4");
	}
}
