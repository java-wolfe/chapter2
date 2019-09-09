import javax.swing.*;

public class PosterFactory {

    public static void main(String[] args){

        int postersBought;
        int boxesFilled;
        int postersLeftOver;
        final int Box_Limit = 11;
        String postersBoughtString;

        postersBoughtString = JOptionPane.showInputDialog(null, "How many posters order today? ",
                "Order Dialog",JOptionPane.INFORMATION_MESSAGE);
        postersBought = Integer.parseInt(postersBoughtString);

        boxesFilled = postersBought / Box_Limit;
        postersLeftOver = postersBought % Box_Limit;

        JOptionPane.showMessageDialog(null, "The number of boxes filled were " +
                boxesFilled + " with " + postersLeftOver + " posters Left Over");

    }

}
