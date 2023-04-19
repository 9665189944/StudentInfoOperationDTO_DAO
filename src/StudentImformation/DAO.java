package StudentImformation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class DAO {

    static StudentDTO s;


    public static ArrayList<StudentDTO> data = new ArrayList<>();


    void studentInfo() {
        data.add(new StudentDTO(1, "amit", 20, new Subject(11, "java", 20)));
        data.add(new StudentDTO(2, "Pramod", 30, new Subject(12, "j2ee", 30)));
        data.add(new StudentDTO(3, "Parvin", 40, new Subject(13, "SQL", 23)));
        data.add(new StudentDTO(4, "Anuj", 50, new Subject(14, "Advance", 22)));
    }


    public void insertInfoStudent(StudentDTO d1) {
        data.add(d1);
    }





    public ArrayList<StudentDTO> displayStudentInfo() {

        Iterator<StudentDTO> itr = data.iterator();
        while (itr.hasNext()) {
            s = itr.next();

        }
        return data;
    }

    public Boolean deleteStudentRecord(StudentDTO s1) {
        boolean status=false;
        Iterator<StudentDTO> itr = data.iterator();
        while (itr.hasNext()) {
            s = itr.next();
            if (s.getStudentID()==s1.getStudentID()) {
                itr.remove();
                status=true;
                break;
            }else {
                status=false;
            }
        }
        return status;
    }

    public  Boolean updateStudentRecord(StudentDTO id)
    {
        Boolean status=false;
        Iterator<StudentDTO> itr = data.iterator();
        while (itr.hasNext()) {
            s = itr.next();
            if (s.getStudentID()==id.getStudentID()) {
                s.getSubject().setSubName(id.getSubject().getSubName());
             status=true;
             break;
            }else {
                status=false;
            }
        }
        return status;
    }

    public List<StudentDTO> displayStudentBySubject(StudentDTO S1) {
        Iterator<StudentDTO> itr=data.listIterator();

        List<StudentDTO> data1=new ArrayList<>();
        while (itr.hasNext()) {
            s= itr.next();
            if (S1.getSubject().getSubName().equals(s.getSubject().getSubName())) {
                       s=new StudentDTO(s.getStudentID(),s.getStudentName(),s.getStudentAge());
                       data1.add(s);
            }
        }

        return data1 ;
    }

    public  List<StudentDTO> searchStudentById(StudentDTO sid)
    {
        Iterator<StudentDTO> itr=data.listIterator();

        List<StudentDTO> data1=new ArrayList<>();
        while (itr.hasNext()) {
            s= itr.next();
            if (sid.getStudentID()==s.getStudentID())
            {
                s.getStudentID();
                data1.add(s);
            }
        }
     return data1;

    }
}
