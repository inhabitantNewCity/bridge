package impl.drawers;

import impl.matrixes.Matrix;

public class ConsoleDrawer implements IDrawer {
    @Override
    public void drawElement(Matrix matrix, Number element) {
        System.out.print("c" + element + "c");
    }

    @Override
    public void drawOuterBorder(Matrix matrix, int width, int height) {
        System.out.print("Console Draw border");
    }

    @Override
    public void drawElementsBorder(Matrix matrix, Number element) {
        System.out.print("C");
    }

    @Override
    public void drawMatrixType(Matrix matrix, String type) {
        System.out.print("C." + type);
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
