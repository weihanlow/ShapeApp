package drawingUI;

import javax.swing.*;
import java.awt.*;

public class SquareDimsSelector extends JPanel {
    private JSlider widthSlider;
    public SquareDimsSelector() {
        JPanel controls=new JPanel();
        controls.setLayout(new GridLayout(3,1));
        JLabel label=new JLabel("Square Side");
        widthSlider=new JSlider(1,100);
        controls.add(label);
        controls.add(widthSlider);
        add(controls);
    }
    public int getCurrentwidth() {
        return widthSlider.getValue();
    }
}
