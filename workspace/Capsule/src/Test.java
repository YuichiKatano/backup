
public class Test {

	public static void main(String[] args) {
		Person p=new Person();

		p.setName("taro");
		p.setAge(20);

		String name=p.getName();
		int age=p.getAge();

		System.out.println(name);
		System.out.println(age);
	}

}
