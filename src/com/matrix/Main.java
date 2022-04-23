package com.matrix;

import java.io.*;
import java.util.ArrayList;

public class Main {

    static Double hasMatrixSaddlePoint(double[][] matrix, int matrixLines, int matrixColumns)
    {
        for (int i = 0; i < matrixLines; i++)
        {
            int columnIndex = 0;
            double minimumInRow = matrix[i][0];

            for (int j = 1; j < matrixColumns; j++) {
                if (minimumInRow > matrix[i][j]) {
                    minimumInRow = matrix[i][j];
                    columnIndex = j;
                }
            }
            int k;
            for (k = 0; k < matrixColumns; k++) {
                if (minimumInRow < matrix[k][columnIndex]) break;
            }
            if (k == matrixColumns) return minimumInRow;
        }
        return null;
    }

    public static void main(String[] args) throws IOException {
        File file = new File("matrix.txt");
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        String line;
        ArrayList<String[]> lines = new ArrayList<>();
        while ((line = bufferedReader.readLine()) != null){
            lines.add(line.split(" "));
        }

        int matrixLines = lines.size();
        int matrixColumns = lines.get(0).length;
        double[][] matrix = new double[matrixLines][matrixColumns];

        for (int i = 0; i < lines.size(); i++) {
            for (int j = 0; j < lines.get(i).length; j++) {
                matrix[i][j] = Double.parseDouble(lines.get(i)[j]);
            }
        }

        Double result = hasMatrixSaddlePoint(matrix, matrixLines, matrixColumns);
        if (result != null) {
            System.out.println("Nyeregpont: " + result);
        } else {
            System.out.println("Nincs nyeregpont+");
        }
    }
}
