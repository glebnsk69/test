import javax.swing.*;
import java.awt.*;
import java.awt.image.ImageObserver;
import java.io.FileNotFoundException;

public class Master {
private static Master instance;

    public Image image;
    public Image tmp;


    public static synchronized Master getInstance() {
        if(instance==null) instance =new Master();
        return instance;
    }

    public Master() {
        System.out.println("Load imagr");
        this.image = new ImageIcon("src/resources/tekstura.jpg").getImage();
        this.tmp = image.getScaledInstance(800,600,0);
        if(this.image==null) System.out.println("load error");

    }
    int counter=0;
    public void render(Graphics graphics){
//        System.out.println("render");
        //graphics.drawOval(0,0,200,200);

        counter++;
        if(counter%1==0)
            //graphics.drawImage(image.getScaledInstance(100,100,0), 0, 0, 800,600,0,0, image.getWidth(null), image.getHeight(null),null);
        {

            if(tmp==null) System.out.println("tmp == null");
            graphics.drawImage(tmp, 0, 0,null);
        }

        if(counter>image.getWidth(null)) counter=0;
//        drawImage(image,0, 100, 0, 100,100, 0, 0, 100, null);


    }
}
