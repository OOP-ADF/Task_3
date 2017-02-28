/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task3exercise1;

/**
 *
 * 
 */
public class AppStore {
    private Application[] appList = new Application[100];
    private int totalApp;
    
  

    public Application[] getAppList() {
        return appList;
    }

    public int getTotalApp() {
        return totalApp;
    }
    

    
    public void createNewApp(String appName, int appSize)
    {
        Application app = new Application(appName, appSize);
        appList[totalApp] = app;
        totalApp++;
    }    
    
   
    
    public Application getApp(int id) 
    {
        return appList[id];
    }
    

    public String toString() {
   
        String p = "There are " + totalApp + " application ready to install";
        return p;
    
    
    }
}
