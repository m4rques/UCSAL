//Todo restaurante, embora por lei não possa obrigar o cliente a pagar, cobra 10% para o garçom. Faça um
//programa em Java que leia o valor gasto com despesas realizadas em um restaurante e mostre o valor total
//com a gorjeta.        
import java.util.Scanner;

public class gorgeta {
    
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("O cliente pediu a conta, quanto deu a conta sem os 10%?");
        double contaPedidos = scanner.nextDouble();
            
        double contaTotal = contaPedidos + (contaPedidos * 10/100);
        
        System.out.println("O valor da conta deu R$ "+contaTotal);   
    }
}
