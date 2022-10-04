import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;

public class FilmeModel {
    static void create(FilmeBean f, Connection con) throws SQLException{
        PreparedStatement st;
        st = con.prepareStatement("INSERT INTO filme (cod_filme,nome_filme,duracao,sinopse, cod_pais,cod_genero, cod_diretor, cod_roteirista)"+"VALUES (?,?,?,?,?,?,?,?)");

        st.setInt(1, f.getCod_filme());
        st.setString(2, f.getNome_filme());
        st.setDouble(3, f.getDuracao());
        st.setString(4, f.getSinopse());
        st.setInt(5, f.getCod_pais());
        st.setInt(6, f.getCod_genero());
        st.setInt(7, f.getCod_diretor());
        st.setInt(8, f.getCod_roteirista());
        
        
        st.execute();
        st.close();
        
    }

    static HashSet listAll(Connection con) throws SQLException {
        Statement st;
        HashSet list = new HashSet();
            st = con.createStatement();
            
            String sql = "SELECT cod_filme,nome_filme,duracao,sinopse, cod_pais,cod_genero, cod_diretor, cod_roteirista FROM filme";
            ResultSet result = st.executeQuery(sql);
            
            while(result.next()) {
                list.add(new FilmeBean(result.getInt(1), result.getString(2), result.getDouble(3), result.getString(4),result.getInt(5), result.getInt(6), result.getInt(7), result.getInt(8)));
            }
        return list;
    }

    static HashSet listFilmesAndGeneros(Connection con) throws SQLException {
        Statement st;
        HashSet list = new HashSet();
        st = con.createStatement();
            
        String sql = "Select f1.nome_filme, g1.nome_genero from filme f1, genero g1 where f1.cod_genero = g1.cod_genero";
        ResultSet result = st.executeQuery(sql);
        
        while(result.next()) {
            FilmeBean fb = new FilmeBean(sql); 
            GeneroBean gb = new GeneroBean(sql);
            
            fb.setNome_filme((result.getString(1) ));
            gb.setNome_genero((result.getString(2) ));
            
            
            fb.setGenero(gb);    
            list.add(fb);
        }
        
        return list;
    }
}
