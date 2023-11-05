package drawingUI;

import javax.swing.*;
import java.awt.*;

public class RectDimsSelector extends JPanel {
    private JSlider widthSlider, heightSlider;
    public RectDimsSelector() {
        JPanel controls = new JPanel();
        controls.setLayout(new GridLayout(3,1));
        JLabel label = new JLabel(" Rect Width and Height");
        widthSlider = new JSlider(1,100);
        heightSlider = new JSlider(1,100);
        controls.add(label);
        controls.add(widthSlider);
        controls.add(heightSlider);
        add(controls);
    }
    public int getCurrentWidth() {
        return widthSlider.getValue();
    }
    public int getCurrentHeight() {
        return heightSlider.getValue();
    }
}

