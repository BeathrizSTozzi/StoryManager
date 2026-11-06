import java.util.Scanner;
import java.util.ArrayList;

public class main{
    public static void main(String[] args){
        Scanner entrada =  new Scanner(System.in);
        ArrayList<Personagem> personagens = new ArrayList<>();
        ArrayList<Usuario> usuarios = new ArrayList<>();
        int menu = 0;


        do{
            System.out.println("\n\n-- MENU PRINCIPAL");
            System.out.println("1. Menu de usuario;");
            System.out.println("2. Menu de personagem;");
            System.out.println("3. Menu de jogo;");
            System.out.println("0. Saída");
            menu = entrada.nextInt();
            entrada.nextLine();

            switch(menu){
                case 1:
                    int opcaoUsuario = 0;

                    do{
                    System.out.println("\n\n-- MENU DE USUARIO");
                    System.out.println("1. Cadastra usuario;");
                    System.out.println("0. Retorno.");
                    opcaoUsuario = entrada.nextInt();
                    entrada.nextLine();

                    switch(opcaoUsuario){
                        case 1:
                            System.out.println("Digite o apelido: ");
                            String apelido = entrada.nextLine();
                            System.out.println("Digite o user: ");
                            String user = entrada.nextLine();

                            usuarios.add(new Usuario(apelido, user));
                        break;
                    }

                    }while(opcaoUsuario != 0);
                    
                break;

                case 2:
                break;

                case 3:
                break;
            }

        }while(menu != 0);

    entrada.close();
    }
}