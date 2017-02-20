package task3exercise1;

public class SmartPhone{
    // 
    // 1. Declare your private attributes here:
    // NIM : 1301150441, 
    // NAMA : NAFASA MUTH MA'NAH, 
    // 
    //------------------- your code here-----------------------
    private Application[] appList = new Application[10];
    private int totalApp =0;
    private int memory = 0;
    int status = 0;
    //---------------------------------------------------------

    
    // 
    // 2. Declare your Setter and Getter method here:
    // NIM : 1301150441, 
    // NAMA : NAFASA MUTH MA'NAH,
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
    //---------------------------------------------------------
    // 
    // 3. method addApplication( appStore , appId ) here:
    // NIM : 1301150441, 
    // NAMA : NAFASA MUTH MA'NAH,
    //
    // get an Application object from array appList of an appStore
    // with array index = appId, an Application can be installed 
    // if Application size is less than remaining memory size
    // 
    //------------------- your code here-----------------------
    public void addApplication(AppStore appStore, int appId)
    {
        Application app = appStore.getApp(appId);
        if (app.getAppSize() < getRemainingSize())
        {
            appList[totalApp] = app;
            totalApp++;
        }
        else
        {
            status = 1;
        }
       
    }
    //---------------------------------------------------------
    // 
    // 4. method method getRemainingSize() : integer here:
    // NIM : 1301150441, 
    // NAMA : NAFASA MUTH MA'NAH,
    //
    // returns the remaining memory size of the smart phone
    //
    //------------------- your code here-----------------------
    public int getRemainingSize() {
        int x = 0;
        for (int i = 0; i < totalApp; i++) {
           if (appList[i] == null){
               
           } 
           else{
               x = x + appList[i].getAppSize();
           }
        }
        return (memory - x);
    }
    //---------------------------------------------------------
    // 
    // 5. Create method toString() : String here:
    //NIM : 1301150441, 
    // NAMA : NAFASA MUTH MA'NAH,
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
        if (status == 0){
            x = "Memory size " + memory + "MB, " + totalApp + " application installed, remaining size : " + getRemainingSize() + "MB.";          
        }
        else{
            x = "Memory penuh";
        }
        return x;
        //---------------------------------------------------------
    }
}
