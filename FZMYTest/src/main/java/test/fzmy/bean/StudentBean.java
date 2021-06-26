package test.fzmy.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class StudentBean {
	private String name = "rosh";
	private String school = "杜桥中学";
	private String hobby = "篮球";
}
