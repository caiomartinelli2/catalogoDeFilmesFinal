import java.sql.Connection;
import java.sql.SQLException;
import java.text.ParseException;
import java.time.Duration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;


public class FilmeController {
    public void createFilme(Connection con) throws SQLException, ParseException{
        Scanner input = new Scanner(System.in);
        
        System.out.println("Insita os dados para criar um novo Filme:");
        
        System.out.println("cod_filme: ");
        int cod_filme = input.nextInt();
        input.nextLine();
        
        System.out.print("nome_filme: ");
        String nome_filme = input.nextLine();
        
        
        System.out.println("duracao: ");
        Double duracao = input.nextDouble();
        input.nextLine();

        System.out.print("sinopse: ");
        String sinopse = input.nextLine();
        

        System.out.println("cod_pais: ");
        int cod_pais = input.nextInt();
        

        System.out.println("cod_genero: ");
        int cod_genero = input.nextInt();
        

        System.out.println("cod_diretor: ");
        int cod_diretor = input.nextInt();
        

        System.out.println("cod_diretor: ");
        int cod_roteirista = input.nextInt();
        


        FilmeBean fb = new FilmeBean(cod_filme,nome_filme,duracao,sinopse, cod_pais,cod_genero, cod_diretor, cod_roteirista);
        
        FilmeModel.create(fb, con);
        System.out.println("Filme criado!");
    }

    public void deleteFilme(Connection con) throws SQLException{
        Scanner input = new Scanner(System.in);
        
        System.out.println("cod_filme: ");
        int cod_filme = input.nextInt();
    
        FilmeBean fb = new FilmeBean(cod_filme);
        
        FilmeModel.delete(fb, con);
        System.out.println("Filme deletado!");
    }

    public void updateFilme(Connection con) throws SQLException{
        Scanner input = new Scanner(System.in);
        
        System.out.println("cod_filme: ");
        int cod_filme = input.nextInt();
        input.nextLine();
        
        System.out.print("nome_filme: ");
        String nome_filme = input.nextLine();
        
        
        System.out.println("duracao: ");
        Double duracao = input.nextDouble();
        input.nextLine();

        System.out.print("sinopse: ");
        String sinopse = input.nextLine();
        

        System.out.println("cod_pais: ");
        int cod_pais = input.nextInt();
        

        System.out.println("cod_genero: ");
        int cod_genero = input.nextInt();
        

        System.out.println("cod_diretor: ");
        int cod_diretor = input.nextInt();
        

        System.out.println("cod_roteirista: ");
        int cod_roteirista = input.nextInt();

        FilmeBean fb = new FilmeBean(cod_filme);
        
        FilmeModel.updateFilme(fb, cod_filme, nome_filme, duracao, sinopse, cod_pais, cod_genero, cod_diretor, cod_roteirista, con);
        System.out.println("Filme atualizado!");
    }

    public void FilmePeloCod(Connection con) throws SQLException{
        Scanner input = new Scanner(System.in);
        
        System.out.println("cod_filme: ");
        int cod_filme = input.nextInt();
        input.nextLine();
        
        
        HashSet all = FilmeModel.FilmebyCod(cod_filme, con);
        Iterator<FilmeBean> it = all.iterator();
        while(it.hasNext()) {
            System.out.println(it.next().toString());
        }
    }
    

    void listarFilme(Connection con) throws SQLException {
        HashSet all = FilmeModel.listAll(con);
        Iterator<FilmeBean> it = all.iterator();
        while(it.hasNext()) {
            System.out.println(it.next().toString());
        }
    }

    void listarFilmeGenero(Connection con) throws SQLException {
        HashSet all = FilmeModel.listFilmesAndGeneros(con);
        Iterator<FilmeBean> it = all.iterator();
        while(it.hasNext()) {
            System.out.println(it.next().toString2());
        }
    }
}
