import static javax.swing.Action.NAME;
import java.util.Scanner;

public class BASIC {
    public static void main(String[] args) {
//        String[] arr = new String[4];
//        arr[0] = "kunal";
//        arr[1] = "shubham";
//        arr[2] = "kunal";
//        arr[3] = "kunal";
//        System.out.println(arr[1]);
    Scanner sc = new Scanner(System.in);

        student[] s = new student[10];
        inp(){
            int i = 0;
            System.out.println(i);
            String n = sc.nextLine();
            String id = sc.nextLine();
            int r = sc.nextInt();
            s[i] = new student( n , id , r);
            i++;

        }




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