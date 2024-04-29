/* 
 -  Escreva uma classe para representar o extrato de uma conta bancária
 -  O extrato é composto por transações (depósitos e saques), além do 
    saldo final. As possíveis operações sobre um extrato são a inicialização, 
    a transação e a visualização
 -  Escreva uma classe executável com um menu onde o usuário pode escolher 
    entre depositar, sacar, visualizar o extrato ou encerrar
 -  Após a escolha do usuário, o programa deve realizar a ação solicitada. 
    Caso não tenha sido escolhida opção de encerrar, o menu deve ser 
    apresentado novamente
 */

package Arrays.extrato;

import java.util.Scanner;

public class DemoExtrato {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Extrato ex = new Extrato();
        int op;
        double valor;

        do {
            System.out.println("0 - Visualizar");
            System.out.println("1 - Deposito");
            System.out.println("2 - Saque");
            System.out.println("3 - Encerrar");
            op = sc.nextInt();
            
            switch(op) {
                case 0:
                    System.out.println(ex);
                    break;
                case 1:
                    System.out.print("Valor do deposito: ");
                    valor = sc.nextDouble();
                    ex.transacao(valor);
                    break;
                case 2:
                    System.out.print("Valor do saque: ");
                    valor = sc.nextDouble();
                    ex.transacao(-valor);
                    break;
                case 3:
                    System.out.println("Sistema encerrado");
                    break;
                default:
                    System.out.println("Opcao invalida");
            }
        } while(op != 3);

        sc.close();
    }    
} 