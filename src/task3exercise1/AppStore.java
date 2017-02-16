package task3exercise1;

// NIM = 1301154110
// Nama = FADHLILLAH

public class AppStore {
    
    private Application[] appList = new Application[100];
    private int totalApp;
    private int a;
    
    public createNewApp(String appName, int appSize){
        Application newApp = new Application(appName, appSize);
        for (int a = 1; a<appList.length; a++){
            if (appList[a] == null){
                appList[a] = newApp;
                this.totalApp = a;
                break;
            }
        }
    }
    
    public Application getApp(int id){
        return appList[id];
    }
    
    public int getTotalApp(){
        return totalApp;
    }
    
    public Application getAppList(){
        for (int i = 0; i <= this.a; i++){
            return appList[i];
        }
        return null;
    }
        
    public String toString() {
        for (int i = 1; i <= 100; i++){
            if (appList[i] != null){
                String nama = "App Name "+i+": "+appList[i].getAppName();
                String size = "App Size "+i+": "+appList[i].getAppSize();
                System.out.println(nama);
                System.out.println(size);
                System.out.println("");
            }else{
                break;
            }
        }
        return null;
    }
}