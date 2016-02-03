//atika w -1301144211
public class Application{
	private String appName;
	private int appSize;
	
	public Application( String appName,int appSize){
		this.appName=appName;
		this.appSize=appSize;
	}
	
	public String getAppName(){
		return appName;
	}
	
	public int getAppSize(){
		return appSize;
	}
	
	public String toString(){
		return ("Application name: "+this.appName+" with size: "+this.appSize+" MB");
	}
	
}
