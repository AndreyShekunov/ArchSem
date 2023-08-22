package homework1.ModelElements;

import homework1.Stuff.Angle3D;
import homework1.Stuff.Point3D;

import java.awt.*;

// Класс источников света
public class Flash {
    public Point3D Location;
    public Angle3D Angle;
    public Color Color;
    public float Power;

    // поворот источников света
    public void Rotate(Angle3D angle){}

    // перемещение к точке
    public void Move(Point3D point){}
}
