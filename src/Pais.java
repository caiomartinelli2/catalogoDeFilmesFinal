import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class Pais {
    public void paisMenu(int op, Connection con) throws SQLException, IOException{
    
        
        do{
                op = menu();
                    switch (op) {
                        case 1: new PaisController().createPais(con);
                        System.in.read();
                        break;
                        case 2: new PaisController().deletePais(con);
                        System.in.read();
                        break;
                        case 3: new PaisController().listarPais(con);
                        System.in.read();
                        break;
                        case 4: new PaisController().paisPeloCod(con);
                        System.in.read();
                        break;
                        case 5: new PaisController().atualizarPais(con);
                        System.in.read();
                        break;
                    }
                
                
            } while(op>0 && op<4);  
        
    }
        private static int menu() { 
            System.out.println("");
            System.out.println("Informe o número da opção que desejas executar: ");
            System.out.println("1 - Inserir um novo pais: ");
            System.out.println("2 - Deletar um pais: ");
            System.out.println("3 - Listar todos os pais: ");
            System.out.println("4 - Listar o pais pelo cod: ");
            System.out.println("5 - Atualizar o pais: ");
            System.out.println("**Informe o número diferente para voltar**");
            System.out.print("\nSua opção: ");
            Scanner input = new Scanner(System.in);
        
            return input.nextInt();
        }    
}
