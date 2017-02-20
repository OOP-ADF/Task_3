package task3exercise1;

public class SmartPhone{
    // 
    // 1. Declare your private attributes here:
    // NIM : 1301150063
    // NAMA : Alfian Rahman Aziz 
    // 
    //------------------- your code here-----------------------
    
    private Application[] appList = new Application[10];
    private int totalApp = 0;
    private int memory;
    int x = 0;
    
    //---------------------------------------------------------

    
    // 
    // 2. Declare your Setter and Getter method here:
    // NIM : 1301150063  
    // NAMA : Alfian Rahman Aziz 
    // 
    //------------------- your code here-----------------------

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

    //---------------------------------------------------------

    
    // 
    // 3. method addApplication( appStore , appId ) here:
    // NIM : 1301150063
    // NAMA : Alfian Rahman Aziz
    //
    // get an Application object from array appList of an appStore 
    // with array index = appId, an Application can be installed 
    // if Application size is less than remaining memory size
    // 
    //------------------- your code here-----------------------
    
    public void addApplication(AppStore appStore, int appId)
    {
        Application app = appStore.getApp(appId);
            appList[totalApp] = app;
            totalApp++;
       
    }
    
    //---------------------------------------------------------
    
        
    // 
    // 4. method method getRemainingSize() : integer here:
    // NIM : 1301150063 
    // NAMA : Alfian Rahman Aziz 
    //
    // returns the remaining memory size of the smart phone
    //
    //------------------- your code here-----------------------
    
    public int getRemainingSize()
    {
        int y = 0;
        for (int i = 0; i < totalApp; i++)
        {
            if (appList[i] == null)
            {}
            else 
            {
                y = y + appList[i].getAppSize();
            }return (memory - y);
        }
        return memory;
    }
    
    //---------------------------------------------------------
        
    
    // 
    // 5. Create method toString() : String here:
    // NIM : 1301150063 
    // NAMA : Alfian Rahman Aziz 
    // 
    // returns String that contains the smart phone total memory size, 
    // number of application installed, and remaining memory size 
    // 
    // example : "memory size 100MB, 5 application installed, 
    //            remaining memory size: 60MB"
    //
    public String toString() {
    //------------------- your code here-----------------------
        String x;
        if (this.x == 0)
        {
            x = "Memory size " + memory + "MB , " + (totalApp+1) + " application installed, remaining memory size : " + getRemainingSize() + "MB.";
        }
        else
        {
            x = "Memory Penuh";
        }
        
        return x;
    
    //---------------------------------------------------------
    }
}
