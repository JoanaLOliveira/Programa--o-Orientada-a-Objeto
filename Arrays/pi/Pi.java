/*  
Vamos fazer um programa que calcule π2/6 através da fórmula acima Para isso:
 -  Escreva no método main o código para calcular os primeiros 1 milhão de 
    elementos do somatório acima e armazená-los em um array termosDaSerie
 -  Escreva também o método calculaEMostraSomatoria para calcular e imprimir 
    a soma dos num primeiros elementos de um array
 -  Por fim, utilize o método main para chamar o método calculaEMostraSomatoria 
    passando o array termosDaSerie e crescentes valores de num (10, 100, …, 1000000)
 -  Os valores obtidos se aproximam da resposta exata (1.64493406685)?
 */


package Arrays.pi;

public class Pi {
    public static void main(String[] args) {
        double[] termosDaSerie = new double[1000000];

        for (int i = 0; i < termosDaSerie.length; i++){
            termosDaSerie[i] = 1.0/Math.pow(i+1, 2);
        }

        for (int i = 10; i <= 1000000; i*=10) {
            calculaEMostraSomatoria(i, termosDaSerie);
        }
    }

    public static void calculaEMostraSomatoria(int num, double[] array){
        double soma = 0.0;
        for (int i = 0; i < num; i++) {
            soma += array[i];
        }
        System.out.println(soma);
    }
}
