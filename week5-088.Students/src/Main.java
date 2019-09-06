
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();

        Scanner reader = new Scanner(System.in);

        while (true) {
            System.out.print("Type students name: ");
            String studentName = reader.nextLine();
            if (studentName.isEmpty()) {
                break;
            }
            System.out.print("Type student number: ");
            String studentNumber = reader.nextLine();

            students.add(new Student(studentName, studentNumber));
        }

        System.out.println();
        for (Student listStudent : students) {
            System.out.println(listStudent);
        }

        System.out.println();
        System.out.println("Give search term: ");
        String searchTerm = reader.nextLine();

        System.out.println("Result: ");
        for (Student student : students) {
            if (student.getName().contains(searchTerm)) {
                System.out.println(student);
            }
        }
    }
}