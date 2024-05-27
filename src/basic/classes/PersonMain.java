package basic.classes;

public class PersonMain {

	public static void main(String[] args) {
		
		Name name = new Name("홍", "길동");
		Address address = new Address("인천 미추홀구", "인하로 100");
		
		person person = new person(name, 10, address);
		System.out.println(person);
		
		Name name2 = person.getName();
		String firstName = name2.getFirstName();
		System.out.println(firstName);

	}

}
