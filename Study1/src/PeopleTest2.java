import java.util.Scanner;
public class PeopleTest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.�̸��� �Է��ϼ���");
		String name = sc.next();
		System.out.println("2.���̸� �Է��ϼ���");
		int age = sc.nextInt();
		System.out.println("3.��ȥ���θ� �Է��ϼ���(Y/N)");
		String isMarried=sc.next();
		if(isMarried.equals("Y")){
			System.out.println("4.(3���� Y�ϰ�� �ۼ�)�ڳ��� ���� �Է��ϼ���");
		}
		int children = 0;
		children = sc.nextInt();
					
		
		
		
		People people = new People();
		
		people.name=name;
		people.age=age;
		if(isMarried.equalsIgnoreCase("Y")) {
			people.isMarried=true;
			people.children=children;
			
		}
	
		
		people.Peopleinfo();
	}

}