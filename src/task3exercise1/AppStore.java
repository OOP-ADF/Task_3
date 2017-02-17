package task3exercise1;

public class AppStore {
    
    // 1. Declare your private attributes here:
    // NIM : 1301154446, 
    // NAMA : Elvaretta Dian Detiana Yucky, 
    
    private Application[] appList = new Application[100];
    private int totalApp = 0;

    
    
    // 2. Declare your Setter and Getter method here:
    // NIM : 1301154446, 
    // NAMA :Elvaretta Dian Detiana Yucky, 
    
    public Application[] getAppList() {
        Application[] aps = new Application[100];
        for (int i = 0; i<appList.length; i++)
        {
            aps[i]=appList[i];
        }
        return aps;
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
    
    // 3. Create method createNewApp( appName, appSize ) here:
    // NIM : 1301154446, 
    // NAMA : Elvaretta Dian Detiana Yucky, 
    
    public void createNewApp(String appName, int appSize)
    {
        Application aps = new Application(appName, appSize);
        if(totalApp<appList.length)
        {
            appList(totalApp)=aps;
            totalApp++;
        }
    }
    
    // 4. Create method getApp( id ) : Application here:
    // NIM : 1301154446, 
    // NAMA : Elvaretta Dian Detiana Yucky, 
    // returns Application object from array appList with array index = id
    
    public Application getApp(int id)
    {
       return appList[id];
    }
    
    // 5. Create method toString() : String here:
    // NIM : 1301154446, 
    // NAMA : Elvaretta Dian Detiana Yucky, 
    // @return returns String that contains the number of Application available
    // 
    // example : "There are 5 applications ready to install"
    // 
    public String toString() {
        
        return "There are "+totalApp+" Application ready to install";
    }
}
