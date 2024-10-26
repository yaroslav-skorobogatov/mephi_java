import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class Student {
    private String name;
    private String group;
    private int course;
    private HashMap<String, Integer> grades;

    public Student(String name, String group, int course, Map<String, Integer> grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = new HashMap<>(grades);
    }

    public Student(String name, String group, int course) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    public int getCourse() {
        return course;
    }

    public HashMap<String, Integer> getGrades() {
        return grades;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public void setGrade(String nameSubject, Integer grade) {
        this.grades.put(nameSubject, grade);
    }

    @Override
    public String toString() {
        return "Студент: " + getName();
    }
}
