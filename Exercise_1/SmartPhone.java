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
public class SmartPhone {
    private Application [] appList = new Application[10];
    private int totalApp;
    private int memory;
    
    public void setMemory(int memory){
        this.memory = memory;
    }
    public void addAplication(AppStore appStore, int appId){
        if (appStore.getApp(appId).getAppSize()<getRemainingSize()){
            appList[totalApp] = appStore.getApp(appId);
            totalApp++;
        }else{
            System.out.println("Memori tidak cukup");
        }
    }
    public Application getApp(int id){
        return appList[id];
    }
    public int getTotalApp(){
        return totalApp;
    }
    public int getRemainingSize(){
        int r;
        r = 0;
        for (int i=0;i<totalApp;i++){
            r = r + appList[i].getAppSize();
        }
        return (memory-r);
    }
    public String toString(){
        return ("Memory size "+memory+"MB, "+totalApp+" application installed, remaining memory size "+getRemainingSize());
   }
}
