import java.util.Scanner;

public class InchesToFeet {

    public static void main(String[] args){

        int inches = 86;
        int feet = inches / 12;
        int INCHES_TO_FEET = inches % 12;

        Scanner input = new Scanner(System.in);

        System.out.println("number of feet is " + feet);

        System.out.println("left over inches are " + INCHES_TO_FEET);

    }
}
