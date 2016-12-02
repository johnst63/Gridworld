import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 * Created by Sheolfire on 12/1/2016.
 */
public class GridPanel extends JPanel implements ActionListener {
    private Timer timer = new Timer(1000, this);
    private ArrayList<JLabel> gridText;
    private int rows;
    private int columns;
    public GridPanel() {
        timer.start();

        rows = 40;
        columns = 40;
        this.setLayout(new GridLayout(rows, columns));
        this.setBackground(Color.black);

        gridText = new ArrayList<JLabel>();


        for(int i = 0; i < rows*columns; i++) {
            JLabel label = new JLabel("X");
            label.setForeground(Color.green);
            gridText.add(label);
            this.add(gridText.get(i));
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == timer) {
            repaint();
        }

    }

    /**
     * Modify a cell in the grid. simulates 2D array
     * @param text the text to set the cell to
     * @param i the cell row
     * @param j the cell column
     */
    public void modifyText(String text, int i, int j) {
        gridText.get(i+j*columns).setText(text);
    }

    /**
     * Modify a cell in the grid.
     * @param text the text to set the cell to
     * @param index the index of the row
     */
    public void modifyText(String text, int index) {
        gridText.get(index).setText(text);
    }


}
