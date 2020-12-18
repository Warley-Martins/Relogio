package relogio;

import java.util.Scanner;

public class TestesRelogio {
        static String formato12Horas = "12Horas";
        static String formato24Horas = "24Horas";
        public static void main(String[] args) {
            menuAssinatura();
            int opcaoFormatoRelogio;
            Scanner input = new Scanner(System.in);
            Relogio relogio;  
            do{
                do{
                    MenuFormatoRelogio();
                    opcaoFormatoRelogio = input.nextInt();     
                }while(opcaoFormatoRelogio < 0 && opcaoFormatoRelogio > 2);
                switch(opcaoFormatoRelogio){
                    case 1:
                        relogio = new Relogio(formato12Horas);
                        printarRelogioFormato12Horas(relogio);
                        break;
                    case 2: 
                        relogio = new Relogio(formato24Horas);
                        printarRelogioFormato24Horas(relogio);
                        break;
                }
            }while(opcaoFormatoRelogio != 0);
        }
    private static void menuAssinatura() {
        System.out.println("Aluno: Warley Junio martins Vieira\n"
                            +"Disciplina: Programacao de computadores 2\n"
                            +"Professoa: Luciana\n"
                            +"Faculdade: CEFET-MG"
                            +"\nAtiidade: Relogio");
    }
    private static void MenuFormatoRelogio() {
        System.out.print("\nQual formato voce deseja:\n"
                        +"(1). Relogio 12 horas\n"
                        +"(2). Relogio 24 horas\n"
                        +"(0). Encerrar o programa\n"
                        +"Opcao desejada: ");    
    }   
    private static void printarRelogioFormato12Horas(Relogio relogio) {
        for(int horas = 0; horas < 24; horas++){
            for(int minutos = 0; minutos < 60; minutos++){
                System.out.printf("%02d:%02d %s\n", relogio.getHora() , relogio.getMinutos(), relogio.getAmPm());
                relogio.ticTac();
            }
        }
    }
    private static void printarRelogioFormato24Horas(Relogio relogio) {
        for(int horas = 0; horas < 24; horas++){
            for(int minutos = 0; minutos < 60; minutos++){
                System.out.printf("%02d:%02d\n", relogio.getHora() , relogio.getMinutos());
                relogio.ticTac();
            }
        }
    }
}








