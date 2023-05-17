
public class TryCatch3 {

	public static void main(String[] args) {
		int num1 = 100, num2 =2, result =0;
		String str ="Java";
		int[] numbers = new int[10];
				
		try {
			result = num1/num2;
			System.out.println("result = "+result);
			
			int length = str.length();
			System.out.println("length ="+length);
		
			numbers[10]=11111;
			System.out.println("numbers = "+numbers[10]);
		}catch (ArithmeticException ex) {
			System.out.println("산술 연산 예외 :"+ex.getMessage());
		}catch(NullPointerException ex) {
			System.out.println("NPE :" +ex.getMessage());
		}catch (Exception ex){
			System.out.println("Exception :"+ex.getMessage());
		}

	}

}
