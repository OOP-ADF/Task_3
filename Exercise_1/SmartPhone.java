
//Nama : Tari Lestari
//Kelas: IF-38-01
//NIM  : 1301144281

public class SmartPhone{
	private Application[] appList = new Application[100];
	private int totalApp=0;
	private int memory=0;
	private int RemainingSize;
	
	public void setMemory(int memory){
		this.memory=memory;
		this.RemainingSize=memory;
	}
	
	public void addApplication  (AppStore appStore, int appId){
		if (totalApp < appList.length) {
			if (RemainingSize >= appStore.getApp(appId).getAppSize()) {
				appList[totalApp] = appStore.getApp(appId);
				RemainingSize = RemainingSize - appList[totalApp].getAppSize();
				totalApp++;
			} else System.out.println("Memori Tidak Cukup");
		}
	}
	
	public Application getApp (int id){
		return appList[id];
	}
	
	public int getTotalApp(){
		return totalApp;
	}
	
	public int getRemainingSize(){
		return RemainingSize;
	}
	
	public String toString(){
		return ("memory size "+memory+"MB, "+totalApp+" application installed, remaining memory size: "+RemainingSize+"MB");
	}
}
