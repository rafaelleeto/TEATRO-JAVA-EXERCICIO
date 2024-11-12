import java.util.Scanner;

public class Desistencia {
    public static void Desistencia(){
        int opcao=0;
        Scanner scanner= new Scanner(System.in);

        do {

            System.out.println("Selecione o ANDAR que você deseja reembolsar");
            System.out.println("-------------------------------------------");
            Andares.MostrarPrimeiro();
            System.out.println("-------------------------------------------");
            Andares.MostrarSegundo();
            System.out.println("-------------------------------------------");
            Andares.MostrarTerceiro();
            System.out.println("-------------------------------------------");
            opcao = scanner.nextInt();

            if (opcao==1){

            }


        } while (opcao!=0);


    }
}
