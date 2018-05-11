package impl.matrixes;

import impl.drawers.IDrawer;

public class DenseMatrix extends Matrix {

    public DenseMatrix(Number[][] elements, int width, int height, IDrawer driver) {
        super(elements, width, height, driver);
    }

    @Override
    public void drawMatrix() {
         drawer.drawOuterBorder(this, this.width, this.height);
         drawer.drawSpace(this);
         Number[][] elements = (Number[][]) this.elements;
         for(int i = 0; i < elements.length; i++){
             for(int j = 0; j < elements[i].length; j++){
                 drawer.drawElementsBorder(this, elements[i][j]);
                 drawer.drawElement(this, elements[i][j]);
             }
             drawer.drawSpace(this);
         }

    }

    @Override
    public void drawTypeMatrix() {
        drawer.drawMatrixType(this, "Dense Matrix");
        drawer.drawSpace(this);
    }

}
