package School;
// This call will track the teachers ID, name, and salary.
public class Teacher {
    private int id;
    private String name;
    private int salary;
    private int salaryEarned;

    /**
     *
     * @param id id of teacher
     * @param name name of teacher
     * @param salary teachers salary
     */

    public Teacher(int id, String name, int salary)
    {
        this.id=id;
        this.name=name;
        this.salary=salary;
        this.salaryEarned=0;
    }
    // returns Teachers Name
    public String getName()
    {
        return this.name;
    }
   // returns teacher ID
    public int getId()
    {
        return this.id;
    }
    // returns salary
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    // adds to the salary
    // removes from total money earned from school
    public void receiveSalary(int salary)
    {
    salaryEarned+=salary;
    School1.updateTotalMoneySpent(salary);
    }
}
