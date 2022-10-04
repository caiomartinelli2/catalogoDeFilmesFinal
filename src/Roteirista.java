import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class Roteirista {
    public void roteiristaMenu(int op, Connection con) throws SQLException, IOException{    
        do{
                op = menu();
                    switch (op) {
                        case 1: new RoteiristaController().createRoteirista(con);
                        System.in.read();
                        break;
                        case 2: new RoteiristaController().deleteRoteirista(con);
                        System.in.read();
                        break;
                        case 3: new RoteiristaController().listarRoteirista(con);
                        System.in.read();
                        break;
                    }
                
                
            } while(op>0 && op<3);  
        
    }
        private static int menu() { 
            System.out.println("");
            System.out.println("Informe o número da opção que desejas executar: ");
            System.out.println("1 - Inserir um novo roteirista: ");
            System.out.println("2 - Deletar um roteirista: ");
            System.out.println("3 - Listar todos os roteirista: ");
            System.out.println("**Informe o número diferente para voltar**");
            System.out.print("\nSua opção: \n");
            Scanner input = new Scanner(System.in);
        
            return input.nextInt();
        }    
}
