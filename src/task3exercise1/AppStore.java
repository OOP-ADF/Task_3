package task3exercise1;

public class AppStore {
    
    // 1. Declare your private attributes here:
    // NIM : 1301154222
    // NAMA : Faishal Wafi N
    private Application[] appList = new Application[100];
    private int totalApp;
    private int i;
    
    public void createNewApp(String appName, int appSize){
        Application newApp = new Application(appName, appSize);
        for(int i = 1; i < appList.length; i++){
            if(appList[i] == null){
                appList[i] = newApp;
                this.totalApp = i;
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
        for(int p = 0; p <= this.i; p++){
            return appList[p];
        }
        return null;
    }
    
    
    public void convertString(){
        for(int p = 1; p <= 100; p++){
            if(appList[p] != null){
                String nama = "App Name " + p + " : " + appList[p].getAppName();
                String size = "App Size " + p + " : " + appList[p].getAppSize();
                System.out.println(nama);
                System.out.println(size);
                System.out.println("");
            }
            else{
                break;
            }
            
        }
    
}
}
