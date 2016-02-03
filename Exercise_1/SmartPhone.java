public class SmartPhone {
    private Application[] appList=new Application[10];
    private int totalApp=0;
    private int memory;
    
    public void setMemory(int memory) {
        this.memory=memory;
    }
    
    public void addApplication(AppStore appStore, int appld){
        Application apps=appStore.getApp(appld);
        appList[totalApp]=apps;
        totalApp++;
    }
    
    public Application getApp(int id){
        return appList[id];
    }
    
    public int getTotalApp(){
        return totalApp;
    }
    
    public int getRemainingSize(){
        int tampung=0;
        for (int i=0; i<appList.length; i++){
            if (appList[i] != null){
                tampung=tampung+appList[i].getAppSize();
            }  
        }
        return (memory-tampung);
    }
    public String toString(){
        return ("Memory size "+memory+" MB, "+getTotalApp()+" applications installed, remaining memory size: " +getRemainingSize()+" MB");
    }
}
