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
                    case 1: new PaisController().createPais(con);;
                    break;
                    case 2: new DiretorController().createDiretor(con);
                    break;
                    case 3: new RoteiristaController().createRoteirista(con);
                    break;
                    case 4: new AtorController().createAtor(con);
                    break;
                    case 5: new GeneroController().createGenero(con);
                    break;
                    case 6: new FilmeController().createFilme(con);
                    break;
                    case 7: new Filme_atorController().createFilme_ator(con);
                    break;
                    case 8: new PaisController().listarPais(con);
                    break;
                    case 9: new DiretorController().listarDiretor(con);
                    break;
                    case 10: new RoteiristaController().listarRoteirista(con);
                    break;
                    case 11: new AtorController().listarAtor(con);
                    break;
                    case 12: new GeneroController().listarGenero(con);
                    break;
                    case 13: new FilmeController().listarFilme(con);
                    break;
                    case 14: new FilmeController().listarFilmeGenero(con);
                    break;
                    case 15: new AtorController().listarAtorFilme(con);
                    break;
                    case 16: new DiretorController().listarDiretorPais(con);
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
        System.out.println("1 - Inserir um novo país");
        System.out.println("2 - Inserir um novo diretor");
        System.out.println("3 - Inserir um novo roteirista");
        System.out.println("4 - Inserir um novo ator");
        System.out.println("5 - Inserir um novo genero de filme");
        System.out.println("6 - Inserir um novo filme");
        System.out.println("7 - Inserir uma nova Relação Filme_ator");
        System.out.println("8 - Listar os Países");
        System.out.print("Sua opção: ");
        Scanner input = new Scanner(System.in);
        
        return input.nextInt();
    }    

        








    }

