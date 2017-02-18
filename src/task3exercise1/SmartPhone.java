package task3exercise1;
//Tugas Hardiyan
public class SmartPhone{
    // 
    // 1. Declare your private attributes here:
    // NIM : Hardiyan Ichsan Gunawan 
    // NAMA : 1301154138 
    // 
    //------------------- your code here-----------------------
    private Application[] appList;
    private int totalApp;
    private int memory;
    //---------------------------------------------------------

    
    // 
    // 2. Declare your Setter and Getter method here:
    // NIM : 1301154138
    // NAMA : Hardiyan Ichsan Gunawan 
    // 
    //------------------- your code here-----------------------
    
    public void setMemory(int memory){
        this.memory = memory;
    }
    
    public int getMemory(){
        return memory;
    }
    
    public Application getApp (int Id){
        return appList[Id];
    }
    
    public int getTotalApp(){
        return totalApp;
    }
    
    //---------------------------------------------------------

    
    // 
    // 3. method addApplication( appStore , appId ) here:
    // NIM : 1301154138 
    // NAMA : Hardiyan Ichsan Gunawan 
    //
    // get an Application object from array appList of an appStore 
    // with array index = appId, an Application can be installed 
    // if Application size is less than remaining memory size
    // 
    //------------------- your code here-----------------------
    public void addApplication(AppStore appStore, int appId){
        if (getAppSize() < getRemainingSize() && totalApp < 10){
            System.out.println("Not Enough Memory");
        } else {
            appList[totalApp] = Application(appStore.getApp(appId));
            totalApp++;
        }
    }
    //---------------------------------------------------------
    
        
    // 
    // 4. method method getRemainingSize() : integer here:
    // NIM : 1301154138 
    // NAMA : Hardiyan Ichsan Gunawan
    //
    // returns the remaining memory size of the smart phone
    //
    //------------------- your code here-----------------------
    public int getRemainingSize(){
        int totalAppSize = 0;
        for (int i=0; i<appList.length; i++){
            totalAppSize += appList[i].getAppSize();
        }
        return memory - totalAppSize;
    }
    //---------------------------------------------------------
        
    
    // 
    // 5. Create method toString() : String here:
    // NIM : 1301154138 
    // NAMA : Hardiyan Ichsan Gunawan 
    // 
    // returns String that contains the smart phone total memory size, 
    // number of application installed, and remaining memory size 
    // 
    // example : "memory size 100MB, 5 application installed, 
    //            remaining memory size: 60MB"
    //
    public String toString() {
    //------------------- your code here-----------------------
        return "Memory size "+getMemory()+", "+getTotalApp()+" application installed, remaining memory size: "+getRemainingSize();
    
    //---------------------------------------------------------
    }

    
}
