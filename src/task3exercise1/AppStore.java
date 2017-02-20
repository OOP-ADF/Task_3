package task3exercise1;

public class AppStore {
    
    // 1. Declare your private attributes here:
    // NIM : 1301154133
    // NAMA : Afif Darmawan
    // Kelas : IF 39-07
	
    private Application appList[] = new Application[100];
    private int totalApp;

    public Application[] getAppList() {
        return appList;
    }

    public int getTotalApp() {
        return totalApp;
    }
    
    public void createNewApp(String appName,int appSize ){
        Application app = new Application(appName,appSize);
        appList[totalApp]=app;
        totalApp++;
    }
    
    public Application getApp(int id) {
        return appList[id];
    }
    
    public String toString() {
    //------------------- your code here-----------------------
        return "There are "+getTotalApp()+" applications ready to install.";
    
    //---------------------------------------------------------
    }
}
