package StudentImformation;

public class Subject {


    private  int subID;
    private  String subName;
    private  double subFee;


    public Subject() {

    }

    public Subject(String sname) {

        this.subName=sname;
    }

    public Subject(int subID, String subName, double subFee) {
        this.subID = subID;
        this.subName = subName;
        this.subFee = subFee;
    }



    public int getSubID() {

        return subID;
    }

    public void setSubID(int subID) {

        this.subID = subID;
    }

    public String getSubName() {

        return subName;
    }

    public void setSubName(String subName) {

        this.subName = subName;
    }

    public double getSubFee() {

        return subFee;
    }

    public void setSubFee(double subFee) {

        this.subFee = subFee;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "subID=" + subID +
                ", subName='" + subName + '\'' +
                ", subFee=" + subFee +
                '}';
    }
}
