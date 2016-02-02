//Vicha Octavia Tama_1301144209_IF-38-09
  
public class Driver
{
	public static void main(String[] args)
	{
		AppStore app=new AppStore();
		Smartphone sp=new Smartphone();
		app.createNewApp("app1",100);
		app.createNewApp("app2",200);
		app.createNewApp("app3",300);
		app.createNewApp("app4",400);
		System.out.println(app.toString());
		System.out.println(app.getApp(2).toString());
		
		sp.setMemory(300);
		System.out.println(sp.toString());
		sp.addApplication(app,3);
		System.out.println(sp.toString());
	}
}
		
