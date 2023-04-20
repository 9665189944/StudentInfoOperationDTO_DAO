package StudentImformation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentPresentation {
    static Scanner sc=new Scanner(System.in);
    static DAO d1=new DAO();
    public static void main(String[] args) {


            Boolean status=true;

        System.out.println("1.Add Subject Data");
           d1.studentInfo();
while (status) {
    System.out.println("select Mode Of operation");
    System.out.println("1.Add Student");
    System.out.println("2.Remove Student");
    System.out.println("3.Display student");
    System.out.println("4.Update student By Subject");
    System.out.println("5.Search Student by Id");
    System.out.println("6.Display Student BY Subject");
    System.out.println("7.Exit");

    int choice = sc.nextInt();
    switch (choice) {
        case 1:
            insertStudentInfo();
            break;
        case 2:
            deleteStudent();
            break;
        case 3:
            dispalyStudent();
            break;
        case 4:
            updateStudentBySubject();
            break;
        case 5:
            searchStudentId();
            break;
        case 6:
            displayStudentBYSubject();
            break;

        default:
            System.out.println("invalid Choice");
           status=false;
           break;
    }

}
    }
    static void insertStudentInfo() {
        System.out.println("Enter the Student ID");
        int id = sc.nextInt();
        System.out.println("Enter the Student Name");
        String name = sc.next();
        System.out.println("Enter the Student age ");
        int age = sc.nextInt();
        System.out.println("Enter Subject Details");

        StudentDTO s1=new StudentDTO();
        s1.setStudentID(id);
        s1.setStudentName(name);
        s1.setStudentAge(age);

        //Using Object DAO Class
        DAO d1 = new DAO();
        Subject data=insertSubjectInfo();
        s1.setSubject(data);
        d1.insertInfoStudent(s1);
        System.out.println("Add Data Successfully");
    }
    static Subject insertSubjectInfo()
    {
        System.out.println("Enter the Subject Id");
        int id=sc.nextInt();
        System.out.println("Enter the Subject Name");
        String name=sc.next();
        System.out.println("Enter the Subject Price ");
        double price=sc.nextDouble();

        Subject sub=new Subject();

        sub.setSubID(id);
        sub.setSubName(name);
        sub.setSubFee(price);


        return sub;
    }

    private static void deleteStudent() {
        System.out.println("Enter Student Id");
        int studId= sc.nextInt();
        StudentDTO s=new StudentDTO(studId);
        Boolean status= d1.deleteStudentRecord(s);
        if (status)
        {
            System.out.println("Delete Successfully Record");
        }else {
            System.out.println("Invalid Record");
        }
    }
    private static void dispalyStudent() {
        ArrayList<StudentDTO> data=d1.displayStudentInfo();
        for (StudentDTO data1:data
        ) {
            System.out.println(data1);
        }

    }


    private static void updateStudentBySubject() {
        System.out.println("Enter Student Id");
        int id=sc.nextInt();
        System.out.println("Enter Subject Name");
        String subName= sc.next();
        Subject name=new Subject(subName);
        StudentDTO nam=new StudentDTO(id,name);
        Boolean status=d1.updateStudentRecord(nam);
        if (status)
        {
            System.out.println("Update Record");
        }else {
            System.out.println("Invalid Id");
        }
    }
    private static void searchStudentId() {
        System.out.println("Enter Student Id");
        int id= sc.nextInt();
        StudentDTO  sid=new StudentDTO(id);
        List<StudentDTO> data=d1.searchStudentById(sid);
        for (StudentDTO data1:data)
        {
            System.out.println(data1);
        }

    }

    private static void displayStudentBYSubject() {

        System.out.println("Enter Subject Name");
        String sname=sc.next();
        Subject name=new Subject(sname);
        StudentDTO na=new StudentDTO(name);
        List<StudentDTO> data=d1.displayStudentBySubject(na);
        for (StudentDTO data1:data)
        {
            System.out.println(data1);
        }

    }







}
