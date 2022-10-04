import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;

public class GeneroModel {
    static void create(GeneroBean g, Connection con) throws SQLException{
        PreparedStatement st;
        st = con.prepareStatement("INSERT INTO genero (cod_genero, nome_genero)"+"VALUES (?,?)");

        st.setInt(1, g.getCod_genero());
        st.setString(2, g.getNome_genero());
        st.execute();
        st.close();
        
    }

    static void delete(GeneroBean g, Connection con) throws SQLException{
        PreparedStatement st;
        st = con.prepareStatement("DELETE FROM genero WHERE cod_genero = ? ");

        st.setInt(1, g.getCod_genero());
        
        st.execute();
        st.close();
        
    }

    static HashSet listAll(Connection con) throws SQLException {
        Statement st;
        HashSet list = new HashSet();
            st = con.createStatement();
            
            String sql = "SELECT cod_genero, nome_genero FROM genero";
            ResultSet result = st.executeQuery(sql);
            
            while(result.next()) {
                list.add(new GeneroBean(result.getInt(1), result.getString(2)));
            }
        return list;
    }


}
