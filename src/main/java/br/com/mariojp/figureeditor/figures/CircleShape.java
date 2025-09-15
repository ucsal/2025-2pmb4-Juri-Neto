package br.com.mariojp.figureeditor.figures;

import java.awt.Point;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;

public class CircleShape implements DrawableShape {
	
    @Override
    public Shape create(Point p, int size) {
        return new Ellipse2D.Double(p.x, p.y, size, size);
    }

}
