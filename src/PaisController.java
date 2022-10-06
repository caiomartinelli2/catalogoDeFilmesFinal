import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class PaisController {
    public void createPais(Connection con) throws SQLException{
        Scanner input = new Scanner(System.in);
        
        System.out.println("Insita os dados para criar um novo País:");
        
        System.out.println("cod_pais: ");
        int cod_pais = input.nextInt();
        
       
        
        System.out.print("nome_pais: ");
        String nome_pais = input.next();

        PaisBean pb = new PaisBean(cod_pais, nome_pais);
        PaisModel.create(pb, con);
        System.out.println("País criado!");
    }

    public void deletePais(Connection con) throws SQLException{
        Scanner input = new Scanner(System.in);
        
        System.out.println("cod_pais: ");
        int cod_pais = input.nextInt();

        PaisBean pb = new PaisBean(cod_pais);
        
        PaisModel.delete(pb, con);
        System.out.println("País deletado!");
    }

    public void atualizarPais(Connection con) throws SQLException{
        Scanner input = new Scanner(System.in);
        
        System.out.println("cod_pais: ");
        int cod_pais = input.nextInt();
        input.nextLine();
        
        System.out.print("nome_pais: ");
        String nome_pais = input.nextLine();

        PaisBean db = new PaisBean(cod_pais);
        
        PaisModel.updatePais(db, cod_pais, nome_pais, con);
        System.out.println("\nPais atualizado!");
    }

    public void paisPeloCod(Connection con) throws SQLException{
        Scanner input = new Scanner(System.in);
            
        System.out.println("cod_pais: ");
        int cod_filme = input.nextInt();
        input.nextLine();
        
        
        HashSet all = PaisModel.paisByCod(cod_filme, con);
        Iterator<PaisBean> it = all.iterator();
        while(it.hasNext()) {
            System.out.println(it.next().toString());
        }
    }

    void listarPais(Connection con) throws SQLException {
        HashSet all = PaisModel.listAll(con);
        Iterator<PaisBean> it = all.iterator();
        while(it.hasNext()) {
            System.out.println(it.next().toString());
        }
    }

}
