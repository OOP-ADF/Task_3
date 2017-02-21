package task3exercise1;

public class Application {

    // 1. Declare your private attributes here:
    // NIM : 1301154567, 
    // NAMA : Nindia Cahyaning Putri, 
    String appName;         //nama aplikasi
    int appSize;            //ukurannya
    
    
    // 2. Declare Constructor here:
    // NIM : 1301154567, 
    // NAMA : Nindia Cahyaning Putri, 
    // Constructor initialize application name and size (MB)
    //constructor
    
    public Application(String name, int size)
    {
        this.appName = name;
        this.appSize = size; 
    
    }
  
    // 3. Declare your Setter and Getter method here:
    // NIM : 1301154567, 
    // NAMA : Nindia Cahyaning Putri,  
    
    //setter & getter
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
    
    
    // 4. Create method toString() : String here:
    // NIM : 1301154567, 
    // NAMA : Nindia Cahyaning Putri,  
    
    public String toString() {
    
        String name = "Application name: " +getAppName()+ "with size: " + getAppSize() ;
    
    // returns String that contains application name and application size 
     // example : "Application name: App1, with size: 3MB"
  
        return null;
    
  
    }

}
