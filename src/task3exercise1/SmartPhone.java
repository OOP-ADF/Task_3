package task3exercise1;

public class SmartPhone{
    // 
    // 1. Declare your private attributes here:
    // NIM : 1301154250
    // NAMA : DJODY FAZA RAHARDIAN 
    // 
    //------------------- your code here-----------------------
    private Application[] appListS = new Application[10];
    private int totalApp;
    private int memory;
    //---------------------------------------------------------

    
    // 
    // 2. Declare your Setter and Getter method here:
    /// NIM : 1301154250
    // NAMA : DJODY FAZA RAHARDIAN 
    // 
    //------------------- your code here-----------------------
    public void setMemory(int memory) {
        this.memory = memory;
    }

    
    //---------------------------------------------------------
    // 
    // 3. method addApplication( appStore , appId ) here:
    // NIM : 1301154250
    // NAMA : DJODY FAZA RAHARDIAN 
    //
    // get an Application object from array appList of an appStore
    // with array index = appId, an Application can be installed 
    // if Application size is less than remaining memory size
    // 
    //------------------- your code here-----------------------
    public void addApplication(AppStore appStore, int appId){
        appListS[appId] =  appStore.getApp(appId);
        this.memory = this.memory - appStore.getApp(appId).getAppSize();
        totalApp++;
    }
    //---------------------------------------------------------
    // 
    // 4. method method getRemainingSize() : integer here:
    // NIM : 1301154250
    // NAMA : DJODY FAZA RAHARDIAN 
    //
    // returns the remaining memory size of the smart phone
    //
    //------------------- your code here-----------------------
    public int getRemainingSize(){
        return memory;
    }
    //---------------------------------------------------------
    // 
    // 5. Create method toString() : String here:
    // NIM : 1301154250
    // NAMA : DJODY FAZA RAHARDIAN
    //
    // returns String that contains the smart phone total memory size,
    // number of application installed, and remaining memory size
    //
    // example : "memory size 100MB, 5 application installed, 
    //            remaining memory size: 60MB"
    //
    public String toString() {
        //------------------- your code here-----------------------
        
        return "This Smartphone has " + totalApp + " of total App and " + getRemainingSize() + " MB of memory.";
    
        /*return null;*/
        
        //---------------------------------------------------------
    }
}
