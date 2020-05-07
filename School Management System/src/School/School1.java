package School;

import java.util.ArrayList;
import java.util.List;

// implements teachers and students using ArrayList.
public class School1 {
    private List<Teacher> teachers ;
    private List<student> students;
    private static int totalMoneyEarned;
    private static int totalMoneySpent;

    /**
     * new school object
     * @param teachers list of teacher in the school
     * @param students list of students in the school
     */
    public School1(List<Teacher> teachers, List<student> students) {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned=0;
        totalMoneySpent=0;

    }
// returns list of teachers in the school
    public List<Teacher> getTeachers() {
        return teachers;
    }
// add teacher to the school
    public void addTeachers(Teacher teacher) {
        teachers.add(teacher);
    }

    public List<student> getStudents() {
        return students;
    }
// adds student to school
    public void addStudents(student student1) {
        students.add(student1);
    }
// gets Total Money earned by the School
    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }
// updates total money Earned
    public static void  updateTotalMoneyEarned(int MoneyEarned) {
        totalMoneyEarned += MoneyEarned;
    }
// gets total money spent
    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }
// updates total money spent
    public static void updateTotalMoneySpent(int MoneySpent) {
        totalMoneyEarned -= MoneySpent;
    }
}
