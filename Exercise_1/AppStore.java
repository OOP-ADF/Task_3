/*
Gentur Cipto Tri Atmaja
1301140239
IF 38-09
 */

public class AppStore 
{
    private Application[] appList = new Application[100];
    private int totalApp = 0;
    
    public void createNewApp(String appName, int appSize)
    {
        Application newApp = new Application(appName, appSize);
        appList[totalApp] = newApp;
        totalApp++ ;
    }

     public Application[] getApp(int id) 
    {
        return appList[id];
    }
     
    public int getTotalApp() 
    {
        return totalApp ;
    } 
    
    public Application[] getAppList() 
    {
        return appList;
    }
    
        public String toString()
    {
        return " Ada" + (totalApp) + " Aplikasi yang siap Install ";
    }    
}

