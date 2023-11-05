package drawingUI;
import shapes.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class DrawingUIController {
    JPanel controlsPanel = new JPanel();
    JPanel mainPanel = new JPanel();
    ShapeDB shapeDB = new ShapeDB();
    Drawing drawing = new Drawing(shapeDB);
    ShapeSelector sSel = new ShapeSelector();
    ColourSelector cSel = new ColourSelector();
    CircleDimsSelector circleDims = new CircleDimsSelector();
    RectDimsSelector rectDims = new RectDimsSelector();
    SquareDimsSelector squareDims = new SquareDimsSelector();
    ShapeCounter shapeCounter = new ShapeCounter();

    public DrawingUIController() {
        // Initialize panels with their respective layouts
        controlsPanel = new JPanel(new GridLayout(3, 2));
        mainPanel = new JPanel(new GridLayout(2, 1));

        mainPanel.add(controlsPanel);
        mainPanel.add(drawing);
        controlsPanel.add(rectDims);
        controlsPanel.add(circleDims);
        controlsPanel.add(squareDims);
        controlsPanel.add(sSel);
        controlsPanel.add(cSel);
        controlsPanel.add(shapeCounter);


        drawing.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
            }

            @Override
            public void mousePressed(MouseEvent e) {

                if (sSel.getCurrentShape().equals("Circle")) {
                Circle circle = new Circle(circleDims.getCurrentRadius(), e.getPoint(), cSel.getCurrentColour());
                drawing.addCircleDB(circle);
                shapeCounter.addCircle();}
                if (sSel.getCurrentShape().equals("Rectangle")) {
                    Rect rect = new Rect(rectDims.getCurrentWidth(), rectDims.getCurrentHeight(), e.getPoint(), cSel.getCurrentColour());
                    drawing.addRectDB(rect);
                shapeCounter.addRect();}
                if (sSel.getCurrentShape().equals("Square")) {
                    Square square = new Square(squareDims.getCurrentwidth(), squareDims.getCurrentwidth(), e.getPoint(), cSel.getCurrentColour());
                    drawing.addRectDB(square);
                shapeCounter.addSquare();}
                drawing.repaint();
            }
            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

    }

    public JPanel getMainPanel() {
        // Return the main panel when this method is called
        return mainPanel;
    }

    // If you need to provide public access to controlsPanel for modification, you can also include:
    public JPanel getControlsPanel() {
        return controlsPanel;
    }


}
