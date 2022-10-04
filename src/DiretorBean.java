
public class DiretorBean{


private int cod_diretor;
private String nome_diretor;
private int cod_pais;
private PaisBean pais;


public DiretorBean(int cod_diretor, String nome_diretor, int cod_pais) {
    this.cod_diretor = cod_diretor;
    this.nome_diretor = nome_diretor;
    this.cod_pais =cod_pais;
}


public DiretorBean(String sql) {
}


public DiretorBean(int cod_diretor) {
    this.cod_diretor=cod_diretor;
}


public int getCod_diretor() {
    return cod_diretor;
}


public void setCod_diretor(int cod_diretor) {
    this.cod_diretor = cod_diretor;
}


public String getNome_diretor() {
    return nome_diretor;
}


public void setNome_diretor(String nome_diretor) {
    this.nome_diretor = nome_diretor;
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
    return " cod_diretor: "+cod_diretor+" nome_diretor: "+nome_diretor+" cod_pais: "+cod_pais;
}

public String toString2(){
        
    return ("nome_diretor: "+nome_diretor+" nome_pais: "+pais.getNome_pais());
     
}



}