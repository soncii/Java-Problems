package com.epam.rd.autotasks;

class Spiral {
    static int[][] spiral(int rows, int columns) {
        int i, k = 0, l = 0;
        int cnt = 1;
        int[][] a = new int[rows][columns];
        while (k < rows && l < columns) {
            for (i = l; i < columns; ++i) {
                a[k][i] = cnt;
                cnt++;
            }
            k++;

            for (i = k; i < rows; ++i) {
                a[i][columns - 1] = cnt;
                cnt++;
            }
            columns--;

            if (k < rows) {
                for (i = columns - 1; i >= l; --i) {
                    a[rows - 1][i] = cnt;
                    cnt++;
                }
                rows--;
            }

            if (l < columns) {
                for (i = rows - 1; i >= k; --i) {
                    a[i][l] = cnt;
                    cnt++;
                }
                l++;
            }
        }
        return a;
    }
}
