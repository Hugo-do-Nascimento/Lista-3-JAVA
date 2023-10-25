/* 3.Elabore um programa que preencha uma matriz 10 ×10 com números reais, 
execute as trocas especificadas a seguir e mostre a matriz resultante: 
a.A linha 2 com a linha 8; 
b.A coluna 4 com a coluna 10; 
c.A diagonal principal com a diagonal secundária; 
d.A linha 5 com a coluna 10.*/
import java.util.*;
public class quest3 {
    static Scanner ler = new Scanner(System.in);
    public static void main(String[] args) {

        double[][] matriz = new double[10][10];

        System.out.println("Preenchimento da matriz:");
        preencher(matriz);

        System.out.println("Exibição da matriz:");
        exibir(matriz);

        
    }

    public static void preencher(double[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print("Matriz [" + (i + 1) + "][" + (j + 1) + "]: ");
                mat[i][j] = ler.nextDouble();
            }
            System.out.println();
        }
    }

    public static void exibir(double[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j]+"  ");
            }
        }
    }
}
