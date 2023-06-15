public class Student {
    String firstName;
    String lastName;
    double gpa;
    int graduationYear;
    String major;

    public  Student(String firstName,String lastName,double gpa,int graduationYear,String major){
        this.firstName=firstName;
        this.lastName=lastName;
        this.gpa=gpa;
        this.graduationYear=graduationYear;
        this.major=major;
    }
    public int joiningYear(){
        return graduationYear - 4;
    }
    public String studentMajor(){
        return major;
    }
}
