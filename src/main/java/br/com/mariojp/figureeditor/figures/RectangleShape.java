package br.com.mariojp.figureeditor.figures;

import java.awt.Point;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;

public class RectangleShape implements DrawableShape {
	
    @Override
    public Shape create(Point p, int size) {
        return new Rectangle2D.Double(p.x, p.y, size, size);
    }

}
