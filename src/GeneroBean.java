public class GeneroBean {
    private int cod_genero;
    private String nome_genero;


    public GeneroBean(int cod_genero, String nome_genero){ 
        this.cod_genero = cod_genero;
        this.nome_genero = nome_genero;
    }


    public GeneroBean(String string) {
    }


    public int getCod_genero() {
        return cod_genero;
    }


    public void setCod_genero(int cod_genero) {
        this.cod_genero = cod_genero;
    }


    public String getNome_genero() {
        return nome_genero;
    }


    public void setNome_genero(String nome_genero) {
        this.nome_genero = nome_genero;
    }

    public String toString(){
        return " cod_ator: "+cod_genero+" nome_ator: "+nome_genero;
    }
}
