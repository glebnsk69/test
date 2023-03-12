import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MovementController extends MouseAdapter {
    private JFrame frame;
    public MovementController(JFrame frame) {
        this.frame = frame;

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        //super.mouseClicked(e);
        frame.getGraphics().drawOval(0,0,e.getX(),e.getY());
        System.out.println(e.getX()+", "+e.getY()+", "+e.getButton());
    }
}
