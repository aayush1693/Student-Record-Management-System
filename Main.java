import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Adding a student
        Student student1 = new Student();
        student1.setName("John Doe");
        student1.setAge(18);
        student1.setGrade("12th");
        student1.setAddress("123 Main St, City");

        StudentManager.addStudent(student1);

        // Getting all students
        List<Student> students = StudentManager.getAllStudents();
        for (Student student : students) {
            System.out.println(student.getName() + " - " + student.getAge() + " - " + student.getGrade() + " - " + student.getAddress());
        }

        // Updating a student
        Student studentToUpdate = students.get(0);
        studentToUpdate.setAddress("456 Elm St, Town");
        StudentManager.updateStudent(studentToUpdate);

        // Deleting a student
        Student studentToDelete = students.get(1);
        StudentManager.deleteStudent(studentToDelete.getId());
    }
}
