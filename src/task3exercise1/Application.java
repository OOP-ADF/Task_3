package task3exercise1;

public class Application {

    // 1. Declare your private attributes here:
    // NIM : 1301154511 
    // NAMA : NABILA KUSUMA PUTRI 
    //
    private String appName;
    private int appSize;
    
    
    //---------------------------------------------------------
    
    // 2. Declare Constructor here:
    // NIM : 1301154511 
    // NAMA : NABILA KUSUMA PUTRI 
    //
    // Constructor initialize application name and size (MB)
    //
    //public Application(){}
    //public Application(String a) {
    //   this.appName=a;
    //}
   public Application(String a, int b) {
       this.appName=a;
       this.appSize=b;
   }
    
    // 3. Declare your Setter and Getter method here:
    // NIM : 1301154511 
    // NAMA : NABILA KUSUMA PUTRI 
    

    public void addAppName (String a) {
        this.appName=a;
    }
    
    public void addAppSize (int b) {
        this.appSize=b;
    }
   
    public String getAppName() {
        return appName;
    }

    public int getAppSize() {
        return appSize;
    }
    
   
    
    // 4. Create method toString() : String here:
    // NIM : 1301154511 
    // NAMA : NABILA KUSUMA PUTRI 
    //
    // returns String that contains application name and application size 
    // 
    // example : "Application name: App1, with size: 3MB"
    public String toString() {
    //------------------- your code here-----------------------
        String a = "Application name: "+appName+", with size: "+appSize;
        return a;
    }
    //---------------------------------------------------------
}