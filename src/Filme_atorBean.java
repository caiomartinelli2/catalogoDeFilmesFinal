public class Filme_atorBean {
    private int cod_filme;
    private int cod_ator;
    
    public Filme_atorBean(int cod_filme, int cod_ator) {
        this.cod_filme = cod_filme;
        this.cod_ator = cod_ator;
    }

    public Filme_atorBean(int cod_filme) {
        this.cod_ator=cod_filme;
    }

    public int getCod_filme() {
        return cod_filme;
    }

    public void setCod_filme(int cod_filme) {
        this.cod_filme = cod_filme;
    }

    public int getCod_ator() {
        return cod_ator;
    }

    public void setCod_ator(int cod_ator) {
        this.cod_ator = cod_ator;
    }

    
    
}
