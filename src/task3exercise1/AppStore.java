package task3exercise1;

public class AppStore {
    
    // 1. Declare your private attributes here:
    // NIM : 1301150049 
    // NAMA : Aldika Wicaksono 
    //
        private Application [] appList = new Application [100];
	private int totalApp;
	private int counter;
    
    // 2. Declare your Setter and Getter method here:
    // NIM : 1301150049, 
    // NAMA : Aldika Wicaksono, 
    //
        public void setTotalApp(int totalApp) 
        {
        this.totalApp = totalApp;
        }
     
        public void setAppList(Application[] appList)  
        {
        this.appList = appList;
        }
        
        public AppStore() 
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
    
    // 3. Create method createNewApp( appName, appSize ) here:
    // NIM : 1301150049
    // NAMA : Aldika Wicaksono
    // instantiate new Application object and insert it in array appList
    //
        public void createNewApp(String appName, int appSize){
            Application newApp = new Application(appName, appSize);
            if (counter < 100){
                appList[counter] = newApp;
                totalApp++;
                counter++;
            }
        }
        
    // 4. Create method getApp( id ) : Application here:
    // NIM : 1301150049 
    // NAMA : Aldika Wicaksono
    // returns Application object from array appList with array index = id
    //
        public Application getApp(int id) {
            return appList[id];
        }
        
    
    // 5. Create method toString() : String here:
    // NIM : 1301150049 
    // NAMA : Aldika Wicaksono
    // @return returns String that contains the number of Application available
    // 
    // example : "There are 5 applications ready to install"
    // 
    public String toString() {
        return "There are " + getTotalApp() + " applications ready to install ";
    }
}

