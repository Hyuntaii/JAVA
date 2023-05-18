import java.util.Scanner;
public class OrderTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("주문번호를 입력하세요 :");
		String orderNum= sc.nextLine();
		System.out.println("주문자의 아이디를 입력하세요 :");
		String customerID =sc.nextLine();
		System.out.println("주문날짜 :");
		String orderDate = sc.nextLine();
		System.out.println("주문자 성명 : ");
		String customerName =sc.nextLine();
		System.out.println("상품번호 :");
		String productNum =sc.nextLine();
		System.out.println("주소 :");
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
