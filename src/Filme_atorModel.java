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

        st.setInt(2, fab.getCod_filme());
        st.setInt(1, fab.getCod_ator());
        
        System.out.println("\nExecuting: " + st);
        st.execute();
        st.close();
        
    }

    static void updateFilme_ator(Filme_atorBean fab,int cod_filme, int cod_filmeNovo, int cod_ator, Connection con) throws SQLException{
        PreparedStatement st;

        StringBuffer columns = new StringBuffer( 255 );

        
        if ( cod_filmeNovo >= 0 && cod_filmeNovo != ( fab.getCod_filme()))
        {
            if ( columns.length() > 0 ) {
                columns.append( ", " );
              }
            columns.append( "cod_filme = '" + cod_filmeNovo + "'" );
        }
        
        if ( cod_ator >= 0 && cod_ator != ( fab.getCod_ator()))
        {
            if ( columns.length() > 0 ) {
                columns.append( ", " );
              }
            columns.append( "cod_ator = '" + cod_ator + "'" );
        }
        


        st = con.prepareStatement(
        "UPDATE filme_ator SET " + columns.toString() + 
        " WHERE cod_filme = " + cod_filme);
        System.out.println("\nExecuting: " + st);
       
        st.execute();
        st.close();

    }

}
