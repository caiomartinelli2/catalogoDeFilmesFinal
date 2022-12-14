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

    static void delete(RoteiristaBean r, Connection con) throws SQLException{
        PreparedStatement st;
        st = con.prepareStatement("DELETE FROM roteirista WHERE cod_roteirista = ? ");

        st.setInt(1, r.getCod_roteirista());
        
        st.execute();
        st.close();
        
    }

    static void updateRoteirista(RoteiristaBean rb,int cod_roteirista, 
    String nome_roteirista, int cod_pais, Connection con) throws SQLException{
        PreparedStatement st;

        StringBuffer columns = new StringBuffer( 255 );

        if ( nome_roteirista != null && !nome_roteirista.equals( rb.getNome_roteirista()))
        {
            columns.append( "nome_roteirista = '" + nome_roteirista + "'" );
        }
        if ( cod_pais >= 0 && cod_pais != ( rb.getCod_pais()))
        {
            if ( columns.length() > 0 ) {
                columns.append( ", " );
              }
            columns.append( "cod_pais = '" + cod_pais + "'" );
        }
        

        st = con.prepareStatement(
        "UPDATE roteirista SET " + columns.toString() + 
        " WHERE cod_roteirista = " + cod_roteirista);
        
        System.out.println("\nExecuting: " + st);
       
        st.execute();
        st.close();

    }

    static HashSet roteiristabyCod(int cod_roteirista, Connection con) throws SQLException {
        Statement st;
        HashSet list = new HashSet();
            st = con.createStatement();
            
            String sql = ("SELECT cod_roteirista, nome_roteirista, cod_pais FROM roteirista "+
            "WHERE cod_roteirista = " + cod_roteirista);
            ResultSet result = st.executeQuery(sql);
            
            if(result.next()) {
                list.add(new RoteiristaBean(result.getInt(1), result.getString(2), result.getInt(3)));
            }
        
        return list;
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
