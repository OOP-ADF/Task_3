package task3exercise2;

public class Member {

    // 1. Declare your private attributes here:
    // NIM :1301154217
    // NAMA : Ahmad Fathoni Zumaro 
    //
    //------------------- your code here-----------------------
    private String Name;
    private String specialization;
    private int projectWorked = 0;
    //---------------------------------------------------------

    // 2. Declare your 2 Constructor here:
    // NIM : 1301154217 
    // NAMA : Ahmad Fathoni Zumaro 
    //
    //------------------- your code here-----------------------
    public Member(String Name) {
        this.Name = Name;
    }

    public Member(String Name, String specialization) {
        this.Name = Name;
        this.specialization = specialization;
    }

    //---------------------------------------------------------
    // 3. Declare your Setter and Getter method here:
    // NIM : 1301154217
    // NAMA : Ahmad FAthoni Zumaro 
    //
    //------------------- your code here-----------------------
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
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

    //---------------------------------------------------------
    // 4. Create method toString() : String here:
    // NIM : 1301154217
    // NAMA : Ahmad Fathoni Zumaro 
    //
    // returns String that contains member name, specialization,
    // and number of project worked
    //
    // example : "Member Alex specialized in Java Programming, 
    //            worked on 5 project(s)"
    public String toString() {
        //------------------- your code here-----------------------
        return "memberName: " + Name + "Specialization: " + specialization + "number of projectworked: " + projectWorked;

        //---------------------------------------------------------
    }

}
