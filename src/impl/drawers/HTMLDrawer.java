package impl.drawers;

import impl.matrixes.Matrix;

public class HTMLDrawer implements IDrawer {

    @Override
    public void drawElement(Matrix matrix, Number element) {
       System.out.print("<td>" + element + "</td>");
    }

    @Override
    public void drawOuterBorder(Matrix matrix, int width, int height) {
        System.out.print("HTML Draw border");
    }

    @Override
    public void drawElementsBorder(Matrix matrix, Number element) {
        System.out.print("H");
    }

    @Override
    public void drawMatrixType(Matrix matrix, String type) {
        System.out.print("H." + type);
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
