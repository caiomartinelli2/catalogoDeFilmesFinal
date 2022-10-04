


public class FilmeBean {
    private int cod_filme;
    private String nome_filme;
    private double duracao;
    private String sinopse;
    private int cod_pais;
    private int cod_genero;
    private int cod_diretor;
    private int cod_roteirista;
    private GeneroBean genero;

    public FilmeBean(int cod_filme, String nome_filme,double duracao, String sinopse, int cod_pais,int cod_genero, int cod_diretor, int cod_roteirista) {
        
        this.cod_filme = cod_filme;
        this.nome_filme = nome_filme;
        this.duracao = duracao;
        this.sinopse = sinopse;
        this.cod_pais = cod_pais;
        this.cod_genero = cod_genero;
        this.cod_diretor = cod_diretor;
        this.cod_roteirista = cod_roteirista;
    
    }

    public FilmeBean(String string) {
    }

    public String toString(){
        return ("cod_filme: "+cod_filme+" nome: "+nome_filme+" duracao: "+duracao+
                " sinopse: "+sinopse+" cod_pais: "+cod_pais+" cod_genero: "+cod_genero+" cod_diretor: "+cod_diretor+"cod_roteirista"+cod_roteirista);
            }
    
    public String toString2(){
        
        return ("nome_filme: "+nome_filme+" nome_genero: "+genero.getNome_genero());
         
    }
    

    public int getCod_filme() {
        return cod_filme;
    }

    public void setCod_filme(int cod_filme) {
        this.cod_filme = cod_filme;
    }

    public String getNome_filme() {
        return nome_filme;
    }

    public void setNome_filme(String nome_filme) {
        this.nome_filme = nome_filme;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public int getCod_pais() {
        return cod_pais;
    }

    public void setCod_pais(int cod_pais) {
        this.cod_pais = cod_pais;
    }

    public int getCod_genero() {
        return cod_genero;
    }

    public void setCod_genero(int cod_genero) {
        this.cod_genero = cod_genero;
    }

    public int getCod_diretor() {
        return cod_diretor;
    }

    public void setCod_diretor(int cod_diretor) {
        this.cod_diretor = cod_diretor;
    }

    public int getCod_roteirista() {
        return cod_roteirista;
    }

    public void setCod_roteirista(int cod_roteirista) {
        this.cod_roteirista = cod_roteirista;
    }

    public void setGenero(GeneroBean genero) {
        this.genero = genero;
    }

    public GeneroBean getGenero() {
        return genero;
    }

    
    


}
    