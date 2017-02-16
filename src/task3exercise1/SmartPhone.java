package task3exercise1;

public class SmartPhone{
    // 
    // 1. Declare your private attributes here:
    // NIM : .........................., 
    // NAMA : ........................., 
    // 
    //------------------- your code here-----------------------
    private int totalApp =0;
    private int memory = 0;
    private Application[] appList = new Application[10];
    private int RemainingSize = 0;
    private int App = 0;
    //---------------------------------------------------------

    
    // 
    // 2. Declare your Setter and Getter method here:
    // NIM : .........................., 
    // NAMA : ........................., 
    // 
    //------------------- your code here-----------------------
    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getTotalApp() {
        return totalApp;
    }
    public Application[] getAppList() {
        return appList;
    }

    public int getRemainingSize() {
        return RemainingSize;
    }

    public int getApp() {
        return App;
    }
    

    //---------------------------------------------------------
    // 
    // 3. method addApplication( appStore , appId ) here:
    // NIM : ..........................,
    // NAMA : ........................., 
    //
    // get an Application object from array appList of an appStore
    // with array index = appId, an Application can be installed 
    // if Application size is less than remaining memory size
    // 
    //------------------- your code here-----------------------
    //---------------------------------------------------------
    // 
    // 4. method method getRemainingSize() : integer here:
    // NIM : ..........................,
    // NAMA : ........................., 
    //
    // returns the remaining memory size of the smart phone
    //
    //------------------- your code here-----------------------
    //---------------------------------------------------------
    // 
    // 5. Create method toString() : String here:
    // NIM : ..........................,
    // NAMA : .........................,
    //
    // returns String that contains the smart phone total memory size,
    // number of application installed, and remaining memory size
    //
    // example : "memory size 100MB, 5 application installed, 
    //            remaining memory size: 60MB"
    //
    public String toString() {
        //------------------- your code here-----------------------
        return null;
        
        //---------------------------------------------------------
    }
}
