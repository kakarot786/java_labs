import java.util.Scanner;

class Operations {

    double[][] matrix;

    public Operations(double[][] m){
        matrix = m;
    }

     double[][] fillMatrix() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j <= matrix.length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        return matrix;
    }
     double[][] minusRows(int row1, int row2, double multiplier){
         double mul = Math.abs(multiplier);

        if(mul == 1){
            for (int i = 0; i <= matrix.length; i++){
                matrix[row1][i] = matrix[row1][i] - matrix[row2][i];
            }
        }
        else {
            for (int i = 0; i <= matrix.length; i++){
                matrix[row1][i] = (matrix[row1][i]) - (mul * matrix[row2][i]);
            }
        }
        return matrix;
    }
    double[][] addRows(int row1, int row2,double multiplier){
        double mul = Math.abs(multiplier);
        if(mul == 1){
            for (int i = 0; i <= matrix.length; i++){
                matrix[row1][i] = matrix[row1][i] + matrix[row2][i];
            }
        }
        else {
            for (int i = 0; i<= matrix.length; i++){
                matrix[row1][i] = matrix[row1][i] + (mul * matrix[row2][i]);
            }
        }
        return matrix;
    }
    double[][] interchangeRows(int row1, int row2){
        for (int i = 0; i <= matrix.length; i++){
            double temp;
            temp = matrix[row1][i];
            matrix[row1][i] = matrix[row2][i];
            matrix[row2][i] = temp;
        }
        return matrix;
    }
    void printMatrix(){
        for (double[] a: matrix){
            for(double element:a){
                System.out.printf("%f  ",element);
            }
            System.out.println();
        }
    }

    double[][] divideRow(int row){
        double divisor = matrix[row][row];
        for (int i = 0; i <= matrix.length; i++){
            matrix[row][i] = (matrix[row][i])/divisor;
        }
        return matrix;
    }

    double[][] method(int row, int col){
        int interchangeable = 1;
        if(row == 0){
            interchangeable = 0;
        }

        if(matrix[row][col] != 1){
            //for the first row only
            if (interchangeable == 0){
                for (int i = row+1; i < matrix.length; i++){
                    if(matrix[i][col] == 1){
                        matrix = interchangeRows(i,row);
                        interchangeable += 2;
                        break;
                    }

                }
            }
            //for 1st and other rows
            if (interchangeable <= 1){
                matrix = divideRow(row);
            }

        }
            for (int i = row+1; i< matrix.length; i++){
                if (matrix[i][col] < 0){ // If below 2 values are negative

                    matrix = addRows(i,row,matrix[i][col]);

                }
                else if(matrix[i][col] > 0){
                    matrix = minusRows(i,row,matrix[i][col]);
                }
            }
        return matrix;
    }
}
public class Echelon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please Enter the size of matrix:");
        int size = sc.nextInt();
        double[][] matrix = new double[size][size+1];
        Operations op = new Operations(matrix);
        System.out.println("Please enter the value of matrix row-wise:");
        matrix = op.fillMatrix();

        for (int i = 0; i < matrix.length; i++){
            matrix = op.method(i,i);
        }
        op.printMatrix();
        }

    }
