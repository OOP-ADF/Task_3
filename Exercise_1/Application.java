
//Nama : Tari Lestari
//Kelas: IF-38-01
//NIM  : 1301144281

public class Application {
	private String appName;
	private int appSize;

	
	public Application(String appName, int appSize){
		this.appName = appName;
		this.appSize = appSize;
	}
	
	public String getAppName (){
		return appName;
	}
	
	public int getAppSize (){
		return appSize;
	}
	
	public String toString(){
		return ("Application name: "+appName+",with size:"+appSize+"MB");
	}
}




	
	
	
