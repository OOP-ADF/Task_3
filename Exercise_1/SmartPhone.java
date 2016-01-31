public class SmartPhone  {
	Application[] applist = new Application [10]; 
	int totalApp = 0; 
	int memory = 0;
	
	public void setMemory (int memory) {
		this.memory = memory;
		}
	
	
	public void addApplication (AppStore appStore, int appId) {
		int i = appStore.getApp(appId).appSize;
                String j = appStore.getApp(appId).appName;
		if ( i < memory ){
			Application a = new Application(j,i);
			applist[totalApp] = a;
		totalApp++;}
	}

	
	public Application getApp(int id) {
		return applist[id];
	}
	public int getMemory() {
		return memory;
	}
	
        public int getRemainingSize() {
            
            int j = 0;
            for (int i = 0; i<totalApp; i++) {
                j = j + applist[i].appSize;
            }
            return j;
	}
	
        
	public int getTotalApp(){
		return totalApp;
	}

	
	public String toString() { 
    return String.format("memory size ",getMemory(), getTotalApp()," application installed, remaining memory size: ",getRemainingSize()," MB");
	}
}
 

	

