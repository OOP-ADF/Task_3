public class SmartPhone {
    private Application[] appList = new Application[100];
    private int totalApp;
    private int memory;

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getTotalApp() {
        return totalApp;
    }
    
    public void addApplication (AppStore appStore, int appId){
        if (appStore.getApp(appId).getAppSize() < getRemainingSize()) {
            appList[totalApp] = appStore.getApp(appId);
            totalApp++;
		}
		else {
            System.out.println("Memory is full");
	}
    }
    
    public Application getApp(int id) {
	return appList[id];
    }
    
    public int getRemainingSize() {
	int temp = 0;
        for (int i = 0; i < appList.length; i++) {
            if (appList[i] != null) {
                temp = temp + appList[i].getAppSize();
            }
	}
	return memory - temp;
    }
    
    public String toString() {
	return ("Memory size " + memory + "MB, " + getTotalApp() + " application installed, remaining memory size: " + getRemainingSize() + "MB");
    }
}
