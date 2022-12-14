import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class DiretorController {
    public void createDiretor(Connection con) throws SQLException{
        Scanner input = new Scanner(System.in);
        
        System.out.println("Insita os dados para criar um novo Diretor:");
        System.out.println("cod_diretor: ");
        int cod_diretor = input.nextInt();
        input.nextLine();
        
        System.out.print("nome_diretor: ");
        String nome_diretor = input.nextLine();
        
        System.out.println("cod_pais: ");
        int cod_pais = input.nextInt();

        DiretorBean db = new DiretorBean(cod_diretor, nome_diretor, cod_pais);
        DiretorModel.create(db, con);
        System.out.println("Diretor criado!");
    }

    public void deleteDiretor(Connection con) throws SQLException{
        Scanner input = new Scanner(System.in);
        
        System.out.println("cod_diretor: ");
        int cod_diretor = input.nextInt();
    
        DiretorBean db = new DiretorBean(cod_diretor);
        
        DiretorModel.delete(db, con);
        System.out.println("Diretor deletado se existir!");
    }

    public void atualizarDiretor(Connection con) throws SQLException{
        Scanner input = new Scanner(System.in);
        
        System.out.println("cod_diretor: ");
        int cod_diretor = input.nextInt();
        input.nextLine();
        
        System.out.print("nome_diretor: ");
        String nome_diretor = input.nextLine();
    
        System.out.println("cod_pais: ");
        int cod_pais = input.nextInt();
    
        DiretorBean db = new DiretorBean(cod_diretor);
        
        DiretorModel.updateDiretor(db, cod_diretor, nome_diretor, cod_pais, con);
        System.out.println("\nDiretor atualizado!");
    }

    public void diretorPeloCod(Connection con) throws SQLException{
        Scanner input = new Scanner(System.in);
            
        System.out.println("cod_diretor: ");
        int cod_diretor = input.nextInt();
        input.nextLine();
        
        
        HashSet all = DiretorModel.diretorByCod(cod_diretor, con);
        Iterator<DiretorBean> it = all.iterator();
        while(it.hasNext()) {
            System.out.println(it.next().toString());
        }
    }

    void listarDiretor(Connection con) throws SQLException {
        HashSet all = DiretorModel.listAll(con);
        Iterator<DiretorBean> it = all.iterator();
        while(it.hasNext()) {
            System.out.println(" "  + it.next().toString()+ " " );
        }
    }

    void listarDiretorPais(Connection con) throws SQLException {
        HashSet all = DiretorModel.listDiretorAndPais(con);
        Iterator<DiretorBean> it = all.iterator();
        while(it.hasNext()) {
            System.out.println(it.next().toString2());
        }
    }
}
