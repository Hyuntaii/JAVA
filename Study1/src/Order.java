
public class Order {

	public String orderNum;
	public String customerID;
	public String orderDate;
	public String customerName;
	public String productNum;
	public String shippingAddress;
	
	public void orderInfo() {
		System.out.println("�ֹ��� ��ȣ : "+orderNum);
		System.out.println("�ֹ��� ���̵� :"+customerID);
		System.out.println("�ֹ� ��¥"+orderDate);
		System.out.println("�ֹ��� �̸�"+customerName);
		System.out.println("�ֹ� ��ǰ ��ȣ"+productNum);
		System.out.println("��� �ּ�"+shippingAddress);
		
		
	}
	
	
}
