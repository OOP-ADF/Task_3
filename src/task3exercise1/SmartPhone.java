package task3exercise1;

public class SmartPhone{
    Application [] appList;
    int totalApp;
    int memory;
    
    public SmartPhone (){
        appList = new Application[10];
    }
    public Application getAppList(int id) {
        return appList[id];
    }

    public void addApplication(AppStore appStore, int appld) {
        if (appStore.appList[appld].appSize < getRemainingSize()){
        this.appList[appld] = appStore.appList[appld];
        }
    }

    public int getTotalApp() {
        return totalApp;
    }

    public void setTotalApp(int totalApp) {
        this.totalApp = totalApp;
    }

    public int getRemainingSize() {
        return memory - (totalApp * Application.appSize);
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }
   
    
    
    // 
    // 1. Declare your private attributes here:
    // NIM  : 1301150082
    // NAMA : Bagas Adi Prayitno 
    // 
    //------------------- your code here-----------------------
    
    //---------------------------------------------------------

    
    // 
    // 2. Declare your Setter and Getter method here:
    // NIM  : 1301150082
    // NAMA : Bagas Adi Prayitno
    // 
    //------------------- your code here-----------------------
    
    //---------------------------------------------------------

    
    // 
    // 3. method addApplication( appStore , appId ) here:
    // NIM  : Bagas Adi Prayitno
    // NAMA : 1301150082
    //
    // get an Application object from array appList of an appStore 
    // with array index = appId, an Application can be installed 
    // if Application size is less than remaining memory size
    // 
    //------------------- your code here-----------------------
    
    //---------------------------------------------------------
    
        
    // 
    // 4. method method getRemainingSize() : integer here:
    // NIM  : 1301150082
    // NAMA : Bagas Adi Prayitno
    //
    // returns the remaining memory size of the smart phone
    //
    //------------------- your code here-----------------------
    
    //---------------------------------------------------------
        
    
    // 
    // 5. Create method toString() : String here:
    // NIM  : 1301150082
    // NAMA : Bagas Adi Prayitno
    // 
    // returns String that contains the smart phone total memory size, 
    // number of application installed, and remaining memory size 
    // 
    // example : "memory size 100MB, 5 application installed, 
    //            remaining memory size: 60MB"
    //
    public String toString() {
    //------------------- your code here-----------------------
        String a;
        
            a = "Memory Size " + memory + ","+totalApp + " Apss installed "+ ", remaining memory "+getRemainingSize();
        
    
    //---------------------------------------------------------
    return a;
}
}

