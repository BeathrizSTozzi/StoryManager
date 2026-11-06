import java.util.Scanner;
import java.util.ArrayList;

public class Menu {
    private ArrayList<Usuario> usuarios = new ArrayList<>();
    private int menu = 0;
    private Scanner entrada = new Scanner(System.in);

    public void iniciar(){
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
                    menuUsuario();
                break;

                case 2:
                    menuPersonagem();
                break;

                case 3:
                    menuJogo();
                break;
            }
        }while(menu != 0);

    entrada.close();
    }

    private void menuUsuario(){
        int opUsuario = 0;

        do{
            System.out.println("\n\n-- MENU DE USUARIO");
            System.out.println("1. Cadastra usuario;");
            System.out.println("0. Retorno.");
            opUsuario = entrada.nextInt();
            entrada.nextLine();

            switch(opUsuario){
                case 1:
                    System.out.println("Digite o apelido: ");
                    String apelido = entrada.nextLine();
                    System.out.println("Digite o user: ");
                    String user = entrada.nextLine();

                    usuarios.add(new Usuario(apelido, user));
                break;
            }
        }while(opUsuario != 0);
    }

    private void menuPersonagem(){
        int opPerso = 0;

        do{
            System.out.println("\n\n-- MENU DE PERSONAGEM");
            System.out.println("1. Cadastra personagem;");
            System.out.println("2. Remove personagem;");
            System.out.println("3. Lista personagens;");
            System.out.println("4. Menu altera;");
            System.out.println("5. Menu lista;");
            System.out.println("0. Retorno.");
            opPerso = entrada.nextInt();
            entrada.nextLine();

            switch(opPerso){
                case 1:
                    System.out.println("\n\nDigite seu usuario:");
                    String usuario1 = entrada.nextLine();

                    Usuario u1 = buscaUsuario(usuario1);

                    if(u1 != null){
                        System.out.println("Usuario encontrado: " + u1.getApelido());

                        System.out.println("Nome do personagem: ");
                        String nome = entrada.nextLine();

                        Personagem p = new Personagem(nome);
                        u1.addPersonagem(p);

                        System.out.println("Deseja continuar o registro agora? \n1. Sim \n2. Nao");
                        int op = entrada.nextInt();
                        entrada.nextLine();

                        if(op == 1){
                            System.out.println("Idade:");
                            int idade = entrada.nextInt();
                            entrada.nextLine();
                            p.setIdade(idade);
                        }
                    }

                    else{
                        System.out.println("Usuario nao encontrado.");
                    }
                break;

                case 2:
                    System.out.println("\n\nDigite seu usuario: ");
                    String usuario2 = entrada.nextLine();

                    Usuario u2 = buscaUsuario(usuario2);

                    if(u2 != null){
                        System.out.println("Digite o nome do personagem: ");
                        String nome = entrada.nextLine();

                        u2.deletaPersonagem(nome);
                    }

                    else{
                        System.out.println("Usuario nao encontrado.");
                    }
                break;

                case 3:
                    System.out.println("Digite seu usuario: ");
                    String usuario3 = entrada.nextLine();

                    Usuario u3 = buscaUsuario(usuario3);

                    if(u3 != null){
                        u3.listarPorUsuario();
                    }

                    else{
                        System.out.println("Usuario nao encontrado.");
                    }
                break;

                case 4:
                    menuPersonagemAltera();
                break;

                case 5:
                    menuPersonagemLista();
                break;
            }

        }while(opPerso != 0);

    }

    private void menuJogo(){
        int opJogo = 0;

        do{
            System.out.println("\n\n-- MENU DE JOGO");
            System.out.println("0. Retorno.");
            opJogo = entrada.nextInt();
            entrada.nextLine();

        }while(opJogo != 0);
    }

// MENUS PERSONAGEM
    private void menuPersonagemAltera(){

    }

    private void menuPersonagemLista(){
        
    }

//METODOS USUARIO
    public Usuario buscaUsuario(String user){
        for(Usuario u : usuarios){
            if(u.getUser().equalsIgnoreCase(user)){
                return u;
            }
        }
        return null;
    }
} 
