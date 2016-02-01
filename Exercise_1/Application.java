/**
 * Nama : Reza Muhammad K
 * Nim  : 1301144332
 */
 
 public class Application {
  private String NamaApp;
  private int SizeApp;
  
  public Application(String NamaApp, int SizeApp){
	this.NamaApp = NamaApp;
	this.SizeApp = SizeApp;
  }
  public String getNamaApp(){
	return NamaApp;
  }
  public int getSizeApp(){
	return SizeApp;
  }
  public String toString(){
      return "Application Name : "+NamaApp+" with Size : "+SizeApp+"MB";
  }
}