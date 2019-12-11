package com.lista.total;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
public class None {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        Random random = new Random();

        int a = 0;
        int b = 10;


        int randomnumber = a + (int) (Math.random() * b);

        public None() throws IOException {
        }
        //нахождение суммы элементов квадратной матрицы н на н которые лежат ниже главной диагонали
        int main() {

            int[][] array = new int[n][n];
            int bottomSum = 0;

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    array[i][j] = randomnumber;
                }
            }


            for (int i = 1; i < n; i++) {
                for (int j = 0; j < i; j++) {
                    bottomSum += array[i][j];
                }
            }

            return bottomSum;
        }
}
