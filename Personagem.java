

public class Personagem{
    private String nome;
    private Ciclo ciclo;
    private int idade;

    public Personagem(String nome, Ciclo ciclo, int idade){
        this.nome = nome;
        this.ciclo = ciclo;
        this.idade = idade;
    }

    public Personagem(String nome){
        this.nome = nome;
    }

// METODOS GET
    public String getNome(){
        return nome;
    }

    public Ciclo getCiclo(){
        return ciclo;
    }

    public int getIdade(){
        return idade;
    }

// METODOS SET
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

// METODOS

}