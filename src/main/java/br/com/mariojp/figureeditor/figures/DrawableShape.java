package br.com.mariojp.figureeditor.figures;

import java.awt.Point;
import java.awt.Shape;

public interface DrawableShape {
	
	Shape create(Point p, int size);

}
