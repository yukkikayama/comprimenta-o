package cumprimentacao;

import java.util.Scanner;


public class Cumprimentacao {
    public static void main(String[] args) {
        int hora;
        
        hora = (int) LeHoras();
        if((hora >= 6) && (hora <= 12)){
            System.out.println("Nesse momento são " + hora + ":00.");
            System.out.println("Bom dia!");
        }
        else if((hora >= 13) && (hora <= 18)){
            System.out.println("Nesse momento são " + hora + ":00.");
            System.out.println("Boa tarde!");
        }
        else if((hora >= 19) && (hora <= 5)){
            System.out.println("Nesse momento são " + hora + ":00.");
            System.out.println("Boa Noite!");
        }
    }
    public static int LeHoras(){
        int time; // ex: 08:30AM -> 8.30 
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Entre com a hora: ");
        time = entrada.nextInt();
        return time;
    }
}
