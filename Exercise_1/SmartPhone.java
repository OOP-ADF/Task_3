/* 
Nama 	: Rizky Muhammad Rifai
NIM  	: 1301144099
Kelas	: IF-38-09
*/
	 
public class SmartPhone {
 private Application[] smAppList = new Application[100];
 private int countApp;
 private int memory;
 public void setMemory(int memory) {
  this.memory = memory;
 }
	
 public int getRemainingSize() {
  int m = memory;
  int i, used;
  i=0;
  used=0;
 while (smAppList[i] != null) {
  used = used + smAppList[i].getAppSize();
  i++;
 }
  return m=m-used;
 }
	
 public void addApplication(AppStore appStore, int appId) {
  if (getRemainingSize() >= appStore.getApp(appId).getAppSize()) {
   smAppList[countApp]=appStore.getApp(appId);
   countApp++;
  }
 }
	
 public String toString() {
  return ("memory size "+memory+", "+countApp+" application installed, remaining memory size : "+getRemainingSize());
 }
}
