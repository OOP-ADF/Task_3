/* Deta Kurnia Soundra 1301140109 - IF 38 09 */
public class Application{
	private String appName;
	private int appSize;
	
	public  Application(String appName, int appSize){
		this.appName = appName;
		this.appSize = appSize;
	}
	
	public String getappName() {
		return appName;
	}
	
	public int getappSize() {
		return appSize;
	}
	
	public String toString(){
		return ("Application name: "+appName+", Size: "+appSize);
	}
	
}
