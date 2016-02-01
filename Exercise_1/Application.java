//IF-38-09_Adzan Nugraha_1301140249

public class Application
{
	private String appName;
	private int appSize;
	
	public void Application(String appName, int appSize)
	{
		this.appName = appName;
		this.appSize = appSize;
	}
	
	public String getAppName()
	{
		return appName;
	}
	
	public int getAppSize()
	{
		return appSize;
	}
	
	public String toString()
	{
		return("Application Name : "+appName+", with size : "+appSize);
	}
}
