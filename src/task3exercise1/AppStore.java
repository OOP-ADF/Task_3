package task3exercise1;

public class AppStore {
    
    // 1. Declare your private attributes here:
    // NIM : 1301154105
    // NAMA : Ressa Firmansyah Fatah
    //
    //------------------- your code here-----------------------
    
    private Application[] appList = new Application[100];
    private int totalApp;
    
    //---------------------------------------------------------
    
    // 2. Declare your Setter and Getter method here:
    // NIM : 1301154105
    // NAMA : Ressa Firmansyah Fatah
    //
    //------------------- your code here-----------------------

    public Application[] getAppList() {
        return appList;
    }

    public int getTotalApp() {
        return totalApp;
    }
    
    //---------------------------------------------------------
    
    
    // 3. Create method createNewApp( appName, appSize ) here:
    // NIM : 1301154105
    // NAMA : Ressa Firmansyah Fatah
    // instantiate new Application object and insert it in array appList
    //
    //------------------- your code here-----------------------
    
    public void createNewApp(String appName, int appSize)
    {
        Application app = new Application(appName, appSize);
        appList[totalApp] = app;
        totalApp++;
    }    
    
    //---------------------------------------------------------
    
    
    // 4. Create method getApp( id ) : Application here:
    // NIM : 1301154105
    // NAMA : Ressa Firmansyah Fatah
    // returns Application object from array appList with array index = id
    //
    //------------------- your code here-----------------------
    
    public Application getApp(int id) 
    {
        return appList[id];
    }
    
    //---------------------------------------------------------
        
    
    // 5. Create method toString() : String here:
    // NIM : 1301154105
    // NAMA : Ressa Firmansyah Fatah
    // @return returns String that contains the number of Application available
    // 
    // example : "There are 5 applications ready to install"
    // 
    public String toString() {
    //------------------- your code here-----------------------
        String p = "There are " + totalApp + " application ready to install";
        return p;
    
    //---------------------------------------------------------
    }
}
