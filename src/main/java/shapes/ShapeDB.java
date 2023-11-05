package shapes;

import java.awt.*;
import java.util.ArrayList;

public class ShapeDB {
    private ArrayList<Shape> shapes = new ArrayList<>();

    void addCircle(Circle circle) {
        shapes.add(circle);
    }
    void addSquare(Square square) {
        shapes.add(square);
    }
    void addRect(Rect rect) {
        shapes.add(rect);
    }

    void drawShapes(Graphics g) {
        for (Shape shape : shapes) {
            shape.draw(g);
        }
    }
}