package task3exercise1;

public class AppStore {
    
    // 1. Declare your private attributes here:
    // NIM :1301154217 
    // NAMA : Ahmad Fathoni Zumaro
    //
    //------------------- your code here-----------------------
   private Application appList[];
   private int totalApp;
  
    //---------------------------------------------------------
    
    // 2. Declare your Setter and Getter method here:
    // NIM :1301154217 
    // NAMA :Ahmad Fathoni Zumaro
    //
    //------------------- your code here-----------------------
     public Application[] getAppList() {
        return appList;
    }

    public void setAppList(int a) {
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
    // NIM : 1301154217 
    // NAMA : Ahmad Fathoni Zumaro 
    // instantiate new Application object and insert it in array appList
    //
    //------------------- your code here-----------------------
    public void CreateNewApp( String appName,int appSize ){
            AppStore A = new AppStore();
            appList = new Application[100];
        
    }
    //---------------------------------------------------------
    
    
    // 4. Create method getApp( id ) : Application here:
    // NIM : .........................., 
    // NAMA : ........................., 
    // returns Application object from array appList with array index = id
    //
    //------------------- your code here-----------------------
    public String getApp(id){
        
    }
    //---------------------------------------------------------
        
    
    // 5. Create method toString() : String here:
    // NIM : .........................., 
    // NAMA : ........................., 
    // @return returns String that contains the number of Application available
    // 
    // example : "There are 5 applications ready to install"
    // 
    public String toString() {
    //------------------- your code here-----------------------
        return null;
    
    //---------------------------------------------------------
    }
}
