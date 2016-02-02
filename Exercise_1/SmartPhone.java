//Ferawidya Primadevi//
//1301140201//
//IF-38-01//


public class SmartPhone {
    private Application[] appList=new Application[10];
    private int totalApp;
    private int memory;
    public void setMemory(int memory) {
        this.memory = memory;
    }
    public void addApplication(AppStore appStore, int appId) {
        Application app = appStore.getApp(appId);
        if (app.getAppSize() < getRemainingSize()) {
            appList[totalApp]=app;
            totalApp++;
        }
    }
    public Application getApp(int id) {
        return appList[id];
    }
    public int getTotalApp() {
        return totalApp;
    }
    public int getRemainingSize() {
        int x=memory;
        int y=0;
        while (appList[y]!=null) {
            x=x-appList[y].getAppSize();
            y++;
        }
        return x;
    }
    public String toString() {
        return "memory size " + memory + " MB, " + getTotalApp() + " application installed, remaining memory size: " + getRemainingSize() + " MB";
    }
}

