import java.util.Scanner;
public class PeopleTest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.이름을 입력하세요");
		String name = sc.next();
		System.out.println("2.나이를 입력하세요");
		int age = sc.nextInt();
		System.out.println("3.결혼여부를 입력하세요(Y/N)");
		String isMarried=sc.next();
		if(isMarried.equals("Y")){
			System.out.println("4.(3번이 Y일경우 작성)자녀의 수를 입력하세요");
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