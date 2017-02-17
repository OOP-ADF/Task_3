package task3exercise1;

public class Application {

    // 1. Declare your private attributes here:
    // NIM : 1301150040
    // NAMA : M Adli Rachman  
        private String appName;
        private int appSize;
        private int appId;
    
    // 2. Declare Constructor here:
    // NIM : 1301150040 
    // NAMA : .M Adli Rachman  
    //
    // Constructor initialize application name and size (MB)
    //
    //------------------- your code here-----------------------
        public void Application(String appName, int appSize){
            this.appName = appName;
            this.appSize = appSize;
            this.appId = 0;
        }
        
        public Application(String appName, int appSize, int appId){
        this.appName = appName;
        this.appSize = appSize;
        this.appId   = appId;
    }
    //---------------------------------------------------------
    

    // 3. Declare your Setter and Getter method here:
    // NIM : 1301150040
    // NAMA : M Adli Rachman 
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

    public int getAppId() {
        return appId;
    }

    public void setAppId(int appId) {
        this.appId = appId;
    }
    

    //---------------------------------------------------------
    // 4. Create method toString() : String here:
    // NIM : 1301150040
    // NAMA : M Adli Rachman 
    //
    // returns String that contains application name and application size
    // 
    // example : "Application name: App1, with size: 3MB"
    public String toString() {
        //------------------- your code here-----------------------
        System.out.println("Application");
        System.out.println("ID  : "+appId);
        System.out.println("Name : "+appName);
        System.out.println("Size : "+appSize);
        return null;
        
        //---------------------------------------------------------
    }

}
