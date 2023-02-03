import javax.print.attribute.standard.OutputDeviceAssigned;

public class ResultadoEscolar {
    public static void main(String[] args) {
        
        int nota = 6; 

        if (nota >=7 ) { //sempre o primeiro
            System.out.println("APROVADO");}

        else if (nota > 5 && nota < 7 ) // && condicional que significa e , ou seja, se maior que 5 E menor que 7 
            System.out.println("Recuperação");
        
        else
        {System.out.println("REPROVADO");}
        

    }
}
