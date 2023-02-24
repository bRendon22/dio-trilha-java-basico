public class ExemploBreackContinue {
    public static void main(String[] args) {
        
        //Break finaliza o fluxo : Continue exclue apenas aquela observação
        for (int numero = 1; numero <= 5; numero ++){

            if (numero == 3)
                continue;

                System.out.println(numero);
        }

    }
}
