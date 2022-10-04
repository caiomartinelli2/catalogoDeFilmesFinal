
public class RoteiristaBean {
    private int cod_roteirista;
    private String nome_roteirista;
    private int cod_pais;
    private PaisBean pais;


    public RoteiristaBean(int cod_roteirista, String nome_roteirista, int cod_pais) {
        this.cod_roteirista = cod_roteirista;
        this.nome_roteirista = nome_roteirista;
        this.cod_pais = cod_pais;
    }


    public RoteiristaBean(int cod_roteirista) {
        this.cod_roteirista=cod_roteirista;
    }


    public int getCod_roteirista() {
        return cod_roteirista;
    }


    public void setCod_roteirista(int cod_roteirista) {
        this.cod_roteirista = cod_roteirista;
    }


    public String getNome_roteirista() {
        return nome_roteirista;
    }


    public void setNome_roteirista(String nome_roteirista) {
        this.nome_roteirista = nome_roteirista;
    }


    public int getCod_pais() {
        return cod_pais;
    }


    public void setCod_pais(int cod_pais) {
        this.cod_pais = cod_pais;
    }


    public PaisBean getPais() {
        return pais;
    }


    public void setPais(PaisBean pais) {
        this.pais = pais;
    }

    public String toString(){
        return " cod_roteirista: "+cod_roteirista+" nome_roteirista: "+nome_roteirista+" cod_pais: "+cod_pais;
    }
    

    

}
