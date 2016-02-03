public class Application {
    private String appName;
    private int appSize;
    
    public Application(String Name, int Size) {
        this.appName=Name;
        this.appSize=Size;
    }
    
    public String getAppName(){
        return appName;
    }
    
    public int getAppSize(){
        return appSize;
    }
   
    @Override
    public String toString(){
        return ("Application name: "+this.appName+", with size: "+this.appSize+" MB");
    }
    
    
}

