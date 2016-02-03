/* RIZMA NURVIARELDA
1301144229
IF 38 09
*/

public class Application {
	private String name;
	private int size;
	
	public Application (String a, int b) {
		this.name = a;
		this.size = b;
	}
	public String getName() {
		return name;
	}
	public int getSize() {
		return size;
	}
	public String toString() { 
		return "Application Name: "+ getName() +" with size: " + getSize();
	}
}
