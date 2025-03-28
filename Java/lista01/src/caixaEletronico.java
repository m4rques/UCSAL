import java.util.Scanner;

public class caixaEletronico {

    public static void main(String[] args){
        
        Scanner scanner=new Scanner(System.in);

        System.out.println("Digite o valor da sua conta bancaria:");
        int valorMonetario = scanner.nextInt();

        int quantidadeNotas50 = valorMonetario / 50;
        System.out.println("Vai precisar de "+quantidadeNotas50+" notas de 50.");
        int quantidadeNotas10 = valorMonetario / 10;
        System.out.println("Vai precisar de "+quantidadeNotas10+" notas de 10");
        int quantidadeNotas5 = valorMonetario / 5;
        System.out.println("Vai precisar de "+quantidadeNotas5+" notas de 10");
        int quantidadeNotas1 = valorMonetario / 1;
        System.out.println("Vai precisar de "+quantidadeNotas1+" notas de 10");

        scanner.close();

    }
    
}