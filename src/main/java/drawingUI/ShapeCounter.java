package drawingUI;

import javax.swing.*;
import java.awt.*;

public class ShapeCounter extends JPanel {
    private JLabel circleCountLabel;
    private JLabel squareCountLabel;
    private JLabel rectCountLabel;

    private int circleCount = 0;
    private int squareCount = 0;
    private int rectCount = 0;

    public ShapeCounter() {
        setLayout(new GridLayout(6, 1)); // 3 rows, 2 columns

        // Initialize the labels
        circleCountLabel = new JLabel("Circles: 0");
        squareCountLabel = new JLabel("Squares: 0");
        rectCountLabel = new JLabel("Rectangles: 0");

        // Add labels to this panel
        add(circleCountLabel);
        add(squareCountLabel);
        add(rectCountLabel);
    }

    public void addCircle() {
        circleCount++;
        circleCountLabel.setText("Circles: " + circleCount);
    }

    public void addSquare() {
        squareCount++;
        squareCountLabel.setText("Squares: " + squareCount);
    }

    public void addRect() {
        rectCount++;
        rectCountLabel.setText("Rectangles: " + rectCount);
    }

    // Getters if you need to retrieve the counts
    public int getCircleCount() {
        return circleCount;
    }

    public int getSquareCount() {
        return squareCount;
    }

    public int getRectCount() {
        return rectCount;
    }
}
