public class SmartPhone {
 	private Application[] appList = new Application[10];
 	private int totalApp;
 	private int memory;
 	
	public void setMemory(int memory) {
		this.memory = memory;
	}
 	public void addApplication(AppStore appStore, int appId) {
 		if(getRemainingSize()>=appStore.getApp(appId).getappSize()) {
            totalApp++;
            appList[totalApp] = appStore.getApp(appId);
		}
 	}
 	public Application getApp(int id) {
 		return appList[id];
	}
 	public int getTotalApp() {
 		return totalApp; 
	}
 	public int getRemainingSize() {
 		int tmp1 = 0;
        int tmp2 = memory;
        for(int i=1;i<appList.length;i++) {
            if(appList[i]!=null) {
                tmp1+=appList[i].getappSize();
			}
        }
        return tmp2-=tmp1;
	}
 	public String toString () {
 		return "memory size "+memory+", "+totalApp+" application installed, remaining memory size: "+getRemainingSize();
	}
}