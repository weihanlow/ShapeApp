package shapes;

import java.awt.*;

public class Rect extends Shape {
    private final int width;
    private final int height;

    public Rect(int width, int height, Point position, Color color) {
        super(position, color);
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public Point getPosition() {
        return position;
    }

    public void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(getPosition().x, getPosition().y, getWidth(), getHeight());
    }
}

