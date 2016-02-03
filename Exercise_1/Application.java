/*
Nama:	Aryaditya Hendri Pratama
Kelas:	IF3802
NIM:	1301144162
*/

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
		return ("Aplication name : "+appName+", Size : "+appSize);
 	}
 	
 }
