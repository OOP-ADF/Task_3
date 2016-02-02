//Sulistiyo TR 1301144329 IF-38-09

public class Application
{
	private String appNama;
	private int appUkuran;
	
	public void Application(String appName, int appSize)
	{
		this.appNama = appNama;
		this.appUkuran = appUkuran;
	}
	
	public String getAppNama()
	{
		return appNama;
	}
	
	public int getAppUkuran()
	{
		return appUkuran;
	}
	
	public String toString()
	{
		return("Application Name : "+appNama+", with size : "+appUkuran);
	}
}
