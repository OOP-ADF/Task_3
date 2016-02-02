//FAISHAL ABDILLAH
//1301144232
//IF-38-02

public class AppStore{
	private application[] appList= new application[100];
	private int totalApp=0;
	
	public void createNewApp(String appName,int appSize){
		Application app=new Application(appName,appSize);
		appList[totalApp]=app;
		totalApp++;
	}
	public Application getApp(int id){
		return appList[id];		
	}
	public String toString(){
		return("there are"+totalApp+"applications ready to install");
	}	
}

