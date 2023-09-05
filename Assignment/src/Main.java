import java.util.*;
public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        System.out.print("Enter number of Students : ");
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int i,ID;
        String Name;
        double CGPA;

        System.out.println("ID\t Name\t GPA");

        for(i=0; i<N; i++){
            ID = input.nextInt();
            Name = input.next();
            CGPA = input.nextDouble();
            students.add(new Student(ID,Name,CGPA));
        }

        Comparator.sort(students,N);

        System.out.println("\nNames Order :");

        for (Student student : students) {
            System.out.println("\t"+student.getName());
        }

    }
}