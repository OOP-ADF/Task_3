package task3exercise1;

public class SmartPhone{
    // 
    // 1. Declare your private attributes here:
    // NIM : 1301154544, 
    // NAMA : NISA NURHARDINI, 
    // 
    //------------------- your code here-----------------------
    
    //---------------------------------------------------------
    private Application appList[10];
    private int totalApp;
    private int memory;
    
    // 
    // 2. Declare your Setter and Getter method here:
    // NIM : 1301154544, 
    // NAMA : NISA NURHARDINI, 
    // 
    //------------------- your code here-----------------------
    
    //---------------------------------------------------------

    
    // 
    // 3. method addApplication( appStore , appId ) here:
    // NIM : 1301154544, 
    // NAMA : NISA NURHARDINI, 
    //
    // get an Application object from array appList of an appStore 
    // with array index = appId, an Application can be installed 
    // if Application size is less than remaining memory size
    // 
    //------------------- your code here-----------------------
    
    //---------------------------------------------------------
    public addApplication (Appstore appStore, int appId){
        appStore apps = new appStore();
        if (appSize < remain){
            apps.getApp(appId);
        }
        
    }
        
    // 
    // 4. method method getRemainingSize() : integer here:
    // NIM : 1301154544, 
    // NAMA : NISA NURHARDINI, 
    //
    // returns the remaining memory size of the smart phone
    //
    //------------------- your code here-----------------------
    
    //---------------------------------------------------------
    public int getRemainingSize(){
        int remain;
        memory = remain;
        remain = remain - appSize;
        return remain;
    }
    
    // 
    // 5. Create method toString() : String here:
    // NIM : 1301154544, 
    // NAMA : NISA NURHARDINI, 
    // 
    // returns String that contains the smart phone total memory size, 
    // number of application installed, and remaining memory size 
    // 
    // example : "memory size 100MB, 5 application installed, 
    //            remaining memory size: 60MB"
    //

    
    public setMemory (int memory){
        this.memory = 2000;
    }

    public Application getApp(int id){
        return appList[id];
    }
    
    public int getTotalApp(){
        return totalApp;
    }

    public String toString() {
    //------------------- your code here-----------------------
        String a = "Memory Size "+memory+", "+totalApp+" application installed "+"remaining memory size : "+remain;
        return a;
    
    //---------------------------------------------------------
    }
}
