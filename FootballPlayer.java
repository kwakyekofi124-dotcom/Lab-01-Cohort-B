import java.util.Scanner;
public class FootballPlayer {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Task 1
        String name;
        int age;
        double height_m, weight_lbs; 
        int jerseyNumber;
        System.out.print("Enter player's name: ");
        name = scan.nextLine();
        System.out.print("Enter player's age: "); 
        age = scan.nextInt();
        System.out.print("Enter player's height (meters): ");
        height_m = scan.nextDouble();
        System.out.print("Enter player's weight (lbs): ");
        weight_lbs = scan.nextDouble();
        System.out.print("Enter player's jersey number: ");
        jerseyNumber = scan.nextInt();
        // Double new line space to make the thing look organized
        System.out.println("\nPlayer Profile:");
        System.out.println("\nName - " + name);
        System.out.println("Age - " + age + " years");
        System.out.println("Height - "+ height_m + " meters");
        System.out.println("Weight - "+ weight_lbs+ " lbs");
        System.out.println("Jersey Number - " + jerseyNumber);

        // Task 2
        // Alternative Player Profile
        double pound = 0.45359237;
        int meter = 100;
        double weight_kg = weight_lbs * pound;
        double height_cm = height_m * meter;
        double weight_kilo =(int) weight_kg;
        // Double spacing: same reason
        System.out.println("\nAlterative player profile -");
        System.out.println("\nName - " + name);
        System.out.println("Age - " + age + " years");
        System.out.println("Height(cm) - " + height_cm + " cm");
        System.out.println("Weight(kg) - "+ weight_kilo + " kg");
        System.out.println("Jersey Number - " + jerseyNumber);
        // Task 3
        System.out.println("After a year, the player is "+ ++age + " years old.");
        System.out.println("Due to misconduct, the player now has jersey number " + --jerseyNumber);
        // Task 4
        System.out.println("Checking for age eligiblity...");
        boolean eligible = true;
        if (18<=age && age<=35) {
            eligible = true;
            System.out.println("ELIGIBLE.");
        }
        
        else{
            eligible = false;
            System.out.println("NOT ELIGIBLE.");
        }
        
        if (18 > age || weight_kilo>= 90.0) {
            eligible = false;
            System.out.println("Player has a problem: either too young or too heavy");
        }        
        if (!( 18<=age && age<=35 )) {
            eligible = false;
            System.out.println("Not eligible");
        }
        // Task 5
        if (age<20){
            System.out.println("Rising Star");
        }
        else if (age<=20&&age<=30){
            System.out.println("Prime Player");
            }
        else{
            System.out.println("Veteran Player");
        }
        // Task 6
        System.out.println("Enter player JErsey number: ");
        int jernum = scan.nextInt();
        switch (jernum){
            case 1:
                System.out.println("Position: Goalkeeper");
                break;
            case 2:
                System.out.println("Position: Right back");
                break;
            case 3:
                System.out.println("Position: center back");
                break;
            case 4:
                System.out.println("Position: center back");
                break;
            case 5:
                System.out.println("Left back");
                break;
            case 6:
                System.out.println("Center defensive midfielder");
                break;
            case 7:
                System.out.println("Left winger");
                break;
            case 8:
                System.out.println("Box-to-Box midfielder");
                break;
            case 9:
                System.out.println("Striker");
                break;
            case 10:
                System.out.println("Center attacking midfielder");
                break;
            case 11:
                System.out.println("Right winger");
                break;
            default:
                System.out.println("Unknown position");
        }
        //Task 7
        //Part A
        System.out.println("Enter player Jersey number(again): ");
        int jer_um = scan.nextInt();
        switch (jer_um){
            case 1: 
                System.out.println("Position: Goalkeeper");
                break;
            case 2:
                System.out.println("Position: Right back");
            case 3:
                System.out.println("Position: center back");
                break;
            case 4:
                System.out.println("Position: center back");
                break;
            case 5:
                System.out.println("Left back");
                break;
            case 6:
                System.out.println("Center defensive midfielder");
            case 7:
                System.out.println("Left winger");
            case 8:
                System.out.println("Box-to-Box midfielder");
                break;
            case 9:
                System.out.println("Striker");
                break;
            case 10:
                System.out.println("Center attacking midfielder");
                break;
            case 11:
                System.out.println("Right winger");
                break;
            default:
                System.out.println("Unknown position");
        }
            // Part B
            System.out.println("AGain, enter Jersey number:");
            int jer_num = scan.nextInt();
            switch (jer_num){
                case 1: 
                    System.out.println("Position: Goalkeeper");
                    break;
                case 2:
                case 3:
                case 4:
                case 5:
                    System.out.println("Position: Defender");
                    break;
                case 6:
                case 8:
                case 10:
                    System.out.println("Position: Midfielder");
                    break;
                case 7:
                case 9:
                case 11:
                    System.out.println("Position: Attacker");
                    break;
                default:
                    System.out.println("Unknown position");
            }
        //Task 8
        if (age<=20&&age<=30){
            if (weight_kilo<90.0){
                System.out.println("Player is in good shape");
                System.out.println("Player in starting 11");
            }
            else{
                System.out.println("Player has a problem");
                System.out.println("Player on the bench");
            }
        }
        else{
            System.out.println("Player has a problem");
            System.out.println("Player in reserves");
        }  
        // Task 9 
        String decision = (eligible) ? "Play" : "Rest";
        System.out.println("Player will " + decision);
        scan.close();
    }
}