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
public class SmartPhone {
    
private Application[] appList = new Application[10];
    private int totalApp = 0;
    private int memory;
    
    public void setMemory(int memory) {
        this.memory = memory;
    }

    public Application[] getAppList() {
        return appList;
    }

    public int getTotalApp() {
        return totalApp;
    }
    
    public void addApplication(AppStore appStore, int appId)
    {
        Application app = appStore.getApp(appId);
        
        if (app.getAppSize() < getRemainingSize())
        {
            appList[totalApp] = app;
            totalApp++;
    }
        
    }
        
        
    public int getRemainingSize()
    {
        int use = 0;
        for (int i = 0; i < totalApp; i++)
        {
            if (appList[i] == null)
            {}
            else 
            {
                use = use + appList[i].getAppSize();
            }
        }
        return (memory - use);
    }
    
    public String toString() {
        
         return "Memory size " + memory + "MB , " + totalApp + " application installed, remaining memory size : " + getRemainingSize() + "MB.";
        
    }
}
