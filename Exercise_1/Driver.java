//Name : Luthfi Fauzani Ahmad
//NIM  : 130140029
//Class: IF-38-09

import java.util.Scanner;

public class Driver{
	
	public static void main(String[] args){
		int x,y,m,p;
		String ax;
		boolean q = false;
		
		AppStore aps = new AppStore();
		SmartPhone sp = new SmartPhone();
		Scanner b = new Scanner(System.in);
		Scanner c = new Scanner(System.in);
		m = b.nextInt();
		sp.setMemory(m);
		do{
		System.out.println("==== Application Program ====");
		System.out.println("1. Add application to store");
		System.out.println("2. Install to smartphone");
		System.out.println("3. View application list");
		System.out.println("Choice : "); 
		x = b.nextInt();
		switch(x){
			case 1: System.out.print("Input app name	: ");
					aps = c.next();
					System.out.print("Input app Size	: ");
					y = b.nextInt();
					aps.createNewApp(ax, x);
					System.out.println(aps.toString());
					continue;
			case 2: System.out.println(sp.toString());
					System.out.print("Input app ID : ");
					p = b.nextInt();
					sp.addAplication(aps,p);
					System.out.println(sp.toString());
					continue;
			case 3: System.out.print("Input app ID : ");
					p = b.nextInt();
					System.out.println(aps.getApp(p).toString());
					continue;
			case 4: q=true;
					break;
		}
		} while(q=false);
	}
}
