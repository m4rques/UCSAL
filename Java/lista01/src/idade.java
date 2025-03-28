// Faça um programa em Java que receba a idade de uma pessoa em anos, 
//meses e dias e informe quantos  dias aproximadamente ele já viveu. 

import java.util.Scanner;

public class idade {
    
    public static void main (String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Qual a sua idade?");
        int idade = scanner.nextInt();

        int quantDias = idade * 365;

        System.out.println("Voce viveu "+quantDias+" dias na terra.");
    }
}
