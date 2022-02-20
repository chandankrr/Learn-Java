package com.ChandanKrr;

import java.util.Scanner;

class Matrix {
    int row;
    int col;
    int[][] arr;

    public Matrix(int row, int col) {
        this.row = row;
        this.col = col;
        arr = new int[row][col];
    }

    public int getRows() {
        return row;
    }

    public int getColumns() {
        return col;
    }

    public int getElement(int r, int c) {
        return arr[r][c];
    }

    public void setElement(int r, int c, int value) {
        arr[r][c] = value;
    }

    public static Matrix add(Matrix a, Matrix b) {
        if ((a.row != b.row) || (a.col != b.col)) {
            System.out.println("Matrices cannot be added");
            return new Matrix(0, 0);
        } else {
            Matrix m = new Matrix(a.row, a.col);
            for (int i = 0; i < m.row; i++) {
                for (int j = 0; j < m.col; j++) {
                    m.setElement(i, j, (a.getElement(i, j) + b.getElement(i, j)));
                }
            }
            return m;
        }

    }

    public static Matrix multiplication(Matrix a, Matrix b) {
        Matrix m = new Matrix(a.row, b.col);
        for (int i = 0; i < a.row; i++) {
            for (int j = 0; j < b.col; j++) {
                int s = 0;
                for (int k = 0; k < a.col; k++) {
                    s = s + (a.getElement(i, k) * b.getElement(k, j));
                }
                m.setElement(i, j, s);
            }
        }
        return m;
    }

    public void printMatrix() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + "   ");
            }
            System.out.println();
        }
    }
}

public class MST_Question2 {
    public static void main(String[] args) {
        Matrix m1 = new Matrix(2, 2);
        Matrix m2 = new Matrix(2, 2);


        Scanner input = new Scanner(System.in);

        System.out.println("Enter " + (m1.row * m1.col) + " elements for matrix 1");
        System.out.print("Enter element: ");
        for (int i = 0; i < m1.getRows(); i++) {
            for (int j = 0; j < m1.getColumns(); j++) {
                m1.arr[i][j] = input.nextInt();
            }
        }
        System.out.println("Elements of matrix 1");
        m1.printMatrix();

        System.out.println("\nEnter " + (m2.row * m2.col) + " elements for matrix 2");
        System.out.print("Enter element: ");
        for (int i = 0; i < m2.getRows(); i++) {
            for (int j = 0; j < m2.getColumns(); j++) {
                m2.arr[i][j] = input.nextInt();
            }
        }
        System.out.println("Elements of matrix 2");
        m2.printMatrix();

       // addition of two matrix
        Matrix m = Matrix.add(m1, m2);
        System.out.println("\nAddition of Matrix 1 and 2");
        m.printMatrix();

        // multiplication of two matrix
        Matrix n = Matrix.multiplication(m1,m2);
        System.out.println("\nMultiplication of matrix 1 and 2");
        n.printMatrix();

        input.close();
    }

}
