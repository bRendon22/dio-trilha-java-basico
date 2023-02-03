public class CaixaEletronico {
    public static void main(String[] args) throws Exception {
        double saldo = 25.0; 
        double valorSolicitado = 20.0; 

        if (valorSolicitado< saldo) { // Condição precisa ser verdadeira para o valor ser executado.
            saldo = saldo - valorSolicitado; 
        }
        System.out.println(saldo);
    }
}
