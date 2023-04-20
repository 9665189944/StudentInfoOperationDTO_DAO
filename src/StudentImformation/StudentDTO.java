package StudentImformation;

public class StudentDTO {

    Subject sub=new Subject();

    private  Subject subject;
    private  int studentID;
    private  String studentName;
    private  int  studentAge;
    public StudentDTO(int studentID, String studentName, int studentAge,Subject subject ) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.studentAge = studentAge;
        this.subject=subject;
    }
    public StudentDTO() {

    }
    public StudentDTO(Subject subject)
   {
       this.subject=subject;
   }
    public StudentDTO(int studId) {

        this.studentID=studId;
    }
    public StudentDTO(int id, Subject subject) {

        this.studentID=id;
        this.subject=subject;
    }

    public StudentDTO(int studentID, String studentName, int studentAge) {
        this.studentID=studentID;
        this.studentName = studentName;
        this.studentAge = studentAge;

    }




    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }


    @Override
    public String toString() {
        return "StudentDTO{" +

                ", studentID=" + studentID +
                ", studentName='" + studentName + '\'' +
                ", studentAge=" + studentAge +
                ", subject=" + subject +
                '}';
    }
}
