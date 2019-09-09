import java.util.Scanner;

public class NauticalMiles {

    public static void main(String[] args){

        final double NM_TO_MILES = 1.150779;
        final double NM_TO_KILO = 1.852;
        double userInputNM;
        double nauticalToMiles;
        double nauticalToKilo;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("How many nautical miles are there? >>> ");
        userInputNM = keyboard.nextDouble();

        nauticalToMiles = userInputNM * NM_TO_MILES;
        nauticalToKilo = userInputNM * NM_TO_KILO;

        System.out.println("The number of miles is " + nauticalToMiles + " with " +
                nauticalToKilo + " number of kilos. ");

    }
}
