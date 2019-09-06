public class Student {
  // OBJECT VARIABLES .. FIELDS
  private String name;
  private String studentNumber;

  // OBJECT CONSTRUCTOR
  public Student(String name, String studentNumber) {
    this.name = name;
    this.studentNumber = studentNumber;
  }

  // OBJECT METHODS
  public String getName() {
    return this.name;
  }

  public String getStudentNumber() {
    return this.studentNumber;
  }

  public String toString() {
    return this.name + " (" + this.studentNumber + ")";
  }
}