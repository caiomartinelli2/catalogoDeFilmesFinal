import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class Filme_atorController {
    public void createFilme_ator(Connection con) throws SQLException{
        Scanner input = new Scanner(System.in);
        
        System.out.println("Insita os dados para criar a relação Filme e ator:");
        System.out.println("cod_filme: ");
        int cod_filme = input.nextInt();
        
        System.out.print("nome_genero: ");
        int cod_ator = input.nextInt();

        Filme_atorBean fab = new Filme_atorBean(cod_filme, cod_ator);
        Filme_atorModel.create(fab, con);
        System.out.println("Relação Filme e ator criado!");
    }
    
    public void deleteFilme_ator(Connection con) throws SQLException{
        Scanner input = new Scanner(System.in);
        
        System.out.println("cod_filme: ");
        int cod_filme = input.nextInt();
        
        System.out.println("cod_ator: ");
        int cod_ator = input.nextInt();
        
        
        Filme_atorBean fb = new Filme_atorBean(cod_ator, cod_filme);
        
        Filme_atorModel.delete(fb, con);
        System.out.println("Relação filme_ator deletado!");
    }
}
