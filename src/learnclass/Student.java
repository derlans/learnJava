package learnclass;
/**
 * @author derlan
 */
public class Student {
    public String studentName;
    public int studentID;
    public int studentGrade;
    public String studentMajor;
    public int studentCredits;
    public float studentGPA;
    private  float tuition;
    private  final float  MAX_TUITION = 4500;
    private  final float  MIN_TUITION = 0;

    public Student(String studentName, int studentID, int studentGrade, String studentMajor, int studentCredits, float studentGPA) {
        this.studentName = studentName;
        this.studentID = studentID;
        this.studentGrade = studentGrade;
        this.studentMajor = studentMajor;
        this.studentCredits = studentCredits;
        this.studentGPA = studentGPA;
    }

    public String getStudentName() {
        return studentName;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public int getStudentGrade() {
        return studentGrade;
    }

    public void setStudentGrade(int studentGrade) {
        this.studentGrade = studentGrade;
    }

    public String getStudentMajor() {
        return studentMajor;
    }

    public void setStudentMajor(String studentMajor) {
        this.studentMajor = studentMajor;
    }

    public int getStudentCredits() {
        return studentCredits;
    }

    public void setStudentCredits(int studentCredits) {
        this.studentCredits = studentCredits;
    }

    public float getStudentGPA() {
        return studentGPA;
    }

    public void setStudentGPA(float studentGPA) {
        this.studentGPA = studentGPA;
    }

    public float getTuition() {
        return tuition;
    }

    public void setTuition(float tuition) {
        if(tuition < MIN_TUITION || tuition > MAX_TUITION) {
            throw new IllegalArgumentException("Tuition must be between $0 and $4500");
        }
        this.tuition = tuition;
    }

    public void printStudentInfo(){
        System.out.println("Student Name: " + studentName);
        System.out.println("Student ID: " + studentID);
        System.out.println("Student Grade: " + studentGrade);
        System.out.println("Student Major: " + studentMajor);
        System.out.println("Student Credits: " + studentCredits);
        System.out.println("Student GPA: " + studentGPA);
        System.out.println("Student Tuition: " + tuition);
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", studentID=" + studentID +
                ", studentGrade=" + studentGrade +
                ", studentMajor='" + studentMajor + '\'' +
                ", studentCredits=" + studentCredits +
                ", studentGPA=" + studentGPA +
                '}';
    }
}
