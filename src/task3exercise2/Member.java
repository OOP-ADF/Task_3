package task3exercise2;

public class Member {

    // NIM : 1301150432 
    // NAMA : Afra Woro D
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
    
    public String toString(){
        return "Nama : "+name+"Spesialisasi : "+specialization+'\n'+"Hasil Proyek : "+projectWorked+'\n'; 
    }
}
