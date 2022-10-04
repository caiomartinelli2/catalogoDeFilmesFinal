import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class AtorController {
    public void createAtor(Connection con) throws SQLException{
        Scanner input = new Scanner(System.in);
        
        System.out.println("Insita os dados para criar um novo Ator:");
        System.out.println("cod_ator: ");
        int cod_ator = input.nextInt();
        input.nextLine();
        System.out.print("nome_ator: ");
        String nome_ator = input.nextLine();
       
        System.out.println("cod_pais: ");
        int cod_pais = input.nextInt();

        AtorBean ab = new AtorBean(cod_ator, nome_ator, cod_pais);
        AtorModel.create(ab, con);
        System.out.println("Ator criado!");
    }

    public void deleteAtor(Connection con) throws SQLException{
        Scanner input = new Scanner(System.in);
        
        System.out.println("cod_ator: ");
        int cod_ator = input.nextInt();
    
        AtorBean ab = new AtorBean(cod_ator);
        
        AtorModel.delete(ab, con);
        System.out.println("Ator deletado se ele existir!");
    }

    void listarAtor(Connection con) throws SQLException {
        HashSet all = AtorModel.listAll(con);
        Iterator<AtorBean> it = all.iterator();
        while(it.hasNext()) {
            System.out.println(it.next().toString());
        }
    }
    
    void listarAtorFilme(Connection con) throws SQLException {
        HashSet all = AtorModel.listAtorAndFilmes(con);
        Iterator<AtorBean> it = all.iterator();
        while(it.hasNext()) {
            System.out.println(it.next().toString2());
        }
    }


}
