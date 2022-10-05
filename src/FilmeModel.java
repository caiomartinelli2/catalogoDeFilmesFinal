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

    static void delete(FilmeBean f, Connection con) throws SQLException{
        PreparedStatement st;
        st = con.prepareStatement("DELETE FROM filme WHERE cod_filme = ?");

        st.setInt(1, f.getCod_filme());
        
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

    static HashSet filmeByCod(int cod_filme, Connection con) throws SQLException {
        Statement st;
        HashSet filmeCod = new HashSet();
            st = con.createStatement();
            
            String sql = ("SELECT cod_filme,nome_filme,duracao,sinopse, cod_pais,cod_genero, cod_diretor, cod_roteirista FROM filme "+
            "WHERE cod_filme = " + cod_filme);
            ResultSet result = st.executeQuery(sql);
            
            if(result.next()) {
                filmeCod.add(new FilmeBean(result.getInt(1), result.getString(2), result.getDouble(3), result.getString(4),result.getInt(5), result.getInt(6), result.getInt(7), result.getInt(8)));
            }
        
        return filmeCod;
    }

    static void updateFilme(FilmeBean f,int cod_filme, 
    String nome_filme, Double duracao,
    String sinopse, int cod_pais,
    int cod_genero, int cod_diretor,
    int cod_roteirista, Connection con) throws SQLException{
        PreparedStatement st;

        StringBuffer columns = new StringBuffer( 255 );

        if ( nome_filme != null && !nome_filme.equals( f.getNome_filme()))
        {
            columns.append( "nome_filme = '" + nome_filme + "'" );
        }
        if ( sinopse != null && !sinopse.equals( f.getSinopse()))
        {
            if(columns.length() > 0){
                columns.append( ", " );
            }
            columns.append( "sinopse = '" + sinopse + "'" );
            
        }
        if ( duracao != null && !duracao.equals( f.getDuracao()))
        {
            if ( columns.length() > 0 ) {
                columns.append( ", " );
              }
            columns.append( "duracao = '" + duracao + "'" );
        }
        if ( cod_pais >= 0 && cod_pais != ( f.getCod_pais()))
        {
            if ( columns.length() > 0 ) {
                columns.append( ", " );
              }
            columns.append( "cod_pais = '" + cod_pais + "'" );
        }
        
        if ( cod_genero >= 0 && cod_genero != ( f.getCod_genero()))
        {
            if ( columns.length() > 0 ) {
                columns.append( ", " );
              }
            columns.append( "cod_genero = '" + cod_genero + "'" );
        }
        if ( cod_diretor >= 0 && cod_diretor != ( f.getCod_diretor()))
        {
            if ( columns.length() > 0 ) {
                columns.append( ", " );
              }
            columns.append( "cod_diretor = '" + cod_diretor + "'" );
        }
        if ( cod_roteirista >= 0 && cod_roteirista != ( f.getCod_roteirista()))
        {
            if ( columns.length() > 0 ) {
                columns.append( ", " );
              }
            columns.append( "cod_roteirista = '" + cod_roteirista + "'" );
        }


        st = con.prepareStatement(
        "UPDATE filme SET " + columns.toString() + 
        " WHERE cod_filme = " + cod_filme);
        System.out.println("\nExecuting: " + st);
        System.out.println(columns.toString());
        st.execute();
        st.close();

    }
    
    private static Filme getCod_filme(int cod_filme) {
        return null;
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
