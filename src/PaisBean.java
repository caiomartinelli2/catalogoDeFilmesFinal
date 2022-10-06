public class PaisBean{

    private int cod_pais;
    private String nome_pais;


    public PaisBean(int cod_pais, String nome_pais){ 
        this.cod_pais = cod_pais;
        this.nome_pais = nome_pais;
    }


    public PaisBean(String sql) {
    }


    public PaisBean(int cod_pais) {
        this.cod_pais=cod_pais;
    }


    public int getCod_pais() {
        return cod_pais;
    }


    public void setCod_pais(int cod_pais) {
        this.cod_pais = cod_pais;
    }


    public String getNome_pais() {
        return nome_pais;
    }


    public void setNome_pais(String nome_pais) {
        this.nome_pais = nome_pais;
    }

    public String toString(){
        return "| cod_pais: "+cod_pais+"| nome_pais: "+nome_pais+"|";
    }


    public int getCod_retorno() {
        return 0;
    }

}