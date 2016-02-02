//DHIVA AZHARA (1301144101) IF-38-01

public class Application {
    private String appName;
    private int appSize;
    
    public Application(String Name, int Size) {
        this.appName = Name;
        this.appSize = Size;
    }
    
    public String getAppName() {
        return appName;
    }
    
    public int getAppSize() {
        return appSize;
    }
    
    public String toString() {
        return "Application Name: "+getAppName()+", with size: "+getAppSize()+"MB";
    }
}
