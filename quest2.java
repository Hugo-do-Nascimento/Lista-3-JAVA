/*2.Escreva um programa querecebe uma matriz 3 ×4 com números reais e retorne:
    a.A soma dos elementos de cada linha;
    b.A soma dos elementos de cada coluna.
*/

import java.util.*;
public class quest2 {
    static Scanner ler = new Scanner(System.in);
    public static void main(String[] args) {

        double[][] matriz = new double[3][4];

        System.out.println("Preenchimento da matriz");
        preencher(matriz);

        exibir(matriz);

        exibeSomaLinha(matriz);

        exibeSomaColuna(matriz);


    }

    public static void preencher(double[][] mat) {
        for (int i =0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print("Matriz [" + (i+1) + "][" + (j+1) + "]: ");
                mat[i][j] = ler.nextDouble();
            }
        }
    }

    public static void exibir(double[][] mat) {
        for (double[] mat1 : mat) {
            for (int j = 0; j < mat1.length; j++) {
                System.out.print(mat1[j] + " ");
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void exibeSomaLinha(double[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            double somaLinha = 0;
            for (int j = 0; j < mat[i].length; j++) {
                somaLinha += mat[i][j];
            }
            
        }
        System.out.println();
    }

    public static void exibeSomaColuna(double[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            double somaColuna = 0;
            for (int j = 0; j < mat[i].length; j++) {
                somaColuna += mat[i][j];
            }
            System.out.println("Coluna "+ (i + 1) +": " + somaColuna);
        }
        System.out.println();
    }
}