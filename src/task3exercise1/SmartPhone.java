package task3exercise1;

public class SmartPhone{
    // 
    // 1. Declare your private attributes here:
    // NIM : 1301154390 
    // NAMA : Chando Anggara Natanael Batubara 
    // 
    private Application appList[];
    private int totalApp;
    private int memory;
    
    public SmartPhone()
    {
        appList = new Application[10];
    }
    
    
    // 2. Declare your Setter and Getter method here:
    // NIM : 1301154390 
    // NAMA : Chando Anggara Natanael Batubara 
    // 
    public void setTotalApp(int totalApp)
    {
        this.totalApp = totalApp;
    }
    
    public void setMemory(int memory)
    {
        this.memory = memory;
    }
    
    public int getTotalApp()
    {
        return totalApp;
    }
    

    
    // 
    // 3. method addApplication( appStore , appId ) here:
    // NIM : 1301154390 
    // NAMA : Chando Anggara Natanael Batubara 
    //
    // get an Application object from array appList of an appStore 
    // with array index = appId, an Application can be installed 
    // if Application size is less than remaining memory size
    // 
    public void addApplication(AppStore appStore, int appId)
    {
        if (appStore.getApp(appId).getAppSize() < getRemainingSize()){
            appList[totalApp] = appStore.getApp(appId);
            totalApp++;
        }
        else
        {
            System.out.println("Memory is full");
        }
    }
    
        
    // 
    // 4. method method getRemainingSize() : integer here:
    // NIM : 1301154390 
    // NAMA : Chando Anggara Natanael Batubara 
    //
    // returns the remaining memory size of the smart phone
    //
    public int getRemainingSize()
    {
        int temp = 0;
        for (int i = 0; i< appList.length; i++)
        {
            if (appList[i] != null)
            {
                temp = temp + appList[i].getAppSize();
            }
        }
        return memory - temp;
    }
    
    public Application getApp(int id)
    {
        return appList[id];
    }
    
        
    
    // 
    // 5. Create method toString() : String here:
    // NIM : 1301154390 
    // NAMA : Chando Anggara Natanael Batubara 
    // 
    // returns String that contains the smart phone total memory size, 
    // number of application installed, and remaining memory size 
    // 
    // example : "memory size 100MB, 5 application installed, 
    //            remaining memory size: 60MB"
    //
    public String toString() {
    //------------------- your code here-----------------------
        return ("Memory Size " + memory + "MB, " + getTotalApp() + " aplication installed, remaining memory size : " + getRemainingSize() + "MB");
    
    //---------------------------------------------------------
    }
}
