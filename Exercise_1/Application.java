/* [IF-38-09] _ Andi Akhmad Fauzi _ 1301144009 */
public class Application{
	private String appName;
	private int appSize;
	
	public void Application(String appName, int appSize){
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
