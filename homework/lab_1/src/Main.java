import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Student student_1 = new Student("Иван", "24-1", 2, Map.of("математика", 4, "физика", 4, "программирование", 4));
        Student student_2 = new Student("Алексей", "24-1", 1, Map.of("математика", 3, "физика", 5, "программирование", 2));
        Student student_3 = new Student("Дмитрий", "24-1", 1, Map.of("математика", 2, "физика", 3, "программирование", 2));
        Student student_4 = new Student("Юрий", "24-1", 2);
        student_4.setGrade("математика", 5);
        student_4.setGrade("программирование", 4);
        student_4.setGrade("физика", 5);

        List<Student> students = List.of(student_1,student_2,student_3,student_4);

        System.out.println("Список студентов, переведенных на следующий курс: " + transferNextCourse(students));
        printStudents(students ,2);
        printStudents(students ,1);

    }
    public static List<Student> transferNextCourse(List<Student> students) {
        ArrayList<Student> transferOfStudents = new ArrayList<>();
        for (Student student : students) {
            double sum = 0.0;
            for (Integer grade : student.getGrades().values()) {
                sum += grade;
            }

            if (sum / student.getGrades().size() > 3) {
                transferOfStudents.add(student);
            }
        }
        return transferOfStudents;
    }

    public static void printStudents(List<Student> students, int course) {
        System.out.printf("Студенты, обучающиеся на %s-м курсе%n", course);
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student);
            }
        }
    }
}