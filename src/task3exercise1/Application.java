package task3exercise1;

public class Application {

    // 1. Declare your private attributes here:
    // NIM : 1301154572
    // NAMA : Herica Bunga Maharani
    //
    private String appName;
    private int appSize;
      
    // 2. Declare Constructor here:
    // NIM : 1301154572 
    // NAMA : Herica Bunga Maharani 
    //
    // Constructor initialize application name and size (MB)
    //
    public Application(String appName, int appSize) {
        this.appName = appName;
        this.appSize = appSize;
    }
    
    // 3. Declare your Setter and Getter method here:
    // NIM : 1301154572
    // NAMA : Herica Bunga Maharani
    //

    public String getAppName() {
        return appName;
    }

    public int getAppSize() {
        return appSize;
    }
     
    // 4. Create method toString() : String here:
    // NIM : 1301154572 
    // NAMA : Herica Bunga Maharani
    //
    // returns String that contains application name and application size 
    // 
    // example : "Application name: App1, with size: 3MB"
    public String toString() {
    //------------------- your code here-----------------------
        return ("Application name: "+appName+"with size: "+appSize+" MB");
    
    //---------------------------------------------------------
    }

}
