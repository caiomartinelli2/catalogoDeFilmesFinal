import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;

public class DiretorModel {
    static void create(DiretorBean p, Connection con) throws SQLException{
        PreparedStatement st;
        st = con.prepareStatement("INSERT INTO diretor (cod_diretor, nome_diretor, cod_pais)"+"VALUES (?,?,?)");

        st.setInt(1, p.getCod_diretor());
        st.setString(2, p.getNome_diretor());
        st.setInt(3, p.getCod_pais());
        st.execute();
        st.close();
        
    }

    static void delete(DiretorBean db, Connection con) throws SQLException{
        PreparedStatement st;
        st = con.prepareStatement("DELETE FROM diretor WHERE cod_diretor = ? ");

        st.setInt(1, db.getCod_diretor());
        
        st.execute();
        st.close();
        
    }

    static HashSet listAll(Connection con) throws SQLException {
        Statement st;
        HashSet list = new HashSet();
            st = con.createStatement();
            
            String sql = "SELECT cod_diretor, nome_diretor, cod_pais FROM diretor";
            ResultSet result = st.executeQuery(sql);
            
            while(result.next()) {
                list.add(new DiretorBean(result.getInt(1), result.getString(2), result.getInt(3)));
            }
        return list;
    }

    static HashSet listDiretorAndPais(Connection con) throws SQLException {
        Statement st;
        HashSet list = new HashSet();
        st = con.createStatement();
            
        String sql = "select d1.nome_diretor, p1.nome_pais from diretor d1 join pais p1 on d1.cod_pais=p1.cod_pais and p1.nome_pais = 'brasil';";
        ResultSet result = st.executeQuery(sql);
        
        while(result.next()) {
            DiretorBean db = new DiretorBean(sql);
            PaisBean pb = new PaisBean(sql); 
            
            db.setNome_diretor((result.getString(1) ));
            pb.setNome_pais((result.getString(2) ));
            
            
            
            db.setPais(pb);    
            list.add(db);
        }
        
        return list;
    }


}
