import java.util.Scanner;


public class Application {

    public  static void main(String args[])
    {
        Elevator a=new Elevator();
        Scanner in = new Scanner(System.in);
        System.out.println("============================================ ");
        System.out.println("               Elevator Program              ");
        System.out.println("=============================================");
        System.out.println("   We Have Only 10 Floor 0-Ground Floor      ");
        System.out.println("If You Press Number 0 or 10 Program Will Exit");
        System.out.println("=============================================");


        while(true) {
            System.out.println("Enter which floor you are on ");
            int currFloor = in.nextInt();
            if(currFloor<0 || currFloor>10)
                break;
            a.CheckForFloor(currFloor);
            System.out.println("Enter Target floor");
            int targetFloor = in.nextInt();
            if(targetFloor<0 || targetFloor>10)
                break;
            a.goToFloor(targetFloor);
        }
    }

}
