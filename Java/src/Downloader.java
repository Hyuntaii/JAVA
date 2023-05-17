import java.lang.Thread;
import java.lang.InterruptedException;

public class Downloader {
	
	private OnDownloadListener mListener;
	
	public Downloader(OnDownloadListener listener) {
		mListener = listener;
	}
	
	public void Start() {
		
		System.out.println("Download Start");
		try {
			Thread.sleep(2000);
			
		} catch(java.lang.InterruptedException e) {
			System.out.println(e.getMessage());
		}
		
		mListener.onDownFinish();
		
	}

}
