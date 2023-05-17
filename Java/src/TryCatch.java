
public class TryCatch {

	public static void main(String[] args) {
		
		try {
			boolean isSuccess =login("g82","1111112");
			if(isSuccess) System.out.println("Login success");
			else System.out.println("Login Failed");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("copyright g82 2015");
		}
	}
	
	static boolean login(String id, String pw)throws Exception{
		
		//Client -> id와 pw가 전송을 시도 ->Server
		
		boolean isNetworkFailed =false;
		boolean isNoId = false;
		boolean isPasswordWrong =false;
		boolean isPWExpired = false;
		
		if(isNetworkFailed)throw new Exception("Network Failed");
		else if(isNoId) throw new Exception ("user ID no exist");
		else if(isPasswordWrong) throw new Exception("Password Wrong");
		else if(isPWExpired) throw new Exception("Need change password");
		
		return true;
		
	}

}
