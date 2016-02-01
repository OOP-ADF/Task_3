//Fitrah Bima Nusantara
//1301140295
//IF 38-09
 
public class Application {
	private String namaApp;
	private int sizeApp;
	
	public Application(String namaApp, int sizeApp) {
		this.namaApp = namaApp;
		this.sizeApp = sizeApp;
	}
	
	public String getnamaApp() {
		return namaApp;
	}
	
	public int getsizeApp() {
		return sizeApp;
	}
	
	public String toString() {
		return ("Application name : "+namaApp+", with size : "+sizeApp+"MB");
	}
}

