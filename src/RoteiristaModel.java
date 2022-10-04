import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;

public class RoteiristaModel {
    static void create(RoteiristaBean r, Connection con) throws SQLException{
        PreparedStatement st;
        st = con.prepareStatement("INSERT INTO roteirista (cod_roteirista, nome_roteirista, cod_pais)"+"VALUES (?,?,?)");

        st.setInt(1, r.getCod_roteirista());
        st.setString(2, r.getNome_roteirista());
        st.setInt(3, r.getCod_pais());
        st.execute();
        st.close();
        
    }

    static HashSet listAll(Connection con) throws SQLException {
        Statement st;
        HashSet list = new HashSet();
            st = con.createStatement();
            
            String sql = "SELECT cod_roteirista, nome_roteirista, cod_pais FROM roteirista";
            ResultSet result = st.executeQuery(sql);
            
            while(result.next()) {
                list.add(new RoteiristaBean(result.getInt(1), result.getString(2), result.getInt(3)));
            }
        return list;
    }

}
