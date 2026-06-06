package fatec.poo.control;

import fatec.poo.control.PreparaConexao;
import fatec.poo.model.LocacaoVeiculo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DaoLocacaoVeiculo {
    private PreparaConexao pc;
    private Connection connection;

    public DaoLocacaoVeiculo () {
        pc = new PreparaConexao("", "");
        pc.setDriver("net.ucanaccess.jdbc.UcanaccessDriver");
        pc.setConnectionString("jdbc:ucanaccess://DB_POO.accdb");
    }

    public void inserir(LocacaoVeiculo objLocacao) {
        String sql = "INSERT INTO tblLocacao (Codigo, NomeCliente, TipoCliente, PlacaCarro, TaxaLocacao, KmRodados, ValorLocacao) "
                   + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        try {
            connection = pc.abrirConexao();
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, objLocacao.getCodigo());
            ps.setString(2, objLocacao.getNomeCliente());
            ps.setString(3, objLocacao.getTipoCliente());
            ps.setString(4, objLocacao.getPlacaCarro());
            ps.setDouble(5, objLocacao.getTaxaLocacao());
            ps.setInt(6, objLocacao.getKmRodados());
            ps.setDouble(7, objLocacao.getValorLocacao());
            ps.executeUpdate();
            System.out.println("[Registro inserido com sucesso]");
        } catch (Exception ex) {
            System.out.println("Erro ao inserir: " + ex.getMessage());
        } finally {
            pc.fecharConexao();
        }
    }

    public void atualizar(LocacaoVeiculo objLocacao) {
        String sql = "UPDATE tblLocacao SET KmRodados=?, ValorLocacao=? WHERE Codigo=?";
        try {
            connection = pc.abrirConexao();
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, objLocacao.getKmRodados());
            ps.setDouble(2, objLocacao.getValorLocacao());
            ps.setInt(3, objLocacao.getCodigo());
            ps.executeUpdate();
            System.out.println("[Registro atualizado com sucesso]");
        } catch (Exception ex) {
            System.out.println("Erro ao atualizar: " + ex.getMessage());
        } finally {
            pc.fecharConexao();
        }
    }

    public LocacaoVeiculo consultar(int codigo) {
        String sql = "SELECT * FROM tblLocacao WHERE Codigo=?";
        LocacaoVeiculo objLocacao = null;
        try {
            connection = pc.abrirConexao();
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, codigo);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                objLocacao = new LocacaoVeiculo(rs.getInt("Codigo"), rs.getString("NomeCliente"));
                objLocacao.setTipoCliente(rs.getString("TipoCliente"));
                objLocacao.setPlacaCarro(rs.getString("PlacaCarro"));
                objLocacao.setTaxaLocacao(rs.getDouble("TaxaLocacao"));
                objLocacao.setKmRodados(rs.getInt("KmRodados"));
            }
        } catch (Exception ex) {
            System.out.println("Erro ao consultar: " + ex.getMessage());
        } finally {
            pc.fecharConexao();
        }
        return objLocacao;
    }
}
