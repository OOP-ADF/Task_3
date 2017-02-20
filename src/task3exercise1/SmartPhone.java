package task3exercise1;

public class SmartPhone{
    // 
    // 1. Declare your private attributes here:
    // NIM : 1301154553.........................., 
    // NAMA :Ranestari Sastriani ........................., 
    // 
    private Application[10] appList;
    private int totalApp;
    private int memory;
    
    // 
    // 2. Declare your Setter and Getter method here:
    // NIM : 1301154553.........................., 
    // NAMA : Ranestari Sastriani........................., 

    public int getTotalApp() {
        return totalApp;
    }

    public void setTotalApp(int totalApp) {
        this.totalApp = totalApp;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }
    
    
    // 
    // 3. method addApplication( appStore , appId ) here:
    //  NIM : 1301154553.........................., 
    //  NAMA : Ranestari Sastriani.........................
    //
    // get an Application object from array appList of an appStore 
    // with array index = appId, an Application can be installed 
    // if Application size is less than remaining memory size
    // 
    public void addApplication(Appstore appstore, int appId){
        if (totalApp < appList.length){
            appList[totalApp] = appstore;
            totalApp++;
        }
    }
    
        
    // 
    // 4. method method getRemainingSize() : integer here:
    //  NIM : 1301154553.........................., 
    //  NAMA : Ranestari Sastriani......................... 
    //
    // returns the remaining memory size of the smart phone
    //
    //------------------- your code here-----------------------
    
    //---------------------------------------------------------
        
    
    // 
    // 5. Create method toString() : String here:
    //  NIM : 1301154553.........................., 
    //  NAMA : Ranestari Sastriani......................... 
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
