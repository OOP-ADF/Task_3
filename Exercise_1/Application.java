// 	Biyan Ilham Akbar, 1301144319, IF-38-09
 public class Application {
 	private String appName;
 	private int kapasitasApp;
 	
 	public Application(String appName, int kapasitasApp) {
 		this.appName = appName;
 		this.kapasitasApp = kapasitasApp;}
 	
 	public String getAppName() {
 		return appName;}
 	
 	public int getAppSize() {
 		return kapasitasApp;}
 	
 	public String toString() {
 		return ("Application name : "+appName+", with size : "+kapasitasApp);}
 }
