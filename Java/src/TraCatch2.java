import java.util.Scanner;

public class TraCatch2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		float num1 = sc.nextInt();
		float num2 = sc.nextInt();
		float result = (num1/num2);
		
		
		if (num2 !=0) {
			result = num1/ num2;
		}else {
			System.out.println("0���� ���� �� �����ϴ�.");
		}
		System.out.println("result ="+result);
		System.out.println();
		
		try {
			result = num1/num2;
			System.out.println("result"+ result);
		}catch(ArithmeticException ex) {
			System.out.println("0���� ������ �߻��ϴ� Exception");
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		}
	}

}
