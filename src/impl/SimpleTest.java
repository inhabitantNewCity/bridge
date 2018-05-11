package impl;

import impl.drawers.ConsoleDrawer;
import impl.drawers.GraphicDrawer;
import impl.drawers.HTMLDrawer;
import impl.drawers.IDrawer;
import impl.matrixes.Matrix;
import impl.matrixes.DenseMatrix;
import impl.matrixes.SparseMatrix;

public class SimpleTest {
    public static void main(String[] args) {
        Number[][] elements = {{1,0,3},{3,0,1}, {0,1,3}};
        IDrawer drawer = new HTMLDrawer();
        Matrix matrix = new DenseMatrix(elements, 9,9, drawer);

        matrix.drawTypeMatrix();
        matrix.drawMatrix();

        drawer = new GraphicDrawer();
        matrix.setDrawer(drawer);
        matrix.drawMatrix();

        drawer = new ConsoleDrawer();
        matrix.setDrawer(drawer);
        matrix.drawMatrix();

        drawer = new HTMLDrawer();
        matrix = new SparseMatrix(elements, 9,9, drawer);

        matrix.drawTypeMatrix();
        matrix.drawMatrix();

        drawer = new GraphicDrawer();
        matrix.setDrawer(drawer);
        matrix.drawMatrix();

        drawer = new ConsoleDrawer();
        matrix.setDrawer(drawer);
        matrix.drawMatrix();
    }
}
