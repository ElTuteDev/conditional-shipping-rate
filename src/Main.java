import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Data input
        System.out.print("Shipping destination (International / National): ");
        var shipping = sc.nextLine().strip().toLowerCase();
        System.out.print("Package weight (Kg): ");
        var weight = Double.parseDouble(sc.nextLine());

        // Shipping Rate
        final int nationalRate = 10;
        final int internationalRate = 20;

        //Conditional
        if (shipping.equals("national")){
            var nationalCalc = nationalRate * weight;
            System.out.println("You national shipping cost is: $" + nationalCalc);
        }
        else if (shipping.equals("international")) {
            var internationalCalc = internationalRate * weight;
            System.out.println("You international shipping cost is: $" + internationalCalc);
        }
        else{
            System.out.println("Invalid data");
        }
    }
}