
// Faça um programa em Java que leia o valor do salário mínimo e 
//o valor do salário de uma pessoa. Calcular  e imprimir quantos salários mínimos ela ganha. 

import java.util.Scanner;

public class salario {
    
    public static void main(String[] args) {
        
        Scanner scanner=new Scanner(System.in);
        System.out.println("Qual o seu salario atual?");
        int salario = scanner.nextInt();

        double vezesSalario = (salario / 1518.00);
        String formatado = String.format("%.2f", vezesSalario);
        System.out.println("Voce ganha "+formatado+" salarios minimos.");

        scanner.close();
    }
}
