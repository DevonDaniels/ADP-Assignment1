package za.ac.cput.studentaccount;


/*      AcademicStaff.java
        Author: Tawfeeq Cupido (216266882)
        Date: 09 April 2022
 */

public class AcademicStaff {

    String ASname;
    String ASposition;
    String ASdepartment;
    int ASid;


    public AcademicStaff (String ASname, String ASposition, String ASdepartment, int ASid){
        this.ASname = ASname;
        this.ASposition = ASposition;
        this.ASdepartment = ASdepartment;
        this.ASid = ASid;

    }

    public String getASname() {
        return ASname;
    }

    public void setASname(String ASname) {
        this.ASname = ASname;
    }

    public String getASposition() {
        return ASposition;
    }

    public void setASposition(String ASposition) {
        this.ASposition = ASposition;
    }

    public String getASdepartment() {
        return ASdepartment;
    }

    public void setASdepartment(String ASdepartment) {
        this.ASdepartment = ASdepartment;
    }

    public int getASid() {
        return ASid;
    }

    public void setASid(int ASid) {
        this.ASid = ASid;
    }

    public void show()
    {
        System.out.println();
        System.out.println("Academic Staff Name : " + ASname);
        System.out.println("Position: " + ASposition);
        System.out.println("Department: " + ASdepartment);
        System.out.println("ID: " + ASid);

    }

    @Override
    public String toString() {
        return "Academic Staff Details{" +
                "Academic Staff Name='" + ASname + '\'' +
                ", Position=" + ASposition +
                ", Department='" + ASdepartment + '\'' +
                ", ID=" + ASid +
                '}';
    }
}