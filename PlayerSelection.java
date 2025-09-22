import java.util.Scanner;
public class PlayerSelection {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String playerName;
        int playerAge;
        double playerWeight;   
        int Jersenum;
        double height_m;
        System.out.println("Enter player's name: ");
        playerName = scan.nextLine();
        System.out.println("Enter player's age: "); 
        playerAge = scan.nextInt(); 
        System.out.println("Enter player's weight (kg): ");
        playerWeight = scan.nextDouble();
        System.out.println("Enter player's height (meters): ");
        height_m = scan.nextDouble();
        System.out.println("Enter player's jersey number: ");
        Jersenum = scan.nextInt();
        scan.close();
        boolean eligible;
        if (playerAge >= 18 && playerAge <= 35 && playerWeight < 90.0) {
            eligible = true;
            System.out.println("Player is ELIGIBLE for selection.");
        } 
        else {
            eligible = false;
            System.out.println("Player NOT ELIGIBLE for selection.");
        }
        String categ;
        if (playerAge<20){
            categ = "Rising Star";
        }
        else if (playerAge>=20 && playerAge<=35){
            categ = "Prime player";
        }
        else{
            categ = "Veteran";
        }
        String pos;
        switch (Jersenum){
            case 1:
                pos = "Goalkeeper";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
                pos = "Defender";   
                break;
            case 6:
            case 8:
            case 10:
                pos = "Midfielder";
                break;
            case 7:
            case 11:
            case 9:
                pos = "Forward";
                break;
            default:
                pos = "Unknown";
        }
        String AttackStatus;
        switch (pos){
            case "Forward":
                AttackStatus = "Yes";
                break;
            default:
                AttackStatus = "No"; 
        }
        String decision = (categ.equals("Prime player")? "Starting 11": "Benched"); 
        
        System.out.println("\nPlayer Report:");
        System.out.println("\nName - " + playerName); 
        System.out.println("Age - " + playerAge + " yrs, " + categ);
        System.out.println("Weight - "+ playerWeight + " kg");
        System.out.println("Player height - " + height_m*100 + " centimeters");
        System.out.println("Jersey Number - " + Jersenum);
        System.out.println("Player position - " + pos);
        System.out.println("Attacker Jersey - " + AttackStatus);
        System.out.println("Eligibility - " + (eligible ? "Eligible" : "Not Eligible"));
        System.out.println("Lineup decision - " + decision);
        System.out.println("Final decision - " + (eligible ? "Play": "Rest"));
    }
}