import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class Ator {
    public void atorMenu(int op, Connection con) throws SQLException, IOException{
    
        
    do{
            op = menu();
                switch (op) {
                    case 1: new AtorController().createAtor(con);
                    System.in.read();
                    break;
                    case 2: new AtorController().deleteAtor(con);
                    System.in.read();
                    break;
                    case 3: new AtorController().listarAtor(con);
                    System.in.read();
                    break;
                    case 4: new AtorController().atorPeloCod(con);
                    System.in.read();
                    break;
                    case 5: new AtorController().atualizarAtor(con);
                    System.in.read();
                    break;
                
                }
            
            
        } while(op>0 && op<10);  
    
}
    private static int menu() { 
        System.out.println("");
        System.out.println("Informe o número da opção que desejas executar ");
        System.out.println("1 - Inserir um novo ator ");
        System.out.println("2 - Deletar um ator ");
        System.out.println("3 - Listar todos os atores ");
        System.out.println("4 - Listar o ator pelo cod ");
        System.out.println("5 - Atualizar o ator ");
        System.out.println("**Informe o número diferente para voltar**");
        System.out.print("\nSua opção: ");
        Scanner input = new Scanner(System.in);
    
        return input.nextInt();
    }    
}
