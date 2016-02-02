//DHIVA AZHARA 1301144101 IF-38-01

public class Member {
    private String name;
    private String specialization;
    private int projectWorked = 0;
    
    public Member(String name) {
        this.name = name;
    }
    public Member(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
    }
    public void setSpecialization(String spesialization) {
        this.specialization = spesialization;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setProjectWorked(int projectWorked) {
        this.projectWorked = projectWorked;
    }
    public String getName() {
        return name;
    }
    public String getSpecialization() {
        return specialization;
    }
    public int getProjectWorked() {
        return projectWorked;
    }
    public String toString() {
        return("Member "+getName()+" specialized in "+getSpecialization()+" and already worked on "+getProjectWorked()+" project(s)");
    }
}
