import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class Filme_ator {
    public void filme_atorMenu(int op, Connection con) throws SQLException, IOException{
    
        
        do{
                op = menu();
                    switch (op) {
                        case 1: new Filme_atorController().createFilme_ator(con);
                        System.in.read();
                        break;
                        case 2: new Filme_atorController().deleteFilme_ator(con);
                        System.in.read();
                        break;
                        case 3: new Filme_atorController().atualizarFilme(con);
                        System.in.read();
                        break;
                        case 4: new AtorController().listarAtorFilme(con);
                        System.in.read();
                        break;
                    }
                
                
            } while(op>0 && op<3);  
        
    }
        private static int menu() { 
            System.out.println("");
            System.out.println("Informe o número da opção que desejas executar ");
            System.out.println("1 - Inserir uma nova realação entre Filme_ator ");
            System.out.println("2 - Deletar uma realação entre Filme_ator ");
            System.out.println("3 - Atualizar uma realação entre Filme_ator ");
            System.out.println("4 - Mostrar o nome dos atores e do Filme que ele faz parte ");
            System.out.println("**Informe o número diferente para voltar**");
            
            System.out.print("\nSua opção: ");
            Scanner input = new Scanner(System.in);
        
            return input.nextInt();
        }    
}
