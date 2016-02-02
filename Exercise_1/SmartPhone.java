//Nama		: Febby Febriansyah
//NIM		: 1301140371
//Kelas		: IF-38-01

public class SmartPhone{
	private Application[] appList = new Application[10];
	int totalApp = 0;
	int memory;
	
	public void setMemory(int memory){
		this.memory = memory;
	}
	public void addApplication(AppStore appStore,int appId){
		if(appStore.getApp(appId).getappSize() <= getRemainingSize()){
			appList[totalApp] = appStore.getApp(appId);
			totalApp++;
		}
	}
	public Application getApp(int id){
		return appList[id];
	}
	public int getTotalApp(){
		return totalApp;
	}
	public int getRemainingSize(){
		int used = 0;
		int i = 0;
		int remains = memory;
		do{
			if(appList[i] != null){
				used += appList[i].getappSize();
			}
			i++;
		}while(i < appList.length);
		remains -= used;
		return remains;
	}
	public String toString(){
		return "memory size "+memory+"MB, "+totalApp+" application installed, remaining memory size : "+getRemainingSize();
	}
	
}

