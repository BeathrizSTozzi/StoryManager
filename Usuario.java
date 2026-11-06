import java.util.ArrayList;

public class Usuario{
    private String apelido;
    private String user;

    private ArrayList<Personagem> personagens = new ArrayList<>();

    public Usuario(String apelido, String user){
        this.apelido = apelido;
        this.user = user;
    }

// METODOS GET
    public String getApelido(){
        return apelido;
    }

    public String getUser(){
        return user;
    }

// METODOS SET
    public void setApelido(String apelido){
        this.apelido = apelido;
    }

    public void setUser(String user){
        this.user = user;
    }


// METODOS PERSONAGEM
    public void addPersonagem(Personagem p){
        personagens.add(p);
    }

    public Personagem buscaPersonagem(String nome) {
        for (Personagem p : personagens) {
            if (p.getNome().equalsIgnoreCase(nome)) {
                return p;
            }
        }
    return null;
    }

    public void deletaPersonagem(String nome){
        Personagem p = buscaPersonagem(nome);

        if(p != null){
            personagens.remove(p);
        }
    }
}