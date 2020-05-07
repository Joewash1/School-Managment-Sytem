package School;

// Create student class containing student ID, Name, Grade, Fees paid, and total fees.
// This class will allow us to track the students.
public class student {


  private int id;
  private int grade;
  private int feesPaid;
  private int totalFees;
  private String studentName;

  public student(int id, String studentName, int grade)
  {
    this.id=id;
    this.studentName=studentName;
    this.grade=grade;
    this.feesPaid=0;
    this.totalFees=50000;
  }

  public void setGrade(int grade)
  {
      this.grade=grade;
  }

    public void payFees(int fees) {
        feesPaid=fees+feesPaid;
        School1.updateTotalMoneyEarned(feesPaid);
    }
// returns ID, name, fees paid, Total fees, and Grade.
  public int getId() {
    return id;
  }

  public int getGrade() {
    return grade;
  }

  public int getFeesPaid() {
    return feesPaid;
  }

  public int getTotalFees() {
    return totalFees;
  }

  public String getStudentName() {
    return studentName;
  }
  public int getRemainder()
  {
    return totalFees-feesPaid;
  }
}
