package School;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Teacher Lexi = new Teacher(1,"Lexi",6000);
        Teacher Joey = new Teacher(2,"Joey", 8000);
        Teacher Lisa = new Teacher(3,"Lisa",4512);
        List<Teacher> TeacherList = new ArrayList<>();
        TeacherList.add(Lexi);
        TeacherList.add(Joey);
        TeacherList.add(Lisa);



        student Aeron = new student(1,"Aeron",6);
        student Harper = new student(2,"Harper",7);
        List<student> studentList = new ArrayList<>();
        studentList.add(Aeron);
        studentList.add(Harper);

        School1 Shs = new School1(TeacherList,studentList);

        Aeron.payFees(500000);
        System.out.println("Shs has earned " + Shs.getTotalMoneyEarned());
        System.out.println("============= Paying Teacher============");
        Lexi.receiveSalary(Lexi.getSalary());
        System.out.println("Shs has paid " + Lexi.getName() +" Remaining balance is " + Shs.getTotalMoneyEarned());
    }
}
