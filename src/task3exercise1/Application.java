package task3exercise1;

public class Application {

    // 1. Declare your private attributes here:
    // NIM : 1301154096 
    // NAMA : Gangsar Yoga Pamungkas 
    //
    //------------------- your code here-----------------------
    private String appName;
    private int appSize;
    //---------------------------------------------------------
    
    // 2. Declare Constructor here:
    // NIM : 1301154096 
    // NAMA : Gangsar Yoga Pamungkas 
    //
    // Constructor initialize application name and size (MB)
    //
    //------------------- your code here-----------------------
    public Application(String nm, int sz)
    {
        this.appName = nm;
        this.appSize = sz;
    }
    //---------------------------------------------------------
    

    // 3. Declare your Setter and Getter method here:
    // NIM : 1301154096
    // NAMA : Gangasr Yoga Pamungkas 
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
    // NIM : 1301154096
    // NAMA : Gangsar Yoga Pamungkas 
    //
    // returns String that contains application name and application size
    // 
    // example : "Application name: App1, with size: 3MB"
    public String toString() {
        //------------------- your code here-----------------------
        String a;
            a = "Application name: "+appName+" with size : "+appSize;
        return a;
        
        //---------------------------------------------------------
    }

}
