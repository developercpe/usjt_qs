package br.emprestimo.servico;

import java.sql.DriverManager;
import java.sql.SQLException;


import com.mysql.jdbc.Connection;
import com.mysql.jdbc.exceptions.jdbc4.CommunicationsException;


public class ConectaDB {
	
	String url = "jdbc:mysql://mysql8.db4free.net:3306/sceweb";
	String driver = "com.mysql.jdbc.Driver";
	String usuario = "alunos";
	String senha = "alunosfatec";
	
	public ConectaDB (ConfiguraDB configura){
		this.url = configura.getUrl();
		this.driver = configura.getDriver();
		this.usuario = configura.getUsuario();
		this.senha = configura.getSenha();
	}
	public ConectaDB(){
		
	}
	public Connection getConnection(){
		try {
			Class.forName(driver);
			
			return (Connection) DriverManager.getConnection(url,usuario,senha);
			}
		catch (CommunicationsException e){
			
			
			throw new RuntimeException(e); 
		}
		catch (SQLException e){
			
			
			throw new RuntimeException(e); 
		}
		catch (Exception e){
			
			
			throw new RuntimeException(e); 
		}
	}
}
