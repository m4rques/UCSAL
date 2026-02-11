import java.util.Scanner;

public class questao2 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a hora:");
        int hora = scanner.nextInt();

        System.out.println("Digite os minutos:");
        int minutos = scanner.nextInt();

        System.out.println("Digite os segundos:");
        int segundos = scanner.nextInt();

        int segundosTotal = (hora * 3600) + (minutos * 60) + segundos;

        System.out.println("O tempo total em segundos é: " + segundosTotal);
    }
}