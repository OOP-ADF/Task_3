
//atika w - 1301144211
public class Nom1 {
	
	public static void main(String [] args){
	AppStore a = new AppStore();
	a.createNewApp("app1",100);
	a.createNewApp("app2",270);
	a.createNewApp("app3",88);
	System.out.println(a.toString());
	SmartPhone s= new SmartPhone();
	s.setMemory(500);
	
	s.addApplication(a, 0);
	System.out.println(s.toString());
	}
}
