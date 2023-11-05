package drawingUI;

import javax.swing.*;

public class ShapeSelector extends JPanel {
    JRadioButton bCirc = new JRadioButton("Circle");
    JRadioButton bRect = new JRadioButton("Rectangle");
    JRadioButton bSquare = new JRadioButton("Square");
    ButtonGroup shapesGroup = new ButtonGroup();

    public ShapeSelector() {
        // Add radio buttons to the ButtonGroup
        shapesGroup.add(bCirc);
        shapesGroup.add(bRect);
        shapesGroup.add(bSquare);

        // Set Circle to be selected by default
        bCirc.setSelected(true);

        // Add radio buttons to the panel
        add(bCirc);
        add(bRect);
        add(bSquare);
    }

    public String getCurrentShape() {
        if (bCirc.isSelected()) {
            return "Circle";
        } else if (bRect.isSelected()) {
            return "Rectangle";
        } else if (bSquare.isSelected()) {
            return "Square";
        } else {
            return "No shape selected"; // or some default value
        }
    }
}
