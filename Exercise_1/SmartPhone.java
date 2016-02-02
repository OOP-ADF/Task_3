//FAISHAL ABDILLAH
//1301144232
//IF-38-02

public class SmartPhone{
	private Applicatiom[] smAppList=new Applicatiom[100];
	private int totalApp;
	private int memory;
	
	public void setMemory(int memory){
		this.memory=memory;		
	}
	public int getRemainingSize(){
		int m=memory;
		int i,used;
		used=0;
		for(i=0;smAppList[i] !=null;i++){
			used =used + smApplist[i].getAppSize();
	
		}
		return m=m-used;
		}
	public void addApplication(AppStore appStore,int appId){
		if(getRemainingSize() >appStore.getApp(appId).getAppSize()){
			smAppList[totalApp]=appStore.getApp(appId);
			totalApp++
		}
	}
	public String toString(){
		System.out.print("memory size "+memory+" MB"+totalApp+" application installed reamaining memory size: "+getRemainingSize()+" MB");
	}
}
