/*
Nama		: Zardarian Ahadika N.
NIM			: 1301140112
Kelas		: IF-38-02
*/

public class Application {
	private String appName;
	private int appSize;
	
	public Application (String appName, int appSize){
		this.appName = appName;
		this.appSize = appSize;
	}
	
	public String getName(){
		return appName;
	}
	public int getSize(){
		return appSize;
	}
	
	public String toString (){
		return ("Application name "+appName+", with size "+appSize);
	}
}
