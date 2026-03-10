import static javax.swing.Action.NAME;

public class BASIC {
    public static void main(String[] args) {
//        String[] arr = new String[4];
//        arr[0] = "kunal";
//        arr[1] = "shubham";
//        arr[2] = "kunal";
//        arr[3] = "kunal";
//        System.out.println(arr[1]);
        student[] s = new student[10];
        s[0] = new student("kunal", "fdfs", 54);



    }
}
class student {
    String NAME;
    String ID;
    int RollNo;

    student(String NAME, String ID, int RollNo) {
        this.NAME = NAME;
        this.ID = ID;
        this.RollNo = RollNo;


    }

}