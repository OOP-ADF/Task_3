package task3exercise1;

    // Nama : Yusuf Yunadian
    // NIM  : 1301150012

public class Smartphone {
    private String name; 
    private Application[] appListS = new Application[10];
    private int totalApp;
    private int memory;

    public void setMemory(int memory) {
        this.memory = memory;
    }
    
    public void addApplication(AppStore appStore, int appId){      
        appListS[appId] =  appStore.getApp(appId);
        this.memory = this.memory - appStore.getApp(appId).getAppSize();
        totalApp++;
    }
    
    public Application getApp(int id){
        return appListS[id];
    }
    
    public int getTotalApp(){
        return totalApp;
    }
    
    public int getRemainingSize(){
        return memory;
    }
    
    public String toString(){
        return "This Smartphone has " + totalApp + " of total App and " + getRemainingSize() + " MB of memory.";
    }
    
}
