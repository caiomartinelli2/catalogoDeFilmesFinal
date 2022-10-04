import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class GeneroController {
    public void createGenero(Connection con) throws SQLException{
        Scanner input = new Scanner(System.in);
        
        System.out.println("Insita os dados para criar um novo genero:");
        System.out.println("cod_genero: ");
        int cod_genero = input.nextInt();
        input.nextLine();
        System.out.print("nome_genero: ");
        String nome_genero = input.next();

        GeneroBean gb = new GeneroBean(cod_genero, nome_genero);
        GeneroModel.create(gb, con);
        System.out.println("Genero criado!");
    }

    void listarGenero(Connection con) throws SQLException {
        HashSet all = GeneroModel.listAll(con);
        Iterator<GeneroBean> it = all.iterator();
        while(it.hasNext()) {
            System.out.println(it.next().toString());
        }
    }

}
