import java.lang.ref.Cleaner;
import java.util.*;
public class ReportCard {
    public static void main(String args[]){
        System.out.print("please entear your marks");
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        String status = marks>33?"pass":"fail";
        System.out.print("you are:"  +status);
    }
    
}
