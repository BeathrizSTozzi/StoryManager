public class Ciclo {
    private int id;
    private int comeco;
    private int duracao;

    public Ciclo(int num, Ciclo anterior, int duracao){
        this.id = num;
        this.duracao = duracao;

        if(anterior == null ){
            this.comeco = 0;
        }

        else{
            this.comeco = anterior.getComeco() + anterior.getDuracao();
        }
    }

// METODOS GET
    public int getId(){
        return id;
    }

    public int getDuracao(){
        return duracao;
    }

    public int getComeco(){
        return comeco;
    }

    public String getEra(){
        if(id >= 0 && id <= 2){
            return "Era Calamitosa";
        }

        if (id >= 3 && id <= 12) {
            return "Era da Guerra Consciente I";
        }

        return "Era desconhecida";
    }

    public String getAto(){
        if(id >= 0 && id <= 3){
            return "Ato da Conquista";
        }

        return "Ato desconhecido";
    }

// METODOS
    public void imprimeCiclo(){
        System.out.println("\nCiclo: " + getId());
        System.out.println("Marco: " + getEra() + " - " + getAto());
        System.out.println("Duracao total:" + getDuracao());
    }
}
