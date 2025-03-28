import java.util.Scanner;

public class locadora {
    
    public static void main(String[] args) {
        
        Scanner scanner=new Scanner(System.in);

        System.out.println("Quantas fitas a locadora possui?");
        int quantidadeFita = scanner.nextInt();

        System.out.println("Qual o valor dos alugueis das fitas?");
        double valorFita = scanner.nextDouble();

        //Faturamento Anual
        double fitasAlugadasMes = quantidadeFita / 3;
        double faturamentoMensal = fitasAlugadasMes * valorFita;
        double faturamentoAnual = faturamentoMensal * 12;
        
        //Valor ganho com multas
        double atrasoMes = fitasAlugadasMes / 10;
        double multafita = valorFita * 0.1;
        double ganhoMultas = atrasoMes * multafita;

        // Quantidade de fitas no final do ano
        double fitasEstragadas = quantidadeFita * 0.02;
        double fitasCompradas = quantidadeFita / 10;
        double totalFitasFinalAno = quantidadeFita - fitasEstragadas + fitasCompradas;

        String formatado = String.format("%.2f", ganhoMultas);

        System.out.println("Faturamento Anual da locadora é R$"+faturamentoAnual);
        System.out.println("O valor da multa é R$"+multafita);
        System.out.println("O valor ganho por multa no mes é R$"+formatado);
        System.out.println("A quantidade de fitas que a locadora tera no final do ano é "+totalFitasFinalAno);

        scanner.close();
    }
} 