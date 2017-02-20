package task3exercise1;

public class Application {

    // 1. Declare your private attributes here:
    // NIM : 1301154357
    // NAMA : Rinaldy Achmad Fauzy 
    //
    //------------------- your code here-----------------------
    
    private String appName;
    private int appSize;
    
    //---------------------------------------------------------
    
    // 2. Declare Constructor here:
    // NIM : 1301154357
    // NAMA : Rinaldy Achmad Fauzy 
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
    // NIM : 1301154357
    // NAMA : Rinaldy Achmad Fauzy 
    //
    //------------------- your code here-----------------------
    public int getAppSize() {
        return appSize;
    }
    public String getAppName() {
        return appName;
    
    }
    
    //---------------------------------------------------------
    // 4. Create method toString() : String here:
    // NIM : 1301154357
    // NAMA : Rinaldy Achmad Fauzy 
    //
    // returns String that contains application name and application size
    // 
    // example : "Application name: App1, with size: 3MB"
    public String toString() {
        //------------------- your code here-----------------------
        return "Application name: "+getAppName()+", with size: "+getAppSize()+"MB";
        
        //---------------------------------------------------------
    }

}
