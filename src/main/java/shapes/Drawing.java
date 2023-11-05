package shapes;

import shapes.Circle;
import shapes.Rect;
import shapes.Shape;

import java.awt.*;
import java.util.ArrayList;


public class Drawing extends Canvas {

    private ShapeDB shapeDB;

    public Drawing(ShapeDB shapeDB) {
        this.shapeDB = shapeDB;
        setBackground(Color.WHITE);
    }

    public void paint(Graphics g) {
        shapeDB.drawShapes(g);
    }
    // Methods in Drawing that call the appropriate method in ShapeDB
    public void addCircleDB(Circle circle) {
        shapeDB.addCircle(circle);
    }

    public void addRectDB(Rect rect) {
        shapeDB.addRect(rect);
    }

    public void addSquareDB(Square square) {
        shapeDB.addSquare(square);
    }

}