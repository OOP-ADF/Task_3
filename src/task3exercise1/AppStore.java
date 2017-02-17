package task3exercise1;

public class AppStore {
    // 1. Declare your private attributes here:
    // NIM : 1301154558 
    // NAMA : Diah Ajeng Dwi Yuniasih 
    //
    //------------------- your code here-----------------------
    private Application[] appList = new Application[100];
    private int totalApp;
    private int i;
    
    public AppStore(){
        this.i = 0;
    }
    //---------------------------------------------------------
    
    // 2. Declare your Setter and Getter method here:
    // NIM : 1301154558 
    // NAMA : Diah Ajeng Dwi Yuniasih  
    //
    //------------------- your code here-----------------------
        public int getTotalApp() {
        return totalApp;
    }

    public Application[] getAppList() {
        return appList;
    }
    //---------------------------------------------------------



        
    // 3. Create method createNewApp( appName, appSize ) here:
    // NIM : 1301154558 
    // NAMA : Diah Ajeng Dwi Yuniasih  
    // instantiate new Application object and insert it in array appList
    //
    //------------------- your code here-----------------------
    public void createNewApp(String appName, int appSize){
       Application newApps = new Application(appName, appSize);
       if (i < 100){
           appList[i] = newApps;
           i++;
       }
    }
    
    //---------------------------------------------------------
    
    
    // 4. Create method getApp( id ) : Application here:
    // NIM : 1301154558 
    // NAMA : Diah Ajeng Dwi Yuniasih  
    // returns Application object from array appList with array index = id
    //
    //------------------- your code here-----------------------
    public Application getApp(int id){
        return appList[id];
    }
    //---------------------------------------------------------
        
    
    // 5. Create method toString() : String here:
    // NIM : 1301154558 
    // NAMA : Diah Ajeng Dwi Yuniasih  
    // @return returns String that contains the number of Application available
    // 
    // example : "There are 5 applications ready to install"
    // 
    public String toString() {
    //------------------- your code here-----------------------
        return "There are " + totalApp + " applications ready to install ";
    //---------------------------------------------------------
    }
}
