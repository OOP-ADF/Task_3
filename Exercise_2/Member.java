
//Sulistiyo TR 1301144329 IF-38-09

public class Member 
{
	private String nama;
	private String spesilisasi;
	private int projectWorked=0;
	
	public Member (String nama) 
	{
		this.nama = nama;
	}
	
	public Member (String nama, String spesifikasi) 
	{
		this.nama = nama;
		this.spesilisasi = spesilisasi;
	}
	
	public void setName(String nama) 
	{
		this.nama = nama;
	}
	
	public String getName() 
	{
		return nama;
	}
	
	public void setProjectWorked(int projectWorked) {
		this.projectWorked = projectWorked;
	}
	
	public int getProjectWorked() 
	{
		return projectWorked;
	}
	
	public void setSpecialization(String spesilisasi) 
	{
		this.spesilisasi=spesilisasi;
	}
	
	public String getSpecialization() 
	{
		return spesilisasi;
	}
	
	public String toString() {
		return ("Member "+nama+" specialized in "+spesilisasi+" and already worked on "+projectWorked+" projec(s)");
	}
} 
