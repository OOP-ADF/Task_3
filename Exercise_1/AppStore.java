/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package driver;

/**
 *Aristya Wirawan-1103134329-IF3809
 * @author aris
 */
public class AppStore {
    private Application[] appList=new Application[100];
    private int totalApp;
    
    public void createNewApp(String appName,int appSize){
        Application appBaru = new Application(appName,appSize);
        appList[totalApp]= appBaru;
        totalApp++;
    }
    public Application getApp(int id){
        return appList[id];
    }

    public Application[] getAppList() {
        return appList;
    }

    public int getTotalApp() {
        return totalApp;
    }

    @Override
    public String toString() {
        return "AppStore{" + "appList=" + appList + ", totalApp=" + totalApp + '}';
    }
    
}
