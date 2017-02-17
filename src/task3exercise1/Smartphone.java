package task3exercise1;

public class SmartPhone{
    // 
    // 1. Declare your private attributes here:
    // NIM : 1301154208 
    // NAMA : Irvan Nur Apendi 
	// KELAS : IF-39-12
    // 
    //------------------- your code here-----------------------
    private int memory;
    private int totalApp;
    private Application[] appList = new Application[10];
    //---------------------------------------------------------

    
    // 
    // 2. Declare your Setter and Getter method here:
    // NIM : 1301154208
    // NAMA : Irvan Nur Apendi
    // KELAS : IF-39-12	
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
    
    public Application getApp(int id){
        return appList[id];
    }
    

    //---------------------------------------------------------

    
    // 
    // 3. method addApplication( appStore , appId ) here:
    // NIM : 1301154208
    // NAMA : Irvan Nur Apendi 
	// KELAS : IF-39-12
    //
    // get an Application object from array appList of an appStore 
    // with array index = appId, an Application can be installed 
    // if Application size is less than remaining memory size
    // 
    //------------------- your code here-----------------------
    public void addApplication(AppStore appStore, int appid) {
        if(totalApp < appList.length) {
            if(appStore.getApp(appid).getAppSize() < getRemainingSize()) {
                appList[totalApp] = appStore.getApp(appid);
                totalApp = totalApp+1;
            } else {
                System.out.println("Memory penuh");
            }
        }
    }
    
    //---------------------------------------------------------
    
        
    // 
    // 4. method method getRemainingSize() : integer here:
    // NIM : 1301154208
    // NAMA : Irvan Nur Apendi 
	// KELAS : IF-39-12
    //
    // returns the remaining memory size of the smart phone
    //
    //------------------- your code here-----------------------
  public int getRemainingSize() {
        int j = 0;
        for (int i = 0; i < appList.length; i++) {
          if(appList[i] != null) {
              j = j+appList[i].getAppSize();
          } 
      }
        return memory - j;
    }
    //---------------------------------------------------------
        
    
    // 
    // 5. Create method toString() : String here:
    // NIM : 1301154208 
    // NAMA : Irvan Nur Apendi 
	// KELAS : IF-39-12
    // 
    // returns String that contains the smart phone total memory size, 
    // number of application installed, and remaining memory size 
    // 
    // example : "memory size 100MB, 5 application installed, 
    //            remaining memory size: 60MB"
    //
    public String toString() {
    //------------------- your code here-----------------------
        return "Memory size " +getMemory()+ ","+ totalApp + " application installed and remaining " + getRemainingSize() + " MB of memory.";
    
    //---------------------------------------------------------
    }
}
