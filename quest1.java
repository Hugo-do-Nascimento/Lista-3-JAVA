/*LISTA 3 - QUESTÃO 1 java
Faça um programa que preecha uma matriz M (2 x 2), calcule e mostre a 
matriz resultante da multiplicação dos elementos de M pelo seu maior 
elemento.*/
import java.util.*;
public class quest1 {
    static Scanner ler = new Scanner(System.in);
    public static void main(String[] args) {

        double[][] matriz = new double[2][2];

        System.out.println("Preenchimento da matriz");
        preencher(matriz);

        System.out.println("Exibição da matriz.");
        exibir(matriz);

        double maiorElemento = EncontrarMaior(matriz);
        double[][] matrizResultante = multiMaiorElem(matriz, maiorElemento);

        System.out.println("Exibição da matriz resultante:");
        exibir(matrizResultante);
    }

    public static void preencher(double[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print("Digite o elemento " + (i+1) +" da matriz: ");
                mat[i][j] = ler.nextDouble();
            }
        }
    }

    public static void exibir(double[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                 System.out.print(mat[i][j] + " ");
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static double EncontrarMaior(double[][] mat) {
        double maior = mat[0][0];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] > maior) {
                    maior = mat[i][j];
                }
            }
        }
        return maior;
    }

    public static double[][] multiMaiorElem(double[][] mat, double maior) {
        double[][] resultado = new double[mat.length][mat[0].length];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                resultado[i][j] = mat[i][j] * maior;
            }
        }
        return resultado;
    }
}