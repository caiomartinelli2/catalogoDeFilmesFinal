public class AtorBean {
    
    private int cod_ator;
    private String nome_ator;
    private int cod_pais;
    private PaisBean pais;
    private FilmeBean filme;
    
    public AtorBean(int cod_ator, String nome_ator, int cod_pais) {
        this.cod_ator = cod_ator;
        this.nome_ator = nome_ator;
        this.cod_pais = cod_pais;
    }


    public AtorBean(String sql) {
    }


    public AtorBean(int cod_ator) {
        this.cod_ator = cod_ator;
    }


    public int getCod_ator() {
        return cod_ator;
    }


    public void setCod_ator(int cod_ator) {
        this.cod_ator = cod_ator;
    }


    public String getNome_ator() {
        return nome_ator;
    }


    public void setNome_ator(String nome_ator) {
        this.nome_ator = nome_ator;
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
        return " cod_ator: "+cod_ator+" nome_ator: "+nome_ator+" cod_pais: "+cod_pais;
    }

    public String toString2(){
        
        return ("nome_ator: "+nome_ator+" nome_filme: "+filme.getNome_filme());
         
    }

    public FilmeBean getFilme() {
        return filme;
    }


    public void setFilme(FilmeBean filme) {
        this.filme = filme;
    }
}
