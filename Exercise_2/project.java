public class project{
	private String projectName;
	private member[] timMember = new member[5];
	private int  nTim = 0;
	private boolean releaseStats = false;
	String Asumsi;
	public project(String projectName){
		this.projectName = projectName;
	}
	
	public void addMember(member m){
		nTim++;
		if (nTim <= 5){
			System.out.println("Anggota tim penuh");
			nTim=nTim-1;
		}
		else{
		timMember[nTim]=m;
		}
	}
	
	public boolean isReleased(){
		return releaseStats;
	}
	
	public void releasedApp(){	
		releaseStats = true;
	}
	
	public String toString(){
		if (releaseStats = true){
			Asumsi = " 	is Complete ";
		}else{
			Asumsi= " on Progress";
		}
	return " Project "+projectName+Asumsi+" with team member of "+nTim;
	}
	
}