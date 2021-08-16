package dao;

import classes.Cliente;
import conexao.Conexao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DaoCliente {
    
    private Connection con;
    private ResultSet rs;
    
    public DaoCliente(){
    
        this.con = new Conexao().getConnection();
    
    }
    
    //aqui é onde o cliente é cadastrado.
    public void cadastrar(Cliente cliente){
        try
        {
            PreparedStatement p=con.prepareStatement("insert into cliente(cpf,faixaIdade,convenio,faixaSalario,motivoEmprestimo)values(?,?,?,?,?)");
            p.setString(1,cliente.getCpf());
            p.setString(2,cliente.getFIdade());
            p.setString(3,cliente.getConvenio());
            p.setString(4,cliente.getFSalario());
            p.setString(5,cliente.getREmprestimo());
            p.execute();
            p.close();
            
        } 
        catch(SQLException erro) 
        {
            throw new RuntimeException(erro);
        }
    }
    
    //esse é o metodo usado para preencher a tabela que está dentro do JFrame Relatorio_Clientes
    public List<Cliente> PreencheClientes(){
        try{
            List<Cliente>clientes = new ArrayList<Cliente>();
            PreparedStatement p = con.prepareStatement("select * from cliente");
            rs = p.executeQuery();
            
            while(rs.next()){
                
                Cliente cli=new Cliente();
                cli.setCodCliente(rs.getInt("codcliente"));
                cli.setCpf(rs.getString("cpf"));
                cli.setFIdade(rs.getString("faixaIdade"));
                cli.setConvenio(rs.getString("convenio"));
                cli.setFSalario(rs.getString("faixaSalario"));
                cli.setREmprestimo(rs.getString("motivoEmprestimo"));
                clientes.add(cli);                
                
            }
            
            return clientes;
            
        }
        catch(SQLException erro){
            throw new RuntimeException(erro);            
        }          
    }
   
    
}
