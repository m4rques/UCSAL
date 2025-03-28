// Faça um programa em Java que solicite a hora atual 
//(expressa em horas, minutos e segundos) ao usuário e  
//informe quantos segundos do dia já passaram. 



import java.util.Scanner;

public class segundos {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Me diga a hora:");
        int horas = scanner.nextInt();
        System.out.println("Me diga o minuto:");
        int minutos = scanner.nextInt();
        System.out.println("Me diga os segundos:");
        int segundos = scanner.nextInt();

        int SegundosDia = (horas * 3600) + (minutos * 60) + segundos;

        System.out.println("O total de segundos do dia foi " + SegundosDia);

        scanner.close();
        
    }
}
