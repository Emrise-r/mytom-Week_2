package Day_4;

import java.util.Scanner;

public class Run {
    public Run() {
    }

    public static void main(String[] args) {
        StopWatch run = new StopWatch();
        int choice = -1;
        Scanner input = new Scanner(System.in);

        while(choice != 0) {
            System.out.println("Run");
            System.out.println("1. Start time");
            System.out.println("2. Stop time");
            System.out.println("3. ElapsedTime, Exit");
            System.out.println("Enter choice");
            choice = input.nextInt();
            switch(choice) {
                case 1:
                    System.out.println("Start time: " + run.start());
                    break;
                case 2:
                    System.out.println("Stop time: " + run.stop());
                    break;
                case 3:
                    System.out.println("Start time " + run.getStartTime());
                    System.out.println("Stop time " + run.getEndTime());
                    System.out.println("ElapsedTime " + run.getElapsedTime());
                    System.exit(0);
                    break;
                default:
                    System.out.println("No choice!");
            }
        }

    }
}
