package impl.drawers;

import impl.matrixes.Matrix;

public interface IDrawer {
    void drawElement(Matrix matrix, Number element);
    void drawOuterBorder(Matrix matrix, int width, int height);
    void drawElementsBorder(Matrix matrix, Number element);
    void drawMatrixType(Matrix matrix, String type);
    void drawSpace(Matrix matrix);
    void drawEmptyValue(Matrix matrix);
}
