package drawingUI;

import javax.swing.*;
import java.awt.*;

public class CircleDimsSelector extends JPanel {
    private JSlider radiusSlider;
    public CircleDimsSelector() {
        JPanel controls=new JPanel();
        controls.setLayout(new GridLayout(3,1));
        JLabel label=new JLabel(" Circle Radius");
        radiusSlider=new JSlider(1,100);
        controls.add(label);
        controls.add(radiusSlider);
        add(controls);
    }
    public int getCurrentRadius() {
        return radiusSlider.getValue();
    }
}
