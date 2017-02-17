package task3exercise1;

public class AppStore {
    
    // 1. Declare your private attributes here:
    // NIM : 1301150049 
    // NAMA : Aldika Wicaksono 
    //
    //------------------- your code here-----------------------
        private Application [] appList = new Application [100];
	private int totalApp;
	private int counter;
    //---------------------------------------------------------
    
    // 2. Declare your Setter and Getter method here:
    // NIM : 1301150049, 
    // NAMA : Aldika Wicaksono, 
    //
    //------------------- your code here-----------------------
        public void setTotalApp(int totalApp) 
        {
        this.totalApp = totalApp;
        }
     
        public void setAppList(Application[] appList)  
        {
        this.appList = appList;
        }
        
        public  AppStore() 
        {
        this.counter = 0;
        }
             
        public int getTotalApp()
        {
        return totalApp;
        }
        
        public Application[] getAppList() 
        {
        return appList;
        }
    //---------------------------------------------------------
    
    
    // 3. Create method createNewApp( appName, appSize ) here:
    // NIM : 1301150049
    // NAMA : Aldika Wicaksono
    // instantiate new Application object and insert it in array appList
    //
    //------------------- your code here-----------------------
        public void createNewApp(String appName, int appSize){
        Application newApp = new Application(appName, appSize);
        if (counter < 100){
            appList[counter] = newApp;
            counter++;
        }
    }
        
    //---------------------------------------------------------
    
    
    // 4. Create method getApp( id ) : Application here:
    // NIM : 1301150049 
    // NAMA : Aldika Wicaksono
    // returns Application object from array appList with array index = id
    //
    //------------------- your code here-----------------------
        public Application getApp(int id)
        {
        return appList[id];
        }
    //---------------------------------------------------------
        
    
    // 5. Create method toString() : String here:
    // NIM : 1301150049 
    // NAMA : Aldika Wicaksono
    // @return returns String that contains the number of Application available
    // 
    // example : "There are 5 applications ready to install"
    // 
    public String toString() {
    //------------------- your code here-----------------------
        for(int p = 1; p <= 100; p++){
            if(appList[p] != null){
                String nama = "App Name " + p + " : " + appList[p].getAppName();
                String size = "App Size " + p + " : " + appList[p].getAppSize();
                System.out.println(nama);
                System.out.println(size);
                System.out.println("");
            }
            else{
                break;
            }
            
        }
        return null;
        //---------------------------------------------------------
    }
}

