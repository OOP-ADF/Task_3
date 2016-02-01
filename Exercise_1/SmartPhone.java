//Anggi Agustian - 1301144149
public class SmartPhone{
	private Application[] appList = new Application[10];
	private int totalApp;
	private int memory;
	
	public void setMemory(int memory){
		this.memory = memory;
	}
	
	public Application getApp(int id){
		return appList[id];
	}
	
	public int getTotalApp(){
		return totalApp;
	}
	
	public int getRemainingSize(){
		int a = 0;
		int m;
		m = memory;
		for (int i=0;i<appList.length;i++){
			if(appList[i]!=null) //pengecekan aplikasi pada urutan tersebut ada atau tidak
			{
				a+=appList[i].getappSize(); //menambahkan ukuran aplikasi yang ditunjuk ke dalam variabel a
			}
		}
		return m-=a; //mengurangi memori yang ada dengan total memori aplikasi sehingga didapatkan memori yang tersisa
	}
	
	public void addApplication(AppStore appStore, int appId){
		if (getRemainingSize()>=appStore.getApp(appId).getappSize())
		{
			appList[totalApp] = appStore.getApp(appId);
			totalApp++;
		}
	}
	
	public String toString(){
		return ("ukuran memory "+memory+", "+totalApp+" aplikasi Terinstall.");
	}
}
