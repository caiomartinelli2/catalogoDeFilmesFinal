import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;

public class PaisModel {
    static void create(PaisBean p, Connection con) throws SQLException{
        PreparedStatement st;
        st = con.prepareStatement("INSERT INTO pais (cod_pais, nome_pais)"+"VALUES (?,?)");

        st.setInt(1, p.getCod_pais());
        st.setString(2, p.getNome_pais());
        st.execute();
        st.close();
        
    }
    
    static HashSet listAll(Connection con) throws SQLException {
        Statement st;
        HashSet list = new HashSet();
            st = con.createStatement();
            
            String sql = "SELECT cod_pais, nome_pais FROM pais";
            ResultSet result = st.executeQuery(sql);
            
            while(result.next()) {
                list.add(new PaisBean(result.getInt(1), result.getString(2)));
            }
        return list;
    }

}
