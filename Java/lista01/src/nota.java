import java.util.Scanner;

public class nota {
    
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Nota da AV1 valendo 5:");
        double nota1 = scanner.nextDouble();

        System.out.println("Nota da AV2 valendo 5:");
        double nota2 = scanner.nextDouble();

        System.out.println("Nota da AV3 valendo 5:");
        double nota3 = scanner.nextDouble();

        double media = (nota1 * 5) + (nota2 * 5) + (nota3 * 5) / nota1 + nota2 + nota3;

        System.out.println("Sua media nessa unidade é: "+media);


    }
}
