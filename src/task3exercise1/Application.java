package task3exercise1;

public class Application {

    // NIM : 1301150432 
    // NAMA : Afra Woro D 
    private String appName;
    private int appSize;
    private int appId;
    
    public Application(String appName, int appSize){
        this.appName = appName;
        this.appSize = appSize;
        this.appId = 0;
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
        return "App ID = "+appId+'\n'+"App Name = "+appName+'\n'+"App Size"+appSize;
    }
}
