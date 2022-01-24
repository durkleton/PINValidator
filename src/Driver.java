import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String pin;
        PINValidator pv;

        System.out.print("Please enter a valid pin: ");
        pin = in.nextLine();

        pv = new PINValidator(pin);
        System.out.println("PIN Validity: " + pv.validate());
    }
    
}
