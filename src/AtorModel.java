import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;

public class AtorModel {
    static void create(AtorBean a, Connection con) throws SQLException{
        PreparedStatement st;
        st = con.prepareStatement("INSERT INTO ator (cod_ator, nome_ator, cod_pais)"+"VALUES (?,?,?)");

        st.setInt(1, a.getCod_ator());
        st.setString(2, a.getNome_ator());
        st.setInt(3, a.getCod_pais());
        st.execute();
        st.close();
        
    }

    static HashSet listAll(Connection con) throws SQLException {
        Statement st;
        HashSet list = new HashSet();
            st = con.createStatement();
            
            String sql = "SELECT cod_ator, nome_ator, cod_pais FROM ator";
            ResultSet result = st.executeQuery(sql);
            
            while(result.next()) {
                list.add(new AtorBean(result.getInt(1), result.getString(2), result.getInt(3)));
            }
        return list;
    }

    static HashSet listAtorAndFilmes(Connection con) throws SQLException {
        Statement st;
        HashSet list = new HashSet();
        st = con.createStatement();
            
        String sql = "select a1.nome_ator, f1.nome_filme from ator a1 join filme_ator fa1 on a1.cod_ator = fa1.cod_ator join filme f1 on f1.cod_filme = fa1.cod_filme;";
        ResultSet result = st.executeQuery(sql);
        
        while(result.next()) {
            AtorBean ab = new AtorBean(sql);
            FilmeBean fb = new FilmeBean(sql); 
            
            ab.setNome_ator((result.getString(1) ));
            fb.setNome_filme((result.getString(2) ));
            
            
            
            ab.setFilme(fb);    
            list.add(ab);
        }
        
        return list;
    }
}
