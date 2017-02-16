package task3exercise1;

public class AppStore {
    
    // 1. Declare your private attributes here:
    // NIM : .........................., 
    // NAMA : ........................., 
    //
    //------------------- your code here-----------------------
    private Application appList[100];
    private int totalApp;
    
    public int getTotalApp(){
        return totalApp;
    }
    
    //---------------------------------------------------------
    
    // 2. Declare your Setter and Getter method here:
    // NIM : .........................., 
    // NAMA : ........................., 
    //
    //------------------- your code here-----------------------
     public Application[] getAppList() {
        return appList;
    }

    //---------------------------------------------------------


    // 3. Create method createNewApp( appName, appSize ) here:
    // NIM : .........................., 
    // NAMA : ........................., 
    // instantiate new Application object and insert it in array appList
    //
    //------------------- your code here-----------------------
    public createNewApp(string appName, int appSize){
        Application app = new Application();
        for(int i = 0; i<totalApp; i++){
            appList[i] = app;
        }
    }
    //---------------------------------------------------------
    
    
    // 4. Create method getApp( id ) : Application here:
    // NIM : .........................., 
    // NAMA : ........................., 
    // returns Application object from array appList with array index = id
    //
    //------------------- your code here-----------------------
    public Application getApp(int id){
        return appList[id];
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
        String msg = "There are "+totalApp+" applications are available"
        return msg;
    
    //---------------------------------------------------------
    }
}
