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

    static void delete(Filme_atorBean fab, Connection con) throws SQLException{
        PreparedStatement st;
        st = con.prepareStatement("DELETE FROM filme_ator WHERE cod_filme = ? and cod_ator = ? ");

        st.setInt(1, fab.getCod_filme());
        st.setInt(2, fab.getCod_ator());
        
        st.execute();
        st.close();
        
    }

}
