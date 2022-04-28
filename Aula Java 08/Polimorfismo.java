public class Polimorfismo{
    public static void main(String[] args){

        ProdutoPerecivel pp = new ProdutoPerecivel();
        pp.descricao = "Abacate";
        pp.dataValidade = "27/04/2022";
        imprimir(pp);

        System.out.println("-------------------------------");

        ProdutoNaoPerecivel pnp = new ProdutoNaoPerecivel();
        pnp.descricao = "Arroz";
        imprimir(pnp);
        
        // ContaCorrente contaCorrente = new ContaCorrente();        
        // contaCorrente.setSaldo(1000);
        // contaCorrente.setLimite(100);
        // sacarDinheiro(contaCorrente, 2000);

        // ContaPoupanca contaPoupanca = new ContaPoupanca();
        // contaPoupanca.setSaldo(3000);
        // contaPoupanca.setRendimento(30);
        // sacarDinheiro(contaPoupanca, 2000);
    }

    public static void imprimir(Produto produto){
        produto.imprimirEtiqueta();
    }

    public static void sacarDinheiro(Conta conta, double valor){
        double saldoAtual = conta.getSaldo();

        if (saldoAtual < valor) {
            System.out.println("Saldo insuficiente para saque!");
        } else {
            saldoAtual = saldoAtual - valor;
            conta.setSaldo(saldoAtual);
            System.out.println("Dinheiro sacado. O saldo agora é R$" + saldoAtual);            
        }        

        if (conta instanceof ContaCorrente) {
            ContaCorrente cc = (ContaCorrente) conta;   
            System.out.println("O limite da CC é : R$"+cc.getLimite()); 
        }

        if (conta instanceof ContaPoupanca){
            ContaPoupanca cp = (ContaPoupanca) conta;
            System.out.println("O Rendimento da CP é : R$"+cp.getRendimento());
        }
    }
}