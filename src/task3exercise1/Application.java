package task3exercise1;

public class Application extends AppStore {

    // 1. Declare your private attributes here:
    // NIM : 1301154502, 
    // NAMA : Lailis Sa'adah, 
    //
    //------------------- your code here-----------------------
    
    private String appName;
    private int appSize;
    
    //---------------------------------------------------------
    
    // 2. Declare Constructor here:
    // NIM : 1301154502, 
    // NAMA : Lailis Sa'adah, 
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
    // NIM : 1301154502, 
    // NAMA : Lailis Sa'adah, 
    //
    //------------------- your code here-----------------------
    
    public String getAppName() {
        return appName;
    
    }   
    
    public int getAppSize() {    
        return appSize;
    }
    
    //---------------------------------------------------------
    // 4. Create method toString() : String here:
    // NIM : 1301154502, 
    // NAMA : Lailis Sa'adah, 
    //
    // returns String that contains application name and application size
    // 
    // example : "Application name: App1, with size: 3MB"
    public String toString() {
        //------------------- your code here-----------------------
        System.out.println("Application name: "+appName+" with size: "+appSize); 
        
        return null;
        
        //---------------------------------------------------------
    }

}
