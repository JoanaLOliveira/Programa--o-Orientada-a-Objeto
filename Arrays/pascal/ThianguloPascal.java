/* Escreva uma classe executável cujo método principal apresente 
o triângulo de pascal
 -  O triângulo de Pascal é uma série de valores onde cada elemento 
        pode ser calculado como a soma do elemento acima com o elemento 
        acima e à esquerda
 -  O primeiro e último elementos de cada linha do triângulo são 
        sempre iguais a um
 -  O triângulo de Pascal de cinco linhas é:
    1 1
    1 2 1
    1 3 3  1
    1 4 6  4  1
    1 5 10 10 5 1
    ...
 */

package Arrays.pascal;

import java.util.Scanner;

public class ThianguloPascal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int linhas, colunas;

        System.out.print("Linhas: ");
        linhas = sc.nextInt();
        int[][] triangulo = new int[linhas][];

        for (int linha = 0; linha < linhas; linha++) {
            colunas = linha + 2;
            triangulo[linha] = new int[colunas];
            triangulo[linha][0] = 1;
            triangulo[linha][colunas - 1] = 1;
            for (int c = 1; c < triangulo[linha].length-1; c++) {
                triangulo[linha][c] = triangulo[linha-1][c] + triangulo[linha-1][c-1];
            }
        }

        for (int lin = 0; lin < triangulo.length; lin++) {
            for (int col = 0; col < triangulo[lin].length; col++) {
                System.out.print(triangulo[lin][col] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
