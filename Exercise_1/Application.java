/*
Hani Dika Riani
1301144012
IF-38-02
*/

public class Application {
    private String appName;
    private int appSize;
    
    public Application(String appName, int appSize){
        this.appName = appName;
        this.appSize = appSize;
    }
    public void setappName(String appName){
        this.appName=appName;
    }
    public String getappName(){
        return appName;
    }
    public void setappSize(int appSize){
        this.appSize=appSize;
    }
    public int getappSize(){
        return appSize;
    }
    public String toString(){
        return "Application name: "+appName+", with size: "+appSize+"MB";
    }
}
