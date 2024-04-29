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
import java.util.ArrayList;

public class Extrato {
    private double saldo;
    private ArrayList<Double> transacoes;

    public Extrato() {
        saldo = 0.0;
        transacoes = new ArrayList<>();
    }

    public void transacao(double valor) {
        if (saldo + valor >= 0.0) {
            saldo += valor;
            transacoes.add(valor);
        }
    }

    public String toString() {
        String str = "================\n";
        for (int i = 0; i < transacoes.size(); i++) {
            str += (i + " : " + transacoes.get(i) + "\n");
        }
        // for (Double double1 : transacoes) {
        //     str += (double1 + "\n");          
        // }
        str += ("Saldo: " + saldo + "\n================\n");
        return str;
    }
}