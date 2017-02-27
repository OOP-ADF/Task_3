package task3exercise1;

public class SmartPhone{
    // 
    // 1. Declare your private attributes here:
    // NIM : 1301154553.........................., 
    // NAMA :Ranestari Sastriani ........................., 
    // 
    private Application[] appList=new Application[10];
    private int totalApp=0;
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

    public Application[] getAppList() {
        return appList;
    }

    public void setAppList(Application[] appList) {
        this.appList = appList;
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
  public void addApplication(AppStore appStore, int appId){
        Application app= appStore.getApp(appId);
        if (app.getAppSize()< getRemainingSize()){
            appList[totalApp]=app;
            totalApp++;
        }
        else{
            int stat=1;
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
    public int getRemainingSize(){
        int use=0;
        for (int i=0;i<totalApp;i++){
            if (appList[i]==null){}
            else
            {
                use = use + appList[i].getAppSize();
            }
        }
        return (memory-use);
    }
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
    @Override
    public String toString() {
    //------------------- your code here-----------------------
        return "memory size "+memory+" mb,"+totalApp+" application installed, remaining memory size : " + getRemainingSize() + "MB.";
    
    //---------------------------------------------------------
    }
}
