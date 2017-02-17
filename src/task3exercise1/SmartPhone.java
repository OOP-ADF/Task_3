package task3exercise1;

public class SmartPhone{
    private String name; 
    private Application[] appListS = new Application[10];
    private int totalApp;
    private int memory;
    // NIM : M. Anugrah A 
    // NAMA : 1301154348
    // 
    public SmartPhone(String name, int memory)
    {
        this.name = name;
        this.memory = memory;
    }

    
    // 
    // 2. Declare your Setter and Getter method here:
    //NIM : M. Anugrah A 
    // NAMA : 1301154348 
    // 
    //------------------- your code here-----------------------
    
    //---------------------------------------------------------

    
    // 
    // 3. method addApplication( appStore , appId ) here:
    // NIM : .........................., 
    // NAMA : ........................., 
    //
    // get an Application object from array appList of an appStore 
    // with array index = appId, an Application can be installed 
    // if Application size is less than remaining memory size
  public void setMemory(int memory) {
        this.memory = memory;
    }
    
    public void addApplication(AppStore appStore, int appId){
      for(int i = 0; i < 100; i++){
            if(appStore.getApp(i) == appStore.getApp(appId)){
                for(int a = 0; a < 10; a++){
                    if(appListS[a] == null){
                        appListS[a] = appStore.getApp(appId);
                        this.totalApp = a;
                    }
                }
            }
            else{
                System.out.println("Apps not found!");
                break;
        }
        }
      
      appListS[appId] =  appStore.getApp(appId);
        this.memory = this.memory - appStore.getApp(appId).getAppSize();
        totalApp++;
    }
    
    public Application getApp(int id){
        return appListS[id];
    }
       
    public int getTotalApp(){
        return totalApp;
    }
    
    
        
    // 
    // 4. method method getRemainingSize() : integer here:
    // NIM : M. Anugrah A 
    // NAMA : 1301154348 
    //
    // returns the remaining memory size of the smart phone
    //
  public int getRemainingSize(){
        return memory;
  }
        
    
    // 
    // 5. Create method toString() : String here:
    // NIM : M. Anugrah A 
    // NAMA : 1301154348 
    // 
    // returns String that contains the smart phone total memory size, 
    // number of application installed, and remaining memory size 
    // 
    // example : "memory size 100MB, 5 application installed, 
    //            remaining memory size: 60MB"
    //
    public String toString() {
        return "This Smartphone has" + totalApp + " of total app and " + getRemainingSize() + " MB of memory";
    
    
    //---------------------------------------------------------
    }
}
