package basic.classes;

public class person {
	private Name name;	// 홍 길동
	private int age;		// 10살
	private Address addr;	// 인천 미추홀구 인하로 100
	
	public person(Name name, int age, Address addr) {
		super();
		this.name = name;
		this.age = age;
		this.addr = addr;
	}

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
	}

	@Override
	public String toString() {
		return "person [name=" + name + ", age=" + age + ", addr=" + addr + "]";
	}
	
}
