package task3exercise1;

public class SmartPhone{
    private Application [] appList;
    private int totalApp;
    private int memory,x;
    
    
    public SmartPhone (){
        appList = new Application[10];
        this.x = 0;
    }
    public Application getAppList(int id) {
        return appList[id];
    }

    public void addApplication(AppStore appStore, int appld) {
        if (x < 10){
        this.appList[x] = appStore.getApp(appld);
        
        x++;
    }
    }

    public int getTotalApp() {
        int j = 0;
        for (int i = 0; i <=x ; i++)
        {
            j++;
        }
        totalApp = j;
        return totalApp;
    }

    public void setTotalApp(int totalApp) {
        this.totalApp = totalApp;
    }

    public int getRemainingSize()
    {
        return memory-appList.length;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }
    
    public String toString() {
    //------------------- your code here-----------------------
         String a;
        
            a = "Memory Size " + memory + ","+getTotalApp() + " Apss installed "+ ", remaining memory "+getRemainingSize();

        return a;
    
    //---------------------------------------------------------
    }
}

    
