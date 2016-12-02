import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created by Sheolfire on 12/1/2016.
 */
public class Driver {
    private static final Dimension DEFAULT_SCREEN_DIM = new Dimension(1000, 1000);
    public static void main(String[] args) {
        GridPanel grid = new GridPanel();
        JFrame frame = new JFrame();
        frame.setSize(DEFAULT_SCREEN_DIM);
        frame.setVisible(true);
        frame.add(grid);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                System.exit(0);
            }
        });


    }
}
