public class Application{
	private String appName;
	private int appSize;
	public Application(String name,int size){
		this.appName=name;
		this.appSize=size;
	}
	public String getAppName(){
		return appName;
	}
	public int getAppSize(){
		return appSize;
	}
	public String toString(){
		return("Application name:: "+this.appName+", with size: "+this.appSize+" Mb");
	}
}
