package task3exercise2;
/**
 *
 */
public class Member {


    
    private String name;
    private String specialization;
    private int projectWorked;
    
    
    public Member(String name) {
        this.name = name;
    }

    public Member(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public int getProjectWorked() {
        return projectWorked;
    }

    public void setProjectWorked(int projectWorked) {
        this.projectWorked = projectWorked;
    }
    

    public String toString() {
    
        String p = "Member " + name + " specialized in " + specialization + " and already worked on " + projectWorked + " projec(s)"; 
        return p;
    
    
    }

}
