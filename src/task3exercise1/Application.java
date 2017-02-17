package task3exercise1;

    // Nama : Muhammad Marchell
    // NIM  : 1301154278 

public class Application {
    private String appName;
    private int appSize;
    private int appId;
    
    public Application(String appName, int appSize){
        this.appName = appName;
        this.appSize = appSize;
        this.appId   = 0;
    }
    
    public Application(String appName, int appSize, int appId){
        this.appName = appName;
        this.appSize = appSize;
        this.appId   = appId;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public int getAppSize() {
        return appSize;
    }

    public void setAppSize(int appSize) {
        this.appSize = appSize;
    }
    
    public int getAppId() {
        return appId;
    }

    public void setAppId(int appId) {
        this.appId = appId;
    }
    
    public String toString(){
        return "App ID = " + appId + '\n'+ "App Name = " + appName + '\n' + "App Size = " + appSize + '\n';
    }
    
    
       
}
