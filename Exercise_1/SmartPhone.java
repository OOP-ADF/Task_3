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
public class SmartPhone {
    private Application[] appList = new Application[10];
    private int totalApp, memory;

    public void setMemory(int memory) {
        this.memory = memory;
    }
    
    public void addApplication(AppStore appStore,int appId){
        if (getRemainingSize()>=appStore.getApp(appId).getAppSize()){
            appList[totalApp]=appStore.getApp(appId);
            totalApp++;
        }
    }
    public Application getApp(int id){
        return appList[id];
    }

    public int getTotalApp() {
        return totalApp;
    }
    public int getRemainingSize(){
        int x=0;
        for (int i = 0; i < appList.length; i++) {
            if (appList[i]!=null) {
                x=x+appList[i].getAppSize();
            }
        }
        return memory-x;
    }

    @Override
    public String toString() {
        return "SmartPhone{totalApp=" + totalApp + ", memory=" + memory +", remaining memory="+getRemainingSize()+ '}';
    }
    
}
