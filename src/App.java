import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Conexao c = new Conexao();
        Connection con = c.getConnection();
        
        int op = 0;
        do{
            op = menu();
            try {
                switch (op) {
                    case 1: new Ator().atorMenu(op, con);
                    System.in.read();
                    break;
                    case 2: new Diretor().diretorMenu(op, con);
                    System.in.read();
                    break;
                    case 3: new Filme_ator().filme_atorMenu(op, con);
                    System.in.read();
                    break;
                    case 4: new Filme().filmeMenu(op, con);;
                    break;
                    case 5: new Genero().generoMenu(op, con);;
                    break;
                    case 6: new Pais().paisMenu(op, con);
                    break;
                    case 7: new Roteirista().roteiristaMenu(op, con);;
                    break;
                    case 8: new ConsultarEspeciais().consultarEspeciaisMenu(op, con);;
                    break;
                }
            }catch(SQLException ex) {
                //ex.printStackTrace();
                System.out.println(ex.getMessage());
                continue;
            }
        } while(op>0 && op<23);  
        con.close();
    }

    private static int menu() {
        System.out.println("");
        System.out.println("Informe o número da opção que desejas executar: ");
        System.out.println("1 - Ator");
        System.out.println("2 - Diretor");
        System.out.println("3 - Filme_ator");
        System.out.println("4 - Filme");
        System.out.println("5 - Genero");
        System.out.println("6 - Pais");
        System.out.println("7 - Roteirista");
        System.out.println("8 - Consultas Especiais");
        System.out.print("Sua opção: ");
        Scanner input = new Scanner(System.in);
        
        return input.nextInt();
    }    

        








    }

