
import javax.swing.JButton; //imports JButton library
import java.awt.GridLayout; //imports GridLayout library
import javax.swing.JFrame;

public class GUIDraft {

    public static JFrame frame;
    public static JButton[][] button;

    public static void main(String[] args) {
        //CALL OUR GET GRIDSIZE X AND Y METHOD HERE AND PASS IT IN
        createGrid(9, 9);
    }

    public static void createGrid(int len, int wid) {
        frame = new JFrame("BattleShip");
        frame.setLayout(new GridLayout(len, wid));
        button = new JButton[len][wid];

        for (int x = 0; x < len; x++) {
            for (int y = 0; y < wid; y++) {
                button[x][y] = new JButton("[O]");
                frame.add(button[x][y]);
            }
        }

        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
//Here is my own code.
