//DHIVA AZHARA (1301144101) IF-38-01

public class SmartPhone {
    private Application[] appList = new Application[10];
    private int totalApp = 0;
    private int memory;
    
    public void setMemory(int memory){
        this.memory = memory;
    }
    public void addApplication(AppStore appStore, int appId) {
        Application b = appStore.getApp(appId);
        appList[totalApp] = b;
        totalApp++;
    }
    public Application getApp(int id){
        return appList[id];
    }
    public int getTotalApp(){
        return totalApp;
    }
    public int getRemainingSize() {
        int temp = 0;
        for (int i=0; i<appList.length; i++) {
            if (appList[i] != null) {
                temp = temp + appList[i].getAppSize();
            }
        }
        return (memory-temp);
    }
    public String toString() {
        return("Memory size "+memory+"MB, "+getTotalApp()+" applications installed, remaining memory size: "+getRemainingSize()+" MB");
    }
}

