public class Elevator {
   public static int floor;


    Elevator()
    {
        floor=0;
    }


    public static void ElevatorUp(int currFloor)
    {
        int i;
            for(i=floor;i<=currFloor;i++)
            {
                System.out.println("The lift is at :"+i+"Floor");
                floor=i;
            }

    }
    public static void ElevatorDown(int currFloor)
    {
        int j;
            for(j=floor;j>=currFloor;j--)
                {
                    System.out.println("The lift is at :"+j+"Floor");
                    floor=j; 
                }

    }
    public static void CheckForFloor(int currFloor) {
        if (floor == currFloor) {
            System.out.println("Lift is at same floor");
        } else if (floor > currFloor) {
            ElevatorDown(currFloor);

        } else {
            ElevatorUp(currFloor);
        }
    }
    public static void goToFloor(int targetFloor)
    {
        if(targetFloor>floor)
        {
            ElevatorUp(targetFloor);
        }
        else if(targetFloor<floor)
        {
            ElevatorDown(targetFloor);
        }
        else if(targetFloor==floor)
        {
            System.out.println("You are on the same floor");
        }
    }

}
