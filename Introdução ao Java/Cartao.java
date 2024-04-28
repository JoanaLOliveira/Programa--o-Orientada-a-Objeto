import java.util.Calendar;
import java.util.Scanner;

public class Cartao {
    public static void main(String[] args) {
        String nome;
        int num,cod,mes,ano,mesAtual,anoAtual;
        Scanner ent = new Scanner(System.in);
        Calendar calendario= Calendar.getInstance();
        boolean dataInvalida;
        mesAtual = 1 + calendario.get(Calendar.MONTH);
        anoAtual = calendario.get(Calendar.YEAR);

        System.out.println("Nome: ");
        nome = ent.nextLine();
        System.out.println("Numero: ");
        num = ent.nextInt();
        System.out.println("Codigo: ");
        cod = ent.nextInt();

        do {
            System.out.println("Mes da validade: ");
            mes = ent.nextInt();
            System.out.println("Ano da validade: ");
            ano = ent.nextInt();
            dataInvalida = (ano < anoAtual)||(ano==anoAtual && mes < mesAtual);
            if (dataInvalida) {
                System.out.println("Dados Invalidos");
            }
        } while (dataInvalida);

        System.out.println("Dados validos");

        ent.close();
    }
}
