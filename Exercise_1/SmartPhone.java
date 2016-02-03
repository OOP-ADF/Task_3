/*
*name  : I Putu Prima Ananda
*class : IF-38-01
*NIM   : 1301144291
*/

public class SmartPhone {
	private Application appList[] = new Application[10];
	private int totalApp;
	private int memory;
	private int mem;
	public void setMemory(int memory){
		mem = memory;
		this.memory = memory;
	}
	public void addApplication(AppStore appStore, int appId){
		// if ()
			if (memory >= appStore.getApp(appId).getAppSize()){
				appList[totalApp] = appStore.getApp(appId);
				memory = memory - appList[totalApp].getAppSize();
				totalApp++;
			}else{
				System.out.println("memory full or not enough");
			}
	}
	public Application getApp(int id){
		return appList[id];
	}
	public int getTotalApp(){
		return totalApp;
	}
	public int getRemainingSize(){
		return memory;
	}
	public String toString(){
		return "memory size "+mem+", "+totalApp+" Application installed, remaining memory is: "+getRemainingSize();
	}
}
