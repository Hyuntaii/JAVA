import java.util.Scanner;
public class PeopleTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.println("1.�̸��� �Է��ϼ���");
		String name = sc.next();
		System.out.println("2.���̸� �Է��ϼ���");
		int age = sc.nextInt();
		System.out.println("3.��ȥ���θ� �Է��ϼ���(Y/N)");
		String isMarried=sc.next();
		System.out.println("4.(3���� Y�ϰ�� �ۼ�)�ڳ��� ���� �Է��ϼ���");
		int children = sc.nextInt();
		
		
		People people = new People();
		
		people.name=name;
		people.age=age;
		if(isMarried.equals("Y")) {
			people.isMarried=true;			
		}else if(isMarried.contentEquals("N")) {
			people.isMarried=false;
		}else {
			System.out.println("�빮�� Y,N���� �Է����ּ���");
		}
		people.children=children;
		
		people.Peopleinfo();
	}

}
