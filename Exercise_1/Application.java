//FAISHAL ABDILLAH
//1301144232
//IF-38-02

public class Application{
	private String appName;
	private int appSize;
	
	public Application(String appName,int appSize){
		this.appName=appName;
		this.appSize=appsize;
	}
	public int getAppSize(){
		return appSize;
	}	
	public String getAppName(){
		return appName;		
	}
	public String toString(){
		return("application name:"+appname+" with size:"+appSize+" MB");
	}
}

