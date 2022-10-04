import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class RoteiristaController {
    public void createRoteirista(Connection con) throws SQLException{
        Scanner input = new Scanner(System.in);
        
        System.out.println("Insita os dados para criar um novo Roteirista:");
        System.out.println("cod_roteirista: ");
        int cod_roteirista = input.nextInt();
        System.out.print("nome_roteirista: ");
        String nome_roteirista = input.next();
        System.out.println("cod_pais: ");
        int cod_pais = input.nextInt();

        RoteiristaBean rb = new RoteiristaBean(cod_roteirista, nome_roteirista, cod_pais);
        RoteiristaModel.create(rb, con);
        System.out.println("Roteirista criado!");
    }

    public void deleteRoteirista(Connection con) throws SQLException{
        Scanner input = new Scanner(System.in);
        
        System.out.println("cod_roteirista: ");
        int cod_roteirista = input.nextInt();
    
        RoteiristaBean rb = new RoteiristaBean(cod_roteirista);
        
        RoteiristaModel.delete(rb, con);
        System.out.println("Roteirista deletado!");
    }

    void listarRoteirista(Connection con) throws SQLException {
        HashSet all = RoteiristaModel.listAll(con);
        Iterator<RoteiristaBean> it = all.iterator();
        while(it.hasNext()) {
            System.out.println(it.next().toString());
        }
    }

}
