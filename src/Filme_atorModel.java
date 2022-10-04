import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Filme_atorModel {
    static void create(Filme_atorBean g, Connection con) throws SQLException{
        PreparedStatement st;
        st = con.prepareStatement("INSERT INTO filme_ator (cod_filme, cod_ator)"+"VALUES (?,?)");

        st.setInt(1, g.getCod_filme());
        st.setInt(2, g.getCod_ator());
        
        st.execute();
        st.close();
        
    }
}
