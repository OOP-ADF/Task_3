package task3exercise1;

public class SmartPhone{
    // 
    // 1. Declare your private attributes here:
    // NIM : 1301154385
    // NAMA : Abdul Nur Sahid
    // 
    //------------------- your code here-----------------------
    private Application [] appList = new Application [10]; 
    private int totalApp;
    private int memory;
    private int x;
    

    // 
    // 2. Declare your Setter and Getter method here:
    // NIM : 1301154385
    // NAMA : Abdul Nur Sahid
    // 
    //------------------- your code here-----------------------
    public int getMemory() {
        return memory;
        
    }
    
    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getTotalApp() {
        return totalApp;
    }

    public void setTotalApp(int totalApp) {
        this.totalApp = totalApp;
    }

    public Application[] getAppList() {
        return appList;
    }

    public void setAppList(Application[] appList) {
        this.appList = appList;
    }
    
    

    //
    // 3. method addApplication( appStore , appId ) here:
    // NIM : 1301154385
    // NAMA : Abdul Nur Sahid
    //
    // get an Application object from array appList of an appStore
    // with array index = appId, an Application can be installed 
    // if Application size is less than remaining memory size
    // 
    //------------------- your code here-----------------------
    public void addApplication(AppStore appStore , int appId ){
        if (x < 10){
            this.appList[x] = appStore.getApp(appId)
                    x++;
        }
    } 
    // 
    // 4. method method getRemainingSize() : integer here:
    // NIM : 1301154385
    // NAMA : Abdul Nur Sahid 
    //
    // returns the remaining memory size of the smart phone
    //
    //------------------- your code here-----------------------
    public int getRemainingSize() {
        return memory-appList.length;
    }
    // 5. Create method toString() : String here:
    // NIM : 1301154385
    // NAMA : Abdul Nur Sahid
    //
    // returns String that contains the smart phone total memory size,
    // number of application installed, and remaining memory size
    //
    // example : "memory size 100MB, 5 application installed, 
    //            remaining memory size: 60MB"
    //
    public String toString() {
        //------------------- your code here-----------------------
        return "memory size" +memory+ "," +getTotalApp() + "application installed , remaining memory size : "  + getRemainingSize();
        
        //---------------------------------------------------------
    }
}