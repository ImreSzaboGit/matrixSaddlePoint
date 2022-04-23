package com.matrix;

import org.junit.Test;

import java.util.Objects;

public class MainTest {

    @Test
    public void hasMatrixSaddlePoint1() {
        double[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        Double result = 7.0;
        assert (Objects.equals(Main.hasMatrixSaddlePoint(matrix, 3, 3), result));
    }

    @Test
    public void hasMatrixSaddlePoint2() {
        double[][] matrix = {
                {2, 5, 6},
                {8, 4, 12},
                {12, 24, 2}
        };
        assert (Main.hasMatrixSaddlePoint(matrix, 3, 3) == null);
    }

    @Test
    public void hasMatrixSaddlePoint3() {
        double[][] matrix = {
                {1, 1, 1},
                {1, 1, 1},
                {1, 1, 1}
        };
        Double result = 1.0;
        assert (Objects.equals(Main.hasMatrixSaddlePoint(matrix, 3, 3), result));
    }
}