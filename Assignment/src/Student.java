public class Student {

    private int ID;
    private String Name;
    private double CGPA;

    public Student(int ID, String Name, double CGPA) {
        this.ID = ID;
        this.Name = Name;
        this.CGPA = CGPA;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return Name;
    }

    public double getCGPA() {
        return CGPA;
    }

}
