package shapes;

import java.awt.*;

public class Circle extends Shape {
    private final int radius;

    public Circle(int radius, Point position, Color color) {
        super(position, color);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public Point getPosition() {
        return position;
    }

    public void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(getPosition().x - getRadius(), getPosition().y - getRadius(), 2 * getRadius(), 2 * getRadius());


    }
}