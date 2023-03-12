import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JPanel implements ActionListener {
    private final Master master;

    public MyFrame(JFrame frame) {
        Timer timer = new Timer(5, this);
        this.master = Master.getInstance();
//        Dimension dim = new Dimension(gameMaster.getMap().getWidth() * SPRITE_SIZE,gameMaster.getMap().getHeight() * SPRITE_SIZE);
        Dimension dim = new Dimension(800,600);
        frame.setPreferredSize(dim);
        frame.pack();
        frame.setLocationRelativeTo(null);
        timer.start();
        System.out.println("GameFrame(JFrame frame)");
//        frame.addKeyListener(new MovementController(gameMaster.getPlayer()));
        //frame.addKeyListener(new MovementController());
        frame.addMouseListener(new MovementController(frame));

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }

    @Override
    public void paint(Graphics g) {
        master.render(g);
    }
}
