import java.util.Scanner;

public class pa {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Primeiro termo da PA:");
        double primeiroTermo = scanner.nextDouble();

        System.out.println("Segundo termo da PA:");
        double segundoTermo = scanner.nextDouble();

        System.out.println("Numero do termo que deseja saber:");
        int n = scanner.nextInt();

        double razao = segundoTermo - primeiroTermo;

        double termosDesejado = primeiroTermo + (n - 1) * razao; 

        System.out.println("O "+ n +"-ésimo termo da PA é: "+ termosDesejado);

        scanner.close();

    }
}
