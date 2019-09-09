import java.util.Scanner;

public class MadLibs {
    public static void main(String[] args){
        String color;
        String WordEst;
        String BodyPart;
        String Animal;
        String Noun;
        String PluralNoun;

        int a;
        int b;
        int c;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a color >>>");
        color = input.nextLine();
        System.out.println("Enter a Word ending in EST >>>");
        WordEst = input.nextLine();
        System.out.println("Enter a plural body part >>>");
        BodyPart = input.nextLine();
        System.out.println("Enter a animal >>>");
        Animal = input.nextLine();
        System.out.println("Enter a Noun >>>");
        Noun = input.nextLine();
        System.out.println("Enter a plural Noun >>>");
        PluralNoun = input.nextLine();

        c = a%b;

        System.out.println("The " + color + " Dragon is the " + WordEst + " Dragon of all. ");
        System.out.println("It has " + BodyPart + " ,and a " + Animal + " shaped like a " + Noun + " . ");
        System.out.println(" It loves to eat " + PluralNoun + " , although it will feast on nearly anything. ");

    }
}