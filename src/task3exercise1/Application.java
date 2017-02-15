package task3exercise1;

public class Application {

    // 1. Declare your private attributes here:
    // NIM : .........................., 
    // NAMA : ........................., 
    //
    //------------------- your code here-----------------------
   private String appName;
   private int appSize;
   
    //---------------------------------------------------------
    
    // 2. Declare Constructor here:
    // NIM : .........................., 
    // NAMA : ........................., 
    //
    // Constructor initialize application name and size (MB)
    //
    //------------------- your code here-----------------------
    public Application(String appName, int appSize) {
        this.appName = appName;
        this.appSize = appSize;
    }
    //---------------------------------------------------------
   

    // 3. Declare your Setter and Getter method here:
    // NIM : ..........................,
    // NAMA : ........................., 
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
    // NIM : ..........................,
    // NAMA : ........................., 
    //
    // returns String that contains application name and application size
    // 
    // example : "Application name: App1, with size: 3MB"
    public String toString() {
        //------------------- your code here-----------------------
        return null;
        
        //---------------------------------------------------------
    }

}
