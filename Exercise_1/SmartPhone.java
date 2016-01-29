//Agung Rahmat Budiman
//1301144142
//IF-38-02

public class SmartPhone {
	private Application[] appList = new Application[10];
	private int totalApp = 0;
	private int memory;
	
	public void setMemory(int memory) {
		this.memory = memory;
	}
	public void addApplication(AppStore appStore, int appId) {
		if(getRemainingSize()>=appStore.getApp(appId).getappSize()) {
            appList[totalApp] = appStore.getApp(appId);
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
		int c = 0;
        int temp = memory;
        for(int i=0;i<appList.length;i++) {
            if(appList[i]!=null) {
                c+=appList[i].getappSize();
            }
        }
        return temp-=c;
	}
	public String toString () {
		return "memory size "+memory+", "+totalApp+" application installed, remaining memory size: "+getRemainingSize();
	}
}