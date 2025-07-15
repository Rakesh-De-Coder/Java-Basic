import java.util.*;
public class MagicSwitch {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your choice");
        int choice = sc.nextInt();
        switch(choice){
           
            case 1:System.out.print(" Youga pracitics ");
                       break;
            case 2:System.out.print("Go to Gym");
                       break;
            case 3:System.out.print("you can try swimming");
                       break;
            case 4:System.out.print("you should try cycling");
                       break;
            default :System.out.print("you are fit maintain it ");
        }
    }
    
}
