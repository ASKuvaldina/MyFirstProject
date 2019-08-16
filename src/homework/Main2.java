package homework;

public class Main2 {
    public static void main(String[] args) {
        Matrix matrix1 = new Matrix(3,3);
        matrix1.setValueAt(0,0,3.0);
        matrix1.setValueAt(0,1,5.0);
        matrix1.setValueAt(0,2,7.0);

        matrix1.setValueAt(1,0,2.0);
        matrix1.setValueAt(1,1,-1.0);
        matrix1.setValueAt(1,2,0.0);

        matrix1.setValueAt(2,0,4.0);
        matrix1.setValueAt(2,1,3.0);
        matrix1.setValueAt(2,2,2.0);

        Matrix matrix2 = new Matrix(3,3);
        matrix2.setValueAt(0,0,1.0);
        matrix2.setValueAt(0,1,2.0);
        matrix2.setValueAt(0,2,4.0);

        matrix2.setValueAt(1,0,2.0);
        matrix2.setValueAt(1,1,3.0);
        matrix2.setValueAt(1,2,-2.0);

        matrix2.setValueAt(2,0,-1.0);
        matrix2.setValueAt(2,1,0.0);
        matrix2.setValueAt(2,2,1.0);

       IMatrix result = matrix1.add(matrix2);
       result.printToConsole();
        System.out.println();
        IMatrix resultSub = matrix1.sub(matrix2);
        resultSub.printToConsole();
        System.out.println();
        IMatrix resultMul = matrix1.mul(matrix2);
        resultMul.printToConsole();
        System.out.println();
        IMatrix resultMulChis = matrix1.mul(4);
        resultMulChis.printToConsole();
        System.out.println();
        IMatrix resultT = matrix1.transpose();
        resultT.printToConsole();
        System.out.println();
        matrix1.fillMatrix(4);
        System.out.println();
        System.out.println(matrix1.isNullMatrix());
        System.out.println();
        System.out.println(matrix1.isSquareMatrix());


    }
}
