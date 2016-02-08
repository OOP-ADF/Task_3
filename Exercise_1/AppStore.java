/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task3;

/**
 *
 * @author iqbal
 */
public class AppStore {
    private Application [] appList = new Application[10];
    private int totalApp;
    
    public void createNewApp(String appName, int appSize){
        appList[totalApp] = new Application(appName,appSize);
        totalApp++;
    }
    public Application getApp(int id){
        return appList[id];
    }
    public int getTotalApp(){
        return totalApp;
    }
    public String toString(){
        return ("There are "+totalApp+" application ready to install");
    }
}
