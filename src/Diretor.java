import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class Diretor {
    
    public void diretorMenu(int op, Connection con) throws SQLException, IOException{
        do{
                op = menu();
                    switch (op) {
                        case 1: new DiretorController().createDiretor(con);
                        System.in.read();
                        break;
                        case 2: new DiretorController().deleteDiretor(con);
                        System.in.read();
                        break;
                        case 3: new DiretorController().listarDiretor(con);
                        System.in.read();
                        break;
                        case 4: new DiretorController().diretorPeloCod(con);
                        System.in.read();
                        case 5: new DiretorController().atualizarDiretor(con);
                        System.in.read();
                    }
                
                
            } while(op>0 && op<23);  
        
    }
        private static int menu() { 
            System.out.println("");
            System.out.println("Informe o número da opção que desejas executar: ");
            System.out.println("1 - Inserir um novo diretor: ");
            System.out.println("2 - Deletar um diretor: ");
            System.out.println("3 - Listar todos os diretores: ");
            System.out.println("4 - Listar o diretor pelo seu código: ");
            System.out.println("5 - Atualizar o diretor ");
            System.out.println("**Informe o número diferente para voltar**");
            System.out.print("\nSua opção: ");
            Scanner input = new Scanner(System.in);
        
            return input.nextInt();
        }    
    
}

