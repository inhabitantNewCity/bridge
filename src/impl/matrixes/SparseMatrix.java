package impl.matrixes;

import impl.drawers.IDrawer;
// zero element shouldn't be drown (use space)
public class SparseMatrix extends Matrix {

    public SparseMatrix(Object elements, int width, int height, IDrawer drawer) {
        super(elements, width, height, drawer);
    }

    @Override
    public void drawMatrix() {
        drawer.drawOuterBorder(this, this.width, this.height);
        drawer.drawSpace(this);
        Number[][] elements = (Number[][]) this.elements;
        for(int i = 0; i < elements.length; i++){
            for(int j = 0; j < elements[i].length; j++){
                if(!elements[i][j].equals(0)) {
                    drawer.drawElementsBorder(this, elements[i][j]);
                    drawer.drawElement(this, elements[i][j]);
                } else {
					drawer.drawElementsBorder(this, elements[i][j]);
                    drawer.drawEmptyValue(this);
				}
            }
            drawer.drawSpace(this);
        }
    }

    @Override
    public void drawTypeMatrix() {
        drawer.drawMatrixType(this, "Sparse Matrix");
        drawer.drawSpace(this);
    }
}
