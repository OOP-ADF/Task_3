    //
    // NIM : 1301150082, 1301154320, 1301154474 
    // NAMA : Bagas Adi P. , Alwi Warisman, Serlii R.c.
    //
   
package task3exercise1;

public class Application {
    private String appName;
    private int appSize;
    private int i;

    
    public Application(String appName, int appSize){
        this.appName = appName;
        this.appSize = appSize;
        this.i = 0;
    }
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
    
    public String toString(){
        return "Application Name = " + appName + '\n' + "Application Size = " + appSize + '\n';
    }
}
