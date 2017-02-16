    //
    // NIM : 1301150082, 1301154320, 1301154474 
    // NAMA : Bagas Adi P. , Alwi Warisman, Serlii R.c.
    //

package task3exercise1;

public class AppStore {
    private Application[] appList = new Application[100];
    private int totalApp;
    private int x ;
    
    public  AppStore() {
        this.x = 0;
    }
    public Application getApp(int id){
        return appList[id];
    }
    
    public int getTotalApp(){
        return totalApp;
    }

    public void setTotalApp(int totalApp) {
        this.totalApp = totalApp;
    }
    
 
    public void setAppList(Application[] appList) {
        this.appList = appList;
    }

    public Application[] getAppList() {
        return appList;
    }

    public void createNewApp(String appName, int appSize){
        Application newApp = new Application(appName, appSize);
        if (x < 100){
            appList[x] = newApp;
            x++;
        }
    }
    
    
    // toString cara sendiri, maafkan pak :(
    
    public String toString(){
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
        return null;
    }
}
