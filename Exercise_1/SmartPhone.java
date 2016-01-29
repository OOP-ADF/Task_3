/* [IF-38-09] _ Andi Akhmad Fauzi _ 1301144009 */
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
		int x = 0;
		int m;
		m = memory;
		for (int i=0;i<appList.length;i++){
			if(appList[i]!=null) //pengecekan aplikasi di urutan i ada atau tidak
			{
				x+=appList[i].getappSize();
				/* baris di atas menambahkan ukuran aplikasi yang ditunjuk
				   ke dalam variabel x */
			}
		}
		return m-=x;
		 /* mengurangi memori yang ada dengan total memori aplikasi
			sehingga didapatkan memori yang tersisa */
	}
	
	public void addApplication(AppStore appStore, int appId){
		if (getRemainingSize()>=appStore.getApp(appId).getappSize())
		{
			appList[totalApp] = appStore.getApp(appId);
			totalApp++;
		}
	}
	
	public String toString(){
		return ("memory size "+memory+", "+totalApp+" application installed.");
	}
}