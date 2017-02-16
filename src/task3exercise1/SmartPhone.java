package task3exercise1;

public class SmartPhone{
    // 
    // 1. Declare your private attributes here:
    // NIM : 1301152427 
    // NAMA : Afnizar Nur Ghifari 
    // 
    
    private Application appList[] = new Application[10];
    private int totalApp;
    private int memory;
    
    // 
    // 2. Declare your Setter and Getter method here:
    // NIM : 1301152427 
    // NAMA : Afnizar Nur Ghifari 
    // 

    public Application[] getAppList() {
        return appList;
    }

    public void setAppList(Application[] appList) {
        this.appList = appList;
    }

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
    // NIM : 1301152427 
    // NAMA : Afnizar Nur Ghifari 
    //
    // get an Application object from array appList of an appStore 
    // with array index = appId, an Application can be installed 
    // if Application size is less than remaining memory size
    // 
    public int addApplication(AppStore appStore, int appId) {
        
    }
    
    // 
    // 4. method method getRemainingSize() : integer here:
    // NIM : 1301152427 
    // NAMA : Afnizar Nur Ghifari 
    //
    // returns the remaining memory size of the smart phone
    //
    
    public int getRemainingSize() {
        int n = memory - appSize;
        return n;
    }
    
    // 
    // 5. Create method toString() : String here:
    // NIM : 1301152427 
    // NAMA : Afnizar Nur Ghifari 
    // 
    // returns String that contains the smart phone total memory size, 
    // number of application installed, and remaining memory size 
    // 
    // example : "memory size 100MB, 5 application installed, 
    //            remaining memory size: 60MB"
    //
    public String toString() {
        return ("memory size " + getMemory() + ", " + getApp() + " applications installed, \nremaining memory size: " + getRemainingSize());
    }
}
