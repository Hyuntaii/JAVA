
public class Browser implements OnDownloadListener{
	
	
	public void imgclick() {
		Downloader loader = new Downloader(this);
		loader.Start();
	}
	@Override
	public void onDownFinish() {
		System.out.println("Browser : onDownFinish()");
	}
	@Override
	public void onDownFailed() {
		System.out.println("browser : Download Failed");
		
	}
	
}
