package task3exercise1;

public class AppStore {
    
    // 1. Declare your private attributes here:
    // NIM : 1301150063
    // NAMA : Alfian Rahman Aziz
    //
    //------------------- your code here-----------------------
    private Application[] appList = new Application[100];
    private int totalApp ;
    private int a;
    //---------------------------------------------------------
    
    // 2. Declare your Setter and Getter method here:
    // NIM : 1301150063
    // NAMA : Alfian Rahman Aziz
    //
    //------------------- your code here-----------------------

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
    
    //---------------------------------------------------------

    
    // 3. Create method createNewApp( appName, appSize ) here:
    // NIM : 1301150063
    // NAMA : Alfian Rahman Aziz
    // instantiate new Application object and insert it in array appList
    //
    //------------------- your code here-----------------------
     public void createNewApp (String appName, int appSize){
         if (a < 100){
            Application App = new Application(appName,appSize);
            appList[totalApp] = App;
            totalApp++;
            a++;
         }
     }

    //---------------------------------------------------------
    
    
    // 4. Create method getApp( id ) : Application here:
    // NIM : 1301150063 
    // NAMA : Alfian Rahman Aziz 
    // returns Application object from array appList with array index = id
    //
    //------------------- your code here-----------------------
    public Application getApp(int id){
        return appList[id]  ;
    }
    //---------------------------------------------------------
        
    
    // 5. Create method toString() : String here:
    // NIM : 1301150063 
    // NAMA : Alfian Rahman Aziz
    // @return returns String that contains the number of Application available
    // 
    // example : "There are 5 applications ready to install"
    // 
    
    //------------------- your code here-----------------------
    public String toString() {
        return "There are " + totalApp + " Application Ready to Install";
    
    //---------------------------------------------------------
    }
}
