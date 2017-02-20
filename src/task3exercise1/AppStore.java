package task3exercise1;

public class AppStore {
    
    // 1. Declare your private attributes here:
    // NIM : 1301154455 
    // NAMA : AYLA PUTERI YANZA
    //
        private int totalApp;
        private Application[] appList = new Application[100];
        int i;
        
    // 2. Declare your Setter and Getter method here:
    // NIM : 1301154455
    // NAMA : AYLA PUTERI YANZA 
    //
    public Application[] getAppList() {
        return appList;
    }
    
    public int getTotalApp() {
        return totalApp;
    }


    // 3. Create method createNewApp( appName, appSize ) here:
    // NIM : 1301154455
    // NAMA : AYLA PUTERI YANZA 
    // instantiate new Application object and insert it in array appList
    //
    public void createNewApp(String appName, int appSize){
        Application App = new Application(appName,appSize);
        appList[totalApp] = App;
        totalApp++;
    }
    
    // 4. Create method getApp( id ) : Application here:
    // NIM : 1301154455
    // NAMA : AYLA PUTERI YANZA 
    // returns Application object from array appList with array index = id
    //
    public Application getApp(int id){
        return appList[id];
    }
        
    
    // 5. Create method toString() : String here:
    // NIM : 1301154455
    // NAMA : AYLA PUTERI YANZA
    // @return returns String that contains the number of Application available
    // 
    // example : "There are 5 applications ready to install"
    // 
    public String toString() {
        
        String a = "There are "+totalApp+" application read to install";
        return a;
        
    
    }
}
