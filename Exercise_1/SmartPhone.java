/* NAMA : ANGKY FAJRIATI MS MUSA
   KELAS : IF-38-01
   NIM : 1301141221
*/

public class SmartPhone {
	private Application[] appList=new Application[10];
	private int totalApp=0;
	private int memory;
	public void setMemory (int memory) {
		this.memory=memory;
	}
	public void addApplication (AppStore appStore, int appId){
		Application app=appStore.getApp(appId);
		appList[totalApp]=app;
		totalApp++;
	}
	public Application getApp(int id){
		return appList[id];
	}
	public int getTotalApp(){
		return totalApp;
	}
	public int getRemainingSize(){
		int c=0;
		for(int i=0;i<appList.length;i++){
			if(appList[i]!=null){
			c=c+appList[i].getAppSize();
		}
		}
		return (memory-c);
	}
	public String toString() {
		return ("Memory Size "+memory+"MB , "+getTotalApp()+" application installed remaining memory size "+getRemainingSize()+"MB");
	}
}
