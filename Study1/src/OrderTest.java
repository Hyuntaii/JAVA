import java.util.Scanner;
public class OrderTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�ֹ���ȣ�� �Է��ϼ��� :");
		String orderNum= sc.nextLine();
		System.out.println("�ֹ����� ���̵� �Է��ϼ��� :");
		String customerID =sc.nextLine();
		System.out.println("�ֹ���¥ :");
		String orderDate = sc.nextLine();
		System.out.println("�ֹ��� ���� : ");
		String customerName =sc.nextLine();
		System.out.println("��ǰ��ȣ :");
		String productNum =sc.nextLine();
		System.out.println("�ּ� :");
		String shippingAddress =sc.nextLine();
		sc.close();
		
		Order order = new Order();
		
		order.orderNum= orderNum ;
		order.customerID=customerID;
		order.orderDate=orderDate;
		order.customerName=customerName;
		order.productNum=productNum;
		order.shippingAddress=shippingAddress;
		
		order.orderInfo();
		
		
		
		
		
	}

}
