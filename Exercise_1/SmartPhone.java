/*
Name 	: Pima Hani Safitri
ID 		: 1301140202
Class 	: IF-38-02
*/
public class SmartPhone {
	private Application []appList = new Application[10];
	private int totalApp;
	private int memory;
	
	public void setMemory(int memory) {
		this.memory = memory;
	}
	public void addApplication(AppStore appStore, int appid) {
		if(getRemainingSize()>=appStore.getApp(appid).getappSize()) {
            appList[totalApp] = appStore.getApp(appid);
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
		int x = 0;
        int temp = memory;
        for(int i=0;i<appList.length;i++) {
            if(appList[i]!=null) {
                x+=appList[i].getappSize();
            }
        }
        return temp-=x;
	}
	public String toString() {
		return "memory size "+memory+", "+totalApp+" application installed, remaining memory size: "+getRemainingSize();
	}
}