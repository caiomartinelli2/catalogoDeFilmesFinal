import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.Scanner;

public class Filme {
    public void filmeMenu(int op, Connection con) throws SQLException, IOException, ParseException{
    
        
        do{
                op = menu();
                    switch (op) {
                        case 1: new FilmeController().createFilme(con);
                        System.in.read();
                        break;
                        case 2: new FilmeController().deleteFilme(con);
                        System.in.read();
                        break;
                        case 3: new FilmeController().listarFilme(con);
                        System.in.read();
                        break;
                        case 4: new FilmeController().updateFilme(con);
                        System.in.read();
                        break;
                        case 5: new FilmeController().filmePeloCod(con);
                        System.in.read();
                        break;
                    }
                
                
            } while(op>0 && op<5);  
        
    }
        private static int menu() { 
            System.out.println("");
            System.out.println("Informe o número da opção que desejas executar: ");
            System.out.println("1 - Inserir um novo filme: ");
            System.out.println("2 - Deletar um filme: ");
            System.out.println("3 - Listar todos os filmes: ");
            System.out.println("**Informe o número diferente para voltar**");
            System.out.print("\nSua opção: ");
            
            Scanner input = new Scanner(System.in);
        
            return input.nextInt();
        }    
}
