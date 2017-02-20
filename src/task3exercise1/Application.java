package task3exercise1;

public class Application {

    // 1. Declare your private attributes here:
    // NIM : 1301150063
    // NAMA : Alfian Rahman Aziz
    //
    //------------------- your code here-----------------------
    private String appName;
    private int appSize;
    //---------------------------------------------------------
    
    // 2. Declare Constructor here:
    // NIM : 1301150063
    // NAMA : Alfian Rahman Aziz
    //
    // Constructor initialize application name and size (MB)
    //
    //------------------- your code here-----------------------
    public Application(String appName, int appSize){
        this.appName = appName;
        this.appSize = appSize;
    }
    
    //---------------------------------------------------------
    
    // 3. Declare your Setter and Getter method here:
    // NIM : 1301150063 
    // NAMA : Alfian Rahman Aziz
    //
    //------------------- your code here-----------------------
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
    //---------------------------------------------------------
    
    
    // 4. Create method toString() : String here:
    // NIM : 1301150063 
    // NAMA : Alfian Rahman Aziz 
    //
    // returns String that contains application name and application size 
    // 
    // example : "Application name: App1, with size: 3MB"
    
    //------------------- your code here-----------------------
    public String toString() {
        String x = "Application Name: " + appName + ", " + "With Size: "+ appSize; 
        return x ;
    }
    //---------------------------------------------------------

}
