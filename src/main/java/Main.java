import drawingUI.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Main {
    static GraphicsConfiguration gc;

    public static void main(String[] args) {
        JFrame frame = new JFrame(gc);
        frame.setSize(500, 600);

        DrawingUIController drawingUIController = new DrawingUIController();
        frame.add(drawingUIController.getMainPanel());
        frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter() {	// Closes the program if close window clicked
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });
    }
}