import java.util.Scanner;

public class questao3 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma nota:");
        double nota1 = scanner.nextDouble();
        System.out.println("Peso da nota 1:");
        double peso1 = scanner.nextDouble();

        System.out.println("Digite uma nota:");
        double nota2 = scanner.nextDouble();
        System.out.println("Peso da nota 2:");
        double peso2 = scanner.nextDouble();

        System.out.println("Digite uma nota:");
        double nota3 = scanner.nextDouble();
        System.out.println("Peso da nota 3:");
        double peso3 = scanner.nextDouble();

        double mediaPonderada = (nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3) / peso1 + peso2 + peso3;

        System.out.println("A média ponderada é: " + mediaPonderada);
    }
}
