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
    
    static void delete(PaisBean p, Connection con) throws SQLException{
        PreparedStatement st;
        st = con.prepareStatement("DELETE FROM pais WHERE cod_pais = ? ");

        st.setInt(1, p.getCod_pais());

        st.execute();
        st.close();
        
    }

    static void updatePais(PaisBean pb,int cod_pais, String nome_pais, Connection con) throws SQLException{
        PreparedStatement st;

        StringBuffer columns = new StringBuffer( 255 );

        if ( nome_pais != null && !nome_pais.equals( pb.getNome_pais()))
        {
            columns.append( "nome_pais = '" + nome_pais + "'" );
        }
        
        st = con.prepareStatement(
        "UPDATE pais SET " + columns.toString() + 
        " WHERE cod_pais = " + cod_pais);
        System.out.println("\nExecuting: " + st);
       
        st.execute();
        st.close();

    }

    static HashSet paisByCod(int cod_pais, Connection con) throws SQLException {
        Statement st;
        HashSet list = new HashSet();
            st = con.createStatement();
            
            String sql = ("SELECT cod_pais, nome_pais FROM pais "+
            "WHERE cod_pais = " + cod_pais);
            ResultSet result = st.executeQuery(sql);
            
            if(result.next()) {
                list.add(new PaisBean(result.getInt(1), result.getString(2)));
            }
        
        return list;
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
