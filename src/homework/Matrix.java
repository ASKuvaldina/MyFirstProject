package homework;

public class Matrix implements IMatrix {

    private double[][] numbers;

    public Matrix(int row, int column) {
        numbers = new double[row][column];

    }


    @Override
    public int getRows() {
        return numbers.length;
    }

    @Override
    public int getColumns() {
        return numbers[0].length;
    }

    @Override
    public double getValueAt(int rowIndex, int colIndex) throws IndexOutOfBoundsException {
        return numbers[rowIndex][colIndex];


    }

    @Override
    public void setValueAt(int rowIndex, int colIndex, double value) throws IndexOutOfBoundsException {
        numbers[rowIndex][colIndex] = value;


    }

    @Override
    public IMatrix add(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {

        if (this.getRows() != otherMatrix.getRows()) {
            System.out.println("Кол-во строк не совпадает:(");
            return null;
        }
        if (this.getColumns() != otherMatrix.getColumns()) {
            System.out.println("Кол-во колонок не совпадает");
            return null;
        }

        Matrix result = new Matrix(otherMatrix.getRows(), otherMatrix.getColumns());
        for (int i = 0; i < otherMatrix.getRows(); i++) {
            for (int j = 0; j < otherMatrix.getColumns(); j++) {
                double value = this.getValueAt(i, j) + otherMatrix.getValueAt(i, j);
                result.setValueAt(i, j, value);
            }

        }
        return result;
    }

    @Override
    public IMatrix sub(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        if (this.getRows() != otherMatrix.getRows()) {
            System.out.println("Кол-во строк не совпадает:(");
            return null;
        }
        if (this.getColumns() != otherMatrix.getColumns()) {
            System.out.println("Кол-во колонок не совпадает");
            return null;
        }

        Matrix result = new Matrix(otherMatrix.getRows(), otherMatrix.getColumns());
        for (int i = 0; i < otherMatrix.getRows(); i++) {
            for (int j = 0; j < otherMatrix.getColumns(); j++) {
                double value = this.getValueAt(i, j) - otherMatrix.getValueAt(i, j);
                result.setValueAt(i, j, value);
            }

        }
        return result;
    }

    @Override
    public IMatrix mul(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {

        if (this.getColumns() != otherMatrix.getRows()) {
            System.out.println("Кол-во столбцов первой матрицы и кол-во строк второй матрицы не совпадает");
            return null;
        }

        Matrix result = new Matrix(this.getRows(), otherMatrix.getColumns());
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < otherMatrix.getColumns(); j++) {
                for (int s = 0; s < this.getColumns(); s++) {

                    double value = result.getValueAt(i, j) + this.getValueAt(i, s) * otherMatrix.getValueAt(s, j);
                    result.setValueAt(i, j, value);
                }
            }

        }
        return result;

    }

    @Override
    public IMatrix mul(double value) {


        Matrix result = new Matrix(this.getRows(), this.getColumns());
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                double res = this.getValueAt(i, j) * value;
                result.setValueAt(i, j, res);
            }

        }
        return result;

    }

    @Override
    public IMatrix transpose() {
        Matrix result = new Matrix(this.getRows(), this.getColumns());
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                double res = this.getValueAt(i, j);
                result.setValueAt(j, i, res);
            }

        }
        return result;

    }

    @Override
    public void fillMatrix(double value) {
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                numbers[i][j] = value;
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }

    }

    @Override
    public double determinant() {
        return 0;
    }

    @Override
    public boolean isNullMatrix() {
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                if (numbers[i][j] != 0) {
                    return false;
                }
            }

        }
        return true;
    }

    @Override
    public boolean isIdentityMatrix() {
        if (this.getColumns() != this.getColumns()) {
            return false;
        }
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                if (i == j) {
                    if (numbers[i][j] != 1) {
                        return false;
                    }
                } else {
                    if (numbers[i][j] != 0) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    @Override
    public boolean isSquareMatrix() {
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                if (this.getColumns() != this.getRows()) {
                    return false;
                }
            }

        }
        return true;


    }

    @Override
    public void printToConsole() {
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}

