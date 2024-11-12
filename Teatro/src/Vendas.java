import java.util.Scanner;
public class Vendas {
    public static void Vendas(){

        int opcao=0;
        int compra=0;
        Scanner scanner= new Scanner(System.in);


        do {
            System.out.println("Bem vindo ao MENU de vendas");
            System.out.println("1- Selecione o primeiro   para comprar");
            System.out.println("2- Selecione o segundo   para comprar");
            System.out.println("3- Selecione o terceiro   para comprar");
            System.out.println("0- Voltar");

            opcao = scanner.nextInt();


             if (opcao==1) {
                System.out.println("PRIMEIRO ANDAR");
                System.out.println("---------------------------------------------");
                Andares.MostrarPrimeiro();
                System.out.println("---------------------------------------------");
                System.out.println("Selecione uma cadeira para comprar");
                compra = scanner.nextInt();

                 for (int i = 0; i < Andares.PrimeiroAndar.length; i++) {
                    for (int j = 0; j < Andares.PrimeiroAndar[i].length ; j++) {

                        if (compra==Andares.PrimeiroAndar[i][j]){
                            Andares.PrimeiroAndar[i][j]=0;
                        }

                        else {
                            System.out.println("Erro");
                            Menu.Menu();
                        }

                    }


                    }



                }

            if (opcao==2) {
                System.out.println("SEGUNDO ANDAR");
                System.out.println("---------------------------------------------");
                Andares.MostrarSegundo();
                System.out.println("---------------------------------------------");
                System.out.println("Selecione uma cadeira para comprar");
                compra = scanner.nextInt();

                for (int i = 0; i < Andares.SegundoAndar.length; i++) {
                    for (int j = 0; j < Andares.SegundoAndar[i].length ; j++) {
                        if (compra==Andares.SegundoAndar[i][j]){
                            Andares.SegundoAndar[i][j]=0;
                        }


                    }


                }

            }

            if (opcao==3) {
                System.out.println("TERCEIRO ANDAR");
                System.out.println("---------------------------------------------");
                Andares.MostrarTerceiro();
                System.out.println("---------------------------------------------");
                System.out.println("Selecione uma cadeira para comprar");
                compra = scanner.nextInt();

                for (int i = 0; i < Andares.TerceiroAndar.length; i++) {
                    for (int j = 0; j < Andares.TerceiroAndar[i].length ; j++) {
                        if (compra==Andares.TerceiroAndar[i][j]){
                            Andares.TerceiroAndar[i][j]=0;
                        }


                    }


                }

            }



        }while(opcao!=0);


    }
}
