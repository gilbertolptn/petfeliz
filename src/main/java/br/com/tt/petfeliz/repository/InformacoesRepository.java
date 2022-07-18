package br.com.tt.petfeliz.repository;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class InformacoesRepository {

    private JdbcTemplate jdbcTemplate;

    public InformacoesRepository(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<String> listarTelefones(){
        return jdbcTemplate.queryForList("select numero from tb_telefones", String.class);
    }

    /*
    public List<String> listarTelefonesComJDBC(){
        List<String> telefones = new LinkedList<>();
        try {
            Connection connection = DriverManager.getConnection("jdbc:h2:mem:testdb", "sa", "");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select numero from tb_telefones");
            while (resultSet.next()) {
                String telefone = resultSet.getString("numero");
                telefones.add(telefone);
            }
            resultSet.close();
            statement.close();
            connection.close();
        }catch (Exception e){
            System.out.println("erro ao consultar");
        }

        return telefones;
    }
    */

    public List<String> listarEnderecos() {
        return jdbcTemplate.queryForList("SELECT endereco FROM tb_enderecos", String.class);
    }

    public List<String> listarHorarios() {
        return jdbcTemplate.queryForList("SELECT horario FROM tb_horarios", String.class);
    }
}
