package task3exercise2;

public class Member {

    // 1. Declare your private attributes here:
    // NIM : 1301154446, 
    // NAMA : Elvaretta Dian Detiana Yucky, 
    
    private String name;
    private String specialization;
    private int projectWorked = 0;
    
    // 2. Declare your 2 Constructor here:
    // NIM : 1301154446, 
    // NAMA : Elvaretta Dian Detiana Yucky, 
   
    public void Member(String name)
    {
        this.setName(name);
    }
    
    public void Member(String name, String specialization)
    {
        this.setName(name);
        this.setSpecialization(specialization);
    }
    
    // 3. Declare your Setter and Getter method here:
    // NIM : 1301154446, 
    // NAMA : Elvaretta Dian Detiana Yucky, 
    
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

    // 4. Create method toString() : String here:
    // NIM : 1301154446, 
    // NAMA : Elvaretta Dian Detiana Yucky, 
    //
    // returns String that contains member name, specialization, 
    // and number of project worked  
    // 
    // example : "Member Alex specialized in Java Programming, 
    //            worked on 5 project(s)"
    public String toString() {
        return "Member"+name+"specialized in "+specialization+" worked on "+projectWorked+"project (s)";
    }
}
