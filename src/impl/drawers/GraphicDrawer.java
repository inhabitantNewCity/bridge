package impl.drawers;

import impl.matrixes.Matrix;

public class GraphicDrawer implements IDrawer {
    @Override
    public void drawElement(Matrix matrix, Number element) {
        System.out.print("g" + element + "g");
    }

    @Override
    public void drawOuterBorder(Matrix matrix, int width, int height) {
        System.out.print("Graphical Draw border");
    }

    @Override
    public void drawElementsBorder(Matrix matrix, Number element) {
        System.out.print("G");
    }

    @Override
    public void drawMatrixType(Matrix matrix, String type) {
        System.out.print("G." + type);
    }

    @Override
    public void drawSpace(Matrix matrix) {
        System.out.println();
    }

    @Override
    public void drawEmptyValue(Matrix matrix) {
        System.out.print(" ");
    }
}
