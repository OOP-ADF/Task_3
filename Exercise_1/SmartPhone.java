// Nama : Andhika Gilang K
// Kelas : IF-38-01
// NIm : 1301140361

public class Smartphone {
	private Application[] appList = new Application[10];
	private int totalApp=0;
	private int memory;
	
	public void addApplication (AppStore appStore,int appId){
		if (appStore.getApp(appId).getAppSize() < getRemainingSize()){
			appList[totalApp] = appStore.getApp(appId);
			totalApp++;
		}
		else {
			System.out.print("Memory  is full");
		}
	}
	public Application getApp(int id ){
		return appList[id];
	}
	public int getTotalApp(){
		return totalApp;
	}
	
	public void setMemory(int memory){
		this.memory=memory;
	}
	
	public int getRemainingSize(){
		int temp=0;
		for (int i=0;i<appList.length;i++){
			if(appList[i]!=null){
				temp=temp+appList[i].getAppSize();
			}
		}
		return (memory-temp);
	}
	
	public String toString() {
		return ("Memory size "+memory+"MB, " +getTotalApp()+"application installed,remaining memory size :" +getRemainingSize()+" MB");
	}
	
	
}
