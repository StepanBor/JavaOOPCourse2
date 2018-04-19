package pack1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Human {

	SimpleDateFormat sdf = new SimpleDateFormat("dd:MM:yyyy");

	private int age;
	private String sex;
	private String name;
	private String lastname;
	private Date birthDay;
	private String citizenship;

	public Human(int age, String sex, String name, String lastname, String birthDay, String citizenship) {
		super();
		this.age = age;
		this.sex = sex;
		this.name = name;
		this.lastname = lastname;
		try {
			this.birthDay = sdf.parse(birthDay);
		} catch (ParseException e) {
			System.out.println(e);
		}

		this.citizenship = citizenship;
	}

	public Human() {
		super();

	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Date getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}

	public String getCitizenship() {
		return citizenship;
	}

	public void setCitizenship(String citizenship) {
		this.citizenship = citizenship;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	@Override
	public String toString() {
		return "Human [sdf=" + sdf + ", age=" + age + ", sex=" + sex + ", birthDay=" + sdf.format(birthDay)
				+ ", citizenship=" + citizenship + "]";
	}

}
