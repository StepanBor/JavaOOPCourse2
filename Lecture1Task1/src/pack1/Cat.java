package pack1;

public class Cat {

	private int age;
	private int weight;
	private String name;
	private String breed;
	private String sex;
	private String food;

	public Cat(int age, int weight, String name, String breed, String sex, String food) {
		super();
		this.age = age;
		this.weight = weight;
		this.name = name;
		this.breed = breed;
		this.sex = sex;
		this.food = food;
	}

	public Cat() {
		super();

	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getFood() {
		return food;
	}

	public void setFood(String food) {
		this.food = food;
	}

	void voice() {
		System.out.println("May May");
	}

	void play() {

	}

	@Override
	public String toString() {
		return "Cat [age=" + age + ", weight=" + weight + ", name=" + name + ", breed=" + breed + ", sex=" + sex
				+ ", food=" + food + "]";
	}
	
	

}
