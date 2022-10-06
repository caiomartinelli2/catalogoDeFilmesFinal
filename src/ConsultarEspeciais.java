import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class ConsultarEspeciais {
    public void consultarEspeciaisMenu(int op, Connection con) throws SQLException, IOException{    
        do{
                op = menu();
                    switch (op) {
                        case 1: new FilmeController().listarFilmeGenero(con);
                        System.in.read();
                        break;
                        case 2: new AtorController().listarAtorFilme(con);
                        System.in.read();
                        break;
                        case 3: new DiretorController().listarDiretorPais(con);
                        System.in.read();
                        break;
                    }
                
                
            } while(op>0 && op<3);  
        
    }
        private static int menu() { 
            System.out.println("");
            System.out.println("Informe o número da opção que desejas executar: ");
            System.out.println("1 - Mostrar o nome dos filmes e o nome de seu genero ");
            System.out.println("2 - Mostrar o nome dos atores e do Filme que ele faz parte ");
            System.out.println("3 - Mostrar diretores que são dos EUA ");
            System.out.println("**Informe o número diferente para voltar**");
            System.out.print("\nSua opção: \n");
            Scanner input = new Scanner(System.in);
        
            return input.nextInt();
        }    
}
