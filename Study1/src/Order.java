
public class Order {

	public String orderNum;
	public String customerID;
	public String orderDate;
	public String customerName;
	public String productNum;
	public String shippingAddress;
	
	public void orderInfo() {
		System.out.println("주문자 번호 : "+orderNum);
		System.out.println("주문자 아이디 :"+customerID);
		System.out.println("주문 날짜"+orderDate);
		System.out.println("주문자 이름"+customerName);
		System.out.println("주문 상품 번호"+productNum);
		System.out.println("배송 주소"+shippingAddress);
		
		
	}
	
	
}
