import java.util.Scanner;

public class duracaoAtividade {
    
    public static void main(String[] args){                                                                                                                                                        
        
        Scanner scanner=new Scanner(System.in);

        System.out.println("Hora que iniciou a atividade:");
        int horaInicio = scanner.nextInt();
        System.out.println("Minuto que iniciou a atividade:");
        int minutoInicio = scanner.nextInt();
        System.out.println("Segundo que inciou a atividade:");
        int segundoInicio = scanner.nextInt();

        System.out.println("Hora que finalizou a atividade:");
        int horaFim = scanner.nextInt();
        System.out.println("Minuto que finalizou a atividade:");
        int minutoFim  = scanner.nextInt();
        System.out.println("Segundo quefinalizou a atividade:");
        int segundoFim = scanner.nextInt();

        int segundosInicio = (horaInicio * 3600) + (minutoInicio * 60) + segundoInicio;
        int segundosFim = (horaFim * 3600) + (minutoFim * 60) + segundoFim;

        int diferencaEmSegundos = segundosFim - segundosInicio;

        int horas = diferencaEmSegundos / 3600;
        int minutos = diferencaEmSegundos % 3600 / 60;
        int segundos = diferencaEmSegundos % 60;

        System.out.println(diferencaEmSegundos);
        System.out.println(horas+":"+minutos+":"+segundos);
        
        

    }
}
