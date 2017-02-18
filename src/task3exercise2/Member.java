package task3exercise2;
// Tugas Azahra
public class Member {

    // 1. Declare your private attributes here:
    // NIM : 1301154460
    // NAMA :Azahra Kartika
     private String name;
    private String specialization;
    private int projectWorked = 0;

    public Member(String name, String specialization){
        this.name = name;
        this.specialization = specialization;
    }

    public Member(String name){
        this.name = name;
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
    //------------------- your code here-----------------------
        return null;

    //---------------------------------------------------------
    }

    int getProjectWorked() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setProjectWorked(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
