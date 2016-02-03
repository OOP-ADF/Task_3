// Rana Renes Rengga-1301144351 (IF-38-01)

public class Application
{
	private String appName;
	private int appSize;

	public void setAppName(String appName)
	{
		this.appName = appName;
	}
	public void setAppSize(int appSize)
	{
		this.appSize = appSize;
	}

	public Application(String _name, int _size)
	{
		setAppName(_name);
		setAppSize(_size);
	}

	public String getAppName()
	{
		return this.appName;
	}
	public int getAppSize()
	{
		return this.appSize;
	}

	public String toString()
	{
		return ("Application name: " + appName + ", with size: " + appSize);
	}
}
