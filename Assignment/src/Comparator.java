import java.util.List;

public class Comparator {

    public static void sort(List<Student> students, int N) {
        Student s1, s2;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N - i - 1; j++) {
                s1 = students.get(j);
                s2 = students.get(j + 1);

                //////first compare CGPA
                if (s1.getCGPA() < s2.getCGPA()) {
                    // Swap the students
                    Student temp = students.get(j);
                    students.set(j, students.get(j + 1));
                    students.set(j + 1, temp);

                    /////else compare Names
                } else if ((s1.getCGPA() == s2.getCGPA()) && (NameComparator.compare(s1.getName(), s2.getName()) > 0)) {
                    //swap the students
                    Student temp = students.get(j);
                    students.set(j, students.get(j + 1));
                    students.set(j + 1, temp);
                }

                //// else compare ID
                else if (s1.getID() < s2.getID()) {
                    //swap the students
                    Student temp = students.get(j);
                    students.set(j, students.get(j + 1));
                    students.set(j + 1, temp);
                }
                //else --> no problem both are in right order
            }
        }
    }
}