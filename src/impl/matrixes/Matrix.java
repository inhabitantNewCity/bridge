package impl.matrixes;

import impl.drawers.IDrawer;

public abstract class Matrix {

    protected IDrawer drawer;
    protected Object elements;
    protected int width;
    protected int height;

    public Matrix(Object elements, int width, int height, IDrawer drawer){
        this.elements = elements;
        this.width = width;
        this.height = height;
        this.drawer = drawer;
    }
    public abstract void drawMatrix();
    public abstract void drawTypeMatrix();

    public void setDrawer(IDrawer drawer) {
        this.drawer = drawer;
    }
}
