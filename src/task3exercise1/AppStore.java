package task3exercise1;

public class AppStore {
    
    // 1. Declare your private attributes here:
    // NIM : 1301150054
    // NAMA : Daniel Tanta Christopher Sirait
    //
    private Application[] appList = new Application[100];
    private int totalApp;
    private int i;
    
    // 2. Declare your Setter and Getter method here:
    // NIM : 1301150054 
    // NAMA : Daniel Tanta Christopher Sirait
    //

    public Application[] getAppList() {
        return appList;
    }

    public void setAppList(Application[] appList) {
        this.appList = appList;
    }

    public int getTotalApp() {
        return totalApp;
    }

    public void setTotalApp(int totalApp) {
        this.totalApp = totalApp;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
    
    
    
    // 3. Create method createNewApp( appName, appSize ) here:
    // NIM : 1301150054
    // NAMA : Daniel Tanta Christopher Sirait
    // instantiate new Application object and insert it in array appList
    //
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
    
    
    // 4. Create method getApp( id ) : Application here:
    // NIM : 1301150054
    // NAMA : Daniel Tanta Christopher Sirait 
    // returns Application object from array appList with array index = id
    //
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
        
    
    // 5. Create method toString() : String here:
    // NIM : 1301150054
    // NAMA : Daniel Tanta Christopher Sirait
    // @return returns String that contains the number of Application available
    // 
    // example : "There are 5 applications ready to install"
    // 
    public String toString() {
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
   

