// 	Biyan Ilham Akbar, 1301144319, IF-38-09

 public class SmartPhone {
 	private Application[] smAppList = new Application[100];
 	private int jumApp;
 	private int memory;
 	public void setMemory(int memory) {
 		this.memory = memory;}
 	
 	public int getRemainingSize() {
 		int m = memory;
 		int i, used;
 		i=0;
 		used=0;
 		while (smAppList[i] != null) {
 			used = used + smAppList[i].getAppSize();
 			i++;
 		}
 		return m=m-used;}
 	
 	public void addApplication(AppStore appStore, int appId) {
 		if (getRemainingSize() >= appStore.getApp(appId).getAppSize()) {
 			smAppList[jumApp]=appStore.getApp(appId);
 			jumApp++;
 		}}
 	
 	public String toString() {
 		return ("memory size "+memory+", "+jumApp+" application installed, remaining memory size : "+getRemainingSize());}
 }
