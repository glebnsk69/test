import javax.swing.*;

public class ImageTest {
    public static void main(String[] args) {
        JFrame frame = new JFrame("ImageTest");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setResizable(false);
        frame.add(new MyFrame(frame));
        frame.setVisible(true);
    }

}
