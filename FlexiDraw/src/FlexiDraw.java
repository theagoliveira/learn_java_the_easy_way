import javax.swing.JFrame;
import java.awt.Dimension;

public class FlexiDraw extends JFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Thiago's FlexiDraw App");
        frame.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        frame.getContentPane().add(new BubblePanel());
        frame.setSize(new Dimension(600, 400));
        frame.setVisible(true);
    }
}
