// 01 -  Faça um programa em Java que receba uma temperatura 
//em centígrados e transforme para fahrenheit.  
//Sabe-se que a fórmula para conversão é F=((9.C)+160)/5. 




import java.util.Scanner;

public class Fahrenheit {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Qual a temperatura em Celsius?");

        double temp = scanner.nextDouble();
        double fahrenheit = (temp * 9/5) + 32;
        
        System.out.println("Certo, a temperatura em Fahrenheit é: "+fahrenheit);

        scanner.close();
    }
}
