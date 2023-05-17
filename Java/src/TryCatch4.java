
public class TryCatch4 {
	public static void main(String[] args) {
		try {
			String str = null;
			str.length();
			int n =100 /0;
			
		}catch(ArithmeticException | NullPointerException | ArrayIndexOutOfBoundsException ex) {
			System.out.println(ex.getClass());
			System.out.println(ex.getMessage());
		}
	}

}
